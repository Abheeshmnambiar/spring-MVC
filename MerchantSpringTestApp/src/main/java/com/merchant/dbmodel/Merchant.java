package com.merchant.dbmodel;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "merchantt1Id")
	private int merchantt1Id;

   
    private String classification;
   
    private String logoUrl;
  
    @OneToOne(mappedBy = "mercha", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Locationn location;
    
  
    @OneToOne 
    @JoinColumn(name="matchDetailsId")
    private MatchDetails matchDetails;

  
    public String getClassification() {
        return classification;
    }

    
    public void setClassification(String classification) {
        this.classification = classification;
    }

   
    public String getLogoUrl() {
        return logoUrl;
    }

   
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

   @JsonIgnore
	public int getMerchantt1Id() {
		return merchantt1Id;
	}

   @JsonIgnore
	public void setMerchantt1Id(int merchantt1Id) {
		this.merchantt1Id = merchantt1Id;
	}

   
	public Locationn getLocation() {
		return location;
	}


	public void setLocation(Locationn location) {
		this.location = location;
	}

	@JsonIgnore
	public MatchDetails getMatchDetails() {
		return matchDetails;
	}

	@JsonIgnore
	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}

    
    

   
	
}
