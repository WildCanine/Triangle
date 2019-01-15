package project;
import javax.swing.JOptionPane;
public class Triangle {
		private double sideA, sideB, sideC;
		private double perimeter;
		private double theArea;
		public void setVarsToZero() {
			sideA=0.0;
			sideB=0.0;
			sideC=0.0;
			perimeter=0.0;
			theArea=0.0;
		}
		public void showVars() {
			JOptionPane.showMessageDialog(null, "Side A = " + sideA);
			JOptionPane.showMessageDialog(null, "Side B = " + sideB);
			JOptionPane.showMessageDialog(null, "Side C = " + sideC);
			JOptionPane.showMessageDialog(null, "Perimeter = " + perimeter);
			JOptionPane.showMessageDialog(null, "Area = " + theArea);
		}
		public void setSides() {
			sideA= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value for side A:"));
			sideB= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value for side B:"));
			sideC= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value for side C:"));
		}
		public void calcPerimeter() {
			perimeter=sideA+sideB+sideC;
		}
		public void calcArea() {
			double p=0.0;
			p=perimeter/2.0;
			theArea=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		}
		public void calcAngles() {
			double cosC=0.0, Ccos=0.0, Cdeg=0.0;
			double cosA=0.0, Acos=0.0, Adeg=0.0;
			double cosB=0.0, Bcos=0.0, Bdeg=0.0;
			cosC=(Math.pow(sideA, 2.0)+Math.pow(sideB, 2.0)-Math.pow(sideC, 2.0))/(2.0*sideA*sideB);
			cosA=(Math.pow(sideB, 2.0)+Math.pow(sideC, 2.0)-Math.pow(sideA, 2.0))/(2.0*sideB*sideC);
			cosB=(Math.pow(sideC, 2.0)+Math.pow(sideA, 2.0)-Math.pow(sideB, 2.0))/(2.0*sideC*sideA);
			Ccos=Math.acos(cosC);
			Acos=Math.acos(cosA);
			Bcos=Math.acos(cosB);
			Cdeg=Math.toDegrees(Ccos);
			Adeg=Math.toDegrees(Acos);
			Bdeg=Math.toDegrees(Bcos);
			JOptionPane.showMessageDialog(null, "Angle A = "+Adeg);
			JOptionPane.showMessageDialog(null, "Angle B = "+Bdeg);
			JOptionPane.showMessageDialog(null, "Angle C = "+Cdeg);
		}
}