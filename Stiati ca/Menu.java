import greenfoot.*;


public class Menu extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage back = getImage();

    public String q1_0 = "Craterele de pe Mercur au denumirile unor: \n";
    public String q1_1 = "1. personalitati \n";
    public String q1_2 = "2. planete \n";
    public String q1_3 = "3. zeitati";
    private String q1s[] = {q1_0, q1_1, q1_2, q1_3};

    public String q2_0 = "Numele Venus provine de la zeita romana a: \n";
    public String q2_1 = "1. razboiului \n";
    public String q2_2 = "2. recoltei \n";
    public String q2_3 = "3. frumusetii";
    private String q2s[] = {q2_0, q2_1, q2_2, q2_3};

    public String q3_0 = "Peste 150 mil. ani, Pamantul va avea ... ore. \n";
    public String q3_1 = "1. 24 \n";
    public String q3_2 = "2. 25 \n";
    public String q3_3 = "3. 23";
    private String q3s[] = {q3_0, q3_1, q3_2, q3_3};

    public String q4_0 = "Satelitii lui Marte, Phobos si Demos inseamna: \n";
    public String q4_1 = "1. teama, repectiv panica \n";
    public String q4_2 = "2. teama, repectiv ura \n";
    public String q4_3 = "3. ura, respectiv tristetea \n";
    private String q4s[] = {q4_0, q4_1, q4_2, q4_3};

    public String q5_0 = "Ceres a fost descoperit in 1801 de catre: \n";
    public String q5_1 = "1. Giuseppe Piazzi \n";
    public String q5_2 = "2. Galileo Galilei \n";
    public String q5_3 = "3. Eratostene";
    private String q5s[] = {q5_0, q5_1, q5_2, q5_3};

    public String q6_0 = "Furtuna de pe Jupiter care dateaza de 150 ani \n";
    public String q6_1 = "se numeste: \n";
    public String q6_2 = "1. Marea Pata Galbena \n";
    public String q6_3 = "2. Marea Pata Rosie \n";
    public String q6_4 = "3. Furtuna de Nisip";
    private String q6s[] = {q6_0, q6_1, q6_2, q6_3, q6_4};

    public String q7_0 = "Inelele lui Saturn sunt formate din: \n";
    public String q7_1 = "1. tone de praf si carbon \n";
    public String q7_2 = "2. tone de praf si particule de gheata \n";
    public String q7_3 = "3. asteroizi si acid sulfuric";
    private String q7s[] = {q7_0, q7_1, q7_2, q7_3};

    public String q8_0 = "Motiv(ul/ele) instabilitatii scutului magnetic \n";
    public String q8_1 = "al planetei Uranus este: \n";
    public String q8_2 = "1. miscarea continua a campului gravitational \n";
    public String q8_3 = "2. lipsa alinierii axei \n";
    public String q8_4 = "3. lipsa alinierii axei, miscarea continua a \n";
    public String q8_5 = "campului gravitational";
    private String q8s[] = {q8_0, q8_1, q8_2, q8_3, q8_4, q8_5};

    public String q9_0 = "Planeta Neptun are numele zeului roman al: \n";
    public String q9_1 = "1. vulcanilor \n";
    public String q9_2 = "2. recoltei \n";
    public String q9_3 = "3. marilor";
    private String q9s[] = {q9_0, q9_1, q9_2, q9_3};

    public String q0_0 = "O treime din masa planetei pitice Pluto este \n";
    public String q0_1 = "formata din: \n";
    public String q0_2 = "1. gaze \n";
    public String q0_3 = "2. praf \n";
    public String q0_4 = "3. apa";
    private String q0s[] = {q0_0, q0_1, q0_2, q0_3, q0_4};

    private Alien myMenu;
    private String planetX = "";

    public Menu(Alien myMenu, String planet)
    {
        this.myMenu = myMenu;
        planetX = planet;
    }

    public Actor getMenu()
    {
        return myMenu;
    }

    public void act()
    {
        write(planetX);
    }
    
    public void display_text_if_correct(String x)
    {
        if (x == "Mercur" && Greenfoot.isKeyDown("1"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Venus" && Greenfoot.isKeyDown("3"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Pamant" && Greenfoot.isKeyDown("2"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Marte" && Greenfoot.isKeyDown("1"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Ceres" && Greenfoot.isKeyDown("1"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Jupiter" && Greenfoot.isKeyDown("2"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Saturn" && Greenfoot.isKeyDown("2"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Uranus" && Greenfoot.isKeyDown("3"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Neptun" && Greenfoot.isKeyDown("3"))
        {
            getWorld().removeObject(this);
        }
        if (x == "Pluto" && Greenfoot.isKeyDown("3"))
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }

    public void write(String x)
    {
        if (x == "Mercur")          {write_string(q1s, 40);     display_text_if_correct(x);}
        else if (x == "Venus")      {write_string(q2s, 40);     display_text_if_correct(x);}
        else if (x == "Pamant")     {write_string(q3s, 40);     display_text_if_correct(x);}
        else if (x == "Marte")      {write_string(q4s, 40);     display_text_if_correct(x);}
        else if (x == "Ceres")      {write_string(q5s, 40);     display_text_if_correct(x);}
        else if (x == "Jupiter")    {write_string(q6s, 40);     display_text_if_correct(x);}
        else if (x == "Saturn")     {write_string(q7s, 40);     display_text_if_correct(x);}
        else if (x == "Uranus")     {write_string(q8s, 40);     display_text_if_correct(x);}
        else if (x == "Neptun")     {write_string(q9s, 40);     display_text_if_correct(x);}
        else if (x == "Pluto")      {write_string(q0s, 40);     display_text_if_correct(x);}
    }

    public void write_string(String x[], int y)
    {
        GreenfootImage txt;
        GreenfootImage background = new GreenfootImage(back);
        for (int i = 0; i < x.length; i++)
        {
            txt = new GreenfootImage(x[i], 24, Color.BLACK, transparent);
            background.drawImage(txt, 40, y);
            y += 30;
        }
        setImage(background);
    }
}