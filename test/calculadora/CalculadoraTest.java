package calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {
	private Calculadora c;
	@Test
	public void tests1(){
		//Act
		int resultado= c.s(1, 2);
		//Assert
		assertTrue("Error",3==resultado);
	}
	
	@Test
	public void testr1(){
		//Act
		int resultado= c.r(2, 1);
		//Assert
		assertTrue("Error",1==resultado);
	}
	
	@Test
	public void testm1(){
		//Act
		int resultado= c.m(1, 2);
		//Assert
		assertEquals("Error",2,resultado);
	}
	
	@Test
	public void testd1(){
		//Act
		int resultado= c.d(2, 2);
		//Assert
		assertEquals("Error",1,resultado);
	}
	
	@Test
	public void testd2(){
		//Act
		int resultado=0;
		try{
			resultado= c.d(2, 0);
			//No pasa por aqui para que funcione
			fail("Fallo en la division");
		}
		catch(ArithmeticException e){
			
		}
	}
	
	@Before
	public void setUp(){
		//Arrange
		c=new Calculadora();
	}
}
