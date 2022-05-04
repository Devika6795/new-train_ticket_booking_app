package train_ticket_booking__app.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import connection.ConnectionUtil;
import train_ticket_booking__app.model.DisplayTrain;



public class InsertTrainDetailsDAO {
public static void insertDAO(DisplayTrain ds) throws Exception {
	Connection connection = null;
	connection=ConnectionUtil.getConnection();
	PreparedStatement statement = null;
		
		String query="INSERT INTO train_ticket_booking_app_display (train_name,train_from,train_to,train_timing,ticket_rate)VALUES(?,?,?,?,?)";
		 statement=connection.prepareStatement(query);
		 statement.setString(1, ds.getTrainName());
		 statement.setString(2, ds.getTrainFrom());
		 statement.setString(3, ds.getTrainTo());
		 statement.setString(4, ds.getTrainTiming());
		 statement.setInt(5,  ds.getTrainRate());
		 int rows=statement.executeUpdate();
			
		 
		 if(rows==1) {
				System.out.println("Sucessfully Inserted");
			}
			else {
				System.out.println("Unsucessfull Inserted");
				
			}
		 
		
	
}
}