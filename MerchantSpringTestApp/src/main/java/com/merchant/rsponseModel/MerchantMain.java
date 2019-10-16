 
package com.merchant.rsponseModel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MerchantMain {

    @JsonProperty("match_type")
    private String matchType;
    @JsonProperty("match_score")
    private Integer matchScore;
    @JsonProperty("match_detail")
    private MatchDetail matchDetail;
    
   
    @JsonProperty("merchant_id")
    private String merchantId;
    @JsonProperty("trans_id")
    private String transId;
    @JsonProperty("acquirer_id")
    private String acquirerId;
    @JsonProperty("network")
    private String network;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match_type")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("match_type")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @JsonProperty("match_score")
    public Integer getMatchScore() {
        return matchScore;
    }

    @JsonProperty("match_score")
    public void setMatchScore(Integer matchScore) {
        this.matchScore = matchScore;
    }

    @JsonProperty("match_detail")
    public MatchDetail getMatchDetail() {
        return matchDetail;
    }

    @JsonProperty("match_detail")
    public void setMatchDetail(MatchDetail matchDetail) {
        this.matchDetail = matchDetail;
    }

    @JsonProperty("merchant_id")
    public String getMerchantId() {
        return merchantId;
    }

    @JsonProperty("merchant_id")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @JsonProperty("trans_id")
    public String getTransId() {
        return transId;
    }

    @JsonProperty("trans_id")
    public void setTransId(String transId) {
        this.transId = transId;
    }

    @JsonProperty("acquirer_id")
    public String getAcquirerId() {
        return acquirerId;
    }

    @JsonProperty("acquirer_id")
    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
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
