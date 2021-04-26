package ok.then;

import java.util.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class App {
    
    public static void main(String[] args) {

        

        String[] hentaiArray = new String[5];
        String link = "https://www.nhentai.net/g/";
        Random rand = new Random();
        int max = 999999;
        int min = 100000;
        int random_int1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int3 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int4 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int5 = (int)Math.floor(Math.random()*(max-min+1)+min);
           
           String random_int11 = String.valueOf(random_int1);
           String random_int22 = String.valueOf(random_int2);
           String random_int33 = String.valueOf(random_int3);
           String random_int44 = String.valueOf(random_int4);
           String random_int55 = String.valueOf(random_int5);

           hentaiArray[0]= random_int11;
           hentaiArray[1]= random_int22;
           hentaiArray[2]= random_int33;
           hentaiArray[3]= random_int44;
           hentaiArray[4]= random_int55;


        String hentaiLink = link + random_int1;
        JEditorPane jep = new JEditorPane();
    jep.setEditable(false);   

    try {
        int min1 = 0;
        int max1 = 4;
        int i = (int)Math.floor(Math.random()*(max1-min1+1)+min1);

    jep.setPage("https://www.nhentai.net/g/" + hentaiArray[i]);
    }catch (IOException e) {
    jep.setContentType("text/html");
    jep.setText("<html>Could not load, probably not a valid hentai link</html>");
        
    } 

    JButton niceC = new JButton("generate NEW hentai");

        niceC.setBounds(206, 240, 250, 40);
    
        niceC.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
                int min1 = 0;
                int max1 = 4;
                int i = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
                jep.setPage("https://www.nhentai.net/g/" + hentaiArray[i]);

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
          }
          
        });

    JScrollPane scrollPane = new JScrollPane(jep);     
    JFrame f = new JFrame("hentai lol");
    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    f.getContentPane().add(scrollPane);
    f.setBounds(800, 1000, 3500, 900);
    // f.setVisible(true);

    JFrame niceA = new JFrame();

    JButton niceB = new JButton("generate hentai");

    niceB.setBounds(80, 100, 250, 40);

    niceB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
      }
      
    });
   

    niceA.add(niceB);
    niceA.add(niceC);

    niceA.setSize(400, 500);
    niceA.setLayout(null);
    niceA.setVisible(true);
    niceA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private static int random_float() {
        return 0;
    }
}