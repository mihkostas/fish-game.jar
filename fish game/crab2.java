import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab2 extends Actor
{
    /**
     * Act - do whatever the crab1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    fish2 b = new fish2();
    public void act() 
 {move(6);
 if (Greenfoot.getRandomNumber(100)<15)
 {
 turn(-15);
 }
 if (Greenfoot.getRandomNumber(100)<5)
 {
 turn(15);
 }
 if (isAtEdge())
 {
 turn(-9);
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

