import javax.swing.*;
import java.awt.*;

public class Test extends JPanel {

	public static void main(String[] args) {

		Test panel = new Test();

		JFrame frame = new JFrame("Test please");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}