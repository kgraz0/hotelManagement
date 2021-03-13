package hotelManagement;

public class Booking {
	
	String personName;
	Hotel hotel;
	Room room;
	
	Booking(String personName, Hotel hotel, Room room) {
		this.personName = personName;
		this.hotel = hotel;
		this.room = room;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
}
