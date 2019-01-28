import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab1 extends Actor
{
    /**
     * Act - do whatever the crab1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    fish2 b = new fish2();
    public void act() 
 {move(4);
 if (Greenfoot.getRandomNumber(100)<10)
 {
 turn(16);
 }
 if (isAtEdge())
 {
 turn(6);
 } 
    {
      // if (isTouching(fish1.class))
       // {
      //removeTouching(fish1.class);
     
  //  } 
 //  {
       if (isTouching(fish2.class))
      {
     removeTouching(fish2.class);
     World MyWorld = getWorld();
     gameover t = new gameover();
     MyWorld.addObject(t,196,250);
     Greenfoot.stop();
   }    
//}
}
}
}


