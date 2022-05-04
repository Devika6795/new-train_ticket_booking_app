package train_ticket_booking__app;

import java.util.List;

import train_ticket_booking__app.DAO.DisplayDAO;
import train_ticket_booking__app.model.DisplayTrain;



public class DisplayTest {
	public static void main(String [] args) throws Exception {

	
		//List<DisplayTrain> train=DisplayDAO.displayDAOSelect();
		//for(DisplayTrain obj:train) {
		//System.out.println(obj);
		DisplayTrain obj2 = new DisplayTrain();
		
		List<DisplayTrain> train=DisplayDAO.findname(obj2);
		for(DisplayTrain obj:train) {
		System.out.println(obj);

		}
		
	}

}
