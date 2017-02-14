package remotePlane;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class bomb {

    private int x;

    private int y;

    private int speed = 10 ;

    private double direction;

    private final JPanel panel = null;

    private Color color;
    
    //private static final Image bullet = Toolkit.getDefaultToolkit().createImage("/IMG/bomb.png") ;

    public bomb(int x, int y, Color c, JPanel panel) {
        
        this.x = x;
        this.y = y;
        this.color = c;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        //g.fillOval(x - radius, y - radius, size, size);
        //g.drawLine(x, y, x+10, y);
        g.draw3DRect(x, y, 10, 5, true);               
    }

    public void move() {
        this.x = x + speed;
    }

}
