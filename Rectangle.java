package project;
import javax.swing.JOptionPane;
public class Rectangle {
	private double side1, side2;
	private double perimeter;
	private double theArea;
	private double diagonal;
	public Rectangle() {
	}
	public void setVarsToZero() {
        side1=0.0;
        side2=0.0;
        perimeter=0.0;
        theArea=0.0;
        diagonal=0.0;
    }	
	public void showVars() {
        JOptionPane.showMessageDialog(null, "Side 1 = " + side1);
        JOptionPane.showMessageDialog(null, "Side 2 = " + side2);
        JOptionPane.showMessageDialog(null, "Perimeter = " + perimeter);
        JOptionPane.showMessageDialog(null, "Area = " + theArea);
        JOptionPane.showMessageDialog(null, "Diagonal = " + diagonal);
    }	
	public void setSides() {
		side1=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value for Side 1:"));
		side2=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value for Side 2:"));
	}
	public void calcPerimeter() {
		perimeter=2*(side1 + side2);
	}
	public void calcArea() {
		theArea=side1 *side2;
	}
	public void calcDiagonal() {
		diagonal=Math.pow((Math.pow(side1, 2)) + (Math.pow(side2, 2)), .5);
	}
}