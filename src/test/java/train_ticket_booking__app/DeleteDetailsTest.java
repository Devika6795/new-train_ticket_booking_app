package train_ticket_booking__app;

import java.util.Scanner;

import train_ticket_booking__app.DAO.DeleteDetailsDAO;

public class DeleteDetailsTest {
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in );
		
		System.out.println("Enter Train Id ");
	Integer trainId=sc.nextInt();
	
	DeleteDetailsDAO.deleteDAO(trainId);

}
}