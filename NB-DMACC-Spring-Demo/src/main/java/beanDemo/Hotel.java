package	beanDemo;

//import	java.util.Date;

public	class	Hotel	{
	
	//private	long	id;
	//private	String	ownerName;
	//private	double	balance;
	//private	Date	accessTime;
	//private	boolean	locked;
	
	private double hotelId, levelOneGuests, levelTwoGuests;
	
	
	final private double LEVEL_ONE_NUMBER_OF_ROOMS = 150, LEVEL_TWO_NUMBER_OF_ROOMS = 200;
	
	
	
	public	Hotel(){
	}
	
	public	Hotel(double id, double levelOneGuests, double levelTwoGuests)	{
		this.hotelId = id;
		this.levelOneGuests	=	levelOneGuests;
		this.levelTwoGuests	=	levelTwoGuests;
		

	}
	//create	getters	and	setters	too
	
	public double getId() {
		return hotelId;
	}
	
	public double getNumberOfRooms(double levelNumber) {
		if (levelNumber == 1) {
			return LEVEL_ONE_NUMBER_OF_ROOMS;
		} else if (levelNumber == 2) {
			return LEVEL_TWO_NUMBER_OF_ROOMS;
		} else {
			return 0;
		}
	}
	
	public double getNumberOfGuests(double levelNumber) {
		if (levelNumber == 1) {
			return levelOneGuests;
		} else if (levelNumber == 2) {
			return levelTwoGuests;
		} else {
			return 0;
		}
	}
	
	public void removeGuest(double hotelNumber, double numberOfGuests) {
		hotelNumber = this.hotelId;
		//numberOfGuests
	}
	

}