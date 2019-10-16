
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "merchant",
    "category_1",
    "category_2",
    "mcc"
})
public class MatchDetail {

    @JsonProperty("merchant")
    private Merchant_ merchant;
    @JsonProperty("category_1")
    private Category1 category1;
    @JsonProperty("category_2")
    private Category2 category2;
    @JsonProperty("mcc")
    private Mcc mcc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("merchant")
    public Merchant_ getMerchant() {
        return merchant;
    }

    @JsonProperty("merchant")
    public void setMerchant(Merchant_ merchant) {
        this.merchant = merchant;
    }

    @JsonProperty("category_1")
    public Category1 getCategory1() {
        return category1;
    }

    @JsonProperty("category_1")
    public void setCategory1(Category1 category1) {
        this.category1 = category1;
    }

    @JsonProperty("category_2")
    public Category2 getCategory2() {
        return category2;
    }

    @JsonProperty("category_2")
    public void setCategory2(Category2 category2) {
        this.category2 = category2;
    }

    @JsonProperty("mcc")
    public Mcc getMcc() {
        return mcc;
    }

    @JsonProperty("mcc")
    public void setMcc(Mcc mcc) {
        this.mcc = mcc;
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
