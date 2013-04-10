import java.sql.*;

public class AcessoBaseDatos {
	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (Exception e) {
			System.out.println("Carga");
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:odbc:TEST", "admin",
					"admin");
		} catch (SQLException e) {
			System.out.println("Conexión");
			e.printStackTrace();
		}

		// Pone los campos en la tablas
		try {
			PreparedStatement sentencia = con
					.prepareStatement("insert into curso values(?,'Prueba','pruebas',100,100.20,?)");

			for (int i = 0; i < args.length; i++) {
				sentencia.setInt(1, Integer.parseInt(args[i]));
				sentencia.setInt(2, Integer.parseInt(args[i]));
			}

			sentencia.execute();
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ejecución");
		}
		
		// Consultar la base de datos
		try {
			PreparedStatement sentencia = con
					.prepareStatement("select * from curso;");

			
			sentencia.executeQuery();
			
			ResultSet r= sentencia.getResultSet();// Guarda el resultadola consulta
			while (r.next()) { // Avnaza por la filas para mostralos
				int id=r.getInt("ID");
				String nombre=r.getString("NOMBRE");
				System.out.println(id + nombre);
			}
			
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Cierra la conexion
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
