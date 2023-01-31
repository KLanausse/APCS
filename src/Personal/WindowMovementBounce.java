/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package Personal;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

/* WindowMovement.java requires no other files. */
public class WindowMovementBounce {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static int framesPerSecond = 60;
    private static int speed = 5;

    private static void createAndShowGUI () throws InterruptedException {
        int width = 175;
        int height = 100;

        //Create and set up the window.
        JFrame frame = new JFrame("WindowMovement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Hi!!! :D");
        emptyLabel.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        //int posX = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        //int posY = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        int posX = 0;
        int posY = 0;

        boolean xAdd = true;
        boolean yAdd = true;
        while (true) {
            frame.setLocation(posX, posY);
            sleep((1000/speed)/framesPerSecond);

            if (xAdd) {
                posX++;
            }else{
                posX--;
            }
            if (posX > dimension.getWidth()-width)
                xAdd=false;
            if (posX <= 0)
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

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
