package	beanDemo;
import	java.util.ArrayList;
import	java.util.HashMap;
import	java.util.List;
import	java.util.Map;

public	class	HotelDaoInMemoryImpl	implements	HotelDao{
	
	private	Map<Long,	Hotel>	hotelsMap	=	new	HashMap<Long,	Hotel>();
	{
		Hotel	hotel1	=	new	Hotel(1L,	"John",	10);
		//Hotel	hotel2	=	new	Hotel(2L,	"Mary",	20);
		hotelsMap.put(hotel1.getId(),	hotel1);
		//hotelsMap.put(hotel2.getId(),	hotel2);
	}
	public void insert(Hotel	hotel)	{
		hotelsMap.put(hotel.getId(),	hotel);
	}
	public void update(Hotel	hotel)	{
		hotelsMap.put(hotel.getId(),	hotel);
	}
	public void update(List<Hotel>	hotels)	{
		for(Hotel	hotel:	hotels){
			update(hotel);
		}
	}
	public void delete(long hotelId) {
		hotelsMap.remove(hotelId);
	}
	public Hotel find(long hotelId) {
		return	hotelsMap.get(hotelId);
	}
	public List<Hotel> find(List<Long> hotelIds) {
		List<Hotel> hotels = new ArrayList<Hotel>();
		for(Long id: hotelIds){
			hotels.add(hotelsMap.get(id));
		}
		return hotels;
	}
	public	List<Hotel>	find(String	ownerName)	{
		List<Hotel>	hotels	=	new	ArrayList<Hotel>();
		for(Hotel	hotel:	hotelsMap.values()){
			if(ownerName.equals(hotel.getOwnerName())){
				hotels.add(hotel);
			}
		}
		return	hotels;
	}
	public	List<Hotel>	find(boolean	locked)	{
		List<Hotel>	hotels	=	new	ArrayList<Hotel>();
		for(Hotel	hotel:	hotelsMap.values()){
			if(locked	==	(hotel.isLocked())){
				hotels.add(hotel);
			}
		}
		return	hotels;
	}
}