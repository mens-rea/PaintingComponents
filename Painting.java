import javax.swing.*;

import java.awt.*;


import javax.swing.JLabel;


public class Painting extends JPanel{

	float x = 100;
	float y = 100;

	int multX = 1;
	int multY = 1;

	public Painting(){
		Thread thread = new Thread(){
			public void run(){
				while(true){

					int width = getWidth();
					int height = getHeight();

					if(x == width-50){
						multX = -1;
						System.out.println(x);
					}
					else if(x == 0){
						multX = 1;	
						System.out.println(x);
					}

					x = x+multX;	

					if(y == height-50){
						multY = -1;
						System.out.println(y);
					} 
					else if(y == 0){
						multY = 1;	
						System.out.println(x);
					}

					y = y+multY;

					repaint();

					try{
						Thread.sleep(50);
					}
					catch(InterruptedException ex){
						System.out.println("error");
					}
				}
			}
		};
		thread.start();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.PINK);
		int xpoints[] = {25, 145, 25, 145, 25};
    	int ypoints[] = {25, 25, 145, 145, 25};
    	int npoints = 5;

    	g.fillPolygon(xpoints, ypoints, npoints);
		g.setColor(Color.RED); 
		g.fillOval(250, 0, 60, 100);
		g.setColor(Color.YELLOW);  
        g.fillOval(100, 150, 100, 200);
        g.setColor(Color.GREEN);  
        g.fillArc(500, 300, 100, 100, 70, 250);
        g.setColor(Color.CYAN);  
        g.fillArc(250, 250, 70, 100, 150, 280);
        g.setColor(Color.BLUE);  
        g.fillArc(500, 80, 100, 200, 100, 80);
        g.setColor(Color.ORANGE);  
        g.fillArc(300, 350, 100, 100, 100, 150);
        g.setColor(Color.BLACK);
        g.fillRect(600,90,50,200);  
        g.setColor(Color.WHITE);
        g.fillRect(350,90,50,100); 


		g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);

	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");


		//Jframe panel1 = new Jpanel();
		Painting myPainting = new Painting();

		myFrame.add(myPainting);

		JPanel panel1 = new JPanel();
		
	

		panel1.setBackground(Color.GREEN);


		myFrame.setContentPane(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700,500);
		myFrame.setVisible(true);

	}
}