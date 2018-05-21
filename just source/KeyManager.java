package window;

import java.awt.event.*;

public class KeyManager implements KeyListener {
	public KeyManager() {
	}
	
	/* The commented examples are an easy, useful way of tracking used keys.
	 * In this example, W and S are used. In App.java, put the variables
	 * for each key under the boolean keyPressed, put them on the same definition
	 */
	public void keyPressed(KeyEvent e) {	//Key Pressed event
		int k = e.getKeyCode();	//Code for the key
		
		/*	Example Code
		 * 	if(k == 'W') {
		 * 		App.wPressed = true;
		 * 	} else if(k == 'S') {
		 * 		App.sPressed = true;
		 * 	}
		 */
	}
	
	public void keyReleased(KeyEvent e) {	//Key Released event
		int k = e.getKeyCode();	//Code for the key
		
		/*	Example Code
		 * 	if(k == 'W') {
		 * 		App.wPressed = false;
		 * 	} else if(k == 'S') {
		 * 		App.sPressed = false;
		 * 	}
		 */
	}
	
	public void keyTyped(KeyEvent e) {		//Key Typed event
		
	}
}
