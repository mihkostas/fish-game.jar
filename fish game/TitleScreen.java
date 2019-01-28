import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
 
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        super(400, 650, 1); 
        Greenfoot.start();
        GreenfootImage bg = new GreenfootImage("tit2.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);}
   private int timer = 0;
   public void act() {
    showText("ᵇʸ ᵐᶦʰᵏᵒˢᵗᵃˢ",200,640);
    timer++;
    if (timer == (120)) {
    GreenfootImage bg = new GreenfootImage("tit1.jpg");
    bg.scale(400,650);
    setBackground(bg);
    timer = -30;
}
    if (timer == (0))
 {
    GreenfootImage bg = new GreenfootImage("tit2.jpg");
    bg.scale(400,650);
    setBackground(bg);
    }
 if (Greenfoot.isKeyDown("Enter")) Greenfoot.setWorld(new MyWorld());
  
    }
}
