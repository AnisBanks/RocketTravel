import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lifeUp extends Actor
{   
    public static int life = 3;
    
    public void act() 
    {
        if (!getIntersectingObjects(raket.class).isEmpty()) {
            getWorld().removeObject(this);
            life += 1;
        }
    }    
    
    
}
