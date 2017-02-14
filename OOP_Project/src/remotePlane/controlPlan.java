package remotePlane;

import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;

public class controlPlan extends javax.swing.JFrame {

    static double x = 0;
    static double y = 0;
    static boolean keys[] = new boolean[41];
    static int start = 0;

    static boolean startGame = false;
    static int x1, x2, x3, x4;
    static int y1, y2, y3, y4;
    
    static int initX ;
    
    public controlPlan() {
        initComponents();
        x = plane.getX();
        y = plane.getY();
        move();                

        x1 = jLabel5.getX() + jLabel5.getWidth();
        x2 = jLabel2.getX() + jLabel2.getWidth();
        x3 = jLabel3.getX() + jLabel3.getWidth();
        x4 = jLabel4.getX() + jLabel4.getWidth();
        
        initX = x1 ;
        
        y1 = jLabel5.getY();
        y2 = jLabel2.getY();
        y3 = jLabel3.getY();
        y4 = jLabel4.getY();
        startGame = true;
        moveBalloon();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        shootBomb1 = new remotePlane.shootBomb();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        plane = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        shootBomb1.setOpaque(false);

        javax.swing.GroupLayout shootBomb1Layout = new javax.swing.GroupLayout(shootBomb1);
        shootBomb1.setLayout(shootBomb1Layout);
        shootBomb1Layout.setHorizontalGroup(
            shootBomb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        shootBomb1Layout.setVerticalGroup(
            shootBomb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/balloon.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/balloon.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/balloon.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/balloon.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        plane.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        plane.setForeground(new java.awt.Color(51, 51, 255));
        plane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plane-3.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background-2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(924, 924, 924)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(plane))
            .addComponent(shootBomb1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(plane))
            .addComponent(shootBomb1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (37 <= evt.getKeyCode() && evt.getKeyCode() <= 40) {
            keys[evt.getKeyCode()] = true;
            new Thread(() -> {                
                while (true) {
                    try {
                        if (keys[KeyEvent.VK_UP] && y > 0) {
                            y -= 0.1;
                        } else if (keys[KeyEvent.VK_DOWN] && y < jPanel3.getHeight() - plane.getHeight()) {
                            y += 0.1;
                        } else if (keys[KeyEvent.VK_LEFT] && x > 0) {
                            x -= 0.1;
                        } else if (keys[KeyEvent.VK_RIGHT] && x < jPanel3.getWidth() - plane.getWidth()) {
                            x += 0.1;
                        }
                        //System.out.println("x:" + x + " y:" + y);
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (37 <= evt.getKeyCode() && evt.getKeyCode() <= 40) {
            keys[evt.getKeyCode()] = false;
        }
    }//GEN-LAST:event_formKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        shootBomb1.addBombRandom((int) x + plane.getWidth(), (int) y + plane.getHeight() / 2);
        if (start < 3) {
            new Thread(shootBomb1).start();
        }
        start++;
    }//GEN-LAST:event_jLabel1MouseClicked

    void moveBalloon() {
        new Thread(() -> {
            while (startGame) {
                x1 = x1 - 5;                
                x2 = x2 - 4;                                
                x3 = x3 - 3;                                
                x4 = x4 - 2;                
                
                if(x1<0) x1 = initX ;
                if(x2<0) x2 = initX ;
                if(x3<0) x3 = initX ;
                if(x4<0) x4 = initX ;
                
                jLabel5.setLocation(x1, y1);
                jLabel2.setLocation(x2, y2);
                jLabel3.setLocation(x3, y3);
                jLabel4.setLocation(x4, y4);

                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                }
            }
        }).start();
    }

    void move() {
        new Thread(() -> {
            int i = 0;
            while (true) {
                if (i % 2 == 0) {
                    y++;
                } else {
                    y--;
                }

                plane.setLocation((int) x, (int) y);

                i = i + 1;
            }
        }).start();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(controlPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel plane;
    private remotePlane.shootBomb shootBomb1;
    // End of variables declaration//GEN-END:variables
}
