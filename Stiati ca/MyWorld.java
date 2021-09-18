import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {
        super(1600, 900, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { 
        Milky_Way milky_way = new Milky_Way();
        addObject(milky_way,371,262);
        Supernova_1987A supernova_1987a = new Supernova_1987A();
        addObject(supernova_1987a,1129,261);
        Sombrero sombrero = new Sombrero();
        addObject(sombrero,771,652);
        supernova_1987a.setLocation(274,650);
        sombrero.setLocation(1259,213);
        supernova_1987a.setLocation(813,634);
        milky_way.setLocation(265,384);
        sombrero.setLocation(1239,344);
        supernova_1987a.setLocation(759,664);
        Next next = new Next();
        addObject(next,1521,848);
    }
}