package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	// 3. ��ǰ ��ȸ
	
	// 4. ��ǰ ����
	
	// 5. ��ǰ ����
	
}