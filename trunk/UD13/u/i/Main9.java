package u.i;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main9 extends JFrame{
	private static int largo;
	private static int ancho;
	private void inicializar(){
		setLocation(ancho, largo);
		setSize(200, 200);
		setTitle("Main4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public Main9(){
		centrar();
		inicializar();
		movimientos();
		moverse();
	}
	public static void main(String[] args) {
		new Main9();
	}
	public void centrar(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		int tancho=200;
		int tlargo=200;
		largo=vlargo/2 - tlargo/2;
		ancho=vancho/2 - tancho/2;
	}
	public void espera(){
		for(int i=0;i<1000;i++){
			for(int m=0;m<10000;m++){
			}
		}
	}
	public void movimientos(){
		int x=getLocation().x;
		int y=getLocation().y;
		Random coordenadas=new Random();
		int num=0;
		
		JPanel p=new JPanel();
		this.add(p);
		
		for(int vueltas=0;vueltas<1;vueltas++){
			num=coordenadas.nextInt(4);
			
			switch(num){
			case 1:
				p.setBackground(Color.blue);
				for(int i=0;i<Toolkit.getDefaultToolkit().getScreenSize().width/2-100;i++){
					setLocation(x+i, y-i);
					espera();
				}
			break;
			case 3:
				p.setBackground(Color.yellow);
				for(int i=0;i<Toolkit.getDefaultToolkit().getScreenSize().width/2-100;i++){
					setLocation(x-i, y-i);
					espera();
				}
			break;
			case 2:
				p.setBackground(Color.orange);
				for(int i=0;i<Toolkit.getDefaultToolkit().getScreenSize().height/2-100;i++){
					setLocation(x+i, y+i);
					espera();
				}
			break;
			case 0:
				p.setBackground(Color.pink);
				for(int i=0;i<Toolkit.getDefaultToolkit().getScreenSize().height/2-100;i++){
					setLocation(x+i, y-i);
					espera();
				}
			break;
			}
			
		}
	}
	public void moverse(){
		int vlargo=Toolkit.getDefaultToolkit().getScreenSize().height-200;
		int vancho=Toolkit.getDefaultToolkit().getScreenSize().width-200;
			do{
				int m=getLocation().x;
				int m2=getLocation().y;
				if(vancho>m && vlargo>m2){
						setLocation(m+1, m2+1);
					espera();
				}
				if(vancho>m && vlargo>m2){
					setLocation(m-1, m2+1);
				espera();
				}
			}
			while(true);
	}
}
