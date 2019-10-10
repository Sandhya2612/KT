package HotelInfoPojos;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class HexSearchHotel {

    @SerializedName("id")
    public Long        id;
    
    @SerializedName("external_ids")
    public HexHotelExternalIds externalIds;
    
    @SerializedName("attributes")
    public List<HexBuyerHotelNameValuePairs> nameValuePairs;

    @SerializedName("name")
    public String       name;

    @SerializedName("rating")
    public Integer      starRating;

    @SerializedName("addLine1")
    public String       addLine1;

    @SerializedName("addLine2")
    public String       addLine2;

    @SerializedName("amenities")
    public String       amenities;
    
    @SerializedName("ota_hac_ids")
    public int[]       amenitiesOTAcode;

    @SerializedName("city_id")
    public Long         cityId;

    @SerializedName("city_name")
    public String      cityName;
    
    @SerializedName("pin_code")
    public String       pinCode;

    @SerializedName("phone_number")
    public String       phoneNumber;
    
    @SerializedName("check_in_time")
    public String       checkInTime;
    
    @SerializedName("check_out_time")
    public String       checkOutTime;
    
    @SerializedName("latitude")
    public String       latitude;

    @SerializedName("longitude")
    public String       longitude;

    @SerializedName("primaryImageLink")
    public String       primaryImageLink;
    
    @SerializedName("secondaryImageLinks")
    public List<String>       secondaryImageLinks;

    @SerializedName("desc")
    public String       desc;

    @SerializedName("location_id")
    public Long         locationId;
    
    @SerializedName("location")
    public String         locationName;
    
    @SerializedName("rack_rate")
    public Long         rackRate;

    @SerializedName("room")
    public HexHotelRoom room;

    @SerializedName("contract_type")
    public String       contractType;

    @SerializedName("commissionable")
    public Boolean    commissionable;


    @SerializedName("contract_rate_type")
    public String       contractRateType;
    
}