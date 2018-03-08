package	beanDemo;

public	class	HotelServiceImpl	implements	HotelService{
	private	HotelDao	hotelDao;
	public	HotelDao	getHotelDao()	{
		return	hotelDao;
	}
	
	public	void	setHotelDao(HotelDao	hotelDao)	{
		this.hotelDao	=	hotelDao;
	}

	
	public void addGuest(double hotelId, double hotelFloorNumber, double guestNumber) {
		Hotel currentHotel = hotelDao.find(hotelId);
		//currentHotel
	}
	
	/*
	public	void transferMoney(long sourceHotelId, long targetHotelId, double amount)	{
		Hotel	sourceHotel	=	hotelDao.find(sourceHotelId);
		Hotel	targetHotel	=	hotelDao.find(targetHotelId);
		sourceHotel.setBalance(sourceHotel.getBalance()	- amount);
		targetHotel.setBalance(targetHotel.getBalance()	+	amount);
		hotelDao.update(sourceHotel);
		hotelDao.update(targetHotel);
	}
	
	public	void	depositMoney(long	hotelId,	double	amount)	throws	Exception	{
		Hotel	hotel	=	hotelDao.find(hotelId);
		hotel.setBalance(hotel.getBalance()	+	amount);
		hotelDao.update(hotel);
	}
	*/
	
	public	Hotel	getHotel(long	hotelId)	{
		return	hotelDao.find(hotelId);
	}
	
	/**
	 * double roomLevel
	 * double numberOfGuests
	 */
	public void addGuests(double roomLevel, double numberOfGuests) {
		
	}
	
	public double getLevelOneGuests() {
		//hotel.setBalance(3);
		return 5;
	}
	
	public double getLevelTwoGuests() {
		return 6;
	}
	
	public double getAvilableRooms() {
		return 2;
	}
	
	public double getCurrentNumberOfGuests() {
		return (getLevelOneGuests() + getLevelTwoGuests());
	}
	
}