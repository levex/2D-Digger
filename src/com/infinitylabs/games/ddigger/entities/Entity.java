/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinitylabs.games.ddigger.entities;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 *
 * @author Levex
 */
public class Entity {
    // Entity base class for enemies, players, blabla.
    // Didn't have time to finish, blah. :)

    public int x = 0;
    public int y = 0;
    public Image img = null;

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics g)
    {
        g.drawImage(img, x, y);
    }

    public void update()
    {
        
    }

}
