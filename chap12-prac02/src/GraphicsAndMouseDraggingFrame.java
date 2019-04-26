import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GraphicsAndMouseDraggingFrame extends JFrame{
	public GraphicsAndMouseDraggingFrame() {
		super("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JFrame {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private int ovalX=100, ovalY=100;
		private final int RADIUS = 20;
		
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
				
			});
		}
		@Override
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, RADIUS, RADIUS);
		}
	}
	
	public static void main(String[] args) {
			new GraphicsAndMouseDraggingFrame();
	}

}













