import java.io.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.io.File;

public class gui extends JFrame {
    //private JPanel canvas;
    private Container pane1,pane2,overallpane;
    private JTextArea xok1,xok2,xoa1,xoa2,xmk1,xmk2,xma1,xma2,xss1,xss2,xsa1,xsa2,xld;
    private JTextArea yok1,yok2,yoa1,yoa2,ymk1,ymk2,yma1,yma2,yss1,yss2,ysa1,ysa2,yld;
    

    public gui() {
	setTitle("Volleyball Statistics Analysis!");
	setSize(400,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	overallpane = getContentPane();
	overallpane.setLayout(new BoxLayout(overallpane, BoxLayout.X_AXIS));
	setVisible(true);
	
	pane1 = getContentPane();
	setVisible(true);
	overallpane.add(pane1);
       	pane1.setLayout(new BoxLayout(pane1, BoxLayout.Y_AXIS));
	xok1 = new JTextArea();
	xok1.setText("hello");
	pane1.add(xok1);
       
    }

    public static void main(String[] args) {
	gui g = new gui();
	g.setVisible(true);
    }
}
