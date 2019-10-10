package HotelInfoPojos;

import com.google.gson.annotations.SerializedName;

public class HexTaxBreakupModel {

    @SerializedName("tax_name")
    public String taxName;
    
    @SerializedName("value")
    public Long taxValue;
    
}



