package train_ticket_booking__app;

import java.util.Scanner;

import UserValidation.UserRegistrationValidation;
import train_ticket_booking__app.DAO.UserRegistrationCommonDAO;
import train_ticket_booking__app.model.UserRegistration;

public class UserRegistrationTest {
	public static void main(String [] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String NAME = sc.next();
		System.out.println("ENTER YOUR EMAILID");
		String EMAILID = sc.next();
		System.out.println("ENTER YOUR PASSWORD");
		String PASSWORD = sc.next();
		System.out.println("ENETR YOUR PHONENUMBER");
		String PHONENUMBER = sc.next();
		
		
		UserRegistration store = new UserRegistration ();
		store.setEmailId(EMAILID);
		store.setUserName(NAME);
		store.setPassword(PASSWORD);
		store.setPhoneNumber(PHONENUMBER);
		UserRegistrationValidation validation = new UserRegistrationValidation();
		int check=validation.userRegistrationValidation(store);
		if(check==0) {
			UserRegistrationCommonDAO user = new UserRegistrationCommonDAO();
			user.userRegistrationCommonDAO(store);
		}
		else {
			System.out.println("Register Unsuccessfull");
		}
		
		
		
	}

}
