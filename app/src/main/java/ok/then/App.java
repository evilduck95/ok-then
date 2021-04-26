package ok.then;

import java.util.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;


public class App {

    public static void main(String[] args) {
        String link = "https://www.nhentai.net/g/";
        Random rand = new Random();
        int min = 6;
        int max = 6;
        int random_int = 6 + random_float() * 6;
        String hentaiLink = link + random_int;
        JEditorPane jep = new JEditorPane();
    jep.setEditable(false);   

    try {
    jep.setPage(hentaiLink);
    }catch (IOException e) {
    jep.setContentType("text/html");
    jep.setText("<html>Could not load</html>");
    } 

    JScrollPane scrollPane = new JScrollPane(jep);     
    JFrame f = new JFrame("Test HTML");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(scrollPane);
    f.setBounds(80, 100, 350, 40);
    // f.setVisible(true);

    JFrame niceA = new JFrame();

    // creating instance of JButton
    JButton niceB = new JButton("hentai hentai hentai");

    // x axis, y axis, width, height
    niceB.setBounds(80, 100, 250, 40);

    // add event listener
    niceB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
      }
    });

    // add button to JFrame
    niceA.add(niceB);

    niceA.setSize(400, 500);
    niceA.setLayout(null);
    // make the frame visible
    niceA.setVisible(true);

    }

    private static int random_float() {
        return 0;
    }
}
