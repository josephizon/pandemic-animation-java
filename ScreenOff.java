/**
	ScreenOff class is quite similar to the DayMode and NightMode wherein I just mess with opacity to be able to make it appear like the screen is turning brighter or darker. 
    This is above the ScreenOn because instead of making everything involved in the screenfade out, I just put the darker layer on top to be able to make it as if the 
    object in the screen are disappearing. 
	
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

public class ScreenOff implements DrawingObject {

    private int alpha;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param alpha - sets the transparency of the screen of the cellphone. 
     */
    public ScreenOff(int alpha) {
        this.alpha = alpha; 
    }

    /**
     * This is the draw method which I used to draw the screen of the cellphone when its off. 
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
        
        g2d.setColor(new Color(0, 0, 0, alpha) );
        g2d.fill(point);
    }

    /**
     * plusBright decreases the value of alpha because since this is screenOff, this will dim the ScreenOff shape so that its as the screen is getting brighter. 
     */
    public void plusBright() {
        if (alpha > 0) {
            alpha -= 15;
        }
    }

    /**
     * minusBright increases the value of alpha because since this is screenOff, this will turn up the opacity of the ScreenOff shape so that its as if the screen is getting darker. 
     */
    public void minusBright() {
        if (alpha < 255) {
            alpha += 15;
        }
   } 

   /**
     * screenOff just resets the value of alpha back to 255 so that ScreenOff is on top of the ScreenOn shape. 
     */
   public void screenOff() {
       alpha = 255;
   }
}
