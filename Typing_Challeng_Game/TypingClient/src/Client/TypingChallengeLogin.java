package Client;

import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFrame;

public class TypingChallengeLogin extends javax.swing.JFrame {

    private SoundController sc;
    String filePath;
    String fileName;

    public TypingChallengeLogin() {
        initComponents();
        setIcon();
    }

    public static String getIp() {
        String ip = ipInput.getText();
        System.out.println("ip input  :" + ip);
        return ip;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        signinButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        ipaddressBar = new javax.swing.JLabel();
        iploginBar = new javax.swing.JLabel();
        ipInput = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setRequestFocusEnabled(false);

        signinButton.setBackground(new java.awt.Color(150, 37, 37));
        signinButton.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        signinButton.setForeground(new java.awt.Color(255, 255, 255));
        signinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign in.png"))); // NOI18N
        signinButton.setAutoscrolls(true);
        signinButton.setBorder(null);
        signinButton.setBorderPainted(false);
        signinButton.setContentAreaFilled(false);
        signinButton.setSelected(true);
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setSelected(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        ipaddressBar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ipaddressBar.setForeground(new java.awt.Color(255, 255, 255));
        ipaddressBar.setText("IP (Server) :");

        iploginBar.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        iploginBar.setForeground(new java.awt.Color(255, 255, 255));
        iploginBar.setText("LOGIN Server");

        ipInput.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ipaddressBar)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(ipInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(iploginBar))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(signinButton)
                        .addGap(66, 66, 66)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(iploginBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ipaddressBar)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ipInput.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        playSound("button-4.mp3", 250);
        TypingChallengeStart nw = new TypingChallengeStart();
        nw.setState(JFrame.MAXIMIZED_BOTH);
        nw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        playSound("02 -แป๊ว.mp3", 250);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton exitButton;
    private static javax.swing.JTextField ipInput;
    private javax.swing.JLabel ipaddressBar;
    private javax.swing.JLabel iploginBar;
    private javax.swing.JLabel jLabel1;
    javax.swing.JButton signinButton;
    // End of variables declaration//GEN-END:variables
}
