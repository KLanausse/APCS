package Personal;

import java.awt.*;

import static java.lang.Thread.sleep;

public class Colors2 {
    public static void main(String[] args) throws InterruptedException{
        int width = 446; // Default: 898px (Left Screen)(Windows 10)
        int height = 1366; // Default: 1370px (Left Screen)(Windows 10)
        int framesPerSecond = 24;
        DrawingPanelSimplifyed panel = new DrawingPanelSimplifyed(width, height);
        Graphics pen = panel.getGraphics();

        pen.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        int h = 0;
        int h2 = 180;
        while (true){
            //pen.setColor( new HSLColor( (int)((x/(double)width)*360), 100, (int)((y/(double)height)*100) ).getRGB() );
            pen.setColor( new HSLColor(h, 100, 50 ).getRGB() );
            pen.fillRect(0,0,width,height);

            pen.setColor( new HSLColor(h2, 100, 50 ).getRGB() );
            pen.drawString("lol colors", width/2, 50);

            sleep(1000/framesPerSecond);

            h++;
            h2++;
            if (h > 360)
                h=0;
            if (h2 > 360)
                h2=0;
            System.out.println("h: " + h);
        }
    }
}
