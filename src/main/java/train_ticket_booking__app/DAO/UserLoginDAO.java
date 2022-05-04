package train_ticket_booking__app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.ConnectionUtil;



public class UserLoginDAO {
	public static int login(String email, String password) throws Exception {
		
		
		
		Connection connection = null;
		connection=ConnectionUtil.getConnection();
		PreparedStatement statement = null;
		String query = "select email_id,PASSWORD from train_ticket_booking_app_registration where email_id=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, email);
		ResultSet result = statement.executeQuery();
		String useremail = null;
		String userpassword = null;
		while (result.next()) {
			useremail = result.getString("email_id");
			userpassword = result.getString("PASSWORD");
		}
		int message=1;
		try {
			
		if (userpassword.equals(password)) {
			message=1;
			System.out.println("sucessful");
			
		} }catch(Exception e) {
			message=0;
			System.out.println("Try again");
			//e.printStackTrace();
			
			
		}
		return message;
		
	}

}
