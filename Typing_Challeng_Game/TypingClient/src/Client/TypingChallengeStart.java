package Client;

import PlaySound.PlaySound;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFrame;

public class TypingChallengeStart extends javax.swing.JFrame {

    private SoundController sc;
    String filePath;
    String fileName;

    public TypingChallengeStart() {
        initComponents();
        PlaySound.PlaySound();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typingBar = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        logoButton = new javax.swing.JLabel();
        versionText = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Challenge");
        setResizable(false);

        typingBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typingBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Start.png"))); // NOI18N

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLAY.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PLAY2.png"))); // NOI18N
        playButton.setSelected(true);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EXIT.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EXIT2.png"))); // NOI18N
        exitButton.setSelected(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        logoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/preview.jpg"))); // NOI18N

        versionText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Game Background.jpg"))); // NOI18N

        Background.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setText("Version : 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoButton)
                .addGap(606, 606, 606)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(typingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(versionText)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(logoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(typingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(versionText)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        playSound("02 -แป๊ว.mp3", 250);
        TypingChallengeGame nw = new TypingChallengeGame();
        nw.setState(JFrame.MAXIMIZED_BOTH);
        nw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        playSound("02 -แป๊ว.mp3", 250);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("keyboard.png")));
    }

    private void playSound(String fileName, int sleepTime) {
        //set to current directory
        File f = new File(filePath, fileName);
        sc = new SoundController(f);
        sc.play();

        try {
            Thread.sleep(sleepTime);
        } catch (Exception e2) {
        };
        sc.close();
    }

        public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TypingChallengeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypingChallengeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypingChallengeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypingChallengeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypingChallengeStart().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel logoButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel typingBar;
    private javax.swing.JLabel versionText;
    // End of variables declaration//GEN-END:variables
}