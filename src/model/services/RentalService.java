package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	// Atributo
	private Double pricePerHour;
	private Double pricePerDay;
	// associação com BrazilTaxService
	private TaxService taxService;
	
	
	// Método Getter e Setter
	
	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public Double getPricePerHour() {
		return pricePerHour;
	}
	
	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public Double getPricePerDay() {
		return pricePerDay;
	}
	
	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public TaxService getTaxService() {
		return taxService;
	}
	
	// Método Construtor
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public RentalService() {
		
	}
	
	// Método
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime(); // instante 1 ou t1 pega o carRental no momento que foi alugado e o tempo em milesegundos
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60; // t2 - t1 = diferença em milesegundos. para converter em segundos divido por 1000. para converter de segundos para minutos dividir por 60 e para converter para hora dividir mais uma vez por 60.
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}
