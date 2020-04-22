package book.headfirst.ch2.observer.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame jframe;

	public static void main(String[] args) {

		SwingObserverExample ex = new SwingObserverExample();
		ex.go();
	}

	public void go() {
		jframe = new JFrame();
		JButton button = new JButton("Should i do it!");
		button.addActionListener(new AngleLeasener());
		button.addActionListener(new DevilListener());
		jframe.getContentPane().add(BorderLayout.CENTER, button);
		jframe.setVisible(true);
	}

	class AngleLeasener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it ");

		}

	}

	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("do it ");

		}

	}

}
