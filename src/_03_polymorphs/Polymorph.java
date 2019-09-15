package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    int getx() {
    	return this.getX();
    }
    void setx(int x) {
    	this.setX(x);
    }
    
    int gety() {
    	return this.y;
    }
    void sety(int y) {
    	this.y = y;
    }
    
    Polymorph(int x, int y){
   	 this.setX(x);
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
