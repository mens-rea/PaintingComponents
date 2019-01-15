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

        g.fillOval(0, 250, 50, 100);
        g.fillOval(0, 300, 60, 500);
        g.fillOval(20, 300, 60, 500);
        g.fillOval(50, 300, 60, 500);
        g.setColor(Color.YELLOW);

        g.fillRect(100,200,200,200);
        g.fillRect(100,200,300,400);
          JFrame myFrame = new JFrame("Painting");
        JPanel panel1 = new JPanel();
        JLabel label = new JLabel("LOUIE ALDRIN CABRAL");
        label.setVisible(true);
        label.setSize(500,100);
        myFrame.setResizable(false);
        label.setBounds(100,200,200,200);
        Painting myPainting = new Painting();

        g.setColor(Color.GREEN);
		g.fillOval((int)x, (int)y, 50, 50);

        panel1.setBackground(Color.GREEN);
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

