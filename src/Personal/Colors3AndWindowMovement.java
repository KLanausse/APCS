package Personal;

import java.awt.*;

import static java.lang.Thread.sleep;

public class Colors3AndWindowMovement {
    public static void main(String[] args) throws InterruptedException{
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        int width = 175; // Default: 898px (Left Screen)(Windows 10)
        int height = 100; // Default: 1370px (Left Screen)(Windows 10)
        int colorScale = 12;
        int framesPerSecond = 24;
        DrawingPanelSimplifyed panel = new DrawingPanelSimplifyed(width, height);
        Graphics pen = panel.getGraphics();

        int posX = (int) ((dimension.getWidth() - width) / 2);
        int posY = (int) ((dimension.getHeight() - height) / 2);
        int speed = 20;

        int h = 0;
        while (true){
            panel.setPosition(posX, posY);
            //pen.setColor( new HSLColor( (int)((x/(double)width)*360), 100, (int)((y/(double)height)*100) ).getRGB() );
            int gr = h;
            for (int y = 0; y < height; y++) {
                //for (int x = 0; x < width; x++) {
                if (gr > 360)
                    gr=0;
                    pen.setColor( new HSLColor( gr, 100, 50 ).getRGB() );
                    pen.fillRect(0,y,width,1);
                //}
                if (y % colorScale == 0)
                gr++;
            }
            sleep((1000/speed)/framesPerSecond);

            h++;
            if (h > 360)
                h=0;

            //posX++;
            //if (posX > dimension.getWidth())
            //    posX = 0 - width;
            //

            posY++;
            if (posY > dimension.getHeight())
                posY = 0 - height - 5;
        }
    }
}
