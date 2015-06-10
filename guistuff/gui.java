import java.io.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.io.File;

public class gui extends JFrame {
    private JPanel stats1,stats2;
    private Container volley;
    private JLabel team1,team2;
    private JTextArea xok1,xok2,xoa1,xoa2,xmk1,xmk2,xma1,xma2,xss1,xss2,xsa1,xsa2,xld;
    private JTextArea yok1,yok2,yoa1,yoa2,ymk1,ymk2,yma1,yma2,yss1,yss2,ysa1,ysa2,yld;
    private JTextArea blank1,blank2,blank3,blank4,blank5,blank6,blank7,blank8,blank9,blank10,blank11,blank12,blank13;
    

    public gui() {
	setTitle("Volleyball Statistics Analysis!");
	setSize(400,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	volley = getContentPane();
	volley.setLayout(new BoxLayout(volley, BoxLayout.X_AXIS));
	setVisible(true);
	/*
	overallpane = getContentPane();
	overallpane.setLayout(new BoxLayout(overallpane, BoxLayout.X_AXIS));
	setVisible(true);
	*/
	stats1 = new JPanel();
       	stats1.setLayout(new BoxLayout(stats1, BoxLayout.Y_AXIS));
	volley.add(stats1);

	team1 = new JLabel("Team 1");
	stats1.add(team1);
	xok1 = new JTextArea();
	xok1.setColumns(20);
	xok1.setRows(1);
	xok1.setText("Outside Kills 1");
	xok1.setEditable(false);
	stats1.add(xok1);
	blank1 = new JTextArea();
	blank1.setColumns(10);
	blank1.setRows(1);
	blank1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank1);

	
	stats2 = new JPanel();
	stats2.setLayout(new BoxLayout(stats2, BoxLayout.Y_AXIS));
	volley.add(stats2);

	team2 = new JLabel("Team 2");
	stats2.add(team2);
	yok1 = new JTextArea();
	yok1.setColumns(20);
	yok1.setRows(1);
	yok1.setText("Outside Kills");
	stats2.add(yok1);

	yok2 = new JTextArea();
	yok2.setColumns(20);
	yok2.setRows(1);
	yok2.setText("Outside Kills");
	stats2.add(yok2);

	
    }

    public static void main(String[] args) {
	gui g = new gui();
	g.setVisible(true);
    }
}
