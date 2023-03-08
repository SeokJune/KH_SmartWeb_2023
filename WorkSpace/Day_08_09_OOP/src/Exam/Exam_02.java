package Exam;
import java.awt.AWTException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_02 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		
		JButton button = new JButton("獄っっっっっっ動");
		frame.add(button);
		
		frame.setVisible(true);

		/*
		Robot r = new Robot();
		r.mouseMove(900, 400);

		for(int i = 0 ; i < 100 ; i++) {
			int x = (int) (Math.random() * (500 - 200 + 1) + 200);
			int y = (int) (Math.random() * (500 - 200 + 1) + 200);
			r.mouseMove(x, y);
			r.delay(100);
		}
		*/

	}

}
