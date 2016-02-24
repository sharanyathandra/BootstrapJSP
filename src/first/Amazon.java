package first;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author sharru
 *
 */
public class Amazon {
   
	 String username;
	 String email;
	 String Password;
	 /**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.Password = password;
	}


	
	 
	 /**
	 * @return the price
	 */
	


	/**
	 * @param price the price to set
	 */
	

	Connection con;
	 
	  public Amazon(){
		 try{
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs","root","password");
			 
		 }catch(Exception e){
			 
		 }
	 }
	
	
	//public String getBookInfo(){
		//return id + "& " + title;
	//}
	
	public int insert(){
	    int x =0;
		try{
			PreparedStatement ps = con.prepareStatement("insert into loginpage values(?,?,?)");
			
			ps.setString(1,username);
			ps.setString(2, email);
			ps.setString(3, Password);
			x = ps.executeUpdate();

		}catch(Exception e){
			
			e.printStackTrace();
		}
		return x;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 

}
