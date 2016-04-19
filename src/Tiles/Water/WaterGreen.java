package Tiles.Water;

import Graphics.Assets;
import Tiles.Tile;

import java.awt.*;

public class WaterGreen extends Tile {

    public WaterGreen(int id) {
        super(Assets.water_green, id);
    }

    private int xTemp = 0;
    @Override
    public void render(Graphics graphics, int asd, int y) {

        for (int x = 0; x < 15; x++) {
            graphics.drawImage(texture,64 * x + xTemp,y,TILE_WIDTH,TILE_HEIGHT * 2,null);
        }
        if (xTemp == -64 ){
            xTemp = 0;
        }
        xTemp--;
    }
}
