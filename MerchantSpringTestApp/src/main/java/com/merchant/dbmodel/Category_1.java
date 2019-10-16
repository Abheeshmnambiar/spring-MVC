package com.merchant.dbmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="category1")
public class Category_1 {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "category1Id")
	private int category_1Id;
	
    private String classification;
   
    private String logoUrl;
  
    @OneToOne
    @JoinColumn(name="matchDetailsId")
    private MatchDetails matchDetails;

    
    
    
    @JsonIgnore
    public int getCategory_1Id() {
		return category_1Id;
	}

    @JsonIgnore
	public void setCategory_1Id(int category_1Id) {
		this.category_1Id = category_1Id;
	}

    @JsonIgnore
	public MatchDetails getMatchDetails() {
		return matchDetails;
	}

    @JsonIgnore
	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}


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

	
	

   
    
   
}
