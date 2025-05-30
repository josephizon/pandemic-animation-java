/**
	Clouds class that instatiates multiple clouds based on one version of the cloud I made. This only appears in day mode. 
	
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

public class Clouds implements DrawingObject {
    
    private double size;
    private int x; 
    private int y; 
    private int alpha;
    private int ctr;
    
    /**
     * This is the constructor that initializes the size, alpha or transparency of the fill, and the ctr which I used as a counter. 
     */
    public Clouds() {
        size = 200;
        alpha = 0;
        ctr = 0;
    
        
    }

    /**
     * This is the draw method which I used to draw the different clouds using this only Clouds class. 
     */
    public void draw(Graphics2D g2d) {

        //first cloud
        x = 125; 
        y = 125; 
        
        Ellipse2D.Double main = new Ellipse2D.Double(x, y, size, size-100); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(main);

        Ellipse2D.Double topright = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(topright);
        
        Ellipse2D.Double bottomleft = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomleft);
        
        Ellipse2D.Double rightCircle = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(rightCircle);
        
        Ellipse2D.Double bottomCircle = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomCircle);

        //second cloud

        x = 800;
        y = 600;
        
        Ellipse2D.Double main1 = new Ellipse2D.Double(x, y, size, size-100); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(main1);

        Ellipse2D.Double topright1 = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(topright1);
        
        Ellipse2D.Double bottomleft1 = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomleft1);
        
        Ellipse2D.Double rightCircle1 = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(rightCircle1);
        
        Ellipse2D.Double bottomCircle1 = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomCircle1);

        //third cloud

        x = 600;
        y = 0;
        
        Ellipse2D.Double main2 = new Ellipse2D.Double(x, y, size, size-100); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(main2);

        Ellipse2D.Double topright2 = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(topright2);
        
        Ellipse2D.Double bottomleft2 = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomleft2);
        
        Ellipse2D.Double rightCircle2 = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(rightCircle2);
        
        Ellipse2D.Double bottomCircle2 = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomCircle2);
        
         //fourth cloud
         x = -10; 
         y = 700; 
         
         Ellipse2D.Double main3 = new Ellipse2D.Double(x, y, size, size-100); 
         g2d.setColor(new Color(255, 255, 255, alpha)); 
         g2d.fill(main3);
 
         Ellipse2D.Double topright3 = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
         g2d.setColor(new Color(255, 255, 255, alpha)); 
         g2d.fill(topright3);
         
         Ellipse2D.Double bottomleft3 = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
         g2d.setColor(new Color(255, 255, 255, alpha)); 
         g2d.fill(bottomleft3);
         
         Ellipse2D.Double rightCircle3 = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
         g2d.setColor(new Color(255, 255, 255, alpha)); 
         g2d.fill(rightCircle3);
         
         Ellipse2D.Double bottomCircle3 = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
         g2d.setColor(new Color(255, 255, 255, alpha)); 
         g2d.fill(bottomCircle3);

        //fifth cloud
        x = 275; 
        y = 450; 
        
        Ellipse2D.Double main4 = new Ellipse2D.Double(x, y, size, size-100); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(main4);

        Ellipse2D.Double topright4 = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(topright4);
        
        Ellipse2D.Double bottomleft4 = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomleft4);
        
        Ellipse2D.Double rightCircle4 = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(rightCircle4);
        
        Ellipse2D.Double bottomCircle4 = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomCircle4);

        //sixth cloud
        x = 925; 
        y = 350; 
        
        Ellipse2D.Double main5 = new Ellipse2D.Double(x, y, size, size-100); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(main5);

        Ellipse2D.Double topright5 = new Ellipse2D.Double(x+50, y-15, size-75, size-150); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(topright5);
        
        Ellipse2D.Double bottomleft5 = new Ellipse2D.Double(x-10, y+45, size-60, size-135); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomleft5);
        
        Ellipse2D.Double rightCircle5 = new Ellipse2D.Double(x+115, y+10, size-100, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(rightCircle5);
        
        Ellipse2D.Double bottomCircle5 = new Ellipse2D.Double(x+65, y+30, size-90, size-115); 
        g2d.setColor(new Color(255, 255, 255, alpha)); 
        g2d.fill(bottomCircle5);

    }

    /**
     * cloudsOn method raises the value of ctr similarly to alpha in the background so that instead of it appearing slowly, it appears in one go when ctr reaches 255.
     */
    public void cloudsOn() {
        if (ctr < 255) {
            ctr += 15;
        }
        else if (ctr == 255) {
            alpha = 255;
        }
    }
    
    /**
     * cloudsOff resets the values of ctr and alpha to 0. 
     */
    public void cloudsOff() {
       alpha = 0; 
       ctr = 0;
    }
}
