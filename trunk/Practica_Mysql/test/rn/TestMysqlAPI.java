package rn;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMysqlAPI {
	public MysqlAPI m;
	public static Connection con = null;
	public String nom="Pepe";
	public int dni=235623126;
	public int edad=10;
	public String nombre="Maria";
		
	@Test
	public void testinsertar1() throws NoDniException{
		m.insertar(dni, nom, edad);
	}
	
	@Test
	public void testmodificar1() throws DniException, EdadFormatoException, NombreFormatoException{
		m.modificar(dni, nombre);
	}
	
	@Test
	public void testmodificar2() throws DniException, NombreFormatoException, EdadFormatoException{
		m.modificar(dni, edad);
	}
	
	@Test
	public void testgetNom1() throws DniException, NombreFormatoException, EdadFormatoException{
		m.getNom(dni);
		assertEquals(nom,nom);
	}
	
	@Test
	public void testgetEdad1() throws DniException, NombreFormatoException, EdadFormatoException{
		m.getEdad(dni);
		assertEquals(edad,edad);
	}

	@Test
	public void testborrar1() throws DniException, NombreFormatoException, EdadFormatoException{
		m.borrar(dni);
	}
	
	@Before
	public void getUp() throws DniException, NombreFormatoException, EdadFormatoException, NoDniException{
		m=new MysqlAPI();
		m.conectar1("test");
	}
	// -------------------------------------------------------------------------------------------
	
	@Test
	public void consultar() throws DniException, NombreFormatoException, EdadFormatoException, NoDniException{
		m.consultar();
	}
	
	@After
	public void cerrar(){
		m.cerrar();
	}
	}
