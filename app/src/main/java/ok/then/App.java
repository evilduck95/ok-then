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
        int max = 999999;
        int min = 100000;
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
    f.setBounds(80, 100, 350, 40);
    // f.setVisible(true);

    JFrame niceA = new JFrame();

    JButton niceB = new JButton("hentai hentai hentai");

    niceB.setBounds(80, 100, 250, 40);

    niceB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
        System.out.println(random_int);
      }
    });


    niceA.add(niceB);

    niceA.setSize(400, 500);
    niceA.setLayout(null);
    niceA.setVisible(true);

    }

    private static int random_float() {
        return 0;
    }
}
