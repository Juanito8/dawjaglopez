package rn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	/**
	 * Clase que contiene los metodos para utilizar la base de datos.
	 *
	 * 
	 * 
	 * @author Juan Antonio Garcia
	 */
public class MysqlAPI {
	public static Connection con = null;
/**
 * Conectar con la base de datos de MYSQL
 * 	
 * @throws DniException
 * @throws NombreFormatoException
 * @throws EdadFormatoException
 * @throws NoDniException
 */
public void conectar() throws DniException, NombreFormatoException, EdadFormatoException, NoDniException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e) {
			System.out.println("Carga");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/personas", "root","root");
		} 
		catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}
	}
	/**
	 * Para conectar con la base de datos de prueba para test
	 * 
	 * @param test
	 * @throws DniException
	 * @throws NombreFormatoException
	 * @throws EdadFormatoException
	 * @throws NoDniException
	 */
public void conectar1(String test) throws DniException, NombreFormatoException, EdadFormatoException, NoDniException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e) {
			System.out.println("Carga");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/personastest", "admin","admin");
		} 
		catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que inserta valores en la base de datos Mysql
	 *
	 * @param dni
	 * @param nom
	 * @param edad
	 * 
	 * @throws NoDniException
	 * 
	 */
public void insertar(int dni, String nom, int edad) throws NoDniException{
	try {
		dni(dni);
		nombre(nom);
		edad(edad);
		
		nom="'"+nom+"'";
		PreparedStatement sentencia = con
				.prepareStatement("insert into personas values("+dni+","+nom+","+edad+")");
		

		sentencia.execute();
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (DniException e){
		System.out.println("DniException");
	}
	catch(NombreFormatoException e){
		System.out.println("NombreFormatoException");
	}
	catch(EdadFormatoException e){
		System.out.println("EdadFormatoException");
	}
	

}

	/**
	 * Metodo que borra una fila por el parametro de dni en la base de datos Mysql
	 * 
	 * @param dni
	 * 
	 * @throws DniException
	 * @throws NombreFormatoException
	 * @throws EdadFormatoException
	 * 
	 */
public void borrar(int dni) throws DniException, NombreFormatoException, EdadFormatoException{
	try {
		dniNo(dni);
		
		PreparedStatement sentencia = con
				.prepareStatement("delete from personas where dni="+dni+"");
		

		sentencia.execute();
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (NoDniException e){
		System.out.println("DniException");
	}
}
	
	/**
	 * Metodo que modifica el nombre en la fila que tiene el dni que adquiere por parametros en la base de datos Mysql
	 * 
	 * @param dni
	 * @param nombre
	 * 
	 * @throws DniException
	 * @throws EdadFormatoException
	 * 
	 */
public void modificar(int dni, String nombre) throws DniException, EdadFormatoException{
	try {
		dniNo(dni);
		nombre(nombre);
		nombre="\""+nombre+"\"";
		PreparedStatement sentencia = con
				.prepareStatement("update personas set nom="+nombre+" where dni="+dni+"");
		

		sentencia.execute();
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (NoDniException e){
		System.out.println("DniException");
	}
	catch(NombreFormatoException e){
		System.out.println("NombreFormatoException");
	}
}

	/**
	 * Metodo que modifica la edad en la fila que tiene el dni que adquiere por parametros en la base de datos Mysql
	 * 
	 * @param dni
	 * @param edad
	 * 
	 * @throws DniException
	 * @throws NombreFormatoException
	 * 
	 */
public void modificar(int dni, int edad) throws DniException, NombreFormatoException{
	try {
		dniNo(dni);
		edad(edad);
		
		PreparedStatement sentencia = con
				.prepareStatement("update personas set edad="+edad+" where dni="+dni+"");
		

		sentencia.execute();
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (NoDniException e){
		System.out.println("DniException");
	}
	catch(EdadFormatoException e){
		System.out.println("EdadFormatoException");
	}
}
	
	/**
	 * Metodo que entrega el nombre de la fila que tiene el dni que adquiere por parametros en la base de datos Mysql
	 * 
	 * @param dni
	 *
	 * @throws DniException
	 * @throws NombreFormatoException
	 * @throws EdadFormatoException
	 * 
	 */
public String getNom(int dni) throws DniException, NombreFormatoException, EdadFormatoException{
	String nombreDni="";
	try {
		dniNo(dni);
		
		PreparedStatement sentencia = con
				.prepareStatement("select * from personas where dni="+dni+"");
		
		sentencia.executeQuery();
		
		ResultSet r= sentencia.getResultSet();// Guarda el resultadola consulta
		while (r.next()) { // Avnaza por la filas para mostralos
			int dniBD=r.getInt("dni");
			if (dni==dniBD){
				nombreDni=r.getString("nom");
			}
		}
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (NoDniException e){
		System.out.println("DniException");
	}
	return nombreDni;
}
	
	/**
	 * Metodo que entrega la edad de la fila que tiene el dni que adquiere por parametros en la base de datos Mysql
	 * 
	 * @param dni
	 *
	 * @throws DniException
	 * @throws NombreFormatoException
	 * @throws EdadFormatoException
	 * 
	 */
public int getEdad(int dni) throws DniException, NombreFormatoException, EdadFormatoException{
	int edadBd=0;
	try {
		dniNo(dni);
		
		PreparedStatement sentencia = con
				.prepareStatement("select * from personas where dni="+dni+"");
		
		sentencia.executeQuery();
		
		ResultSet r= sentencia.getResultSet();
		while (r.next()) {
			int dniBD=r.getInt("dni");
			if (dni==dniBD){
				edadBd=r.getInt("edad");
			}
		}
		sentencia.close();
	} catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("SQLException");
	}
	catch (NoDniException e){
		System.out.println("DniException");
	}
	return edadBd;
}



// -------------------------------------------------------------------------------------------



/**
 * Busca en la base de datos si el dni esta
 * 
 * @param dni
 * @throws DniException
 */
private static void dni(int dni) throws DniException{
	try{
	PreparedStatement sentencia = con
			.prepareStatement("select dni from personas");

	
	sentencia.executeQuery();
	
	ResultSet r= sentencia.getResultSet();// Guarda el resultadola consulta
	while (r.next()) { // Avnaza por la filas para mostralos
		int dniBd=r.getInt("dni");
		if (dni==dniBd){
			DniException e= new DniException();
			throw e;
		}
	}
	}
	catch (SQLException e){
		System.out.println("SQLException");
	}
	
}
/**
 * Busca en la base de datos si el dni no esta
 * 
 * @param dni
 * @throws NoDniException
 */
private static void dniNo(int dni) throws NoDniException{
	try{
	PreparedStatement sentencia = con
			.prepareStatement("select dni from personas");

	
	sentencia.executeQuery();
	
	ResultSet r= sentencia.getResultSet();// Guarda el resultadola consulta
	
	int total=0;
	while (r.next()) { // Avnaza por la filas para mostralos
		int dniBd=r.getInt("dni");
		if (dni==dniBd){
			total=dni;
		}
	}
		if (total==0){
			NoDniException e= new NoDniException();
			throw e;
		}
	}
	catch (SQLException e){
		System.out.println("SQLException");
	}
}
/**
 * Establece un limite de caracteres cuando introducimos un nombre a la base de datos
 * 
 * @param nom
 * @throws NombreFormatoException
 */
private static void nombre(String nom) throws NombreFormatoException{
	if (nom.length()<1 || nom.length()>50){
		NombreFormatoException e=new NombreFormatoException();
		throw e;
	}
}
/**
 * Limita la edad en 200 cuando la pasamos a la base de datos
 * 
 * @param edad
 * @throws EdadFormatoException
 */
private static void edad(int edad) throws EdadFormatoException{
	if (edad > 200){
		EdadFormatoException e= new EdadFormatoException();
		throw e;
	}
}
/**
 * Permite ver los campos de la base de datos que estan introducidos
 * 
 * @throws DniException
 * @throws NombreFormatoException
 * @throws EdadFormatoException
 * @throws NoDniException
 */
public void consultar() throws DniException, NombreFormatoException, EdadFormatoException, NoDniException{
	try{
	conectar();
	PreparedStatement sentencia = con
			.prepareStatement("select * from personas");

	
	sentencia.executeQuery();
	
	ResultSet r= sentencia.getResultSet();
	while (r.next()) {
		int dni=r.getInt("dni");
		String nom=r.getString("nom");
		int edad=r.getInt("edad");
		System.out.println(dni +"\t"+ nom +"\t"+ edad);
	}
	cerrar();
	}
	catch (SQLException e){
		System.out.println("SQLException");
	}
}
/**
 * Desconecta las bases de datos que esten en funcionamiento
 */
public void cerrar(){
	try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}


@SuppressWarnings("serial")
class DniException extends Exception{
}
@SuppressWarnings("serial")
class NombreFormatoException extends Exception{
}
@SuppressWarnings("serial")
class EdadFormatoException extends Exception{
}
@SuppressWarnings("serial")
class NoDniException extends Exception{
}
