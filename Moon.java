/**
	This is the Moon class which consists of two Ellipse. One circle is the inner circle, the other just serves as an outline for the Moon. 
	
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

public class Moon implements DrawingObject {
    
    private double size;
    private int x;
    private int y;
    private int alpha;  

    /**
     * This is the constructor which initializes the x and y values which are the positions of the moon, the size of the moon, and the alpha used for transparency. 
     */
    public Moon() {
        x = 850;
        y = 100; 
        size = 250;
        alpha = 0;
    }

    /**
     * This is the draw method which I used to draw the moon of NightMode. 
     */
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double sun1 = new Ellipse2D.Double(x-10, y-13, size+25, size+25); 
        g2d.setColor(new Color(108, 108, 108, alpha) ); 
        g2d.fill(sun1);

        Ellipse2D.Double sun = new Ellipse2D.Double(x, y, size, size); 
        g2d.setColor(new Color(229, 229, 229, alpha) ); 
        g2d.fill(sun);
    }

    /**
     * moonRising method raises the value of alpha to so that it appears slowly while at the same time the y-value is decreased so that it appears as if the moon is rising
     */
    public void moonRising() {
        if (alpha < 255) {
            alpha += 15;
            y -= 10;
        }  
    }
    
    /**
     * moonOff method resets the value of alpha and the vertical position of the moon. 
     */
    public void moonOff() {
       alpha = 0;
       y = 100;

    }
}
