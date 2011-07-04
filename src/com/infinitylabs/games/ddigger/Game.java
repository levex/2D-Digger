/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinitylabs.games.ddigger;

import com.infinitylabs.games.ddigger.tiles.DirtTile;
import com.infinitylabs.games.ddigger.tiles.EmptyTile;
import com.infinitylabs.games.ddigger.tiles.Tile;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Levex
 */
public class Game extends BasicGame {

    public final int tileMapWidth = 128;
    public final int tileMapHeight = 128;
    public Tile[][] tileMap = new Tile[tileMapWidth][tileMapHeight];

    public Game()
    {
        super("2D-Digger");
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        container.getGraphics().setBackground(Color.cyan);
        for(int x = 0; x < tileMapWidth; x++)// Fill tilemap with dirttiles.
        {
            for(int y = 0; y < tileMapHeight; y++)
            {
                tileMap[x][y] = new DirtTile(x , y);
            }
        }
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        Input inp = container.getInput();
        if (inp.isMousePressed(Input.MOUSE_LEFT_BUTTON))
        {
            int mx = inp.getMouseX();  // Mouse X saved cause it can change in the actual frame.
            int my = inp.getMouseY();  // Same
            int tx = (int) Math.floor(mx / 4);  // Tile X
            int ty = (int) Math.floor(my / 4);  // Tile Y
            tileMap[tx][ty] = new EmptyTile(tx, ty);  // Remove tile.
        }
    }

    public void render(GameContainer container, Graphics g) throws SlickException {
        for(int x = 0; x < tileMapWidth; x++)  // Render the tiles.
        {
            for(int y = 0; y < tileMapHeight; y++)
            {
                tileMap[x][y].render(g);
            }
        }
    }

}
