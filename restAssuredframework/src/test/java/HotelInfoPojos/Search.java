package HotelInfoPojos;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Search {
	
	 @SerializedName("hotels")
	 public List<HexSearchHotel>   hotels;
	 
	 @SerializedName("status")
	 public String status;

}
