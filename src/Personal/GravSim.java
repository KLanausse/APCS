package Personal;

import java.awt.*;

import static java.lang.Thread.sleep;

public class GravSim {
    public static void main(String[] args) throws InterruptedException {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics pen = panel.getGraphics();

        double gravity = 9.8;
        double secondsPerFrame = 1;

        //object
        int objectWidth = 20;
        int objectHeight = 20;
        int objectX = 0;
        int objectY = 0;
        int objectVelocityX = 0;
        int objectVelocityY = 0;

        //SIM LOOP
        boolean run = true;

        objectVelocityX = 5;

        while (run){

            panel.clear();
            pen.drawRect(objectX,objectY,objectWidth,objectHeight);
            System.out.println("X: "+objectX+" Y: "+objectY);

            //gravity
            objectVelocityY -= (gravity*secondsPerFrame);

            objectX += objectVelocityX;
            objectY -= objectVelocityY;

            //Bound check
            if (objectY >= 500-objectHeight) {
                objectY = 500 - objectHeight;
                objectVelocityY = 0;
            } else if (objectY < 0){
                objectY = 0;
                objectVelocityY = 0;
            }

            if (objectX >= 500 - objectWidth) {
                objectX = 500 - objectWidth;
                objectVelocityX = 0;
            } else if (objectX < 0){
                objectX = 0;
                objectVelocityX = 0;
            }


            sleep((int)secondsPerFrame*1000);
        }

    }
}
