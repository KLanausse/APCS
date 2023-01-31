package Personal;

import java.awt.image.ImageObserver;
import java.io.File;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Thread.sleep;

public class Colors3AndWindowMovementBounceFish {
    public static void main(String[] args) throws InterruptedException{
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        int width = 175; // Default: 898px (Left Screen)(Windows 10)
        int height = 100; // Default: 1370px (Left Screen)(Windows 10)
        int framesPerSecond = 24;
        DrawingPanelSimplifyed panel = new DrawingPanelSimplifyed(width, height);
        Graphics pen = panel.getGraphics();

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/Data/In/Fish.jpg"));
        } catch (IOException e) {
        }
        pen.drawImage(img, 0, 0, width, height, null);

        int posX = (int) ((dimension.getWidth() - width) / 2);
        int posY = (int) ((dimension.getHeight() - height) / 2);
        int speed = 50;

        boolean xAdd = true;
        boolean yAdd = true;
        while (true){
            panel.setPosition(posX, posY);
            sleep((1000/speed)/framesPerSecond);

            if (xAdd) {
                posX++;
            }else{
                posX--;
            }
            if (posX > dimension.getWidth()-width)
                xAdd=false;
            if (posX <= 0-10)
                xAdd=true;


            if (yAdd) {
                posY++;
            }else{
                posY--;
            }
            if (posY > dimension.getHeight()-height)
                yAdd=false;
            if (posY <= 0)
                yAdd=true;
        }
    }
}
