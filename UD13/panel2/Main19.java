package panel2;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Main19 extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j1;
	private JTabbedPane p;
	private JPanel j2;
	private JLabel l;
	private JTextField t;
	private JLabel l1;
	private JTextField t1;
	private JLabel l2;
	private JTextField t2;
	private JButton b;
	private JLabel l3;
	private JTextField t3;
	private JButton b1;
	private JLabel l4;
	private JLabel t4;
	private JLabel l5;
	private JLabel t5;
	private JLabel l6;
	private JLabel l8;
	private JTable j3;
	private ConsultaInsertar m= ConsultaInsertar.getConsultarInsertar();
	public Main19(){
		centrar();
		menu();
		paneles();
	}
	public static void main(String[] args) {
		new Main19();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=300;
		tlargo=500;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	public void paneles(){

		p=new JTabbedPane();
		this.add(p);
		
		j1=new JPanel(new GridLayout(4, 2));
		p.addTab("Insertar", j1);
		
		j2=new JPanel(new GridLayout(4, 2));
		p.addTab("Consultar", j2);
		
		DefaultTableModel modeloTabla=m.getConsultaBasedeDatos();
		j3=new JTable(modeloTabla);
		p.addTab("Tabla", j3);
		
		// Añadir botones y texto
		
		// Insertar
		
		l=new JLabel("Nombre");
		j1.add(l);
		
		t=new JTextField("Introduce un nombre");
		t.setActionCommand("insertar");
		j1.add(t);
		t.addActionListener(this);
		
		l1=new JLabel("Apellido");
		j1.add(l1);
		
		t1=new JTextField("Introduce un apellido");
		t1.setActionCommand("insertar");
		j1.add(t1);
		t1.addActionListener(this);
		
		l2=new JLabel("DNI");
		j1.add(l2);
		
		t2=new JTextField("Introduce un dni");
		t2.setActionCommand("insertar");
		j1.add(t2);
		t2.addActionListener(this);
		
		b=new JButton("Insertar");
		b.setActionCommand("insertar");
		j1.add(b);
		b.addActionListener(this);
		
		l6=new JLabel();
		j1.add(l6);
		
		
		// Consultar
		
		l3=new JLabel("DNI");
		j2.add(l3);
		
		t3=new JTextField("Introduce un dni");
		t3.setActionCommand("consultar");
		j2.add(t3);
		t3.addActionListener(this);
		
		b1=new JButton("Consultar");
		b1.setActionCommand("consultar");
		j2.add(b1);
		b1.addActionListener(this);
		
		l8=new JLabel();
		j2.add(l8);
		
		l4=new JLabel("Nombre");
		j2.add(l4);
		
		t4=new JLabel("");
		j2.add(t4);
		
		l5=new JLabel("Apellido");
		j2.add(l5);
		
		t5=new JLabel("");
		j2.add(t5);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "insertar":
			try {
				m.insertar(Integer.parseInt(t2.getText()), t.getText(), t1.getText());
				l6.setText("El DNI esta introducido "+t2.getText());
			} catch (DniDuplicado e1) {
				l6.setText("El DNI esta duplicado como "+t2.getText());
			}
		break;
		case "consultar":
			String n = "--------";
			String ape="--------";
			try {
				n = m.consultarNombre(Integer.parseInt(t3.getText()));
				ape=m.consultarApellido(Integer.parseInt(t3.getText()));
				l8.setText("");
			} catch (DniNulo e1) {
				l8.setText("El Dni no esta en la base de datos "+t3.getText());
			}
			
			
			t4.setText(n);
			t5.setText(ape);
		break;
		}
	}
}
