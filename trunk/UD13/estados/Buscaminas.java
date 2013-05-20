package estados;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buscaminas extends JFrame implements ActionListener{
	private static int largo;
	private static int ancho;
	private static int tlargo;
	private static int tancho;
	private JPanel j;
	private JButton b;
	private JPanel j2;
	private JButton[][] arrayBotones;
	private boolean[][] arrayMinas;
	private int numero;
	private int numero2;
	public Buscaminas(){
		centrar();
		menu();
		minas();
	}
	public static void main(String[] args) {
		new Buscaminas();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		tancho=500;
		tlargo=500;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void menu(){
		setLocation(ancho, largo);
		setSize(tlargo, tancho);
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Iniciar panel
		j=new JPanel(new BorderLayout());
		this.add(j);

		
		// Agregar Panel
		
		
		b=new JButton("Borrar");
		b.addActionListener(this);
		j.add(b,BorderLayout.NORTH);
		b.setActionCommand("borrado");
		
		j2=new JPanel();
		j2.setLayout(new GridLayout(9,9));
		j.add(j2,BorderLayout.CENTER);
		
		j.add(new JLabel("    "),BorderLayout.EAST);
		j.add(new JLabel("    "),BorderLayout.WEST);
		j.add(new JLabel("    "),BorderLayout.SOUTH);
		
		arrayBotones=new JButton[9][9];
		for(int i=0;i<9;i++){
			for(int m=0; m < 9;m++){
				arrayBotones[i][m]=new JButton("");
				j2.add(arrayBotones[i][m]);
				arrayBotones[i][m].addActionListener(this);
				arrayBotones[i][m].setActionCommand(i+"-"+m);
			}
		}
		
		setVisible(true);

	}
	public void minas(){
		arrayMinas=new boolean[9][9];
		Random n=new Random();
		int x=0;
		do{
			numero=n.nextInt(9);
			numero2=n.nextInt(9);
			System.out.print(numero+"-"+numero2+" ");
			
			if(!arrayMinas[numero][numero2]){
				arrayMinas[numero][numero2]=true;
			}
			x++;
		}
		while(x<10);
		System.out.println();
		
		for(int i=0;i<9;i++){
			for(int m=0; m < 9;m++){
				System.out.print(arrayMinas[i][m]?" *":" -");
			}	
			System.out.println();
		}
	}
	private int numMinasAlrededor(int i,int m){
		int numMinas=0;
		for(int x=i-1;x<=i+1;x++){
			for(int n=m-1; n <= m+1;n++){
				if(x>=0 && x<9 && n>=0 && n<9 && !(x==i && n==m) && arrayMinas[x][n]){
					System.out.println(numMinas);
					numMinas++;
				}
			}
		}
		
		return numMinas;
	}
	public int testNumMinasAlrededor(int i,int m){
		return numMinasAlrededor(i, m);
	}
	
	public void setArrayMinas(boolean[][] minas){
		this.arrayMinas=minas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "borrado":
			System.out.println("Borrar");
		break;
		default:
			int fila=Integer.parseInt(e.getActionCommand().split("-")[0]);
			int colum=Integer.parseInt(e.getActionCommand().split("-")[1]);
				if(arrayMinas[fila][colum]){
					((JButton)(e.getSource())).setBackground(Color.red);
					System.out.println("PUM");
				}
				else{
					if(numMinasAlrededor(fila, colum)==0){
						((JButton)(e.getSource())).setEnabled(false);
					}
					else{
					((JButton)(e.getSource())).setText(Integer.toString(numMinasAlrededor(fila, colum)));
					((JButton)(e.getSource())).setEnabled(false);
					}
				}
			((JButton)(e.getSource())).setEnabled(false);
		break;
		}
	}
}
