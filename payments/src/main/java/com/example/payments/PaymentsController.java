package com.example.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController {

	@GetMapping("/payments/{id}/")
	public Payments getPayments(@PathVariable int id) {
		Payments pay = new Payments();
		
		pay.setId(id);
		pay.setValue(5.00);
		
		return pay;
	}
}
