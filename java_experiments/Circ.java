import javax.swing.JOptionPane;
import java.awt.*;

public class Circ{
	public static void main(String[] args){
		String inputStr = JOptionPane.showInputDialog("Enter the radius", "0");
		if (inputStr == null || inputStr.equals("")){
			JOptionPane.showMessageDialog(null, "Error: enter a value");
			return;
		}
		if(!(Mark.isNumeric(inputStr)))
		{
			JOptionPane.showMessageDialog(null, "Error: enter a numerical value");
			return;
		}
		double radius = Double.parseDouble(inputStr);
		if (radius < 0)
			JOptionPane.showMessageDialog(null, "Error: radius must be >= 0");
		else{
			double area = Math.PI * Math.pow(radius, 2);
			JOptionPane.showMessageDialog(null, "The area is " + area);
		}
	}
}