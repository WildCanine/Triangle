package project;
import javax.swing.JOptionPane;
public class Runner {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Matthew Woodall-9/14/18-3A");
		Triangle myTriangle=new Triangle();
		Circle myCircle=new Circle();
		Rectangle myRectangle=new Rectangle();
		Cuboid myCuboid=new Cuboid();
		Sphere mySphere=new Sphere();
		String restart="Y";
		while(restart.equals("Y")) {
			String answer=JOptionPane.showInputDialog(null, "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere");
			if(answer.equals("Triangle")) {
				JOptionPane.showMessageDialog(null, answer);
				myTriangle.setVarsToZero();
				myTriangle.setSides();
				myTriangle.calcPerimeter();
				myTriangle.calcArea();
				myTriangle.showVars();
				myTriangle.calcAngles();
			}
			else if(answer.equals("Circle")) {
				JOptionPane.showMessageDialog(null, answer);
				myCircle.setVarsToZero();
				myCircle.setRadius();
				myCircle.calcCircumference();
				myCircle.calcArea();
				myCircle.showVars();
			}
			else if(answer.equals("Rectangle")) {
				myRectangle.setVarsToZero();
				myRectangle.setSides();
				myRectangle.calcPerimeter();
				myRectangle.calcArea();
				myRectangle.calcDiagonal();
				myRectangle.showVars();
			}
			else if(answer.equals("Cuboid")) {
				myCuboid.setVarsToZero();
				myCuboid.setSides();
				myCuboid.calcSurfaceArea();
				myCuboid.calcVolume();
				myCuboid.showVars();
			}
			else if(answer.equals("Sphere")) {
				JOptionPane.showMessageDialog(null, answer);
				mySphere.setVarsToZero();
				mySphere.setRadius();
				mySphere.calcVolume();
				mySphere.calcSurfaceArea();
				mySphere.showVars();
			}
			else {
				JOptionPane.showMessageDialog(null, "That isn't one of the selections.");
			}
			int legit=0;
			while(legit==0) {
				restart=JOptionPane.showInputDialog(null, "Would you like to go back to the beginning? (Y/N)");
				if(restart.equals("Y")) {
					JOptionPane.showMessageDialog(null, "Great! Let's do it!");
					legit=1;
				}
				else if(restart.equals("N")) {
					JOptionPane.showMessageDialog(null, "Goodbye. Thanks for playing!");
					legit=1;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter Y or N.");
					legit=0;
				}
			}
		}
	}
}