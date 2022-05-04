package train_ticket_booking__app;

import java.util.Scanner;

import train_ticket_booking__app.DAO.InsertTrainDetailsDAO;
import train_ticket_booking__app.model.DisplayTrain;
import train_ticket_booking__app.model.UserRegistration;

public class InsertTrainTest {
	
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in );
	System.out.println("Enter Train Name ");
	String trainName=sc.nextLine();
	System.out.println("Enter Train From ");
	String trainFrom=sc.nextLine();
	System.out.println("Enter  To");
	String trainTo=sc.nextLine();
	System.out.println("Enter Train Timing ");
	String trainTiming=sc.nextLine();
	System.out.println("Enter the ticket rate:");
	int ticketRate=sc.nextInt();
	
	
	DisplayTrain insert = new DisplayTrain();
	insert.setTrainName(trainName);
	insert.setTrainFrom(trainFrom);
	insert.setTrainTo(trainTo);
	insert.setTrainTiming(trainTiming);
	insert.setTrainRate(ticketRate);
	
	
	InsertTrainDetailsDAO.insertDAO(insert);
}
}
