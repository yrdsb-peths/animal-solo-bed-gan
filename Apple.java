import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Lin 
 * @version April 2025
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+2);
        
        //Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
