package com.merchant.dbmodel;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "merchantPrimary")
public class MerchantPrimary {

	

	private String match_type;
	private int match_score;

	@OneToOne(mappedBy = "merchantP", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private MatchDetails match_detail;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int merchantId;
	private String trans_id;
	private String acquirer_id;
	private String network;


	

	

	public int getMerchantId() {
		return merchantId;
	}


	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}


	public String getMatch_type() {
		return match_type;
	}

	
	public void setMatch_type(String match_type) {
		this.match_type = match_type;
	}

	public int getMatch_score() {
		return match_score;
	}

	public void setMatch_score(int match_score) {
		this.match_score = match_score;
	}

	


	public MatchDetails getMatch_detail() {
		return match_detail;
	}

	public void setMatch_detail(MatchDetails match_detail) {
		this.match_detail = match_detail;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getAcquirer_id() {
		return acquirer_id;
	}

	public void setAcquirer_id(String acquirer_id) {
		this.acquirer_id = acquirer_id;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

}
