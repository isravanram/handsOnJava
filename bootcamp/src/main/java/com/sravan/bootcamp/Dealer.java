package com.sravan.bootcamp;

public class Dealer {

	private String company;

	public Dealer(String company) {
		super();
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Dealer [company=" + company + "]";
	}
	
}
