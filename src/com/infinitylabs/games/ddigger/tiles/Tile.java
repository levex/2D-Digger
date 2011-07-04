/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinitylabs.games.ddigger.tiles;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 *
 * @author Levex
 */
public class Tile {

    public static final int TILE_WIDTH = 4;
    public static final int TILE_HEIGHT = 4;

    public Image img = null;
    public int x = 0, y = 0;

    public Tile()
    {
        
    }

    public void render(Graphics g)
    {
        g.drawImage(img, TILE_WIDTH * x + 1 , TILE_HEIGHT * y + 1);
    }

}
