import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Supernova_1987A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Supernova_1987A extends Actor
{
    /**
     * Act - do whatever the Supernova_1987A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) == true)
        {
            Greenfoot.setWorld(new Supernova_1987A_World());
        }
    }
}
