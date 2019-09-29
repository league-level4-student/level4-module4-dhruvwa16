package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
	private int width;
	private int height;
	int getwidth() {
		return this.width = width;
	}
	void setwidth(int width) {
		this.width = width;
	}
	
	int getheight() {
		return this.height = height;
	}
	void setheight(int height) {
		this.height = height;
	}
	
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), 50,50);
	}
	
}
