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
						multX = -5;
						System.out.println(x);
					}
					else if(x == 0){
						multX = 5;	
						System.out.println(x);
					}

					x = x+multX;	

					if(y == height-50){
						multY = -5;
						System.out.println(y);
					} 
					else if(y == 0){
						multY = 5;	
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

		g.setColor(Color.YELLOW);
		g.fillOval(500, 50, 100, 100);
		
		g.setColor(Color.ORANGE);
		g.fillRect(100,300,150,100);

		g.setColor(Color.GREEN);
		g.fillRect(125,250,100,50);

		g.setColor(Color.BLACK);
		g.fillRect(225,260,50,25);

		g.setColor(Color.BLACK);
		g.fillRect(150,240,50,10);

		g.setColor(Color.GREEN);
		g.fillRect(0,400,700,350);

		g.setColor(Color.BLACK);
		g.fillOval((int)x, (int)y, 50, 50);
	}

	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");

		Painting myPainting = new Painting();
		
		myFrame.add(myPainting);

		JPanel panel1 = new JPanel();

		panel1.setBackground(Color.GREEN);

		myFrame.setContentPane(myPainting);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
		myFrame.setResizable(false);
		myFrame.setLocationRelativeTo(null);

	}
}