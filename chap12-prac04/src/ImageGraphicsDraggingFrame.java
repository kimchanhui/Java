import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ImageGraphicsDraggingFrame extends JFrame {
	public ImageGraphicsDraggingFrame() {
		super("그래픽 이미지 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JFrame {
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image img = icon.getImage();
		private int width, height;
		private int x=100,y=100;
		
		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			MyMouseListener m1 = new MyMouseListener();
			addMouseListener(m1);
			addMouseMotionListener(m1);
		}
		
		@Override
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			g.drawImage(img, x, y, width, height, this);
		}
		
		class MyMouseListener extends MouseAdapter {
			private Point startP = null;
			private boolean bDrag = false;
			
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				startP = e.getPoint();
				if((startP.x >= x && startP.x <= x+width) && (startP.y >= y && startP.y <= y+height)) {
					bDrag = true;
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(bDrag == false)
					return;
				
				Point endP = e.getPoint();
				x = x + endP.x - startP.x;
				y = y + endP.y - startP.y;
				repaint();
				
				bDrag = false;
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				if(bDrag == false)
					return;
				
				Point endP = e.getPoint();
				x = x + endP.x - startP.x;
				y = y + endP.y - startP.y;
				
				startP = endP;
				repaint();
			}
		}
	}

	public static void main(String[] args) {
			new ImageGraphicsDraggingFrame();
	}

}





















