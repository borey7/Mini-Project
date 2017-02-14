package Client;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TypingChallengeScore extends javax.swing.JFrame {
    
    private SoundController sc;
    String filePath;
    String fileName;
    
    public TypingChallengeScore() {
        initComponents();
        setIcon();
        showScore();
    }
    
    private void showScore() {
        DefaultTableModel df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //all cells false
            }
        };
        String[] columnNames = {" Name", " Time", " Score"};
        tbScore.setModel(df);
        tbScore.setRowHeight(35);
        JTableHeader header = tbScore.getTableHeader();
        header.setFont(new Font("TH Krub", Font.BOLD, 24));
        df.setColumnIdentifiers(columnNames);
        
        String fileName = "";
        String dataFile;
        String[] data = new String[3];
        
        ArrayList<Score> topTen = new ArrayList<Score>();
        
        Score score;
        try {
            fileName = new File(System.getProperty("user.dir")).getCanonicalPath();
        } catch (IOException e1) {
        }
        fileName = fileName + File.separator + "src"
                + File.separator + "score.dat";
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(fileName));
            
            while ((dataFile = reader.readLine()) != null) {
                data = dataFile.split(";");
                score = new Score(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                topTen.add(score);
            }
        } catch (IOException e) {
            System.out.println("ERROR: reading file");
        }
        
        Comparator<Score> com = new Comparator<Score>() {
            public int compare(Score o1, Score o2) {
                return ((Integer) o1.getScore()).compareTo(
                        (Integer) o2.getScore());
            }
        };
        
        Collections.sort(topTen, com);
        Collections.reverse(topTen);
        
        int cnt = 0;
        //for each Score in topTen
        for (Score c : topTen) {
            if (cnt < 10) {
                df.addRow(new Object[]{c.getName(), c.getHour(), c.getScore()});
                cnt++;
            } else {
                break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreBar = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        paneWord = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Challenge");
        setResizable(false);

        scoreBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/score.png"))); // NOI18N

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home2.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeButton.setSelected(true);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e2.png"))); // NOI18N
        exitButton.setSelected(true);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        tbScore.setForeground(new java.awt.Color(255, 0, 153));
        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        paneWord.setViewportView(tbScore);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WoodBackground.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(scoreBar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(paneWord, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scoreBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(paneWord, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        playSound("button-4.mp3", 250);
        TypingChallengeStart nw = new TypingChallengeStart();
        nw.setState(JFrame.MAXIMIZED_BOTH);
        nw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        playSound("button-4.mp3", 250);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane paneWord;
    private javax.swing.JLabel scoreBar;
    private javax.swing.JTable tbScore;
    // End of variables declaration//GEN-END:variables
}
