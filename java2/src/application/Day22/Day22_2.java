package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	// 1. �ʵ�
		private Connection connection; // ���� ��ü ����
	// 2. ������
		public Day22_2() {
			try { // JAVA�� ����� ������ �Ϲݿ��� �߻�
			// DB ����̺� Ŭ���� ȣ�� [ DBȸ�縶�� �ٸ��⶧���� �ϱ����� ���� ���� ]
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					// JDBC : JAVA DATA BASE CONNECTION
					// jbbc:mysql://ip�ּ�(����[����pc]�̸�localhost):port��ȣ/DB�̸�DB�ð�����
					// , ������, "DB��й�ȣ"
					"jdbc:mysql://localhost:3306/javafx?serverTimeZone=UTC", "root", "1234");
			System.out.println("DB ���� ����");
			
			}catch(Exception e) {System.out.println("���� ����");}
		}
	// 3. �޼ҵ�
	public boolean writer(String �ۼ���, String ����) {
		try {
		// 1. SQL �ۼ� [ DB�� ���� ] 
			// db�� ���̺� ������ ���� : insert into ���̺�1(�ʵ��1,�ʵ��2) values(�ʵ��1�� ��, �ʵ��2�� ��)
		String sql = "insert into test(writer, content)values(?,?)";
		// 2. SQL ���� [ ����� DB�� SQL ���� ]
			// PreparedStatement : ����� DB���� ���̺� ����(����, ����, ����, ����)�� �� ���� �������̽�
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, �ۼ���); // sql�� �ۼ��� ù��° ?�� ���� �ֱ�
		ps.setString(2, ����); // sql�� �ۼ��� �ι�° ?�� ���� �ֱ�
		// 3. SQL ����
		ps.executeUpdate(); // sql ���� ����
		
		// ������ true
		return true;
		}catch(Exception e) {System.out.println(e);}
		
		// ���н� false
		return false;
	}
	// 3. ������ ȣ�� �޼ҵ� [ ��ȯŸ���� ����Ʈ�� �� ���� : ���� ��[���ڵ�] �������� ����)
	public ArrayList<������> get() {
		
		// DB���� ������ �����͸� ������ ����Ʈ ����
		ArrayList<������> �����͸�� = new ArrayList<������>();
		try {
		// 1. SQL �ۼ� [ ������ ȣ�� ]
			// select*(����ʵ�) from ���̺��; : ��� �����͸� ��������
		String sql = "select * from test";
			// 2. SQL ����[ db�� ����� ��ü�� ���� �������̽� ���� ]
		PreparedStatement ps = connection.prepareStatement(sql);
			// 3.SQL ����[ ResultSet �������̽� java.sql ��Ű�� ]
		ResultSet rs = ps.executeQuery(); // ����� ��������
		// ������� �ϳ��� �ƴϰ� ������ �̱� ������ �ݺ��� ���
			// ���پ� ��üȭ -> ����Ʈ�� ����
		while(rs.next()) { // ���� ��[���ڵ�]�� ������ = ���ڵ� ������ ���� ����
			������ temp = new ������(
					rs.getInt(1), // �ش� ��[���ڵ�]�� ù��° �ʵ� [����] �� ��������
					rs.getString(2), // �ش� ��[���ڵ�]�� �ι�° �ʵ� [����] �� ��������
					rs.getString(3) // �ش� ��[���ڵ�]�� ����° �ʵ� [����] �� ��������
					);
			// 2. ��ü�� ����Ʈ�� ���
			�����͸��.add(temp); }
		
			return �����͸��;
			
			// �ݺ��� ���� ����Ʈ ��ȯ
		}catch(Exception e) {System.out.println(e);}
		// ������ ������ ��� ��ȯ
		
		
		// ���н�
		return null;
	}
}
