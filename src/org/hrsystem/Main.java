//Importar paqueterias 
package org.hrsystem;
import org.hrsystem.classes.Empleoyee;
import org.hrsystem.classes.SalesMan;
import org.hrsystem.classes.SalesRep;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleoyee empleoyee = new Empleoyee(
				"Manuel", "Cantoran"
				, 12, 23, 365, 14
				, 25000.0, 5);
		
		SalesRep salesrep = new SalesRep(
				"Julia", "Cantoran"
				, 11, 45, 365, 15
				, 35000.0, 20
				, 25000.0);
		
		SalesMan salesman = new SalesMan(
				"Andrea", "Castellanos"
				, 10, 22, 365, 20
				, 40000.0, 3
				, 40000.0
				, new HashMap<>());

		System.out.println(empleoyee);
        System.out.println(salesrep);
        System.out.println(salesman);
	}

}