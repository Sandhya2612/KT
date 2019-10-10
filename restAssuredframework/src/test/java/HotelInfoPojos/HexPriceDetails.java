
package HotelInfoPojos;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class HexPriceDetails {
    
    @SerializedName("buyer_id")
    public Long buyerId;
    
    @SerializedName("currency")
    public String currency;
    
    @SerializedName("price")
    public Long price;
    
    @SerializedName("post_pay")
    public boolean postPay = Boolean.FALSE;
    
    @SerializedName("commission_amount")
    public Long commissionAmount;
    
    @SerializedName("tds_amount")
    public Long tdsAmount;
    
    @SerializedName("description")
    public String description;
    
    @SerializedName("pos")
    public List<HexPosPrices> posPriceListings;
    
    @SerializedName("taxes")
    public List<HexTaxBreakupModel> taxListings;
    
    @SerializedName("total_tax")
    public Long totalTax;
    
    @SerializedName("total_price")
    public Long totalPrice;
    
    @SerializedName("contract_inclusions")
    public ArrayList<String>       contractInclusions;
}