import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolygonWithMouse extends JFrame{
	public DrawPolygonWithMouse() {
		super("���콺�� ��ٰ��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private Vector<Integer> x = new Vector<Integer>();
		private Vector<Integer> y = new Vector<Integer>();
	
		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					x.add(e.getX());
					y.add(e.getY());
					repaint();
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			
			int xs [] = new int [x.size()];
			int ys [] = new int [y.size()];
			
			for(int i=0; i<x.size(); i++) {
				xs[i] = x.get(i);
				ys[i] = y.get(i);
			}
			g.drawPolygon(xs, ys, xs.length);
		}
	}
	
	public static void main(String[] args) {
		new DrawPolygonWithMouse();
	}

}




















