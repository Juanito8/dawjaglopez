package estados;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BuscaminasTest {
	private Buscaminas b;
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor1(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(3, 1);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor2(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(4, 1);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor3(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(5, 1);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor4(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(3, 2);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor5(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(5, 2);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor6(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(3, 3);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor7(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(4, 3);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor8(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(5, 3);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Mina en i-4 y m-2
	 */
	@Test
	public void testnumMinasAlrededor9(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,true,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(4, 2);
		assertEquals("Mina",0,numMinas);
	}
	/**
	 * Esquina superior 0,0 no tiene minas
	 */
	@Test
	public void testnumMinasAlrededor10(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(0, 0);
		assertEquals("Mina alrededor 0",0,numMinas);
	}
	/**
	 * Arriba
	 */
	@Test
	public void testnumMinasAlrededor11(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,true,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(8, 0);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Abajo
	 */
	@Test
	public void testnumMinasAlrededor12(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,true,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(6, 8);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Derecha 1 mina
	 */
	@Test
	public void testnumMinasAlrededor13(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,true},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(8, 7);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Izquierda 1 mina
	 */
	@Test
	public void testnumMinasAlrededor14(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{true,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(0, 8);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	/**
	 * Esquina inferior izquierda
	 */
	@Test
	public void testnumMinasAlrededor15(){
		boolean[][] arrayMinas=
			{
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false,false},
				{true,false,false,false,false,false,false,false,false},
			};
		b.setArrayMinas(arrayMinas);
		int numMinas=b.testNumMinasAlrededor(1, 8);
		assertEquals("Mina alrededor 1",1,numMinas);
	}
	@Before
	public void getUp(){
		b=new Buscaminas();
	}
}
