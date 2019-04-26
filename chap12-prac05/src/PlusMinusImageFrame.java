import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PlusMinusImageFrame extends JFrame{
	public PlusMinusImageFrame() {
		super("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel extends JFrame {
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image img = icon.getImage();
		private int width, height;
		
		public MyPanel() {
				width = img.getWidth(this);
				height = img.getHeight(this);
				
				addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyChar() == '+') {
							width = (int)(width*1.1);
							height = (int)(height*1.1);
							repaint();
						}
						else if(e.getKeyChar() == '-') {
							width = (int)(width*0.9);
							height = (int)(height*0.9);
							repaint();
						}
					}
				});
		}
		
		@Override
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
		
	}
	
	public static void main(String[] args) {
		new PlusMinusImageFrame();
	}

}

















