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

		g.setColor(Color.GREEN);

		g.fillRoundRect(400, 200, 200, 200, 100, 100);

		g.setColor(Color.BLUE);
		g.fillRect(50, 250, 50, 100);

		g.setColor(Color.GREEN);
		g.fillOval(90, 50, 50,100);

		g.fillOval((int)x, (int)y, 50, 50);
	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");

		JPanel panel1 = new JPanel();
		
		Painting myPainting = new Painting();

		panel1.setBackground(Color.GREEN);

		myFrame.setContentPane(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}