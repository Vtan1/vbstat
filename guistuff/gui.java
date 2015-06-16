import java.io.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.io.File;

public class gui extends JFrame implements ActionListener {
    private JPanel stats1,stats2;
    private Container volley;
    private JDialog error,success;
    private JButton submit;
    private JLabel team1,team2;
    //these are for the first team
    private JTextArea xok1,xok2,xoa1,xoa2,xmk1,xmk2,xma1,xma2,xmb1,xmb2,xss1,xld;
    //these are for the second team
    private JTextArea yok1,yok2,yoa1,yoa2,ymk1,ymk2,yma1,yma2,ymb1,ymb2,yss1,yld;
    //these blank fields are for the first team
    private JTextArea blank1,blank2,blank3,blank4,blank5,blank6,blank7,blank8,blank9,blank10,blank11,blank12;
    //these blank fields are for the second team
    private JTextArea blank14,blank15,blank16,blank17,blank18,blank19,blank20,blank21,blank22,blank23,blank24,blank25;
    private JComboBox t1, t2;
    

    public gui() {
	setTitle("Volleyball Statistics Analysis!");
	setSize(400,500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	volley = getContentPane();
	volley.setLayout(new BoxLayout(volley, BoxLayout.X_AXIS));
	setVisible(true);


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

	xmb1 = new JTextArea();
	xmb1.setText("Middle Blocks 1");
	xmb1.setEditable(false);
	stats1.add(xmb1);
	blank9 = new JTextArea();
	blank9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank9);

	xmb2 = new JTextArea();
	xmb2.setText("Middle Blocks 2");
	xmb2.setEditable(false);
	stats1.add(xmb2);
	blank10 = new JTextArea();
	blank10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank10);

	xss1 = new JTextArea();
	xss1.setText("Sets per Set");
	xss1.setEditable(false);
	stats1.add(xss1);
	blank11 = new JTextArea();
	blank11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank11);

	xld = new JTextArea();
	xld.setText("Libero Digs");
	xld.setEditable(false);
	stats1.add(xld);
	blank12 = new JTextArea();
	blank12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats1.add(blank12);

	
	stats2 = new JPanel();
	stats2.setLayout(new BoxLayout(stats2, BoxLayout.Y_AXIS));
	volley.add(stats2);

	team2 = new JLabel("Team 2");
	stats2.add(team2);

	yok1 = new JTextArea();
	yok1.setText("Outside Kills 1");
	yok1.setEditable(false);
	stats2.add(yok1);
	blank14 = new JTextArea();
	blank14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank14);

	yok2 = new JTextArea();
	yok2.setText("Outside Kills 2");
	yok2.setEditable(false);
	stats2.add(yok2);
	blank15 = new JTextArea();
	blank15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank15);

	yoa1 = new JTextArea();
	yoa1.setText("Outside Kill Attempts 1");
	yoa1.setEditable(false);
	stats2.add(yoa1);
	blank16 = new JTextArea();
	blank16.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank16);

	yoa2 = new JTextArea();
	yoa2.setText("Outside Kill Attempts 2");
	yoa2.setEditable(false);
	stats2.add(yoa2);
	blank17 = new JTextArea();
	blank17.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank17);

	ymk1 = new JTextArea();
	ymk1.setText("Middle Kills 1");
	ymk1.setEditable(false);
	stats2.add(ymk1);
	blank18 = new JTextArea();
	blank18.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank18);

	ymk2 = new JTextArea();
	ymk2.setText("Middle Kills 2");
	ymk2.setEditable(false);
	stats2.add(ymk2);
	blank19 = new JTextArea();
	blank19.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank19);
	
	yma1 = new JTextArea();
	yma1.setText("Middle Kill Attempts 1");
	yma1.setEditable(false);
	stats2.add(yma1);
	blank20 = new JTextArea();
	blank20.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank20);

	yma2 = new JTextArea();
	yma2.setText("Middle Kill Attempts 2");
	yma2.setEditable(false);
	stats2.add(yma2);
	blank21 = new JTextArea();
	blank21.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank21);

	ymb1 = new JTextArea();
	ymb1.setText("Middle Blocks 1");
	ymb1.setEditable(false);
	stats2.add(ymb1);
	blank22 = new JTextArea();
	blank22.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank22);

	ymb2 = new JTextArea();
	ymb2.setText("Middle Blocks 2");
	ymb2.setEditable(false);
	stats2.add(ymb2);
	blank23 = new JTextArea();
	blank23.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank23);
	
	yss1 = new JTextArea();
	yss1.setText("Sets per Set");
	yss1.setEditable(false);
	stats2.add(yss1);
	blank24 = new JTextArea();
	blank24.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank24);
	
	yld = new JTextArea();
	yld.setText("Libero Digs");
	yld.setEditable(false);
	stats2.add(yld);
	blank25 = new JTextArea();
	blank25.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	stats2.add(blank25);

	t1 = new JComboBox();
	t2 = new JComboBox();
        t1.add("Binghampton");
	t1.add("BostonCollege");
	t1.add("BrownUniversity");
	t1.add("UCLA");
	t1.add("Columbia");
	t1.add("Dartmouth");
	t1.add("Duke");
	t1.add("Georgetown");
	t1.add("Harvard");
	t1.add("NotreDame");
	t1.add("UPenn");
	t1.add("Stanford");
	t1.add("Stonybrook");
	t1.add("TexasAM");
	t1.add("Yale");
	t2.add("Binghampton");
	t2.add("BostonCollege");
	t2.add("BrownUniversity");
	t2.add("UCLA");
	t2.add("Columbia");
	t2.add("Dartmouth");
	t2.add("Duke");
	t2.add("Georgetown");
	t2.add("Harvard");
	t2.add("NotreDame");
	t2.add("UPenn");
	t2.add("Stanford");
	t2.add("Stonybrook");
	t2.add("TexasAM");
	t2.add("Yale");

	volley.add(t1);
	volley.add(t2);

	submit = new JButton("Submit");
	volley.add(submit);

    }


    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == submit) {
	    // for (int i = 1; i < 27; i++) {
	    //	if (("blank" + i)(JTextArea).getText().equals("")) {
     		    //error = new JDialog(error,"Error");
		    //error.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    //	}
	    // }
	}
    }

    public static void main(String[] args) {
	gui g = new gui();
	g.setVisible(true);
    }
}
