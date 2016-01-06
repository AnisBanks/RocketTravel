import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lives extends Actor
{   
    public void Text(String text)
    {
        updateImage(text);
    }
 
    public void updateImage(String text)
    {
        setImage(new GreenfootImage(text, 18, Color.black, new Color(0, 0, 0, 0)));
    }
    public void act() 
    {
        
    }    
}

//WAAR WAS IK GEBLEVEN: HOE LAAT JE ER LEVENS BIJ KOMEN