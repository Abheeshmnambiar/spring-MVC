package com.merchant.token;






import com.fasterxml.jackson.annotation.JsonIgnore;



public class MerchantToken {

    
    private String token;

    
    private Integer expiresIn;
   

    public String getToken() {
        return token;
    }

    
    public void setToken(String token) {
        this.token = token;
    }

    
    public Integer getExpiresIn() {
        return expiresIn;
    }

    
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

   

}


        

    

   
 