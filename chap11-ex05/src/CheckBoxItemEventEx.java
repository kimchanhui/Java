import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	private JCheckBox [] fruits = new JCheckBox [3]; // 체크박스 배열
	private String [] name = {"사과", "배", "체리"}; // 체크박스 문자열로 사용할 문자열 배열
	private JLabel sumLabel; // 계산 합을 출력할 레이블
	
	public CheckBoxItemEventEx() {
			setTitle("체크박스와 ItemEvent 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
