package org.hrsystem.classes;


//Creamo la Herencia
public class SalesRep extends Empleoyee {
	double salesMade;
	
	//Constructor automatico por herencia
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
	double salary, int yearsWorked, double salesMade) {
	super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
	this.salesMade = salesMade;
	} // public SalesRep
	
	
	//Punto 4 crear comision de venta
	// comission = 0.1 * salesMade
	public double calculateComission() {
		return 0.1 * this.salesMade;
	} // comsiiion

	
	//toSting automatico
	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", calculateComission()=" + calculateComission()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getRegistration()="
				+ getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()=" + getDaysWorked()
				+ ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()=" + getSalary()
				+ ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus() + "]";
	}//toString
}//claseRep