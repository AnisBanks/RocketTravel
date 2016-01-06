import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class enemy1 extends Actor {
    GreenfootSound beeping = (new GreenfootSound("mineBombSound.mp3"));
    public void volgRaket() {
        
    }
    
    public void act() { 
        move(2);
        turn(1);
        beeping.playLoop();
    }    
    
    public void stop() {
        beeping.stop();
    }
    
}
