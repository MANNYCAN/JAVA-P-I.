package org.hrsystem.classes;


public class Empleoyee {
	//Crando las propiedades dek objeto
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	
	public Empleoyee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//Constructor Empleoyee

	
	//Automatic Setters and Getetrs
	public String getFirstName() {
		return firstName;
	}//getfirstname

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getRegistration() {
		return registration;
	}//getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration

	public int getAge() {
		return age;
	}//getAge

	public void setAge(int age) {
		this.age = age;
	}//setAge

	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked

	
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}//getVacationDaysTaken

		
	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}//setVacationDaysTaken

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}//getYearsWorked

	
	
	//3 metodo de timetoretirement
	public int timeToRetirement(){
	   // time to retirement = min(60 - age, 40 - yearsWorked)
		return Math.min(60 - age, 40 - yearsWorked);
	}

	public int vacationTimeLeft(){
       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		return (daysWorked / 360) * (30 - vacationDaysTaken);
	}

	public double calculateBonus(){
       // bonus = 2.2*salary
		return 2.2 * salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}//toString
}//Class Empleoyee