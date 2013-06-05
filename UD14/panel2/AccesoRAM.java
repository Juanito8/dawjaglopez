package panel2;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultarApellido(int dni) throws DniNulo {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DefaultTableModel getConsultaBasedeDatos() {
		// TODO Auto-generated method stub
		return null;
	}

}
