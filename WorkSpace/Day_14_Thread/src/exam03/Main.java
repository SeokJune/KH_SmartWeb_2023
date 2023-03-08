package exam03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String[] quiz = new String[] { 
				"public static void main(String[] args)",
				"Scanner scan =", "  new Scanner(System.in)",
				"DataOutputStream dos = ", "new DataOutputStream(os)"
		};

		new CountDown().start();

		while(true) {
			int index = (int) (Math.random() * quiz.length);

			String msg = JOptionPane.showInputDialog(quiz[index]);

			if(msg.equals(quiz[index])) {
				System.out.println("Success: time + 5");
				CountDown.i += 5;
			} else {
				System.out.println("Typo: time - 3");
				CountDown.i -= 3;
			}
			
		}

	}

}
