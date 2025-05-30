/**
	This uses the similar concept of the Cloud class since this also has multiple instances of one version of the star I made. This only appears when 
    NightMode is on. 
	
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

public class Stars implements DrawingObject{
    
    private int x; 
    private int y; 
    private int alpha;
    private int ctr;

    /**
     * This is the constructor that initializes the alpha or transparency of the fill and the ctr which I used as a counter. 
     */
    public Stars() {
        alpha = 0;
        ctr = 0;
    }

    /**
     * This is the draw method which I used to draw the different stars using only this Star Class. 
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double point = new Path2D.Double();
        //star 1
        x = 700;
        y = 100;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 2
        x = 900;
        y = 400;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 3
        x = 150;
        y = 510;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 4
        x = 500;
        y = 50;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 5
        x = 100;
        y = 100;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);
        
        //star 6
        x = 700;
        y = 700;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 7
        x = 900;
        y = 650;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 8
        x = 250;
        y = 250;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 9
        x = 50;
        y = 700;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

        //star 10
        x = 300;
        y = 675;
        point.moveTo(x, y);
        point.curveTo(x, y+15, x, y+15, x+8, y+24); //bezier points are the handles wherein the first point connects to the first bezier point and the second bezier connectts to the end point 
        point.curveTo(x, y+35, x, y+35, x, y+50);
        point.curveTo(x, y+35, x, y+35, x-8, y+24);
        point.curveTo(x, y+15, x, y+15, x, y);
        point.closePath();

        g2d.setColor(new Color(255, 224, 80, alpha));
        g2d.setStroke(new BasicStroke(2));
        g2d.fill(point);

    }

    /**
     * starsOn method raises the value of ctr similarly to alpha in the background so that instead of it appearing slowly, it appears in one go when ctr reaches 255.
     */
    public void starsOn() {
        if (ctr < 255) {
            ctr += 15;
        }
        else if (ctr == 255) {
            alpha = 255;
        }     
    }
    
    /**
     * starsOff resets the values of ctr and alpha to 0. 
     */
    public void starsOff() {
       alpha = 0; 
       ctr = 0;
    }

}
