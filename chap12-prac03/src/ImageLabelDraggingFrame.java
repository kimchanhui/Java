import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLabelDraggingFrame extends JFrame{
	public ImageLabelDraggingFrame() {
		super("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		JLabel imageLabel = new JLabel(icon);
		
		imageLabel.setSize(icon.getIconHeight(),icon.getIconWidth());
		imageLabel.setLocation(100,100);
		
		MyMouseListener m1 = new MyMouseListener();
		imageLabel.addMouseListener(m1);
		imageLabel.addMouseMotionListener(m1);
		
		c.add(imageLabel);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private Point startP = null;
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			startP = e.getPoint();
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			Point endP = e.getPoint();
			Component la = (JComponent)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			la.getParent().repaint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			Point endP = e.getPoint();
			Component la = (JComponent)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			la.getParent().repaint();
		}
	}

	public static void main(String[] args) {
		new ImageLabelDraggingFrame();
	}

}























