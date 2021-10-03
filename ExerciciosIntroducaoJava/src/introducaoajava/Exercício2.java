package introducaoajava;

import javax.swing.JOptionPane;

public class Exercício2 {

	public static void main(String[] args) {
        
		int totaldias,anos,meses,dias;
		
		totaldias = Integer.parseInt(JOptionPane.showInputDialog("Entre com o total de dias vividos: "));
				
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		
		JOptionPane.showMessageDialog(null,"\nVoce tem  "+ anos +" anos, " + meses + " meses e " + dias + " dias ");
 
	} 

}