// Java program to Draw a
// Smiley using Java Applet
import java.applet.*;
import java.awt.*;


public class LineRect extends Applet 
{
	public void paint(Graphics g)
	{

		// Oval for face outline
		g.drawLine(80, 70, 150, 150);
		g.drawRect(80, 70, 150, 150);
		g.fillRect(80, 70, 150, 150);
		g.drawRoundRect(80, 70, 150, 150,20,20);		
		g.fillRoundRect(80, 70, 150, 150,25,25);	
		g.drawLine(80, 70, 150, 150);
		g.drawLine(80, 70, 150, 150);	
	}
}
