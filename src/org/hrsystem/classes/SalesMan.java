package org.hrsystem.classes;
import java.util.HashMap;


//Harencia para salario manager
//Laherencia apica una objeto a objerto, entonces 
//tomamos la herencia del objeto SalesRep
public class SalesMan extends SalesRep {
	private HashMap <Integer,SalesRep> salesTeam;

	//Constructor automatico por herencia
	public SalesMan(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}//constructor 
	
	//venta de comision
	// 0.03 * all sales made by team
	   public double calculateComission(){ 
		   double sales = 0;
		    //for( :())
		    return 0.03 * sales;
	   }//comision
	   
	  
	//Getter y Setter automatico 
	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}//get
	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}//set

	//toString
	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", salesMade=" + salesMade + ", calculateComission()="
				+ calculateComission() + ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()="
				+ getAge() + ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()="
				+ getVacationDaysTaken() + ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked()
				+ ", timeToRetirement()=" + timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft()
				+ ", calculateBonus()=" + calculateBonus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}//toString	   
}//ClassMan