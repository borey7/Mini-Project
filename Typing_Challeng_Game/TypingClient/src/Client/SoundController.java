/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Ji
 */
public class SoundController {

    private Player player;
    private File f;

    //construcror
    public SoundController(File f) {
        this.f = f;
    }
    public void close() {
        if (player != null) {
            player.close();
        }
    }

    //sound card
    public void play() {
        try {
            FileInputStream fis = new FileInputStream(f.getAbsolutePath());
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (FileNotFoundException | JavaLayerException e) {
            System.out.println(e);
        }

        //run in new thread to play in background
        new Thread() {
            public void run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }.start();
    }
}
