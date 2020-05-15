import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Frame extends JPanel implements KeyListener {

	
	GamePanel panel;
	public Frame()
	{
		JFrame frame = new JFrame();
		panel = new GamePanel();
		frame.add(panel);
		frame.setTitle("Snake Game");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(this);      
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int i = e.getKeyCode();

		if ((i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) && panel.direction != panel.RIGHT)
		{
			panel.direction = panel.LEFT;
		}

		if ((i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT) && panel.direction != panel.LEFT)
		{
			panel.direction = panel.RIGHT;
		}

		if ((i == KeyEvent.VK_W || i == KeyEvent.VK_UP) && panel.direction != panel.DOWN)
		{
			panel.direction = panel.UP;
		}

		if ((i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN) && panel.direction != panel.UP)
		{
			panel.direction = panel.DOWN;
		}

		if (i == KeyEvent.VK_SPACE)
		{
			if (panel.running)
			{
				panel.start();
			}
			else
			{
				panel.paused = !panel.paused;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
