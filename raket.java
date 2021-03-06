import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class raket extends Actor {  
    GreenfootSound speedSound    = (new GreenfootSound("speedSound.mp3"));
    GreenfootSound gameoverSound = (new GreenfootSound("gameoverSound.mp3"));
    boolean shooting = false;
    int timer = 0;
    public void gameOver() {
       //LAAT DE NIEUWE WERELD VERSCHIJNEN WAARIN JE DE GAME KAN RESTARTEN, EN JE SCORE KAN ZIEN
       enemy1.class.getClass();
       
       
    }
    int s = 4;
    int direction, speed;

    public void act() {
        timer++;
        if (Greenfoot.isKeyDown("up")) {
            move(s);   
        }       
        if (Greenfoot.isKeyDown("left")){
            turn(-s);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(s);
        }
        //ALS DE SPELER speedUP OPPAKT
        if (!getIntersectingObjects(speedUp.class).isEmpty()) { 
            s += 4;
            speedSound.play();
        }
        
        //ALS DE SPELER DE ENEMY RAAKT
        if (!getIntersectingObjects(enemy1.class).isEmpty()) {
            getWorld().removeObject(this);
            gameoverSound.play();
            gameOver();
            Greenfoot.setWorld(new beginScherm());
        }
        
        //ATTACK
        if (Greenfoot.isKeyDown("space") && shooting == false && timer > 20) {
            getWorld().addObject(new Shot(getRotation()), getX(), getY());
            shooting = true;
            timer = 0;
        }
        else {shooting = false;}
         
    }   
    

}
