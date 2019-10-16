/*
 * package com.merchant.dbmodel;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnore;
 * 
 * 
 * @Entity
 * 
 * @Table(name="Category2") public class Category_2 {
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO)
 * 
 * @Column(name = "category2Id") private int category_2Id;
 * 
 * private String classification;
 * 
 * private Object logoUrl;
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="matchDetailsId") private MatchDetails matchDetails;
 * 
 * 
 * 
 * 
 * 
 * @JsonIgnore public int getCategory_2Id() { return category_2Id; }
 * 
 * @JsonIgnore public void setCategory_2Id(int category_2Id) { this.category_2Id
 * = category_2Id; }
 * 
 * @JsonIgnore public MatchDetails getMatchDetails() { return matchDetails; }
 * 
 * @JsonIgnore public void setMatchDetails(MatchDetails matchDetails) {
 * this.matchDetails = matchDetails; }
 * 
 * 
 * public String getClassification() { return classification; }
 * 
 * 
 * public void setClassification(String classification) { this.classification =
 * classification; }
 * 
 * 
 * public Object getLogoUrl() { return logoUrl; }
 * 
 * 
 * public void setLogoUrl(Object logoUrl) { this.logoUrl = logoUrl; }
 * 
 * 
 * }
 */