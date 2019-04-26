import java.awt.Color;

import java.awt.FlowLayout;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;



public class a1 extends JFrame {

	public a1() {
		setTitle("a1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();

		JMenu A = new JMenu("파일");

		mb.add(A);

		setJMenuBar(mb);
		
		A.add(new JMenuItem("만들고싶다"));
		

		setSize(200, 100);

		setVisible(true);
		

	}


		public static void main(String[] args) {

		new a1();

	}



}