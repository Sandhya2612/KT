package ApiTesting;

public class HexHotelSearchwithPost {
	private String city;
	private String rooms;
	private String check_in_date;
	private String check_out_date;
	private	String key;
	private String buyer_id;
	private String corporate_buyer_id;
	private roomwisePaxInfo[] roomwisePax;
	
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getRooms(){
		return rooms;
	}
	
	public void setRooms(String rooms){
		this.rooms = rooms;
	}
	
	public String getCheck_in_date(){
		return check_in_date;
	}
	
	public void setCheck_in_date(String check_in_date){
		this.check_in_date = check_in_date;
	}
	public String getCheck_out_date(){
		return check_out_date;
	}
	
	public void setCheck_out_date(String check_out_date){
		this.check_out_date = check_out_date;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key=key;
	}
	
	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getCorporate_buyer_id() {
		return corporate_buyer_id;
	}

	public void setCorporate_buyer_id(String corporate_buyer_id) {
		this.corporate_buyer_id = corporate_buyer_id;
	}

	public roomwisePaxInfo[] getRoomwisePax() {
		return roomwisePax;
	}

	public void setRoomwisePax(roomwisePaxInfo[] roomwisePax) {
		this.roomwisePax = roomwisePax;
	}

	

	

	
}
