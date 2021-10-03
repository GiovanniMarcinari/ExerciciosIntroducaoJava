package introducaoajava;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		int  horas, minutos, segundos, segundosUsuario;	       
		   
	    segundosUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do evento em segundos: "));
       
	    horas = (segundosUsuario / 3600);
	    minutos = ((segundosUsuario % 3600) / 60);
	    segundos = ((segundosUsuario % 3600) % 60);
	    
	    JOptionPane.showMessageDialog(null, "A duração do evento foi de " + horas +" horas " + minutos + " minutos e " + segundos +" segundos");
	}

}
