package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    //ArrayList<Polymorph>polymorphs;
    //CircleMorph circle = new CircleMorph(300, 300);
    MouseMorph  mousemorph = new MouseMorph(100,100);
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.addMouseMotionListener(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
//   	polymorphs = new ArrayList<Polymorph>();
//   	polymorphs.add(new RedMorph(5,5));
//   	polymorphs.add(new BluePolymorph(230,15));
//   	polymorphs.add(new MovingMorph(100,70));
//   	polymorphs.add(new BluePolymorph(300,30));
//   	polymorphs.add(new RedMorph(400,400));
   	
   	 
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
//   	for(Polymorph p: polymorphs) {
//   		p.draw(g);
//   	}
   	 //circle.draw(g);
   	 mousemorph.draw(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
//    	for(Polymorph p: polymorphs) {
//       		p.update();
//       	}
   	// circle.update();
   	 }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
