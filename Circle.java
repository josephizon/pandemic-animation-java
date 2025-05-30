/**
	Circle class which makes the circle button. The circle button is the home button of the phone. 
	
	@author Joseph Raymund F. Izon (202605)
	@version April 6, 2021
**/

/*
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
*/

import java.awt.*; 
import java.awt.geom.*; //used for importing shapes 


public class Circle implements DrawingObject {
    
    private double size;
    private Color color;
	
	/**
	 * @param size - sets the size of the Circle
	 * @param color - sets the color of the Circle 
	 */
    public Circle(double size, Color color) {

        this.size = size; 
        this.color = color;
    }

	/** 
	 * draw method used to draw the ellipse shape into the canvas. 
	*/
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(525, 539, size, size); 
        g2d.setColor(color); 
        g2d.fill(c);
    }
}
