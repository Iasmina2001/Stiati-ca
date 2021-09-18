import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Game extends World
{
    public Game()
    {
        super(1600, 900, 1);
        prepare();
    }
    
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,193,232);
        Mercur mercur = new Mercur();
        addObject(mercur,375,91);
        mercur.setLocation(243,538);
    }
}
