package view;

import javax.swing.JOptionPane;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController divCont = new DivisaoController();
		int a;
		int b;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("insira o valor do dividendo: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				a = Integer.parseInt(input);
				if (a <= 0) {
					JOptionPane.showMessageDialog(null, "número inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
		
		do {
			try {
				String input = JOptionPane.showInputDialog("insira o valor do divisor: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				b = Integer.parseInt(input);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
		
		JOptionPane.showMessageDialog(null, "O resultado do resto da divisão por subtrações de " + a + " por " + b + " é de = " + divCont.divide(a, b));

	}

}
