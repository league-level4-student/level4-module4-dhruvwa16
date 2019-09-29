package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int squareSide = 0;
	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void update() {
		if(squareSide==0) {
			y = this.y-20;
		}
		else if(squareSide==1) {
			x = this.x+20;
		}
		else if(squareSide==2) {
			x = this.y+20;
		}
		else if(squareSide==3) {
			x = this.x-20;
		}
		squareSide++;
		if(squareSide>3) {
			squareSide = 0;
		}
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
			g.setColor(Color.GREEN);
			g.fillRect(getx(), gety(), 50,50);
		
	}

}
