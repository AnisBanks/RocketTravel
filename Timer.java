import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends TextToImage {
    
    private long startTime;
    private GreenfootImage image = new GreenfootImage(250, 30);
    
    public Timer() {
        startTime = System.currentTimeMillis();
        setImage(image);
    }

    /**
     * Act - do whatever the GameOverWindow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        drawGameOverWindow();
    }
    
    
    public String elapsedTime() {
        long duration = (System.currentTimeMillis()-startTime)/1000;
        int hh = (int)(duration/3600);
        int mm = (int)(duration%3600/60);
        int ss = (int)(duration%60);
        String elapsedTime = String.format("%02d:%02d:%02d", hh, mm, ss);
        return elapsedTime;
    }
    
    public void drawGameOverWindow() {
        
        
        /*----------* draw strings into image *----------*/
        image.setFont(new Font("Arial", Font.BOLD, 20));
        String text1 = elapsedTime();
        Dimension dim1 = getTextDimensions(image, text1);
       // image.setColor(new Color(200, 200, 200));
       // image.drawString(text1, image.getWidth()/2-(int)(dim1.getWidth()/2)+1, image.getHeight()/2);
        image.setColor(new Color(0, 0, 0));
        image.drawString(text1, image.getWidth()/2-(int)(dim1.getWidth()/2), image.getHeight()/2);
        
        setImage(image);
    }
}