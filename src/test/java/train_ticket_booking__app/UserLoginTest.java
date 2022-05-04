package train_ticket_booking__app;

import java.sql.ResultSet;
import java.util.Scanner;

import UserValidation.UserRegistrationValidation;
import train_ticket_booking__app.DAO.UserLoginDAO;
import train_ticket_booking__app.DAO.UserRegistrationCommonDAO;
import train_ticket_booking__app.model.UserRegistration;

public class UserLoginTest {
	public static void main(String [] args) throws Exception {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR EMAILID");
		String EMAILID = sc.next();
		System.out.println("ENTER YOUR PASSWORD");
		String PASSWORD = sc.next();
		
		 UserLoginDAO.login(EMAILID, PASSWORD);
	}
}
