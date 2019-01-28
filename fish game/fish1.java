import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish1 extends Actor
{
    public void act() 
    {
     if (Greenfoot.isKeyDown("left"))
    {
     turn(-5);
    }
    if (Greenfoot.isKeyDown("right"))
    {
     turn(5);
    }
    if (Greenfoot.isKeyDown("up"))
    {
     move(5);
    }
    if (Greenfoot.isKeyDown("down"))
    {
     move(-3);
    }
    }    
}
