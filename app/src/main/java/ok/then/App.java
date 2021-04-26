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
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min); 
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
    f.setPreferredSize(new Dimension(1500,600));
    // f.setVisible(true);

    JFrame niceA = new JFrame();

    // creating instance of JButton
    JButton niceB = new JButton("Click me!");

    // x axis, y axis, width, height
    niceB.setBounds(80, 100, 250, 40);

    // add event listener
    niceB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Hello world!");
      }
    });

    // add button to JFrame
    niceA.add(niceB);

    niceA.setSize(400, 500);
    niceA.setLayout(null);
    // make the frame visible
    niceA.setVisible(true);

    }
}
