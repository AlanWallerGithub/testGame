package mainPackage;
import java.util.Scanner;

import javax.swing.JFrame;

public class Game {
	

	
public static void main(String args[]) {
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Here we are in the space age.\nHi. Let me tell you a secret.\n");
	System.out.println("Press any tool to exit.\n");
int cold = scanner.nextInt();
System.out.println("You selected "+cold);
System.out.println("I'm Wario and I'm learning how to make a game");
JFrame frame = new JFrame("FrameDemo");
//2. Optional: What happens when the frame closes?
frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//4. Size the frame.
frame.pack();

frame.setLocationRelativeTo(null);

//5. Show it.
frame.setVisible(true);
frame.getContentPane().setSize(400, 400);
	} 


}
