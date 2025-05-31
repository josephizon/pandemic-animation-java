/**
	Line class that is just the outline of the cellphone I made. This is literally just the grey outline of the phone. 
	
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

public class Line implements DrawingObject{
    
    private int stroke;
    private Color color;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param stroke - sets the stroke of the outline of the cellphone. 
     * @param color - sets the color of the outline of the cellphone. 
     */
    public Line(int stroke, Color color) {
        this.stroke = stroke; 
        this.color = color;
    }

    /**
     * This is the draw method which I used to draw the outline of the cellphone. 
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double point = new Path2D.Double();
        point.moveTo(600, 100);
        point.curveTo(700, 100, 700, 100, 700, 200); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.lineTo(700, 500);
        point.curveTo(700, 600, 700, 600, 600, 600);
        point.lineTo(500, 600);
        point.curveTo(400, 600, 400, 600, 400, 500);
        point.lineTo(400, 200);
        point.curveTo(400, 100, 400, 100, 500, 100);
        point.closePath();
        
        g2d.translate(-30, 35);
        
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(stroke));
        g2d.draw(point);
    }
}
