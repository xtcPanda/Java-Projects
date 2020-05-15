import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;




public class GamePanel extends JPanel implements  ActionListener {
	
	public JFrame frame;

	public static final int WIDTH = 500, HEIGHT = 500;
	
	public static final long  serialVersionUID = 1L;
	
	public static GamePanel panel = new GamePanel();
	
	@SuppressWarnings("unused")
	public boolean running = false, paused;
	
	public static ArrayList<Point> SnakeBody = new ArrayList<Point>();
	
	private int delay = 100;
	
	private Timer timer =  new Timer(delay, this);
	
	public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;
	
	public Point head, food;
	
	public int ticks = 0, direction = DOWN, length = 10, time, score;
	
	private Random r;
	
	public Body b;

	private String s = "";
	
	
	
	public GamePanel()
	{	
		start();
	}
	
	public void start()
	{
		running = false;
		time = 0;
		score = 0;
		length = 10;
		ticks = 0;
		direction = DOWN;
		head = new Point(0, -1);
		timer.start();
		r = new Random();
		food = new Point(10,10);
		paused = false;
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.GREEN);
		
		for(Point point : GamePanel.SnakeBody)
		{
			g.fillRect(point.x * GamePanel.SCALE, point.y * GamePanel.SCALE, GamePanel.SCALE, GamePanel.SCALE);
		}
		g.fillRect(panel.head.x * GamePanel.SCALE, panel.head.y * GamePanel.SCALE, GamePanel.SCALE, GamePanel.SCALE);
		
		
		g.setColor(Color.RED);
        g.fillRect(food.x * GamePanel.SCALE,food.y * GamePanel.SCALE, GamePanel.SCALE, GamePanel.SCALE);
        
        
        s = "The score is: " + score;
        g.drawString(s ,400, 25);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		 	repaint();
	        ticks++;

	        if (ticks % 2 == 0 && head != null && !running && !paused) {
	        	
	            time++;
	            
	            SnakeBody.add(new Point(head.x, head.y));
	            
	            if (direction == UP) {
	                if (head.y - 1 >= 0 && noTailAt(head.x, head.y - 1)) {
	                    head = new Point(head.x, head.y - 1);
	                } else {
	                    running = true;
	                }
	            }

	            if (direction == DOWN) {
	                if (head.y + 1 < HEIGHT / SCALE && noTailAt(head.x, head.y + 1)) {
	                    head = new Point(head.x, head.y + 1);
	                } else {
	                    running = true;
	                }
	            }

	            if (direction == LEFT) {
	                if (head.x - 1 > 0 && noTailAt(head.x - 1, head.y)) {
	                    head = new Point(head.x - 1, head.y);
	                } else {
	                    running = true;
	                }
	            }

	            if (direction == RIGHT) {
	                if (head.x + 1 < WIDTH / SCALE && noTailAt(head.x + 1, head.y)) {
	                    head = new Point(head.x + 1, head.y);
	                } else {
	                    running = true;
	                }
	                
	                
	            }
	            
	            if (SnakeBody.size() > length) {
	                SnakeBody.remove(0);
	            }
	            
	      
	                if (head.x == food.x && head.y == food.y) {
	                    score += 1;
	                    length++;
	                    food.setLocation(r.nextInt(50), r.nextInt(50));
	                }

	            
	        }
		
		
	}
	
	public boolean noTailAt(int x, int y)
	{
		for (Point point : SnakeBody)
		{
			if (point.equals(new Point(x, y)))
			{
				return false;
			}
		}
		return true;
	}



		
}


