// Java program to Draw an Olympic
// Symbol using Java Applet
import java.applet.Applet;
import java.awt.Graphics;

public class Olympics extends Applet {
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawOval(30, 30, 30, 30);
		g.setColor(Color.YELLOW);
		g.drawOval(50, 45, 30, 30);
		g.setColor(Color.BLACK);
		g.drawOval(70, 30, 30, 30);
		g.setColor(Color.GREEN);
		g.drawOval(90, 45, 30, 30);
		g.setColor(Color.RED);
		g.drawOval(110, 30, 30, 30);
	}
}
