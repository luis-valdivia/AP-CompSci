import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel
{
	public ColorPanel(Color backColor, int width, int height) 	
	{
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));
	}

	public ColorPanel(Color backColor)
		{setBackground(backColor);}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int thickness = getWidth() / 15;
		int x = 0, y = 0;
		int width = getWidth() - 1;
		int height = getHeight() - 1;
		Color ringColor = Color.red;
		for(int a = 1; a <= 7; a++)
		{
			g.setColor(ringColor);
			g.fillOval(x, y, width, height);
			x += thickness;
			y += thickness;
			width -= thickness * 2;
			height -= thickness * 2;
			if(ringColor == Color.red)
				ringColor = Color.white;
			else
				ringColor = Color.red;
		}
	}
}