package	beanDemo;

public	interface	HotelService	{
	
	//public	void	transferMoney(long	sourceAccountId, long targetAccountId, double amount);
	//public	void	depositMoney(long	accountId,	double	amount)	throws	Exception;
	//public	Account	getAccount(long	accountId);
	
	public void addGuests(double roomLevel, double numberOfGuests);
	
	public double getLevelOneGuests();
	public double getLevelTwoGuests();
	public double getAvilableRooms();
	public double getCurrentNumberOfGuests();
	
	//public Hotel getHotel();

}