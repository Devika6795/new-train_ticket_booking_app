package UserValidation;

import train_ticket_booking__app.model.UserRegistration;

public class UserRegistrationValidation {
	public static int userRegistrationValidation(UserRegistration object1) {
		int isValid = 0;
		if(object1.getUserName().isEmpty())
		{
			System.out.println("Invalid User Name");
			isValid =1;
		}
	    if(object1.getEmailId().isEmpty()||(!object1.getEmailId().contains("@gmail.com")))
		{
			System.out.println("Invalid EmailId");
			isValid =1;
			
		}
		if(object1.getPassword().isEmpty()||(!(object1.getPassword().length()>=8)))
		{
			System.out.println("Invalid Password");
			isValid =1;
		}
		if(object1.getPhoneNumber().isEmpty()||(!(object1.getPhoneNumber().length()==10)))
		{
			System.out.println("Invalid PhoneNumber");
		}
		
		return isValid;
	}

}
