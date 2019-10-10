package HotelInfoPojos;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class HexPosPrices {

    @SerializedName("pos_id")
    public String posId;
    
    @SerializedName("pos_name")
    public String posName;
    
    @SerializedName("pos_price")
    public Long posPrice;
}