package remotePlane;

//  Child class extends Parent Class
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

//  sub class extends super class
public class shootBomb extends JPanel implements Runnable {

    @Override
    public void run() {
        while (true) {
            moveAllBall();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
        }
    }

    private bomb[] bombArray;
    private int bombTotal;

    public shootBomb() {
        setSize(400, 400);
        setPreferredSize(getSize());
        bombArray = new bomb[1000];
        bombTotal = 0;
    }
    
    //วาดลุกปืนทั้งหมด
    @Override 
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < bombTotal; i++) {
            bombArray[i].paint(g);
        }         
    }
    
    //สร้างลูกปืนใหม่
    public void addBombRandom(int x , int y) {
        if (bombTotal < bombArray.length) {
            bombArray[bombTotal]
                    = new bomb(x, y, Color.BLACK, this);
            bombTotal++;
            repaint();
        }
    }
    
    //ให้ลูกปืนเปลือนที่
    public void moveAllBall() {
        for (int i = 0; i < bombTotal; i++) {
            bombArray[i].move();
        }
        repaint();
    }
    
}




