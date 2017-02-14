package Splash;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Splash {

    public static SplashScreen loadingScreen;
    public static Double loadingTextArea;
    public static Double loadingProgressArea;
    public static Graphics2D loadingGraphics;
    public static Font myfont;

    public static void main(String[] args) {

        loadingMethod();
        mainMethod();

        if (loadingScreen != null) {
            loadingScreen.close();
        }
    }

    public static void loadingMethod() {
        //loadingScreen = SplashScreen.getSplashScreen();
        if (loadingScreen != null) {

            Dimension dim = loadingScreen.getSize();
            int ht = dim.height;
            int wd = dim.width;
            //Placing textArea and progressArea
            loadingTextArea = new Rectangle2D.Double(15, ht * 0.7, wd * 0.4, 30);
            loadingProgressArea = new Rectangle2D.Double(15, ht * 0.85, wd * 0.4, 25);
            loadingGraphics = loadingScreen.createGraphics();
            //Setting font for text in status info
            ////////myfont = new Font("TimesRoman", Font.BOLD, 14);
            loadingGraphics.setFont(myfont);
        }
    }

    public static void loadingText(String string) {
        if (loadingScreen != null) {
            loadingGraphics.setPaint(Color.CYAN);
            loadingGraphics.fill(loadingTextArea);
            loadingGraphics.setPaint(Color.BLACK);
            loadingGraphics.drawString(string, (int) loadingTextArea.getX() + 10,
                    (int) loadingTextArea.getY() + 20);
            loadingScreen.update();
        }
    }

    public static void loadingProgress(int prog) {
        if (loadingScreen != null) {
            loadingGraphics.setPaint(Color.LIGHT_GRAY);
            loadingGraphics.fill(loadingProgressArea);
            loadingGraphics.setPaint(Color.BLUE);
            loadingGraphics.draw(loadingProgressArea);
            int x = (int) loadingProgressArea.getMinX();
            int y = (int) loadingProgressArea.getMinY();
            int width = (int) loadingProgressArea.getWidth();
            int height = (int) loadingProgressArea.getHeight();
            int doneProg = prog * width / 50;
            //////loadingGraphics.setPaint(Color.BLUE);
            loadingGraphics.fillRect(x, y + 1, doneProg, height);
            loadingScreen.update();
        }
    }

    public static void mainMethod() {
        for (int i = 1; i <= 10; i++) {
            //////loadingText("Loading resources "+i);
            loadingProgress(i * 10);
            try {
                URL url = new URL("www.google.com");
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
                in.close();
            } catch (MalformedURLException e) {
            } catch (IOException e) {
            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu();
            }
        });
    }
}
