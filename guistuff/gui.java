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
    //these are for the first team
    private JTextArea xok1,xok2,xoa1,xoa2,xmk1,xmk2,xma1,xma2,xss1,xss2,xsa1,xsa2,xld;
    //these are for the second team
    private JTextArea yok1,yok2,yoa1,yoa2,ymk1,ymk2,yma1,yma2,yss1,yss2,ysa1,ysa2,yld;
    //these blank fields are for the first team
    private JTextArea blank1,blank2,blank3,blank4,blank5,blank6,blank7,blank8,blank9,blank10,blank11,blank12,blank13;
    //these blank fields are for the second team
    private JTextArea blank14,blank15,blank16,blank17,blank18,blank19,blank20,blank21,blank22,blank23,blank24,blank25,blank26;
    

    public gui() {
	setTitle("Volleyball Statistics Analysis!");
	setSize(400,500);
	setLocationRelativeTo(null);
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
	xok1.setText("Outside Kills 1");
	xok1.setEditable(false);
	stats1.add(xok1);
	blank1 = new JTextArea();
	blank1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank1);

	xok2 = new JTextArea();
	xok2.setText("Outside Kills 2");
	xok2.setEditable(false);
	stats1.add(xok2);
	blank2 = new JTextArea();
	blank2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank2);

	xoa1 = new JTextArea();
	xoa1.setText("Outside Kill Attempts 1");
	xoa1.setEditable(false);
	stats1.add(xoa1);
	blank3 = new JTextArea();
	blank3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank3);

	xoa2 = new JTextArea();
	xoa2.setText("Outside Kill Attempts 2");
	xoa2.setEditable(false);
	stats1.add(xoa2);
	blank4 = new JTextArea();
	blank4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank4);

	xmk1 = new JTextArea();
	xmk1.setText("Middle Kills 1");
	xmk1.setEditable(false);
	stats1.add(xmk1);
	blank5 = new JTextArea();
	blank5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank5);

	xmk2 = new JTextArea();
	xmk2.setText("Middle Kills 2");
	xmk2.setEditable(false);
	stats1.add(xmk2);
	blank6 = new JTextArea();
	blank6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank6);
	
	xma1 = new JTextArea();
	xma1.setText("Middle Kill Attempts 1");
	xma1.setEditable(false);
	stats1.add(xma1);
	blank7 = new JTextArea();
	blank7.setColumns(10);
	blank7.setRows(1);
	blank7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank7);

	xma2 = new JTextArea();
	xma2.setText("Middle Kill Attempts 2");
	xma2.setEditable(false);
	stats1.add(xma2);
	blank8 = new JTextArea();
	blank8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank8);

	xss1 = new JTextArea();
	xss1.setText("Sets per Set 1");
	xss1.setEditable(false);
	stats1.add(xss1);
	blank9 = new JTextArea();
	blank9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank9);

	xss2 = new JTextArea();
	xss2.setText("Sets per Set 2");
	xss2.setEditable(false);
	stats1.add(xss2);
	blank10 = new JTextArea();
	blank10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank10);

	xsa1 = new JTextArea();
	xsa1.setText("Set Attempts 1");
	xsa1.setEditable(false);
	stats1.add(xsa1);
	blank11 = new JTextArea();
	blank11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank11);


	
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
