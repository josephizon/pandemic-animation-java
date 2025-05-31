/**
	DayMode class that uses GradientPaint to make the gradient background. Only appears when you turn on DayMode. 
    This thing uses alpha which I first made here and in NightMode to make them appear and disappear. 
	
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

public class DayMode implements DrawingObject {
    
    private int width;
    private int height;
    private int alpha;
    
    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param w - sets the width of the background 
     * @param h - sets the height of the background
     */
    public DayMode(int w, int h) {
        width = w;
        height = h;
        alpha = 0;
    }

    /**
     * This is the draw method which I used to draw the background gradient for the DayMode. 
     */
    public void draw(Graphics2D g2d) {

        // Vertical
        GradientPaint gp = new GradientPaint(
                0, height/2, new Color(0,0,0,0),
                0, height, new Color(224, 233, 244, alpha) ); //bottom color
                
        // Horizontal
        GradientPaint gp2 = new GradientPaint(
                0, 0, new Color(1, 29, 92, alpha), //top color 
                0, height/2, new Color(53, 123, 195, alpha), true); //mid color 

        g2d.setPaint(gp2);
        g2d.fillRect(0, 0, width, height); 
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height); 
        
    }

    /**
     * bgOn raises the value of alpha by 15 so that its as if the background is slowly turning on. 
     */
    public void bgOn() {
        if (alpha < 255) {
            alpha += 15;
        }
   }

    /**
     * bgOff resets the value of alpha to make it seem like its not there. 
     */
    public void bgOff() {
        alpha = 0; 
   }
}
