//package com.merchant.dbmodel;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name="mcc")
//public class Mcc {
//	
//	
//
//	@Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    @Column(name = "mccId")
//	private int mccId;
//	
//    private String classification;
//   
//    private Object logoUrl;
//  
//    @OneToOne 
//    @JoinColumn(name="matchDetailsId")
//    private MatchDetails matchDetails;
//
//    
//    
//    
//   
//   
//	
//    @JsonIgnore
//	public int getMccId() {
//		return mccId;
//	}
//    
//    @JsonIgnore
//	public void setMccId(int mccId) {
//		this.mccId = mccId;
//	}
//
//	@JsonIgnore
//	public MatchDetails getMatchDetails() {
//		return matchDetails;
//	}
//
//    @JsonIgnore
//	public void setMatchDetails(MatchDetails matchDetails) {
//		this.matchDetails = matchDetails;
//	}
//
//
//	public String getClassification() {
//        return classification;
//    }
//
//    
//    public void setClassification(String classification) {
//        this.classification = classification;
//    }
//
//   
//    public Object getLogoUrl() {
//        return logoUrl;
//    }
//
//    
//    public void setLogoUrl(Object logoUrl) {
//        this.logoUrl = logoUrl;
//    }
//	
//
//}
//
//	
//
//
