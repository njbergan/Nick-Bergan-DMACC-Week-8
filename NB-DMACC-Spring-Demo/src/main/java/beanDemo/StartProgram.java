package	beanDemo;

import	org.springframework.context.annotation.AnnotationConfigApplicationContext;

public	class	StartProgram	{
public	static	void main(String[]	args)	{
	
	double numberOfGuestsToAdd = 10;
	
	AnnotationConfigApplicationContext	applicationContext	=	new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	HotelService hotelService = applicationContext.getBean("hotelService", HotelService.class);
	
	System.out.println("Current number of guests:"+ hotelService.getCurrentNumberOfGuests());
	System.out.println("Floor One Guests: "+ hotelService.getLevelOneGuests());
	System.out.println("Floor Two Guests: "+ hotelService.getLevelTwoGuests());
	System.out.println("Available Rooms:  "+ hotelService.getAvilableRooms());
	
	hotelService.addGuests(2, 5);
	System.out.println("\nAdding "+ numberOfGuestsToAdd + " guests\n");
	
	System.out.println("Current number of guests:"+ hotelService.getCurrentNumberOfGuests());
	System.out.println("Floor One Guests: "+ hotelService.getLevelOneGuests());
	System.out.println("Floor Two Guests: "+ hotelService.getLevelTwoGuests());
	System.out.println("Available Rooms:  "+ hotelService.getAvilableRooms());
	
applicationContext.close();
}
}