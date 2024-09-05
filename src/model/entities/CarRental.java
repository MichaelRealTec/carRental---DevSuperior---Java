package model.entities;

import java.util.Date;

public class CarRental {
	// Atributo
	private Date start;
	private Date finish;
	private Vehicle vehicle;
	private Invoice invoice;
	
	// Método Getter e Setter
	
	public void setStart(Date start) {
		this.start = start;
	}
	
	public Date getStart() {
		return start;
	}
	
	public void setFinish(Date finish) {
		this.finish = finish;
	}
	
	public Date getFinish() {
		return finish;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	// Método construtor
	public CarRental() {
		
	}
	
	public CarRental(Date start, Date finish) {
		this.start = start;
		this.finish = finish;
	}
	
	// Método
}
