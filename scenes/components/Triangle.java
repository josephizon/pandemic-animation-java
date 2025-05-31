/**
	This is the Triangle shape for the alert to be displayed on the screen of the phone. Andito din yung text ng on screen message. 
	
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

public class Triangle implements DrawingObject {
    
    private double size;
    private Color color;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param size - sets the size of the triangle used as the warning sign. 
     * @param color - sets the color of the triangle.
     */
    public Triangle (double size, Color color) {
        this.size = size; 
        this.color = color;
    }

    /**
     * This is the draw method which I used to draw the triangle of the warning sign. This also draws the the text used in the warning of the cellphone. 
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double p = new Path2D.Double();
        p.moveTo(500, 315); //moves to a certain location || lifting the pen when u draw so that u dont draw there || starting point 
        p.lineTo(540, 385); //creates a line || actual process of drawing || this is where it continues 
        p.lineTo(460, 385);
        g2d.setStroke(new BasicStroke(3)); 
        p.closePath(); 
        g2d.setColor(color);
        g2d.fill(p); // or .fill to fill in the shape 

        Font font = new Font("Arial", Font.PLAIN, 50);
        g2d.setColor(Color.BLACK);
        g2d.setFont(font);
        
        // Draw a string such that its base line is at x, y
        
        g2d.drawString("!", 490, 375);

        Font font2 = new Font("Arial", Font.PLAIN, 15);
        g2d.setColor(Color.BLACK);
        g2d.setFont(font2);
        
        g2d.drawString("MAY COVID ", 540, 350);

        FontMetrics fontMetrics = g2d.getFontMetrics();
 
        g2d.drawString("PA DIN BRO :(", 540, 350+fontMetrics.getAscent()); //this is so that this text will appear right under the previous text 
    }
}
