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

		Thread thread1 = new Thread(){
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
		thread1.start();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);


		g.setColor(Color.RED);
		g.fillOval(250, 250, 75, 75);
		g.setColor(Color.BLUE);
		g.fillRect(300, 200, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 25, 25);
		g.setColor(Color.GREEN);
		g.fillRoundRect(400, 200, 200, 200, 100, 100);
		g.setColor(Color.PINK);
		g.fillRect(300, 50, 46, 130);
		g.setColor(Color.PINK);
		g.fillRoundRect(200, 250, 110, 50, 56, 45);
		g.setColor(Color.BLACK);
		g.fillArc(150, 350, 95, 45, 150, 200);

		g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);

	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");

		//JPanel Panel1 = new JPanel();


		JPanel panel1 = new JPanel();
		

		Painting myPainting = new Painting();
		//Panel1.setBackground(Color.RED);


		myPainting.setBackground(Color.YELLOW);

		myFrame.add(myPainting);

		panel1.setBackground(Color.GREEN);


		myFrame.setContentPane(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}