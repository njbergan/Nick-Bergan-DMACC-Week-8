package	beanDemo;
import	java.util.List;

public	interface	HotelDao	{
	
	public	void	insert(Hotel	hotel);
	public	void	update(Hotel	hotel);
	public	void	update(List<Hotel>	hotels);
	public	void	delete(long	hotelId);
	
	public	Hotel	find(double	hotelId);
	public	List<Hotel>	find(List<Long>	hotelIds);
	public	List<Hotel>	find(String	ownerName);
	//public	List<Hotel>	find(boolean	locked);
	
	//public void 

}