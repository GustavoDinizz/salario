package nega;

import javax.swing.JOptionPane;

public class Sal�rio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SB = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor bruto: "));
		double GS = ((SB*110)/100);
		double IR = ((GS*20)/100);
		double SL = (GS-IR);
		
		JOptionPane.showMessageDialog(null,"O sal�rio l�quido � " + SL);
	}

}
