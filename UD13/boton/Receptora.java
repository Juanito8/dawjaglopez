package boton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Receptora implements ActionListener{
	private JLabel l;
	public Receptora(JLabel l){
		this.l=l;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Pulsado Receptora");
		l.setText("HOLA MUNDO");
	}

}
