package com.bmhs.gdxintro.gfx.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.assets.WorldTile;

public class TileHandler {

    public static TileHandler tileHandler = null;

    private int spriteOnSheetHeight, spriteOnSheetWidth;

    private String primaryColorSheetPath = "SteveColors2.png";

    private Array<WorldTile> worldTileArray;

    private TileHandler() {
        worldTileArray = new Array<>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);

        TextureRegion tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*2, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile brownWorldTile = new WorldTile(tempRegion, 1, "brown");
        worldTileArray.add(brownWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*4, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile tealWorldTile = new WorldTile(tempRegion, 6, "teal");
        worldTileArray.add(tealWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*6, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile tanWorldTile = new WorldTile(tempRegion, 2, "tan");
        worldTileArray.add(tanWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*8, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkPurpWorldTile = new WorldTile(tempRegion, 3, "darkPurp");
        worldTileArray.add(darkPurpWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*10, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile greyWorldTile = new WorldTile(tempRegion, 4, "grey");
        worldTileArray.add(greyWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*12, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 5, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*2, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 0, "white");
        worldTileArray.add(whiteWorldTile);
    }

    public Array<WorldTile> getWorldTileArray() {
        return worldTileArray;
    }

    public static TileHandler getTileHandler() {
        if(tileHandler == null) {
            tileHandler = new TileHandler();
        }
        return tileHandler;
    }
}
