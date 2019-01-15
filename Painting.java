import java.awt.*;
import javax.swing.*;
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


		g.setColor(Color.ORANGE);
		g.fillOval(315, 60, 1000, 1000);

		g.setColor(Color.BLACK);
		g.fillOval(470, 200, 700, 700);

		g.setColor(Color.YELLOW);
		g.fillOval(700, 250, 250, 250);
		
		g.setColor(Color.WHITE);
		g.fillOval(750, 300, 150, 150);
		
		g.setColor(Color.YELLOW);
		g.fillRect(750, 500, 150, 300);


		g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);
	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		JPanel panel1 = new JPanel();
		
		Painting myPainting = new Painting();

		myPainting.setBackground(Color.PINK);

		// panel1.setBackground(Color.GREEN);

		myFrame.add(myPainting);


		myFrame.setContentPane(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1700, 1500);
		myFrame.setVisible(true);
	}
}