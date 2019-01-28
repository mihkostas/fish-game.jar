import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
private int timer = 0;
   public void act() {
    getWorld().showText("score: "+timer,70,20); 
    timer++;
    if (timer == (5000))
    {
    World MyWorld = getWorld();
    GreenfootImage bg = new GreenfootImage("sea2.png");
    bg.scale(400,650);
    MyWorld.setBackground(bg);
    }
    if (timer == (10000)) {
    World MyWorld = getWorld();
    GreenfootImage bg = new GreenfootImage("sea9.jpg");
    bg.scale(400,650);
    MyWorld.setBackground(bg);
    crab2 d = new crab2();
    MyWorld.addObject(d,199,320);
    }
    if (timer == (1240)) {
    World MyWorld = getWorld();
    GreenfootSound backgroundMusic1 = new GreenfootSound("Pim Poy.wav");
    backgroundMusic1.playLoop();
    
    }
 }
}
    

