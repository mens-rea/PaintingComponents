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

			//stickman
		g.fillOval(280, 150, 30, 100);
		g.drawLine(295, 150, 295, 135);
		g.fillOval(280, 95, 30, 40);
		
		//left
		g.drawLine(281, 175, 260, 195);
		g.drawLine(260, 195, 270, 230);
		g.fillOval(268, 228, 15, 15);
		g.drawLine(288, 245, 288, 320);
		g.fillOval(272, 318, 25, 10);

		//right
		g.drawLine(302, 245, 302, 320);
		g.fillOval(297, 318, 25, 10);
		g.drawLine(309, 175, 328, 195);
		g.drawLine(328, 195, 338, 160);
		g.fillOval(330, 156, 15, 15);

		//flower bed
		g.setColor(Color.ORANGE);
		g.drawRect(15, 395, 310, 60);
		g.fillRect(20, 400, 300, 50);
		g.setColor(Color.GREEN);
		g.fillOval(30, 380, 30, 30);
		g.fillOval(50, 380, 30, 30);
		g.fillOval(40, 360, 30, 30);
		g.fillOval(70, 380, 30, 30);
		g.fillOval(60, 360, 30, 30);
		g.fillOval(90, 380, 30, 30);
		g.fillOval(80, 360, 30, 30);
		g.fillOval(110, 380, 30, 30);
		g.fillOval(100, 360, 30, 30);
		g.fillOval(130, 380, 30, 30);
		g.fillOval(120, 360, 30, 30);
		g.fillOval(150, 380, 30, 30);
		g.fillOval(140, 360, 30, 30);
		g.fillOval(170, 380, 30, 30);
		g.fillOval(160, 360, 30, 30);
		g.fillOval(190, 380, 30, 30);
		g.fillOval(180, 360, 30, 30);
		g.fillOval(210, 380, 30, 30);
		g.fillOval(200, 360, 30, 30);
		g.fillOval(230, 380, 30, 30);
		g.fillOval(220, 360, 30, 30);
		g.fillOval(250, 380, 30, 30);
		g.fillOval(240, 360, 30, 30);
		g.fillOval(270, 380, 30, 30);
		g.fillOval(260, 360, 30, 30);
		g.setColor(Color.BLACK);
		g.drawLine(60, 380, 30, 340);
		g.drawLine(60, 380, 60, 330);
		g.drawLine(60, 380, 90, 340);
		g.setColor(Color.BLUE);
		g.fillOval(55, 325, 10, 10);
		g.fillOval(25, 335, 10, 10);
		g.fillOval(85, 335, 10, 10);
		g.setColor(Color.RED);
		g.fillOval(60, 330, 13, 13);
		g.fillOval(54, 315, 13, 13);
		g.fillOval(46, 330, 13, 13);
		g.fillOval(30, 340, 13, 13);
		g.fillOval(24, 325, 13, 13);
		g.fillOval(16, 340, 13, 13);
		g.fillOval(90, 340, 13, 13);
		g.fillOval(84, 325, 13, 13);
		g.fillOval(76, 340, 13, 13);


		g.setColor(Color.GREEN);
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