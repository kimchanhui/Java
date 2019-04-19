import javax.swing.*;
import java.awt.*;

public class ContainerComponentEx extends JFrame {
	public ContainerComponentEx() {
		setTitle("Container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(null);
		this.setBackground(Color.gray);
		
		Panel1 p1 = new Panel1();
		p1.setSize(150,150);
		p1.setLocation(10,10);
		add(p1);
		
		JButton btn = new JButton("OK");
		btn.setLocation(130, 170);
		btn.setSize(70, 30);
		add(btn);
		setSize(350, 250);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			
			add(new JLabel("Type Password"));
			add(new JTextField(1));						
		}
	}
	
	
	public static void main(String[] args) {
		new ContainerComponentEx();
	}
}