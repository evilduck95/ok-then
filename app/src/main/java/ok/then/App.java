package ok.then;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;




public class App {
  public BufferedImage backgroundImage;
  public void JPanelWithBackground(String fileName) throws IOException {
    backgroundImage = ImageIO.read(new File(fileName));
  }

  public static void genRanNum(int minNum, int maxNum, JEditorPane panelToFill){
    int new_forHentai = (int)Math.floor(Math.random()*(maxNum-minNum+1)+minNum);

     int newGenHentai = new_forHentai;

    try {
      panelToFill.setPage("https://www.nhentai.net/g/" + newGenHentai);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

    private static final String JToolBar = null;

    public static void main(String[] args) {

        int min1 = 0;
        int max1 = 4;
        int i_forHentai = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
        String i_forHentai_string = String.valueOf(i_forHentai);
        int bannedHentaiNum = 3;
        int hentaiArrayToPush = bannedHentaiNum + 1;
        String[] bannedHentais = new String[bannedHentaiNum];
        JButton niceC = new JButton("make new hentai");
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

        JButton niceD = new JButton("mysterious button (dont click)");

        JEditorPane jep1 = new JEditorPane();
        jep1.setEditable(false); 
        niceD.setBounds(1130, 5, 250, 40);

        

        JScrollPane vibeeScrollPane = new JScrollPane(jep1);   
        JFrame vibee = new JFrame("hentai lol");
    vibee.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    vibee.getContentPane().add(vibeeScrollPane);
    vibee.setBounds(800, 1000, 3500, 900);

    JFrame f1 = new JFrame("newwwww hentai");
    f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    f1.getContentPane().add(vibeeScrollPane);
    f1.setBounds(800, 1000, 3500, 900);

        JEditorPane jep = new JEditorPane();
    jep.setEditable(false);   
    JFrame niceA = new JFrame();
    try {
        
        System.out.println(hentaiArray[i_forHentai]);
    jep.setPage("https://www.nhentai.net/g/" + hentaiArray[i_forHentai]);
    } catch (IOException e) {
    jep.setContentType("text/html");
    jep.setText("<html>Could not load, probably not a valid hentai link</html>");
    niceA.toFront();
    bannedHentaiNum += 2;
    i_forHentai_string = bannedHentais[bannedHentaiNum - 3];
    niceA.add(niceC);
    } 

    JScrollPane scrollPane = new JScrollPane(jep);     
    JFrame f = new JFrame("hentai lol");
    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    f.getContentPane().add(scrollPane);
    f.setBounds(800, 1000, 3500, 900);
    // f.setVisible(true);

    JButton niceB = new JButton("generate hentai");

    niceB.setBounds(80, 100, 250, 40);

    niceB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
      }
      
    });
   
    

        niceC.setBounds(80, 150, 250, 40);
    
        niceC.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            f1.setVisible(true);

          }
          
        });
      
        niceD.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            int maxI = 999999;
            int minI = 100000;
            int random_int51 = (int)Math.floor(Math.random()*(maxI-minI+1)+minI);

            f.setVisible(false);
            f1.setVisible(true);
            try {
              jep1.setPage("https://cdn.discordapp.com/attachments/771537337112330250/836695201447673956/getrekt.jpg");
            } catch (IOException e1) {
              // TODO Auto-generated catch block
              e1.printStackTrace();
              jep1.setText("unable to load image");
            }
          }
        });

    niceA.add(niceB);
    jep.add(niceD);
    niceA.setSize(400, 500);
    niceA.setLayout(null);
    niceA.setVisible(true);
    niceA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private static int random_float() {
        return 0;
    }
}