import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.AllPermission;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDrawPracticeFrame extends JFrame{
	public ImageDrawPracticeFrame() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private JButton button = new JButton("Hide/Show");
		private boolean showFlag = true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(button);
			
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag;
					MyPanel.this.repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(showFlag)
					g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
		}
		
	}
	
	public static void main(String[] args) {
		new ImageDrawPracticeFrame();
	}

}



















