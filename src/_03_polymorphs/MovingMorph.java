package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		setX(getX() + 1);
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillRect(getx(), gety(), 50,50);
	}

}
