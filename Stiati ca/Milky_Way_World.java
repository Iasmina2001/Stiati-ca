import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Milky_Way_World extends World
{
    public Milky_Way_World()
    {
        super(1600, 900, 1);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(null) == true)
            Greenfoot.setWorld(new MW_Map());
    }
}