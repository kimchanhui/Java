import java.awt.Image;

public class AlienSprite extends Sprite {
	private GalagaGame game;

	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = +5; // ���� �����̴� �ӵ�
		dy = -5;
	}

	@Override
	public void move() {
		if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 1870))) { // ���� ����ġ��
			dx = -dx;
			y += 10;
			if (y > 600) {
				
			}
		}
		
		if (((dy < 0) && (y < 10)) || ((dy > 0) && (y > 970))) { // ���� ����ġ��
			dy = -dy;
			y += 10;
			if (x > 600) {
				
			}
		}
		super.move();
	}
}