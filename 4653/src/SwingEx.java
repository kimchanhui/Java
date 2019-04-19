
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class SwingEx extends JFrame {
	public SwingEx() {
		setTitle("메모장");
		createMenu();
		createToolBar();
		setSize(500, 400);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("파일(F)"));
		mb.add(new JMenu("편집(E)"));
		mb.add(new JMenu("서식(O)"));
		mb.add(new JMenu("보기(V)"));
		mb.add(new JMenu("도움말(H)"));

		this.setJMenuBar(mb);
	}

	private void createToolBar() {
		JTextField bar = new JTextField();
		add(new JTextField(""));

	}

	public static void main(String[] args) {
		new SwingEx();
	}
}