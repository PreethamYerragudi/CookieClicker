package code;

/**
 * Class ArcadeDemo
 * This class contains demos of many of the things you might
 * want to use to make an animated arcade game.
 * 
 * Adapted from the AppletAE demo from years past. 
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.sound.sampled.Clip;


public class CookieClickerEngine extends AnimationPanel 
{

    //Constants
    //-------------------------------------------------------

    //Instance Variables
    //-------------------------------------------------------
    Stats stats = new Stats();


    //Constructor
    //-------------------------------------------------------
    public CookieClickerEngine()
    {   //Enter the name and width and height.  
        super("ArcadeDemo", 800, 800);

    }
       
    //The renderFrame method is the one which is called each time a frame is drawn.
    //-------------------------------------------------------
    protected void renderFrame(Graphics g) 
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 800);
        g.setColor(Color.WHITE);
        g.drawString("Score:" + stats.getScore(), 0, 30);
        g.fillRect(600, 0, 200, 50);
        g.fillRect(600, 125, 200, 50);
        g.fillRect(600, 250, 200, 50);
        g.fillRect(600, 375, 200, 50);
        g.fillRect(600, 500, 200, 50);
        g.fillRect(600, 625, 200, 50);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Comic Sans", 25, 12));
        g.drawString("-100 - Grandma(+1/s)", 600, 50);
        g.drawString("-100 - RollingPin(Click+0.5)", 600, 175);
        g.drawString("-2000 - UltimateRollingPin(+1 all)", 600, 300);
        g.drawString("-1000 - GreatGrandma(+200/s)", 600, 425);
        g.drawString("-200 - AutoRoller(Click+1)", 600, 550);
        g.drawString("-6000 - Mom(+1Grandma/s)", 600, 675);
        if(frameNumber % 60 == 0){
          stats.increaseScore();
          stats.increaseGrandma();
        }
    }//--end of renderFrame method--
    
    //-------------------------------------------------------
    //Respond to Mouse Events
    //-------------------------------------------------------
    public void mouseClicked(MouseEvent e)  
    { 
        
       if((mouseX >= 600 && (mouseY>0 && mouseY<50))&&stats.getScore()>=100){
        stats.setGrandmas(stats.getGrandmas()+1);
        stats.setScore(stats.getScore()-100);
       }
       if((mouseX >= 600 && (mouseY>125 && mouseY<175))&&stats.getScore()>=100){
        stats.setRollingPins(stats.getRollingPins()+1);
        stats.setScore(stats.getScore()-100);
       }
       if(mouseX >= 600 && ((mouseY>250 && mouseY<300))&&stats.getScore()>=2000){
        stats.setUltimateRollingPins(stats.getUltimateRollingPins()+1);
        stats.setScore(stats.getScore()-2000);
       }
       if((mouseX >= 600 && (mouseY>375 && mouseY<425))&&stats.getScore()>=1000){
        stats.setGreatGrandmas(stats.getGreatGrandmas()+1);
        stats.setScore(stats.getScore()-1000);
       }
       if((mouseX >= 600 && (mouseY>500 && mouseY<550)) && stats.getScore()>=200){
        stats.setAutoRoller(stats.getAutoRoller()+1);
        stats.setScore(stats.getScore()-200);
       }
       if((mouseX >= 600 && (mouseY>625 && mouseY<675))&&stats.getScore()>=6000){
        stats.setMoms(stats.getMoms()+1);
        stats.setScore(stats.getScore()-6000);
       }
    }
    
    //-------------------------------------------------------
    //Respond to Keyboard Events
    //-------------------------------------------------------
    public void keyTyped(KeyEvent e) 
    {
        
    }
    
    public void keyPressed(KeyEvent e)
    {

    }

    public void keyReleased(KeyEvent e)
    {

    }
    
    
    //-------------------------------------------------------
    //Initialize Graphics
    //-------------------------------------------------------
//-----------------------------------------------------------------------
/*  Image section... 
 *  To add a new image to the program, do three things.
 *  1.  Make a declaration of the Image by name ...  Image imagename;
 *  2.  Actually make the image and store it in the same directory as the code.
 *  3.  Add a line into the initGraphics() function to load the file. 
//-----------------------------------------------------------------------*/

    
    public void initGraphics() 
    {      
       
    } //--end of initGraphics()--
    
    //-------------------------------------------------------
    //Initialize Sounds
    //-------------------------------------------------------
//-----------------------------------------------------------------------
/*  Music section... 
 *  To add music clips to the program, do four things.
 *  1.  Make a declaration of the AudioClip by name ...  AudioClip clipname;
 *  2.  Actually make/get the .wav file and store it in the same directory as the code.
 *  3.  Add a line into the initMusic() function to load the clip. 
 *  4.  Use the play(), stop() and loop() functions as needed in your code.
//-----------------------------------------------------------------------*/

    
    public void initMusic() 
    {

    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}//--end of ArcadeDemo class--

