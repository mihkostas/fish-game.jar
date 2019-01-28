import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
  {move(2);
 if (Greenfoot.getRandomNumber(100)<10)
 {
 }
 if (isAtEdge())
 {
 turn(20);
 }
  {
 //      if (isTouching(fish1.class))
    //    {
  //    removeTouching(fish1.class);
   // } 
   {
       if (isTouching(fish2.class))
       {
     removeTouching(fish2.class);
     World MyWorld = getWorld();
     gameover t = new gameover();
     MyWorld.addObject(t,196,250);
     Greenfoot.stop();
    
    }    
}
}
}
}
