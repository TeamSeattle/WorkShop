package DIsplay.Menus.ExitButtons;

import Graphics.Assets;
import Input.MouseManager;
import Main.Engine;
import States.StateManager;

import java.awt.*;

public class ExitButton {

    public static int time = 0;

    /**
     * Ticks every time when called
     */
    public static void tick() {
        if (MouseManager.isClicked == 1 &&
                (MouseManager.getX > 347 && MouseManager.getX < 550) &&
                (MouseManager.getY > 700 && MouseManager.getY < 770) &&
                time > 20) {

            StateManager.setCurrentState(Engine.exitState);
            time = 0;
        }
        time++;
    }

    /**
     * Renders the exit button for the menu
     *
     * @param graphics -> Required
     */
    public static void render(Graphics graphics) {
        if ((MouseManager.getX > 347 && MouseManager.getX < 550) &&
                (MouseManager.getY > 700 && MouseManager.getY < 770)) {
            graphics.drawImage(Assets.close_menu_button_hover, 347, 700, null);
        } else {
            graphics.drawImage(Assets.close_menu_button, 347, 700, null);
        }
    }

    public static void resetTime() {
        time = 0;
    }
}
