package train_ticket_booking__app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connection.ConnectionUtil;
import train_ticket_booking__app.model.DisplayTrain;



public class DisplayDAO {
	public static List<DisplayTrain> displayDAOSelect()throws Exception
	{
		List<DisplayTrain> displayTrainList=new ArrayList<DisplayTrain>();
		Connection connection = null;
		connection=ConnectionUtil.getConnection();
		String query3="SELECT*FROM  train_ticket_booking_app_display";
		PreparedStatement statement=connection.prepareStatement(query3);
		ResultSet rs=statement.executeQuery();
		while(rs.next()) {
			Integer id = rs.getInt("train_id");
			String trainName = rs.getString("train_name");
			String trainFrom = rs.getString("train_from");
			String trainTo = rs.getString("train_to");
			String trainTiming = rs.getString("train_timing");
			int ticketRate=rs.getInt("ticket_rate");
			
			DisplayTrain displayTrain = new DisplayTrain();
			displayTrain.setId(id);
			displayTrain.setTrainFrom(trainFrom);
			displayTrain.setTrainName(trainName);
			displayTrain.setTrainRate(ticketRate);
			displayTrain.setTrainTiming(trainTiming);
			displayTrain.setTrainTo(trainTo);
			
			
			displayTrainList.add(displayTrain);
		}
		return displayTrainList;
	}
	public static List<DisplayTrain> findname(DisplayTrain train)throws Exception
	{
		List<DisplayTrain> displayTrainList=new ArrayList<DisplayTrain>();
		Connection connection = null;
		connection=ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your placename:");
		String trainsName=sc.next();
		String query="SELECT*FROM train_ticket_booking_app_display WHERE train_to=?";
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setString(1, trainsName);
		ResultSet rs=statement.executeQuery();
		while(rs.next()) {
			Integer id = rs.getInt("train_id");
			String trainName = rs.getString("train_name");
			String trainFrom = rs.getString("train_from");
			String trainTo = rs.getString("train_to");
			String trainTiming = rs.getString("train_timing");
			int ticketRate=rs.getInt("ticket_rate");
			
			DisplayTrain displayTrain = new DisplayTrain();
			displayTrain.setId(id);
			displayTrain.setTrainFrom(trainFrom);
			displayTrain.setTrainName(trainName);
			displayTrain.setTrainRate(ticketRate);
			displayTrain.setTrainTiming(trainTiming);
			displayTrain.setTrainTo(trainTo);
			
			
			displayTrainList.add(displayTrain);
		}
		
				
		return displayTrainList;
	}
	}


		
	
	
	

