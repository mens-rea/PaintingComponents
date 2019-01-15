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


		g.setColor(Color.PINK);
		g.fillOval(100, 250,100, 50);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100,100, 50);
		g.setColor(Color.GREEN);
		g.fillOval(30, 50,200, 200);
		g.setColor(Color.BLUE);
		g.fillRect(380, 250, 280, 200);
		g.setColor(Color.CYAN);
		g.fillRoundRect(390, 70, 180, 150, 70, 70);
		g.setColor(Color.PINK);
		g.fillArc(200, 150, 200, 380, 50, 80);
		g.setColor(Color.ORANGE);
		g.fillRoundRect(50, 330, 180, 100, 70, 70);
		
		g.setColor(Color.WHITE);
		g.fillOval((int)x, (int)y, 50, 50);

}


	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		JPanel panel1 = new JPanel();
		
		Painting myPainting = new Painting();


		myPainting.setBackground(Color.BLACK);

		myFrame.add(myPainting);

		panel1.setBackground(Color.GREEN);

		myFrame.setContentPane(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
}