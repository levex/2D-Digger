/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinitylabs.games.ddigger.tiles;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Levex
 */
public class EmptyTile extends Tile {

    public EmptyTile(int x, int y) throws SlickException
    {
        this.x = x;
        this.y = y;
        this.img = null;
    }

    public void render(Graphics g)
    {
        ;
    }

}
