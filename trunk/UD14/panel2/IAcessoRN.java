package panel2;

import javax.swing.table.DefaultTableModel;

public interface IAcessoRN {
	public void conectar();
	public void insertar(int dni, String nombre, String apellido) throws DniDuplicado;
	public String consultarNombre(int dni) throws DniNulo ;
	public String consultarApellido(int dni) throws DniNulo;
	public DefaultTableModel getConsultaBasedeDatos();
	
}
