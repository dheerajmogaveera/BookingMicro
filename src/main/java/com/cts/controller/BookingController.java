package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Booking;
import com.cts.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bs;
	
	@PostMapping("/bookFlight")
	public Booking bookFlight(@RequestBody Booking b)
	{
		System.out.println(b.getFlightId()+""+b.getId());
		return bs.addBooking(b);
	}
	
}
