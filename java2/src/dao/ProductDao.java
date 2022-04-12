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
	// 1. ��ǰ ���
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
	// 2. ��� ��ǰ ���
	public ArrayList<Product> list(String category, String search){
		ArrayList<Product> productlist = new ArrayList<>(); // ����Ʈ ���� 	
		try {
			String sql = null;
			if(category == null && search == null) {
				sql = "select * from javafx.product";
				ps = conn.prepareStatement(sql);
			}
			else if(search == null) {
			sql = "select * from javafx.product where pcategory = ? order by pnum desc";	// SQL �ۼ�
			ps = conn.prepareStatement(sql);			// SQL ����
			ps.setString(1, category); }
			else if (category == null) {
				sql = "select * from javafx.product";
				ps = conn.prepareStatement(sql);
			}
			else {													// �ʵ�� = ��[=�񱳿�����] // �ʵ�� Like %��% [���� ���Ե� �� ���]
				sql = "select * from javafx.product where pcategory = ? and pname like '%"+search+"%' order by pnum desc";
				ps = conn.prepareStatement(sql);
				ps.setString(1, category);
			}
			
			rs = ps.executeQuery();					// SQL ����  
			while( rs.next() ) {					// SQL ���[ ���ڵ� ���� ]
				Product product = new Product(  	// �ش� ���ڵ带 ��üȭ
						rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9));
				productlist.add(product);			// ����Ʈ�� ��ü ��� 
			}	
			return productlist;						// ����Ʈ ��ȯ
			
			
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return null; // ���࿡ ���н� NULL ��ȯ
	}
	// 3. ��ǰ ��ȸ
	
	// 4. ��ǰ ����
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
	// 5. ��ǰ ����
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
	// 6. ��ǰ ���� ����
	public boolean activation(int pnum) {
		try { // ���� ��ǰ�� ����
			String sql = "select pactivation from javafx.product where pnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, pnum);
			rs = ps.executeQuery();
			if(rs.next()) { // �˻������ �����ϸ� ���� ���ڵ� �������� 
				String upsql = null;
				if(rs.getInt(1) == 1) { // ���� ��ǰ�� ���°� 1�̸�
					 upsql = "update javafx.product set pactivation = 2 where pnum=?";
				}
				else if(rs.getInt(1) == 2) {
					upsql = "update javafx.product set pactivation = 3 where pnum=?";
				}
				else if(rs.getInt(1) == 3) {
					upsql = "update javafx.product set pactivation = 1 where pnum=?";
				}
				ps = conn.prepareStatement(upsql); // ������Ʈ 
				ps.setInt(1, pnum);
				ps.executeUpdate(); // sql ����
				return true;
			}
			
		} catch(Exception e) {System.out.println("sql ���� : " + e);}
		return false;
	}
	// ���� ����� ��ǰ ����
	
}
