package HotelInfoPojos;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class HexBuyerHotelNameValuePairs {

    @SerializedName("name")
    public String  name;
    
    @SerializedName("value")
    public String  value;

}