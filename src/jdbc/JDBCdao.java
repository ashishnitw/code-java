package jdbc;// package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class User{
	int id;
	String name;
	int age;
	@Override
	public String toString() {
		return "jdbc.User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

class UserDao{
	Connection con = null;
	
	public void connect() {
		String url = "jdbc:mysql://localhost:3306/webappdb";
		String uname = "root";
		String pass = "welcome";
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public User getUser(int id) throws Exception {
		User u = new User();
		u.id = id;
		
		String q = "select username,age from users where id="+id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(q);
		
		rs.next();
		String name = rs.getString("username");
		int age = rs.getInt("age");
		u.name = name;
		u.age = age;
		
		return u;
	}
	public void addUser(User u) throws Exception {
		String q = "insert into users values (?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, u.id);
		ps.setString(2, u.name);
		ps.setInt(3, u.age);
		
		ps.executeUpdate();
	}
	public void removeUser(int id) {
		
	}
}

public class JDBCdao {

	public static void main(String[] args) throws Exception {
		UserDao dao = new UserDao();
		dao.connect();
//		jdbc.User u1 = dao.getUser(4);
//		System.out.println(u1);
		
		User u2 = new User();
		u2.id = 9; u2.name = "Serene"; u2.age = 28;
		dao.addUser(u2);
	}
}
