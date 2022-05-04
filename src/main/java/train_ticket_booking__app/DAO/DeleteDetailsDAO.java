package train_ticket_booking__app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//import com.display_train.DisplayTrain;

import connection.ConnectionUtil;
import train_ticket_booking__app.model.DisplayTrain;

public class DeleteDetailsDAO {
	public static void deleteDAO(Integer id)throws Exception
	{
		Connection connection = null;
		connection=ConnectionUtil.getConnection();
		PreparedStatement statement = null;
			
			String query="DELETE INTO train_ticket_booking_app_display (train_id)VALUES(?)";
			 statement=connection.prepareStatement(query);
			 statement.setInt(1,id);
			 
			 int rows=statement.executeUpdate();
				
			 
			 if(rows==1) {
					System.out.println("Sucessfully Deleted");
				}
				else {
					System.out.println("Unsucessfull Deleted");
					
				}
			 
			
		
	}
	}



