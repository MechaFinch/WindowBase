package window;

//Imports for the window
import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class App extends JFrame {		//Main class for the window
	public static boolean keyPressed;	//Booleans for different keys being pressed go here
	
	static Board board = new Board();	//Object for the window graphics
	
	public static final int width = 400, height = 400;	//Width and height of the window
	
	static final double frameRate = 30;	//Framerate for updating graphics
	
	static String windowTitle = "Window!";	//Title of the window
	
	public App() {	//Init the program
		initUI();	//Init window
	}
	
	private void initUI() {					//Initialize the window
		add(board);							//Add the graphics board
		setSize(width, height);				//Initial size is the specified w/h
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Close operation
		setLocationRelativeTo(null);		//Free frame
		addKeyListener(new KeyManager());	//Get the KeyManager object
	}
	
	public static void main(String[] args) {	//Main method
		EventQueue.invokeLater(() -> {	//Create the window
			App ex = new App();
			ex.setVisible(true);
		});
		
		while(true) {	//Running loop for the application
			EventQueue.invokeLater(() -> {	//Update graphics
				board.repaint();
			});
			
			//Do loop stuff here
			
			try {
				Thread.sleep((long) (1000 / frameRate));
			} catch(InterruptedException e) {
			}
		}
	}
}
