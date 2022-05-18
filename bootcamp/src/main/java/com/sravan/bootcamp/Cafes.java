package com.sravan.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cafes implements Restaurant{

	@Autowired
	Dealer company;
	public void motto()
	{
		System.out.println("Change the world ! Start with Coffee :) ");
		System.out.println(company);
	}
}
