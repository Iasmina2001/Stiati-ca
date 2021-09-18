import greenfoot.*;

public class Alien extends Actor
{
    boolean sw_Mercur = false;
    boolean sw_Venus = false;
    boolean sw_Pamant = false;
    boolean sw_Marte = false;
    boolean sw_Ceres = false;
    boolean sw_Jupiter = false;
    boolean sw_Saturn = false;
    boolean sw_Uranus = false;
    boolean sw_Neptun = false;
    boolean sw_Pluto = false;

    boolean visited_Mercur = false;
    boolean visited_Venus = false;
    boolean visited_Pamant = false;
    boolean visited_Marte = false;
    boolean visited_Ceres = false;
    boolean visited_Jupiter = false;
    boolean visited_Saturn = false;
    boolean visited_Uranus = false;
    boolean visited_Neptun = false;
    boolean visited_Pluto = false;

    public void act() 
    {
        if (getWorld().getObjects(Menu.class).isEmpty() == true)
        {
            move(5);

            if (isTouching(Mercur.class) == true && sw_Mercur == false)
            {
                getWorld().addObject(new Menu(this, "Mercur"), 1350, 160);
                sw_Mercur = true;
                add_planets();
            }
            if (isTouching(Venus.class) == true && sw_Venus == false)
            {
                getWorld().addObject(new Menu(this, "Venus"), 1350, 160);
                sw_Venus = true;
                add_planets();
            }
            if (isTouching(Pamant.class) == true && sw_Pamant == false)
            {
                getWorld().addObject(new Menu(this, "Pamant"), 1350, 160);
                sw_Pamant = true;
                add_planets();
            }
            if (isTouching(Marte.class) == true && sw_Marte == false)
            {
                getWorld().addObject(new Menu(this, "Marte"), 1350, 160);
                sw_Marte = true;
                add_planets();
            }
            if (isTouching(Ceres.class) == true && sw_Ceres == false)
            {
                getWorld().addObject(new Menu(this, "Ceres"), 1350, 160);
                sw_Ceres = true;
                add_planets();
            }
            if (isTouching(Jupiter.class) == true && sw_Jupiter == false)
            {
                getWorld().addObject(new Menu(this, "Jupiter"), 1350, 160);
                sw_Jupiter = true;
                add_planets();
            }
            if (isTouching(Saturn.class) == true && sw_Saturn == false)
            {
                getWorld().addObject(new Menu(this, "Saturn"), 1350, 160);
                sw_Saturn = true;
                add_planets();
            }
            if (isTouching(Uranus.class) == true && sw_Uranus == false)
            {
                getWorld().addObject(new Menu(this, "Uranus"), 1350, 160);
                sw_Uranus = true;
                add_planets();
            }
            if (isTouching(Neptun.class) == true && sw_Neptun == false)
            {
                getWorld().addObject(new Menu(this, "Neptun"), 1350, 160);
                sw_Neptun = true;
                add_planets();
            }
            if (isTouching(Pluto.class) == true && sw_Pluto == false)
            {
                getWorld().addObject(new Menu(this, "Pluto"), 1350, 160);
                sw_Pluto = true;
            }
        }

        if (Greenfoot.isKeyDown("left") == true)
            turn(-3);

        if (Greenfoot.isKeyDown("right") == true)
            turn(3);
    }

    private void add_planets()
    {
        if (sw_Mercur == true && visited_Venus == false)
        {
            getWorld().addObject(new Venus(), 60, 400);
            visited_Venus = true;
        }
        if (sw_Venus == true && visited_Pamant == false)
        {
            getWorld().addObject(new Pamant(), 700, 500);
            visited_Pamant = true;
        }
        if (sw_Pamant == true && visited_Marte == false)
        {
            getWorld().addObject(new Marte(), 900, 120);
            visited_Marte = true;
        }
        if (sw_Marte == true && visited_Ceres == false)
        {
            getWorld().addObject(new Ceres(), 670, 700);
            visited_Ceres = true;
        }
        if (sw_Ceres == true && visited_Jupiter == false)
        {
            getWorld().addObject(new Jupiter(), 1400, 420);
            visited_Jupiter = true;
        }
        if (sw_Jupiter == true && visited_Saturn == false)
        {
            getWorld().addObject(new Saturn(), 900, 600);
            visited_Saturn = true;
        }
        if (sw_Saturn == true && visited_Uranus == false)
        {
            getWorld().addObject(new Uranus(), 650, 200);
            visited_Uranus = true;
        }
        if (sw_Uranus == true && visited_Neptun == false)
        {
            getWorld().addObject(new Neptun(), 170, 130);
            visited_Neptun = true;
        }
        if (sw_Neptun == true && visited_Pluto == false)
        {
            getWorld().addObject(new Pluto(), 1000, 800);
            visited_Pluto = true;
        }
    }
}