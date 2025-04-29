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
        setLocation(getX(), getY()+1);
    }
}
