import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    public Shot(int rotation) {
        setRotation(rotation);
    }
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        Actor enemy = getOneObjectAtOffset(0, 0, enemy1.class);
        if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
    }    
}
