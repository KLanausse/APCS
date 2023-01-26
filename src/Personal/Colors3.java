package Personal;

import java.awt.*;

import static java.lang.Thread.sleep;

public class Colors3 {
    public static void main(String[] args) throws InterruptedException{
        int width = 446; // Default: 898px (Left Screen)(Windows 10)
        int height = 1366; // Default: 1370px (Left Screen)(Windows 10)
        int colorScale = 12;
        int framesPerSecond = 24;
        DrawingPanelSimplifyed panel = new DrawingPanelSimplifyed(width, height);
        Graphics pen = panel.getGraphics();

        int h = 0;
        while (true){
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
            sleep(1000/framesPerSecond);
            h++;
            if (h > 360)
                h=0;
            System.out.println("h: " + h);
        }
    }
}
