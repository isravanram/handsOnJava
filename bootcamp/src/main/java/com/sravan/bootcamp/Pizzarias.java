package com.sravan.bootcamp;

import org.springframework.stereotype.Component;

@Component
public class Pizzarias implements Restaurant{

	public void motto()
	{
		System.out.println("Problems come and go , Pizzas are forever !");
	}
}
