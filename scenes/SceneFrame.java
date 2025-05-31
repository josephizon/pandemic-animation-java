/**
	This is where most of the main Java Frame code is placed wherein you add the components of the frame in here. 
    The ActionListeners, ActionEvents, and the buttons are also placed. 
	
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
package scenes; 

import javax.swing.*; //for JComponents 
import java.awt.*; //for Layouts 
import java.awt.event.*;   //For Action event and Listener


public class SceneFrame {

    private JFrame frame; 
    private JButton nightButton; 
    private JButton dayButton; 
    private JButton plusBrightButton; 
    private JButton minusBrightButton; 
    private JButton resetButton; 
    private SceneCanvas drawHere;

    /**
     * This is the constructor of the class wherein all values are initialized here. 
     */
    public SceneFrame(){
        frame = new JFrame(); 
        nightButton = new JButton("Click here to fade into the night."); 
        dayButton = new JButton("Click here to rise and shine to the afternoon."); 
        plusBrightButton = new JButton("Increase phone brightness."); 
        minusBrightButton = new JButton("Decrease phone brightness."); 
        resetButton = new JButton("Reset"); 
        drawHere = new SceneCanvas(1024, 768, new Color(255, 97, 97) );
    }

    /**
     * This is the setUpGUI which is used to set up the JFrame stuff. 
     */
    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Midterm Project - Izon, Joseph - 202605"); 

        JPanel buttonsPanel = new JPanel();

        buttonsPanel.setLayout(new GridLayout(2,3));
        buttonsPanel.add(nightButton);
        buttonsPanel.add(dayButton);
        buttonsPanel.add(resetButton);
        buttonsPanel.add(plusBrightButton);
        buttonsPanel.add(minusBrightButton);
        buttonsPanel.add(new JLabel("Welcome to the Philippine Quarantine Experience"));
    
        cp.add(drawHere, BorderLayout.CENTER);
        cp.add(buttonsPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.pack(); //resize canvas based on the things inside the frame 
        frame.setVisible(true); 
    }

    /**
     * This is the setUpButtonListeners wherein here actions are assigned to button to be listened to so that when the button is pressed, it will respond with what was assigned to the button. 
     */
    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() { 

            @Override //define an already defined method which is the ActionPerformed and give it our own implementation
            public void actionPerformed(ActionEvent ae) {
                //this is what happens when the buttonlistener is read
                Object o = ae.getSource(); //refers to where the event came from

                if(o == nightButton ) {
                    drawHere.getNightMode().bgOn();
                    drawHere.getMoon().moonRising();
                    drawHere.getStars().starsOn();
                    drawHere.getDayMode().bgOff();
                    drawHere.getClouds().cloudsOff();
                    drawHere.getSun().sunOff();
                    drawHere.repaint();
                }

                else if (o == dayButton ) {
                    drawHere.getDayMode().bgOn();
                    drawHere.getSun().sunRising();
                    drawHere.getClouds().cloudsOn();
                    drawHere.getNightMode().bgOff();
                    drawHere.getMoon().moonOff();
                    drawHere.getStars().starsOff();
                    drawHere.repaint();
                }
                
                else if (o == plusBrightButton ) {
                    drawHere.getScreenOff().plusBright();
                    drawHere.repaint();
                }

                else if (o == minusBrightButton ) {
                    drawHere.getScreenOff().minusBright();
                    drawHere.repaint();
                }
                
                else if (o == resetButton ) {
                    drawHere.getNightMode().bgOff();
                    drawHere.getMoon().moonOff();
                    drawHere.getDayMode().bgOff();
                    drawHere.getSun().sunOff();
                    drawHere.getClouds().cloudsOff();
                    drawHere.getStars().starsOff();
                    drawHere.getScreenOff().screenOff();
                    drawHere.repaint();
                }
                
            }
        }; //needed since this is one big long line 

        nightButton.addActionListener(buttonListener); //registers the buttonListener to button1
        dayButton.addActionListener(buttonListener); 
        plusBrightButton.addActionListener(buttonListener); 
        minusBrightButton.addActionListener(buttonListener); 
        resetButton.addActionListener(buttonListener); 
    }
}
