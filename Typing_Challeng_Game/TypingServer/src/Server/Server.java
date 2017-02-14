package Server;
// ชนขอบไม่ตาย
import java.awt.Toolkit;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Server extends javax.swing.JFrame {

    String[] msg = new String[2];
    ServerSocket server = null; // server
    Socket client; // desttination
    /* port change all time you run */
    static int portNo = 1026;
    static int idxWord = 0;
    static int idxChar = 0;
    static String typed = "";
    static String status = "start";
    static String word[] = {"active", "adapter", "address", "bridge", "client", "collision",
        "lan", "latency", "layer", "link", "mask", "multi-hop", "nic", "node", "switch", "traffic",
        "domain", "driver", "error", "ethernet", "firewall", "gateway", "hub", "internet", "session",
        "resolution", "router", "segment", "server", "transaction", "transmission",
        "packet", "passive", "patch cable", "path", "peer-to-peer", "ping", "port", "protocol",
        "twisted pair", "unshielded"};
    boolean running = true;
    private SoundController sc;
    String filePath;
    String fileName;

    public Server() {
        initComponents();
        setIcon();
        try {
            //JOptionPane.showMessageDialog(rootPane, Inet4Address.getLocalHost());
            checkIP.setText(Inet4Address.getLocalHost().toString()) ;
        } catch (UnknownHostException ex) {
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sreverBar = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        Underline = new javax.swing.JSeparator();
        checkIP = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        sreverBar.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        sreverBar.setForeground(new java.awt.Color(255, 102, 102));
        sreverBar.setText(" SERVER ");

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/start.png"))); // NOI18N
        startButton.setBorder(null);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/start2.png"))); // NOI18N
        startButton.setSelected(true);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stop.png"))); // NOI18N
        stopButton.setBorder(null);
        stopButton.setBorderPainted(false);
        stopButton.setContentAreaFilled(false);
        stopButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stop2.png"))); // NOI18N
        stopButton.setSelected(true);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        checkIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkIP.setForeground(new java.awt.Color(255, 255, 255));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.jpg"))); // NOI18N
        Background.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(checkIP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(startButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(stopButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(sreverBar))
            .addComponent(Background)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Underline, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(checkIP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(startButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(stopButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sreverBar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Background)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Underline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        playSound("button-4.mp3", 250);
        int confirm = JOptionPane.showConfirmDialog(null, "Do you really want to exit Server Program?");
        if (confirm == 0) {
            System.exit(0);
        }
        terminate();
        playSound("02 -แป๊ว.mp3", 250);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        playSound("button-4.mp3", 250);
        try {
            server = new ServerSocket(portNo);
            System.out.println("Server started . . .");
            System.out.println("Port : " + portNo);
        } catch (IOException ie) {
            System.out.println("Cannot open socket");
        }
        thread.start();

        startButton.setEnabled(false);
        stopButton.setEnabled(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("server.png")));
    }

    /* keep in server and send only L1 (initial word) and L2 (inputed char) */
    static void process(String msg) {
        if (msg.compareTo(">start") == 0) {
            idxWord = 0;
            idxChar = 0;
            typed = "";
            //start idxWord = 0 ; idxChar = 0 ; typed = "" ;
            //send msg = word[idxWord] to client
        } else if (idxChar < word[idxWord].length() - 1) {//if the word not complete yet
            status = "incomplete";
            //if input is right else do nothing
            if (msg.compareTo(word[idxWord].substring(idxChar, idxChar + 1)) == 0) {
                typed = word[idxWord].substring(0, idxChar + 1);//set new typed char
                idxChar++;//idx change to next index
            }
        } else//word is complete
        {
            if (idxWord < word.length - 1) {
                idxWord++;//go to next word
                idxChar = 0;//set index of char to be 0
                typed = "";//set the right type to be empty
                status = "complete";
            } else {
                typed = "";//set the right type to be empty
                status = "finish";
            }
        }
    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (running) {
                try {
                    client = server.accept();
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    InputStream clientIn = client.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
                    //read message from socket
                    msg = br.readLine().toString().split("#");
                    process(msg[1]); //sent input char to check
                    //System.out.println("msg[1]"+msg[1]);
                    //System.out.println("Word: " + word[idxWord]+ " typed: "+typed);
                    pw.println(typed + "#" + word[idxWord] + "#" + status);
                    //return word and typed character
                    Thread.sleep(100);
                } catch (IOException ex) {
                } catch (InterruptedException ex) {
                }
            }

        }
    });

    public void terminate() {
        running = false;
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

    public static void main(String args[]) throws UncheckedIOException, UnknownHostException {
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JSeparator Underline;
    private javax.swing.JLabel checkIP;
    private javax.swing.JLabel sreverBar;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
