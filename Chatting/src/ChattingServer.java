import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChattingServer extends JFrame{
	private JTextField name = new JTextField(10);
	private JButton saveBtn = new JButton("µî·Ï");
	private JTextArea ta = new JTextArea(5, 10);
	
	public ChattingServer() {
		super("Chatting Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(150,200);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(name);
		c.add(saveBtn);
		
		saveBtn.addActionListener(new ActionListener () {
		
		public void actionPerformed(ActionListener e) {
			ta.append(str);
		}
		
	});
	
	}
	
	
	public static void main(String[] args) {

	}

}
