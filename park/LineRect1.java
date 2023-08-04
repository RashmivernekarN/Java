// Java program to Draw a
// Smiley using Java Applet
import java.applet.*;
import java.awt.*;


public class LineRect1 extends Applet 
{
	public void paint(Graphics g)
	{

		// Oval for face outline
		g.drawLine(10, 10, 50, 50);
		g.drawRect(10, 60, 40, 30);
		g.fillRect(60, 60, 30, 80);
		g.drawRoundRect(10, 100, 80, 50, 10,10);		
		g.fillRoundRect(20, 110, 60, 30,5,5);	
		g.drawLine(80, 70, 150, 150);
		g.drawLine(80, 70, 150, 150);	
	}
}
