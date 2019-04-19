package homework;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homework extends JFrame {
	public homework() {
		setTitle("메모장");
		Menu();
		Text();

		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	private void Menu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("파일(F)"));
		mb.add(new JMenu("편집(E)"));
		mb.add(new JMenu("서식(O)"));
		mb.add(new JMenu("보기(V)"));
		mb.add(new JMenu("도움말(H)"));

		this.setJMenuBar(mb);
	}

	private void Text() {
		JTextField t = new JTextField();
		add(new JTextArea());
	}

	public static void main(String[] args) {
		new homework();
	}

}
