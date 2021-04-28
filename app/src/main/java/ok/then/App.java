package ok.then;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.io.FileNotFoundException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;


public class App {

  private static final int SIZE = 8; // 8x8 board
  private static final int DIAM = SIZE * 10; // checker size
  private static final int maxX = SIZE * DIAM;
  private static final int maxY = SIZE * DIAM;
  private static final String glyph = "\u2748";
  private static final Color white = new Color(0xF0F0C0);
  private static final Color light = new Color(0x40C040);
  private static final Color dark = new Color(0x404040);
  private static final Cursor hand = new Cursor(Cursor.HAND_CURSOR);
  private static final Cursor norm = new Cursor(Cursor.DEFAULT_CURSOR);
  private static final Font font = new Font("Serif", Font.BOLD, 48);
  private final Ellipse2D.Double checker = new Ellipse2D.Double();
  private final Rectangle2D.Double boundary = new Rectangle2D.Double();
  private int posX = 3 * DIAM; // column three
  private int posY = 3 * DIAM; // row three
  private int pressedX, pressedY;
  private int frameX, frameY;
  private boolean checkerVisible = true;
  private boolean mouseDown = false;

  public BufferedImage backgroundImage;
  public void JPanelWithBackground(String fileName) throws IOException {
    backgroundImage = ImageIO.read(new File(fileName));
  }
  
  public static void cool(int numTimesPrint){
    for (numTimesPrint =  0; 10 > numTimesPrint; numTimesPrint++){
      System.out.println("zoom");
    }
  }


    private static Random random = new Random();
    
    private void run() {
        int min = 100000;
        int max = 999999;
        int randNum = getNumInRange(min, max);
        
    }
    
    public static int getNumInRange(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }


    private static final String JToolBar = null;

    public static void main(String[] hentai) {
        JFrame niceA = new JFrame("Hentai hub?");
        
        JFrame window = new JFrame("loading..."); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        JTextField imbored = new JTextField("Loading... please allow up to 15 seconds (javas slow lol)");
        imbored.setEditable(false);
        window.setBounds(80, 150, 400, 200);
        window.add(imbored);

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

        HTMLEditorKit kit = new HTMLEditorKit();
        HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
        StyleSheet styles = doc.getStyleSheet();
 

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

        JButton niceD = new JButton("zooooooooooom");

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
    try {
        
        System.out.println(hentaiArray[i_forHentai]);
    jep.setPage("https://www.nhentai.net/g/" + hentaiArray[i_forHentai]);
    niceA.add(niceC);
    } catch (IOException e) {
    jep.setContentType("text/html");
    jep.setText("<html>Could not load, probably not a valid hentai link</html>");
    niceA.toFront();
    bannedHentaiNum += 2;
    i_forHentai_string = bannedHentais[bannedHentaiNum - 3];
    
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
            int newIntForHentai = getNumInRange(0, 4);
            for (int i = 0; 9999999 > i; i++){
              new App().getNumInRange(min, max);
            }

            int amibored = new App().getNumInRange(100000, 999999);
            f.setVisible(false);

            try {
              jep1.setPage("https://www.nhentai.net/g/" + new App().getNumInRange(100000, 999999));
            } catch (FileNotFoundException s) {
              s.printStackTrace();
              jep1.setText("unable to load, probably an invalid link");
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            f1.setVisible(true);
          }

          }
          
        );
        niceD.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("yeah, its zoom time");
              try {
                Thread.sleep(4000);
                cool(900);
              } catch (InterruptedException e1) {
                e1.printStackTrace();
              }

          }
        });

     
      try {
        window.setVisible(true);
        Thread.sleep(5000);
        window.setVisible(false);
        niceA.setVisible(true);
        niceA.add(niceC);
      } catch (InterruptedException e2) {
        e2.printStackTrace();
      }

      niceA.add(niceB);
      niceA.add(niceC);
      jep.add(niceD);
      niceA.setSize(400, 500);
      niceA.setLayout(null);
      
      niceA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jep.add(new ScaledPanel());

    }

    private static Object getView() {
      return null;
    }

  

    private static int random_float() {
        return 0;
    }
}