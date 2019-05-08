import java.awt.Image;

public class AlienSprite extends Sprite {
	private GalagaGame game;

	public AlienSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dx = +3; // 몬스터 움직이는 속도
	}

	@Override
	public void move() {
		if (((dx < 0) && (x < 10)) || ((dx > 0) && (x > 760))) { // 벽에 붙이치는
			dx = -dx;
			y += 10;
			if (y > 600) {
				game.endGame();
			}
		}
		super.move();
	}

}