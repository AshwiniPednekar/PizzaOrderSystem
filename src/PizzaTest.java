import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {
	
	Pizza nonVeg,veg;
	float total;

	@Before
	public void setUp() throws Exception {
		nonVeg = new Pizza("Chiken", 100, 2, "Non-Veg");
		veg = new Pizza("Corn", 200, 3, "Veg");

		total=total+nonVeg.generatePrice()+veg.generatePrice();
	}

	@Test
	public void testGetName() {
		System.out.println("---------------------------------");
		System.out.println("- - - - - PIZZA Details - - - - -");
		nonVeg.displayDetails();
		veg.displayDetails();
	}


	@Test
	public void testGetPrice() {
	
		System.out.println("Pizza Price BEFORE TAX :"+nonVeg.generatePrice());
		
		System.out.println("Pizza Price BEFORE TAX :"+veg.generatePrice());

		System.out.println("Total Amount:- "+total);
		
		float amount=total;
		float GST;
		float finalamt;
		GST=(amount*8)/100;
		System.out.println("GST AMOUNT:- "+GST);
		finalamt=amount+GST;
		System.out.println("Grand Total amount: " +finalamt);
	}
}

