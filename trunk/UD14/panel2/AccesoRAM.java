package panel2;

import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

public class AccesoRAM implements IAcessoRN{
	
	private Map<Integer, Cliente> c;
	
	public AccesoRAM(){
		c=new HashMap<Integer, Cliente>();
	}
	@Override
	public void conectar() {
		
	}

	@Override
	public void insertar(int dni, String nombre, String apellido)
			throws DniDuplicado {
		if(c.containsKey(new Integer(dni))){
			throw(new DniDuplicado());
		}
		else{
			Cliente b=new Cliente(dni, nombre, apellido);
			c.put(new Integer(dni), b);
			System.out.println(c);
			}
	}

	@Override
	public String consultarNombre(int dni) throws DniNulo {
		Object nombre=null;
		if(c.containsKey(new Integer(dni))){
			nombre=c.get(dni).getNombre();
			System.out.println(nombre);
		}
		else{
			throw(new DniNulo());
		}
		return (String) nombre;
	}

	@Override
	public String consultarApellido(int dni) throws DniNulo {
		Object apellido=null;
		if(c.containsKey(new Integer(dni))){
			apellido=c.get(dni).getApellido();
			System.out.println(apellido);
		}
		else{
			throw(new DniNulo());
		}
		return (String) apellido;
	}

	@Override
	public DefaultTableModel getConsultaBasedeDatos() {
		DefaultTableModel tabla=new DefaultTableModel();
		
		Object[] principal={"Nombre","Apellido","DNI"};
		tabla.setColumnIdentifiers(principal);
		
		Collection<Cliente> m=c.values();
		
		for( Cliente n : m ){
			Object[] fila=new Object[3];
			fila[0]=n.getNombre();
			fila[1]=n.getApellido();
			fila[2]=n.getDni();
			
			tabla.addRow(fila);
		}
		return tabla;
	}

}
