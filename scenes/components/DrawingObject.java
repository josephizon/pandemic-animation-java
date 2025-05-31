/**
	DrawingObject class is the interface that is implemented by all the shape classes I made but only has the draw method. I did this so that 
     I could make an enhanced for loop so that I don't need to draw everything manually. 
	
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

import java.awt.*; //for Layouts 

public interface DrawingObject {

     void draw(Graphics2D g2d);
    
}
