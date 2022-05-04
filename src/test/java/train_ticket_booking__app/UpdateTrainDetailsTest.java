package train_ticket_booking__app;

import java.util.Scanner;

import train_ticket_booking__app.DAO.UpdateTrainDetailsDAO;
import train_ticket_booking__app.model.DisplayTrain;

public class UpdateTrainDetailsTest {
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in );
	System.out.println("Enter Train Name ");
	String trainName=sc.nextLine();
	System.out.println("Enter Train From ");
	String trainFrom=sc.nextLine();
	
	/*DisplayTrain update = new DisplayTrain();
	update.setTrainName(trainName);
	update.setTrainFrom(trainFrom);*/
	
	UpdateTrainDetailsDAO.updateDAO();
	
}
}