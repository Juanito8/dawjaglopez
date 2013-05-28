package panel2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaInsertar {
	public static Connection con=null;
	
	public ConsultaInsertar(){
		conectar();
	}

	public void conectar(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e) {
			System.out.println("Carga");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/programacion", "admin","admin");
		} 
		catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}
	}
	public void insertar(int dni, String nombre, String apellido){
		try {
			PreparedStatement sentencia = con
					.prepareStatement("insert into clientes values("+dni+",'"+nombre+"','"+apellido+"')");
			

			sentencia.execute();
			sentencia.close();
			cerrar();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("SQLException");
		}
		
	}
	public String consultarNombre(int dni) {
		String nom ="";
		try{
		PreparedStatement sentencia = con
				.prepareStatement("select nombre from clientes where dni='"+dni+"'");

		
		sentencia.executeQuery();
		
		ResultSet r= sentencia.getResultSet();
		while (r.next()) {
			nom=r.getString("nombre");
			//System.out.println(nom);
		}
		}
		catch (SQLException e){
			System.out.println("SQLException");
		}
		return nom;
	}
	public String consultarApellido(int dni){
		String ape = "";
		try{
		PreparedStatement sentencia = con
				.prepareStatement("select apellidos from clientes where dni='"+dni+"'");

		
		sentencia.executeQuery();
		
		ResultSet r= sentencia.getResultSet();
		while (r.next()) {
			ape=r.getString("apellidos");
			//System.out.println(ape);
		}
		cerrar();
		}
		catch (SQLException e){
			System.out.println("SQLException");
		}
		return ape;
	}
	public void cerrar(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
