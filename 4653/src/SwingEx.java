
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class SwingEx extends JFrame {
	public SwingEx() {
		setTitle("�޸���");
		createMenu();
		createToolBar();
		setSize(500, 400);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("����(F)"));
		mb.add(new JMenu("����(E)"));
		mb.add(new JMenu("����(O)"));
		mb.add(new JMenu("����(V)"));
		mb.add(new JMenu("����(H)"));

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