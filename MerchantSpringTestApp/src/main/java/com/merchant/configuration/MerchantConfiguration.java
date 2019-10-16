package com.merchant.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "merchant")
public class MerchantConfiguration {

	private MerchantHeader header;

	private String baseUrl;

	public MerchantHeader getHeader() {
		return header;
	}

	public void setHeader(MerchantHeader header) {
		this.header = header;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

}
