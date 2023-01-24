package Personal;

import java.awt.*;

public class Colors {
    public static void main(String[] args){
        int width = 898;
        int height = 1370;
        DrawingPanelSimplifyed panel = new DrawingPanelSimplifyed(width, height);
        Graphics pen = panel.getGraphics();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                pen.setColor( new HSLColor( (int)((x/(double)width)*360), 100, (int)((y/(double)height)*100) ).getRGB() );
                pen.drawRect(x,y,1,1);
            }
        }
    }
}
