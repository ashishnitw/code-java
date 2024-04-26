package jdbc;// package JDBC;

import java.sql.*;

public class JavaJDBC {
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/webappdb";
		String uname = "root";
		String pass = "welcome";
		String q = "select * from users";
		
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");	//same as above
		
		int id = 8;
		String name = "Deepali";
		int age = 26;
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(q);
		
		while(rs.next()) {
			String data = rs.getInt("id") + " : " + rs.getString("username");
			System.out.println(data);
		}
		
//		q = "insert into users values(7, 'Rajesh', 35)";
//		int n = st.executeUpdate(q);
		
		q = "insert into users values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		
		int n = ps.executeUpdate();
		System.out.println(n + " rows updated");
		
		
		
		
		st.close();
		con.close();
		
		
		
		
		
		
		
	}
}
