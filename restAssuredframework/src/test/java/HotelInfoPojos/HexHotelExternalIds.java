package HotelInfoPojos;

import com.google.gson.annotations.*;

import lombok.Data;

@Data
public class HexHotelExternalIds {
	
	@SerializedName("tripadvisor_id")
    public String  tripAdvisorId;
    
    @SerializedName("vendor_id")
    public String  vendorId;
}
