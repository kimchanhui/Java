import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	private JCheckBox [] fruits = new JCheckBox [3]; // üũ�ڽ� �迭
	private String [] name = {"���", "��", "ü��"}; // üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭
	private JLabel sumLabel; // ��� ���� ����� ���̺�
	
	public CheckBoxItemEventEx() {
			setTitle("üũ�ڽ��� ItemEvent ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
