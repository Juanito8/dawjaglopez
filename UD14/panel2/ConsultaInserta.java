package panel2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultaInserta implements IAcessoRN{
	public static Connection con=null;
	private static ConsultaInserta c;
	private ConsultaInserta(){
		conectar();
	}
	public static ConsultaInserta getConsultarInsertar(){
		if(c==null){
			c=new ConsultaInserta();
		}
		return c;
	}

	public void conectar(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Cargado");
		} 
		catch (Exception e) {
			System.out.println("Carga");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/programacion", "admin","admin");
			System.out.println("Base de datos agregada");
		} 
		catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}
	}
	public void insertar(int dni, String nombre, String apellido) throws DniDuplicado{
		try {
			PreparedStatement sentencia = con
					.prepareStatement("insert into clientes values("+dni+",'"+nombre+"','"+apellido+"')");
			
			try{
			sentencia.execute();
			}
			catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("DNI duplicado");
				throw (new DniDuplicado());
			}
			try{
			sentencia.close();
			}
			catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("Error al cerrar la sentencia");
			}
			cerrar();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("SQLException");
		}
		
	}
	public String consultarNombre(int dni) throws DniNulo {
		String nom ="";
		try{
		PreparedStatement sentencia = con
				.prepareStatement("select nombre from clientes where dni='"+dni+"'");

		
		sentencia.executeQuery();
		
		try{
			ResultSet r= sentencia.getResultSet();
			if(r.next()){
				nom=r.getString("nombre");
			}
			else{
				throw (new DniNulo());
			}
		}
		catch (SQLException e){
			System.out.println("Dni no existe");
		}
		sentencia.close();
		}
		catch (SQLException e){
			System.out.println("SQLException");
		}
		return nom;
	}
	public String consultarApellido(int dni) throws DniNulo{
		String ape = "";
		try{
		PreparedStatement sentencia = con
				.prepareStatement("select apellidos from clientes where dni='"+dni+"'");

		
		sentencia.executeQuery();
		
		try{
		ResultSet r= sentencia.getResultSet();
		if(r.next()){
			ape=r.getString("apellidos");
		}
		else{
			throw (new DniNulo());
		}
		}
		catch (SQLException e){
			System.out.println("Dni no existe");
		}
		sentencia.close();
		cerrar();
		}
		catch (SQLException e){
			System.out.println("SQLException");
		}
		return ape;
	}
	public DefaultTableModel getConsultaBasedeDatos(){
		DefaultTableModel tabla=new DefaultTableModel();
		try{
			PreparedStatement sentencia = con
					.prepareStatement("select nombre, apellidos, dni from clientes");

			
			sentencia.executeQuery();
			
			try{
			Object[] principal={"Nombre","Apellido","DNI"};
			tabla.setColumnIdentifiers(principal);
			ResultSet r= sentencia.getResultSet();
			while(r.next()){
				Object[] fila=new Object[3];
				fila[0]=r.getString("nombre");
				fila[1]=r.getString("apellidos");
				fila[2]=r.getInt("DNI");
				
				tabla.addRow(fila);
			}
			
			}
			catch (SQLException e){
				System.out.println("Dni no existe");
			}
			sentencia.close();
			cerrar();
			}
			catch (SQLException e){
				System.out.println("SQLException");
			}
			return tabla;
	}
	public void cerrar(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
