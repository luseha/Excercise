package JFrameTest;

import java.awt.Dimension;
import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.pack();
		
		//frame.setLocation(100, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
