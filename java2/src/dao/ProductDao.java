package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	public static ProductDao produtctDao = new ProductDao();
	
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root", "1234");
		} catch(Exception e) {}
	}
	// 1. 제품 등록
	public boolean add(Product product) {
		try {
			String sql = "insert into javafx.product(pname,pimg,pcontent,pcategory,pprice,pactivation,mno)values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getPcategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPactivation());
			ps.setInt(7, product.getMnum());
			ps.executeUpdate();
			return true;
		} catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 2. 모든 제품 출력
	public ArrayList<Product> list(String category, String search){
		ArrayList<Product> productlist = new ArrayList<>(); // 리스트 선언 	
		try {
			String sql = null;
			if(category == null && search == null) {
				sql = "select * from javafx.product";
				ps = conn.prepareStatement(sql);
			}
			else if(search == null) {
			sql = "select * from javafx.product where pcategory = ? order by pnum desc";	// SQL 작성
			ps = conn.prepareStatement(sql);			// SQL 연결
			ps.setString(1, category); }
			else if (category == null) {
				sql = "select * from javafx.product";
				ps = conn.prepareStatement(sql);
			}
			else {													// 필드명 = 값[=비교연산자] // 필드명 Like %값% [값이 포함된 걸 출력]
				sql = "select * from javafx.product where pcategory = ? and pname like '%"+search+"%' order by pnum desc";
				ps = conn.prepareStatement(sql);
				ps.setString(1, category);
			}
			
			rs = ps.executeQuery();					// SQL 실행  
			while( rs.next() ) {					// SQL 결과[ 레코드 단위 ]
				Product product = new Product(  	// 해당 레코드를 객체화
						rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9));
				productlist.add(product);			// 리스트에 객체 담기 
			}	
			return productlist;						// 리스트 반환
			
			
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return null; // 만약에 실패시 NULL 반환
	}
	// 3. 제품 조회
	
	// 4. 제품 삭제
	public boolean delete(int pnum) {
		try {
			String sql = "delete from javafx.product where pnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		} catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 5. 제품 수정
	public boolean update(Product product) {
		try {
			String sql = "update javafx.product set pname = ?, pimg = ?, pcontent = ?, pcategory = ?, pprice = ? where pnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getPcategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPnum());
			ps.executeUpdate();
			return true;
		} catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 6. 제품 상태 변경
	public boolean activation(int pnum) {
		try { // 현재 제품의 상태
			String sql = "select pactivation from javafx.product where pnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, pnum);
			rs = ps.executeQuery();
			if(rs.next()) { // 검색결과가 존재하면 다음 레코드 가져오기 
				String upsql = null;
				if(rs.getInt(1) == 1) { // 현재 제품의 상태가 1이면
					 upsql = "update javafx.product set pactivation = 2 where pnum=?";
				}
				else if(rs.getInt(1) == 2) {
					upsql = "update javafx.product set pactivation = 3 where pnum=?";
				}
				else if(rs.getInt(1) == 3) {
					upsql = "update javafx.product set pactivation = 1 where pnum=?";
				}
				ps = conn.prepareStatement(upsql); // 업데이트 
				ps.setInt(1, pnum);
				ps.executeUpdate(); // sql 실행
				return true;
			}
			
		} catch(Exception e) {System.out.println("sql 오류 : " + e);}
		return false;
	}
	// 내가 등록한 상품 보기
	
}
