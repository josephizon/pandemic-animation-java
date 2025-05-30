/**
	This is the tester file wherein the main method is located here. Additionally, 
    this is where a new SceneFrame is created. 
	
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


public class SceneStarter {

	/**
     * Main method which sets up the the whole program. 
     */
    public static void main(String[] args) {
        SceneFrame sf = new SceneFrame(); 
        sf.setUpGUI(); 
        sf.setUpButtonListeners(); 
    }
    
}
