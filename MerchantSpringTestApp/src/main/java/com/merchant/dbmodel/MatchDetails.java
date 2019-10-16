package com.merchant.dbmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="matchdetails")
public class MatchDetails {
	
	
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name = "matchDetailsId")
   private int matchDetailsId;	 
	
   @OneToOne(mappedBy = "matchDetails",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private   Merchant merchant;      

   @OneToOne(mappedBy = "matchDetails",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private 	 Category_1 category_1;  
   
	
	
	 @OneToOne(mappedBy = "matchDetails",cascade = CascadeType.ALL,fetch=
	 FetchType.LAZY) private Category_1 category_2;
	 
	 



   @OneToOne(mappedBy = "matchDetails",cascade = CascadeType.ALL,fetch= FetchType.EAGER)
   private   Category_1  mcc;
   
	
	 @OneToOne (cascade = CascadeType.ALL)
	 @JoinColumn(name="id")
     private MerchantPrimary merchantP;
   
   
   
  
   
   

@JsonIgnore
public int getMatchDetailsId() {
	return matchDetailsId;
}
@JsonIgnore
public void setMatchDetailsId(int matchDetailsId) {
	this.matchDetailsId = matchDetailsId;
}












public Merchant getMerchant() {
	return merchant;
}
public void setMerchant(Merchant merchant) {
	this.merchant = merchant;
}

@JsonIgnore
public MerchantPrimary getMerchantP() {
	return merchantP;
}
@JsonIgnore
public void setMerchantP(MerchantPrimary merchantP) {
	this.merchantP = merchantP;
}
public Category_1 getCategory_1() {
	return category_1;
}
public void setCategory_1(Category_1 category_1) {
	this.category_1 = category_1;
}

public Category_1 getMcc() {
	return mcc;
}
public void setMcc(Category_1 mcc) {
	this.mcc = mcc;
}
public Category_1 getCategory_2() {
	return category_2;
}
public void setCategory_2(Category_1 category_2) {
	this.category_2 = category_2;
}

	



	
	
	

}
