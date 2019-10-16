package com.merchant.dbmodel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "locationn")
public class Locationn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;

	private String city;
	private String state;
	private String country;
	private String zip;

	@OneToOne
	@JoinColumn(name = "matchDetailsId")
	private Merchant mercha ;

	
   @JsonIgnore
	public int getLocationId() {
		return locationId;
	}
  
    @JsonIgnore
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

   

	public Merchant getMercha() {
		return mercha;
	}

	public void setMercha(Merchant mercha) {
		this.mercha = mercha;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}



	

}
