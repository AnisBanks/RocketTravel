import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class bosshp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lives extends Actor {
    
    private GreenfootImage image = new GreenfootImage(129, 20);
    
    public lives() {
        setImage(image);
        draw();
    }
    
    public void act() {
        draw();
    }
    
    public void draw() {
        image.clear();
        //set image background
        if (lifeUp.life < 0) {
            lifeUp.life = 0;
        }
        if (lifeUp.life > 0 ) {
            image.setColor(new Color(255, 0, 0));
            image.fillRect(0, 0, lifeUp.life*10, 20);
        }
    }

}