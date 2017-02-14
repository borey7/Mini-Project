package Client;

import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TypingChallengeGame extends javax.swing.JFrame implements Runnable {

    boolean startGame = false;
    static String[] serverMsg = new String[2]; //there are 2 parts of message 1.word 2.typed
    //serverMsg[0]:word serverMsg[1]:typed
    Client cc = new Client();
    static int portNo = 1026;
    Thread tr = new Thread(this);
    int tm = 0;
    int x, y, inX, inY;
    int score = 0;
    private SoundController sc;
    String filePath;
    String fileName;
    String playerName = "";
    int i = 2;

    public TypingChallengeGame() {
        initComponents();
        x = showTyped.getX();
        y = showTyped.getY();
        inX = x;
        inY = y;
        setIcon();
        String dir = "user.dir";
        try {
            dir = new File(System.getProperty(dir))
                    .getCanonicalPath();
        } catch (IOException e1) {
        }
        filePath = dir + File.separator + "src";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        showTyped = new javax.swing.JLabel();
        showWord = new javax.swing.JLabel();
        typingBar = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        timePoint = new javax.swing.JLabel();
        scorePoint = new javax.swing.JLabel();
        scoreBar = new javax.swing.JLabel();
        timeBar = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Challenge");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        panel.setOpaque(false);
        panel.setLayout(null);

        showTyped.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        showTyped.setForeground(new java.awt.Color(0, 255, 255));
        showTyped.setText("Click Start");
        panel.add(showTyped);
        showTyped.setBounds(60, 0, 240, 60);

        showWord.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        showWord.setForeground(new java.awt.Color(204, 204, 255));
        showWord.setText("Click Start");
        panel.add(showWord);
        showWord.setBounds(60, 0, 240, 60);

        typingBar.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        typingBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                typingBarKeyTyped(evt);
            }
        });

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/STAR.png"))); // NOI18N
        startButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/STAR2.png"))); // NOI18N
        startButton.setSelected(true);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e3.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e4.png"))); // NOI18N
        exitButton.setSelected(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        scoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scor.png"))); // NOI18N
        scoreButton.setBorder(null);
        scoreButton.setBorderPainted(false);
        scoreButton.setContentAreaFilled(false);
        scoreButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scor2.png"))); // NOI18N
        scoreButton.setSelected(true);
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });

        timePoint.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        timePoint.setForeground(new java.awt.Color(255, 204, 204));
        timePoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timePoint.setText("000");

        scorePoint.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        scorePoint.setForeground(new java.awt.Color(255, 204, 204));
        scorePoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorePoint.setText("0");

        scoreBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/score_1.png"))); // NOI18N

        timeBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TIme.png"))); // NOI18N

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextBox.jpg"))); // NOI18N
        Background.setToolTipText("");
        Background.setMaximumSize(null);
        Background.setMinimumSize(new java.awt.Dimension(10000, 10000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(timePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(scorePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(typingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(scoreBar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(timePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scorePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(typingBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scoreBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void typingBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typingBarKeyTyped
        //when get char send to server and wait the respons message and set to showWord & showTyped
        if (startGame) {
            char key = evt.getKeyChar();
            if (31 < key) {
                serverMsg = cc.sendMsg("user", key + "", portNo).split("#");
                showTyped.setText(serverMsg[0]);
                showWord.setText(serverMsg[1]);
                if (serverMsg[2].compareTo("complete") == 0) {
                    //System.out.println("Complet word");
                    x = inX;
                    y = inY;
                    showTyped.setLocation(inX, inY);
                    showWord.setLocation(inX, inY);
                    checkScore();
                } else if (serverMsg[2].equals("finish")) {
                    //System.out.println("Finish Game!");
                    startGame = false;
                    tr.stop();
                    playerName = (String) JOptionPane.showInputDialog(this, "Well Done!"
                            + "\nInput your name :\n");
                    TypingChallengeGame nw = new TypingChallengeGame();
                    nw.setState(JFrame.MAXIMIZED_BOTH);
                    nw.setVisible(true);
                    this.dispose();
                    writeToFile(
                            playerName,
                            Integer.parseInt(timePoint.getText()),
                            Integer.parseInt(scorePoint.getText())
                    );
                }
            }
        }
    }//GEN-LAST:event_typingBarKeyTyped

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        playSound("button-4.mp3", 250);
        try {
            startGame = true;
            move();
            showTyped.setLocation(x, y);
            showWord.setLocation(x, y);
            serverMsg = cc.sendMsg("user", ">start", portNo).split("#");
            showWord.setText(serverMsg[0]);
            showTyped.setText(serverMsg[1]);
            if (showTyped.getY() + showTyped.getHeight() == typingBar.getY()) {
                startGame = false;
                typingBar.setText(" ");
            }
            startButton.setEnabled(false);
        } catch (Exception e) {
            startGame = false;
            showWord.setText("");
            showTyped.setText("");
            JOptionPane.showMessageDialog(this,
                    "Unable to Connect to Server, please try again later.!",
                    "Connection Failed", JOptionPane.ERROR_MESSAGE);
            TypingChallengeLogin IP = new TypingChallengeLogin();
            String ip = IP.getIp();
            IP.setState(JFrame.MAXIMIZED_BOTH);
            IP.setVisible(true);
            Client.getIp(ip);
            System.out.println("IP input : "+ ip);
            this.dispose();
        }
        tr.start();
        //System.out.println("serverMsg[2]: " + serverMsg[2]);
    }//GEN-LAST:event_startButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        playSound("02 -แป๊ว.mp3", 250);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        playSound("button-4.mp3", 250);
        TypingChallengeScore nw = new TypingChallengeScore();
        nw.setState(JFrame.MAXIMIZED_BOTH);
        nw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("keyboard.png")));
    }

    public void run() {
        while (startGame) {
            try {
                tr.sleep(1000);
                tm++;
                timePoint.setText("" + tm);
            } catch (InterruptedException ex) {
            }
        }
    }

    void move() {
        new Thread(() -> {
            while (startGame) {
                y++;
                showWord.setLocation(x, y);
                showTyped.setLocation(x, y);
                //System.out.println("showWod y  + showWord h: " + (showWord.getY() +showWord.getHeight())+" typingBar.getY: "+typingBar.getY());
                if (showWord.getY() + showWord.getHeight() >= typingBar.getY()) {
                    startGame = false;
                    //System.out.println("Game Over");     
                    JOptionPane.showMessageDialog(this,
                            "Game Over !",
                            "Game Over!", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                    TypingChallengeStart nw = new TypingChallengeStart();
                    nw.setState(JFrame.MAXIMIZED_BOTH);
                    nw.setVisible(true);
                }
                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                }
            }
        }).start();
    }

    private void playSound(String fileName, int sleepTime) {
        File f = new File(filePath, fileName);
        sc = new SoundController(f);
        sc.play();

        try {
            Thread.sleep(sleepTime);
        } catch (Exception e2) {
        };
        sc.close();
    }

    public void checkScore() {
        score++;
        scorePoint.setText(Integer.toString(score));
        typingBar.setText(" ");
    }

    private void writeToFile(String name, int hour, int score) {
        try {
            fileName = filePath + File.separator
                    + "score.dat";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(playerName + ";" + hour + ";" + score + ";");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR: writing file");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel scoreBar;
    private javax.swing.JButton scoreButton;
    private javax.swing.JLabel scorePoint;
    private javax.swing.JLabel showTyped;
    private javax.swing.JLabel showWord;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeBar;
    private javax.swing.JLabel timePoint;
    private javax.swing.JTextField typingBar;
    // End of variables declaration//GEN-END:variables
}
