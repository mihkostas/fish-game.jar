import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish2 extends Actor
{
    /**
     * Act - do whatever the fish2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("a"))
    {
     turn(-5);
    }
    if (Greenfoot.isKeyDown("d"))
    {
     turn(5);
    }
    if (Greenfoot.isKeyDown("w"))
    {
     move(5);
    }
    if (Greenfoot.isKeyDown("s"))
    {
     move(-3);
    }
    }    
}
