import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{   
    //RANDOM COORDINATEN
    int min1 = 250;
    int max1 = getHeight();
    
    int min2 = 200;
    int max2 = getHeight();
    int random1 = min1 + Greenfoot.getRandomNumber( max1 - min1 + 1 );
    //RAKET COORDINATEN
    int raketX = 100;
    int raketY = getHeight() / 2;
    //ENEMY COORDINATEN
    int enemy1X = random1;
    int enemy1Y = random1;

    public space()
    {    
        //DE WERELD LATEN MAKEN
        super(1200, 600, 1); 
        //TOP BAR WAAR JE HET AANTAL LEVENS EN TIJD KUNT ZIEN
        addObject(new topBar(), 599, 25);
        addObject(new lives(), 134, 28);
        addObject(new pauseButton(), 1169, 28);
        //RAKET SPAWNEN
        addObject(new raket(), raketX, raketY);
        
        //ENEMYS
        addObject(new enemy1(), enemy1X, enemy1Y);
        addObject(new speedUp(), getHeight()/2, 200);
 
        
    }
    
    public void stopped() {
        getObjects(enemy1.class).get(0).stop();
    }
    
    
    
}
