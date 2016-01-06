import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speedUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speedUp extends Actor {


     public void act()  {
        if (!getIntersectingObjects(raket.class).isEmpty()) {
            getWorld().removeObject(this);
        }
    }    
}
