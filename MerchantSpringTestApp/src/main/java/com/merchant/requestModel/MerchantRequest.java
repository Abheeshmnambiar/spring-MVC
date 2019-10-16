package com.merchant.requestModel;



import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;



public class MerchantRequest {

    @JsonProperty("ucic")
    private String ucic;
    @JsonProperty("uaic")
    private String uaic;
    @JsonProperty("terminal_id")
    private String terminalId;
    @JsonProperty("acquirer_id")
    private String acquirerId;
    @JsonProperty("merchant_id")
    private String merchantId;
    @JsonProperty("merchant_description")
    private String merchantDescription;
    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("trans_amount")
    private Double transAmount;
    @JsonProperty("trans_timestamp")
    private String transTimestamp;
    @JsonProperty("trans_vehicle")
    private String transVehicle;
    @JsonProperty("trans_category")
    private String transCategory;
    @JsonProperty("trans_type")
    private String transType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ucic")
    public String getUcic() {
        return ucic;
    }

    @JsonProperty("ucic")
    public void setUcic(String ucic) {
        this.ucic = ucic;
    }

    @JsonProperty("uaic")
    public String getUaic() {
        return uaic;
    }

    @JsonProperty("uaic")
    public void setUaic(String uaic) {
        this.uaic = uaic;
    }

    @JsonProperty("terminal_id")
    public String getTerminalId() {
        return terminalId;
    }

    @JsonProperty("terminal_id")
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    @JsonProperty("acquirer_id")
    public String getAcquirerId() {
        return acquirerId;
    }

    @JsonProperty("acquirer_id")
    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    @JsonProperty("merchant_id")
    public String getMerchantId() {
        return merchantId;
    }

    @JsonProperty("merchant_id")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @JsonProperty("merchant_description")
    public String getMerchantDescription() {
        return merchantDescription;
    }

    @JsonProperty("merchant_description")
    public void setMerchantDescription(String merchantDescription) {
        this.merchantDescription = merchantDescription;
    }

    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    @JsonProperty("trans_amount")
    public Double getTransAmount() {
        return transAmount;
    }

    @JsonProperty("trans_amount")
    public void setTransAmount(Double transAmount) {
        this.transAmount = transAmount;
    }

    @JsonProperty("trans_timestamp")
    public String getTransTimestamp() {
        return transTimestamp;
    }

    @JsonProperty("trans_timestamp")
    public void setTransTimestamp(String transTimestamp) {
        this.transTimestamp = transTimestamp;
    }

    @JsonProperty("trans_vehicle")
    public String getTransVehicle() {
        return transVehicle;
    }

    @JsonProperty("trans_vehicle")
    public void setTransVehicle(String transVehicle) {
        this.transVehicle = transVehicle;
    }

    @JsonProperty("trans_category")
    public String getTransCategory() {
        return transCategory;
    }

    @JsonProperty("trans_category")
    public void setTransCategory(String transCategory) {
        this.transCategory = transCategory;
    }

    @JsonProperty("trans_type")
    public String getTransType() {
        return transType;
    }

    @JsonProperty("trans_type")
    public void setTransType(String transType) {
        this.transType = transType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
	
	
	
	
	
	
	
	


