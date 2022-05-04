package train_ticket_booking__app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionUtil;
import train_ticket_booking__app.model.UserRegistration;



public class UserRegistrationCommonDAO {
	public int userRegistrationCommonDAO(UserRegistration ur) throws Exception {
		
		
		
		Connection connection = null;
		connection=ConnectionUtil.getConnection();
		PreparedStatement statement = null;
		try {
		String query="INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES(?,?,?,?)";
		 statement=connection.prepareStatement(query);
		 statement.setString(1,ur.getUserName());
		 statement.setString(2,ur.getEmailId());
		 statement.setString(3, ur.getPassword());
		 statement.setString(4, ur.getPhoneNumber());
		int rows=statement.executeUpdate();
		
		if(rows==1) {
			System.out.println("Sucessfully Register");
		}
		else {
			System.out.println("Unsucessfull Register");
			
		}
		
		}
		catch(Exception e) {
			
			
			
		}
		return 1;
	}
}
