import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   GreenfootSound backgroundMusic1 = new GreenfootSound("Pim Poy Pocket.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(400, 650, 1);
    backgroundMusic1.play();
    GreenfootImage bg = new GreenfootImage("seabg.jpg");
    bg.scale(getWidth(), getHeight());
    setBackground(bg);
    //fish1 a = new fish1();
    Greenfoot.start();
    //gameover t = new gameover();
    fish2 b = new fish2();
    timer c = new timer();
    crab1 d = new crab1();
    crab1 e = new crab1();
    turtle z = new turtle();
    //addObject(a,200,200);
    addObject(b,342,162);
    addObject(d,199,310);
    addObject(e,150,310);
    addObject(z,100,100);
    addObject(c,70,20);
   
//GreenfootSound music = new GreenfootSound("Pim Poy.wav");
// if(!music.isPlaying())
//{
// music.play();
//}
   }
}
