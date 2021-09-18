import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Next extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true)
            Greenfoot.setWorld(new Game());
    }    
}