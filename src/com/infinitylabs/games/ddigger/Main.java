/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinitylabs.games.ddigger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Levex
 * @test
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Game());
        app.setDisplayMode(640, 480, false);
        //app.
        app.start();
    }

}
