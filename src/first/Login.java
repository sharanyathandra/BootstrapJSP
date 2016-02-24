/**
 * 
 */
package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author sharru
 *
 */
public class Login {
	String email;
	 String Password;
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
	Connection con;
	 
	  public Login(){
		 try{
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs","root","password");
			 
		 }catch(Exception e){
			 
		 }
	  }
	  public int insert(){
		    int x =0;
			try{
				PreparedStatement ps = con.prepareStatement("insert into login1 values(?,?)");
				
				ps.setString(1, email);
				ps.setString(2, Password);
				x = ps.executeUpdate();

			}catch(Exception e){
				
				e.printStackTrace();
			}
			return x;
		}

}
	 


