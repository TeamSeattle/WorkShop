package Tiles.Backgrounds.Set4;

import Graphics.Assets;
import Tiles.Tile;

import java.awt.*;

public class Set4Tiles extends Tile {

    public Set4Tiles(int id) {
        super(Assets.set4_tiles, id);
    }

    @Override
    public void render(Graphics graphics, int x, int y) {
        graphics.drawImage(texture,0,0,64 * 14,64 * 12,null);
    }
}
