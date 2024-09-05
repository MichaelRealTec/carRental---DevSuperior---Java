package model.services;

import model.entities.CarRental;

public class RentalService {
	// Atributo
	private Double pricePerHour;
	private Double pricePerDay;
	// associação com BrazilTaxService
	private BrazilTaxService taxService;
	
	
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
	
	public void setBrazilTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public BrazilTaxService getTaxService() {
		return taxService;
	}
	
	// Método Construtor
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public RentalService() {
		
	}
	
	// Método
	public void processInvoice(CarRental carRental) {
		
	}
	
	
}
