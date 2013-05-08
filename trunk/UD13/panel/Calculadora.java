package panel;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	
	private JPanel p;
	private JPanel p1;
	private JLabel mensaje;
	private JButton b;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b10;
	private JButton b11;
	private JButton b12;
	private JButton b13;
	private JButton b14;
	private JButton b15;
	public String numero="";
	public String matematico="";
	public int num1;
	public int num2;

	private void inicializar(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel de Main
		p=new JPanel();
		p.setLayout(new GridLayout(2, 1));
		this.add(p);
		
		// Crear un JLabel
		mensaje=new JLabel("");
		p.add(mensaje);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(4, 3));
		p.add(p1);

		
		
		// Creacion de Botones
		b1=new JButton("1");
		p1.add(b1);
		b1.setActionCommand("uno");
		
		b2=new JButton("2");
		p1.add(b2);
		b2.setActionCommand("dos");
		
		b3=new JButton("3");
		p1.add(b3);
		b3.setActionCommand("tres");
		
		b12=new JButton("+");
		p1.add(b12);
		b12.setActionCommand("sumar");
		
		b4=new JButton("4");
		p1.add(b4);
		b4.setActionCommand("cuatro");
		
		b5=new JButton("5");
		p1.add(b5);
		b5.setActionCommand("cinco");
		
		b6=new JButton("6");
		p1.add(b6);
		b6.setActionCommand("seis");
		
		b13=new JButton("-");
		p1.add(b13);
		b13.setActionCommand("restar");
		
		b7=new JButton("7");
		p1.add(b7);
		b7.setActionCommand("siete");
		
		b8=new JButton("8");
		p1.add(b8);
		b8.setActionCommand("ocho");
		
		b9=new JButton("9");
		p1.add(b9);
		b9.setActionCommand("nueve");
		
		b14=new JButton("*");
		p1.add(b14);
		b14.setActionCommand("multiplicar");
		
		b10=new JButton("=");
		p1.add(b10);
		b10.setActionCommand("igual");
		
		b=new JButton("0");
		p1.add(b);
		b.setActionCommand("cero");
		
		b11=new JButton("C");
		p1.add(b11);
		b11.setActionCommand("borrar");
		
		b15=new JButton("/");
		p1.add(b15);
		b15.setActionCommand("dividir");
		
		setVisible(true);
		
	}
	public Calculadora(){
		centrar();
		inicializar();
		listener();
	}
	public static void main(String[] args) {
		new Calculadora();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=400;
		tlargo=400;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void listener(){
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "uno": numero=numero+"1";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "dos": numero=numero+"2";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "tres": numero=numero+"3";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "cuatro": numero=numero+"4";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "cinco": numero=numero+"5";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "seis": numero=numero+"6";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "siete": numero=numero+"7";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "ocho": numero=numero+"8";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "nueve": numero=numero+"9";mensaje.setText(numero);
		System.out.println(numero);
		break;
		case "cero": numero=numero+"0";mensaje.setText(numero);
		System.out.println(numero);
		break;
		
		case "sumar": num1=Integer.parseInt(numero);mensaje.setText(num1+ " + ");numero="";matematico="+";
		System.out.println(num1);
		break;
		case "restar": num1=Integer.parseInt(numero);mensaje.setText(num1+ " - ");numero="";matematico="-";
		System.out.println(num1);
		break;
		case "multiplicar": num1=Integer.parseInt(numero);mensaje.setText(num1+ " * ");numero="";matematico="*";
		System.out.println(num1);
		break;
		case "dividir": num1=Integer.parseInt(numero);mensaje.setText(num1+ " / ");numero="";matematico="/";
		System.out.println(num1);
		break;
		
		case "igual": num2=Integer.parseInt(numero);mensaje.setText(num2+" =");
		if(matematico.equals("+")){
			String sum=Integer.toString(sumar());
			mensaje.setText(sum);
		}
		else if(matematico.equals("-")){
			String res=Integer.toString(restar());
			mensaje.setText(res);
		}
		else if(matematico.equals("*")){
			String mul=Integer.toString(multiplicar());
			mensaje.setText(mul);
		}
		else if(matematico.equals("/")){
			String divi=Float.toString(dividir());
			mensaje.setText(divi);
		}
		System.out.println(num1+" "+matematico+" "+num2+" = "+mensaje.getText());numero="";
		break;
		case "borrar": numero="";mensaje.setText(numero);
		System.out.println(numero);
		break;
		}
	}
	public int sumar(){
		return num1+num2;
	}
	public int restar(){
		return num1-num2;
	}
	public int multiplicar(){
		return num1*num2;
	}
	public float dividir(){
		return num1/num2;
	}
}
