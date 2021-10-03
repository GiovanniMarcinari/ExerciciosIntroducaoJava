package introducaoajava;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int ano, mes, dia;       
		
		JOptionPane.showMessageDialog(null, "Esse programa pedirá sua idade em anos, meses e dias respectivamente. Clique em ok para prosseguir \n");   
	   
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos"));       
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês"));     
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));      	   
		
		int calc = (ano * 365) + (mes * 30) + dia;        
		JOptionPane.showMessageDialog(null,"Sua idade em dias é: "+ calc);
	}
}
