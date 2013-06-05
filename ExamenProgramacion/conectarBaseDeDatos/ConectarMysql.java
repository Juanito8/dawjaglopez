package conectarBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMysql {
	public static Connection con = null;
	public ConectarMysql(){
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
			con = DriverManager.getConnection("jdbc:mysql://localhost/personas", "root","root");
		} 
		catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ConectarMysql();
	}
}
