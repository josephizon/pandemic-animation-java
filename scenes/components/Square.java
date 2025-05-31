/**
	Square class is instantiated twice in the program to be able to make the rectangle for the phone alert. 
    I made two of these because it was required instead of one whole rectangle hehe :D 
	
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
package scenes.components; 

import java.awt.*; 
import java.awt.geom.*; //used for importing shapes 

public class Square implements DrawingObject {
    
    private int x; 
    private int y;
    private double size;
    private Color color;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param x - sets the x position of the square
     * @param y - sets the y position of the square
     * @param size - sets the size of the square
     * @param color - sets the color of the square
     */
    public Square (int x, int y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size; 
        this.color = color;
    }
    
    /**
     * This is the draw method which I used to draw the two squares made to make the rectangle for the warning box in the cellphone. 
     */
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double warningLayout = new Rectangle2D.Double(x, y, size, size); 
        g2d.setColor(color);
        g2d.fill(warningLayout);
    }

}
