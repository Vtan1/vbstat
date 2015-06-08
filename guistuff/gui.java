import java.io.*;
import java.util.*;
import java.awt.*;
import java.io.File;

public class gui extends JFrame {
    private JPanel canvas;
    private Container pane;

    public gui() {
	setTitle("Volleyball Statistics Analysis!");
	setSize(400,500);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
	
    }

    public static void main(String[] args) {
	gui g = new gui();
	g.setVisible(true);
    }
}
