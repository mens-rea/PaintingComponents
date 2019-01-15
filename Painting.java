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

		g.setColor(Color.WHITE);
		g.fillRect(320, 130, 50, 120);

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(323, 133, 45, 120);

		g.setColor(Color.GRAY);
		g.fillRect(326, 136, 40, 120);

		g.setColor(Color.YELLOW);
		g.fillRect(310, 250, 70, 8);

		g.setColor(Color.BLACK);
		g.fillRect(338,258, 15, 30);

		int xpoints[] = {320, 370, 370};
		int ypoints[] = {130, 100, 130};
		int npoints = 3;

		g.setColor(Color.WHITE);
		g.fillPolygon(xpoints, ypoints, npoints);

		int apoints[] = {323, 368, 368};
		int bpoints[] = {133, 105, 133};
		int cpoints = 3;

		g.setColor(Color.LIGHT_GRAY);
		g.fillPolygon(apoints, bpoints, cpoints);

		int dpoints[] = {326, 366, 366};
		int epoints[] = {136, 110, 136};
		int fpoints = 3;

		g.setColor(Color.GRAY);
		g.fillPolygon(dpoints, epoints, fpoints);

		g.setColor(Color.YELLOW);	
		g.fillOval(332, 287, 25, 25);

		g.setColor(Color.RED);	
		g.fillOval(333, 289, 22, 22);

		g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);
	}



	public static void main(String args[]){
		JFrame myFrame = new JFrame("Painting");
		//JPanel myPanel = new JPanel();

		Painting myPainting = new Painting();

		myPainting.setBackground(Color.RED);
	
		myFrame.add(myPainting);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(700, 500);
		myFrame.setVisible(true);
	}
	
}