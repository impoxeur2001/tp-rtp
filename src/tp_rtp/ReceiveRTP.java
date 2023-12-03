/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_rtp;

import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;

/**
 *
 * @author slimane
 */

import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;


public class ReceiveRTP {

    public static void main(String[] args) {
        try {
            Player player;
            // medialocator to receive data from this url : includes the sender that we want to receive data from
            MediaLocator url = new MediaLocator("rtp://192.168.1.26:10000/audio");

            //creating a player to receive data
            player = Manager.createPlayer(url);
            player.realize();
            player.start();

            System.out.println("Receiving...");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
