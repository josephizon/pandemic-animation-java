/**
	ScreenOn class doesn't have external methods called out by the program since I made it easier for myself by letting ScreenOff be the only one that actually disappears. 
    ScreenOn is just the background of the phone when its on. 
	
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

public class ScreenOn implements DrawingObject {

    private int alpha;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param alpha - sets the transparency of the screen of the cellphone. 
     */
    public ScreenOn (int alpha) {
        this.alpha = alpha; 
    }

    /**
     * This is the draw method which I used to draw the screen of the cellphone when its on. 
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double point = new Path2D.Double();
        point.moveTo(590, 120);
        point.curveTo(680, 120, 680, 120, 680, 210); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.lineTo(680, 530);
        point.lineTo(420, 530);
        point.lineTo(420, 210);
        point.curveTo(420, 120, 420, 120, 510, 120);
        point.closePath(); 
        
        g2d.setColor(new Color(162, 228, 242, alpha) );
        g2d.fill(point);
    }
}
