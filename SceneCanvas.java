/**
	This is where the drawing canvas is. The main shape codes are not here, but the shapes are mostly drawn here 
    through the use of an arraylist. 
	
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

import javax.swing.*; //for JComponents 
import java.util.*; 
import java.awt.*; //for Layouts 
import java.awt.geom.*; // for the shapes 


public class SceneCanvas extends JComponent {

    private int width;
    private int height; 
    private Color backgroundColor;  

    //Changing Background
    private NightMode nightMode;
    private Moon moonCircle;
    private Stars starsLine;
    private DayMode dayMode;
    private Clouds cloudsCircle;
    private Sun sunCircle;

    //Cellphone Composite Shape
    private Line cpOutline;
    private RoundedRectangle cpBody;
    private Circle homeCircle;
    
    //Things inside the screen
    private ScreenOn cpScreenOn;    
    private Triangle warningTriangle;
    private Square warningSquare;
    
    private ScreenOff cpScreenOff;

    ArrayList<DrawingObject> drawO = new ArrayList<DrawingObject>();
    
    /**
     * This is the constructor of the class wherein all values are initialized here. 
     * @param w - sets the width of the background 
     * @param h - sets the height of the background
     * @param bgc - sets the color of the first background
     */
    public SceneCanvas(int w, int h, Color bgc) {
        width = w; 
        height = h; 
        backgroundColor = bgc; 

        //this is the bg for day and night mode
        drawO.add(nightMode = new NightMode(width, height));
        drawO.add(starsLine = new Stars());
        drawO.add(moonCircle = new Moon() );
        drawO.add(dayMode = new DayMode(width, height));
        drawO.add(cloudsCircle = new Clouds() );
        drawO.add(sunCircle = new Sun() );

        //this is the phone 
        drawO.add(cpOutline = new Line(10, new Color(125, 125, 125)) );
        drawO.add(cpBody = new RoundedRectangle(new Color(89, 89, 89)) );
        drawO.add(homeCircle = new Circle(50, Color.LIGHT_GRAY) );

        //this is the screen
        drawO.add(cpScreenOn = new ScreenOn(255));
        drawO.add(warningSquare = new Square(450, 300, 100, new Color(85, 194, 116) ) );
        drawO.add(warningSquare = new Square(550, 300, 100, new Color(85, 194, 116) ) );
        drawO.add(warningTriangle = new Triangle(300, new Color(255, 224, 80) ) );
        drawO.add(cpScreenOff = new ScreenOff(255));
        
        setPreferredSize(new Dimension(width, height));
    }

    /**
     * This is the paintComponent which acts as the drawing canvas for the whole program. 
     */
    @Override
    protected void paintComponent(Graphics g) {//drawing goes here 
        Graphics2D g2d = (Graphics2D) g; 
 
        //Antialising 
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //pases the antialiasing to the g2d 

        //Main Background
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height); 
        g2d.setColor(backgroundColor);
        g2d.fill(background);
        
        for(DrawingObject object: drawO) {
            object.draw(g2d);
        } 

    }

    //ANIMATION METHOD

    /**
     * NightMode gets the instantiated nightMode so that it could be referenced in SceneFrame. 
     * @return returns nightMode so it could be used in SceneFrame.
     */
    public NightMode getNightMode() {
        return nightMode;
    } 
    
    /**
     * DayMode gets the instantiated dayMode so that it could be referenced in SceneFrame. 
     * @return returns dayMode so it could be used in SceneFrame.
     */
    public DayMode getDayMode() {
        return dayMode;
    }

    /**
     * ScreenOff gets the instantiated cpScreenOff so that it could be referenced in SceneFrame. 
     * @return returns cpScreenOff so it could be used in SceneFrame.
     */
    public ScreenOff getScreenOff() {
        return cpScreenOff;
    }

    /**
     * Clouds gets the instantiated cloudsCircle so that it could be referenced in SceneFrame. 
     * @return returns cloudsCircle so it could be used in SceneFrame.
     */
    public Clouds getClouds() {
        return cloudsCircle;
    }

    /**
     * Stars gets the instantiated starsLine so that it could be referenced in SceneFrame. 
     * @return returns starsLine so it could be used in SceneFrame.
     */
    public Stars getStars() {
        return starsLine; 
    }

    /**
     * Sun gets the instantiated sunCircle so that it could be referenced in SceneFrame. 
     * @return returns sunCircle so it could be used in SceneFrame.
     */
    public Sun getSun() {
        return sunCircle;
    }

    /**
     * Moon gets the instantiated moonCircle so that it could be referenced in SceneFrame. 
     * @return returns moonCircle so it could be used in SceneFrame.
     */
    public Moon getMoon() {
        return moonCircle;
    }

}
