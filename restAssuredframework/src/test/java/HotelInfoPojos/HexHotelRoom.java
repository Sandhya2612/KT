
package HotelInfoPojos;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class HexHotelRoom {

    @SerializedName("room_id")
    public Long    roomId;

    @SerializedName("room_name")
    public String  roomName;
    
    @SerializedName("room_description")
    public String  roomDescription;

    @SerializedName("room_details")
    public String  roomDetails;
    
    @SerializedName("ota_rma_ids")
    public int[]  otaRoomAmenityCodes;
    
    @SerializedName("price_details")
    public List<HexPriceDetails> priceDetails;

}