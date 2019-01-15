package project;
import javax.swing.JOptionPane;
public class Circle {
	private double radius;
	private double circumference;
	private double theArea;
	public Circle() {	
	}
	public void setVarsToZero() {
        radius=0.0;
        circumference=0.0;
        theArea=0.0;
    }	
	
	public void showVars() {
        JOptionPane.showMessageDialog(null, "Radius = " + radius);
        JOptionPane.showMessageDialog(null, "Circumference = " + circumference);
        JOptionPane.showMessageDialog(null, "Area = " + theArea);
    }	
	public void setRadius() {;
		radius=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Radius:"));
	}
	public void calcCircumference() {
		circumference=(2 * radius * Math.PI);
	}
	public void calcArea() {
		theArea=(Math.pow(radius, 2) * Math.PI);
	}
}
