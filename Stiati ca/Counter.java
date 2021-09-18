import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage back = getImage();

    public String text_Mercur0 = "Mercur \n";
    public String text_Mercur1 = "Majoritatea craterelor de pe Mercur sunt numite dupa scriitori \n ";
    public String text_Mercur2 = "si artisti faimosi, precum „Eminescu”, „Spiru Haret” „Johann \n ";
    public String text_Mercur3 = "Sebastian Bach”, „Salvador Dali” etc. \n ";
    public String text_Mercur4 = "Sunt prezente formatiuni de gheata la polii planetei.";
    private String[] textsMer = {text_Mercur0, text_Mercur1, text_Mercur2, text_Mercur3, text_Mercur4};

    public String text_Venus0 = "Venus \n";
    public String text_Venus1 = "Descoperire: Planeta a fost descoperita in antichitate. \n";
    public String text_Venus2 = "Nume: Venus a fost numit dupa zeita romana a dragostei si a \n";
    public String text_Venus3 = "frumusetii la romani. \n";
    public String text_Venus4 = "Curiozitati: Venus are masa si structura asemanatoare cu cele \n";
    public String text_Venus5 = "ale Pamantului, dar climatul acesteia nu este unul favorabil. \n";
    public String text_Venus6 = "Atmosfera de pe Venus este creata din acid sulfuric mortal, \n";
    public String text_Venus7 = "vanturi puternice si fulgere. \n";
    public String text_Venus8 = "Pe Venus, Soarele rasare de la vest si apune la est. \n";
    public String text_Venus9 = "Venus este cea mai luminoasa planeta din sistemul solar. \n";
    private String[] textsV = {text_Venus0, text_Venus1, text_Venus2, text_Venus3, text_Venus4, text_Venus5, text_Venus6, text_Venus7, text_Venus8, text_Venus9};

    public String text_Pamant0 = "Pamant \n";
    public String text_Pamant1 = "Rotatia pamantului incetineste treptat, ceea ce determina ca \n";
    public String text_Pamant2 = "peste 140 mil. ani, ziua va avea 25 de ore. \n";
    public String text_Pamant3 = "Este singura planeta care nu are denumirea unei zeitati ro-";
    public String text_Pamant4 = "mane.";
    private String[] textsPam = {text_Pamant0, text_Pamant1, text_Pamant2, text_Pamant3, text_Pamant4};

    public String text_Marte0 = "Marte \n";
    public String text_Marte1 = "Descoperire: Planeta Marte este cunoscuta din antichitate. \n";
    public String text_Marte2 = "Nume: Numele planetei provine de la zeul roman al razboiului. \n";
    public String text_Marte3 = "Curiozitati: Numele satelitilor proprii: Phobos si Demos, au \n";
    public String text_Marte4 = "fost denumiti astfel dupa fii zeului razboinic la greci care in- \n";
    public String text_Marte5 = "seamna teama, respectiv panica. \n";
    public String text_Marte6 = "Se presupune ca acesti sateliti au fost doi asteroizi care au \n";
    public String text_Marte7 = "fost captivati de gravitatia lui Marte. \n";
    public String text_Marte8 = "Se presupune ca acum 3,5 miliarde de ani, Marte a fost cuprin- \n";
    public String text_Marte9 = "sa de inundatii. \n";
    private String[] textsM = {text_Marte0, text_Marte1, text_Marte2, text_Marte3, text_Marte4, text_Marte5, text_Marte6, text_Marte7, text_Marte8, text_Marte9};

    public String text_Ceres0 = "Ceres: \n";
    public String text_Ceres1 = "Descoperire: Giuseppe Piazzi, 1 ianuarie 1801 \n";
    public String text_Ceres2 = "Nume: Asteroidul Ceres a fost numit dupa zeita romana a re- \n";
    public String text_Ceres3 = "coltei si graului. \n";
    public String text_Ceres4 = "Curiozitati:  Ceres a fost considerata planeta, dupa care a fost \n";
    public String text_Ceres5 = "clasificata in randul asteroizilor. Pe 24 august 2006, Ceres a \n";
    public String text_Ceres6 = "fost redenumita ca fiind o planeta pitica.";
    private String[] textsC = {text_Ceres0, text_Ceres1, text_Ceres2, text_Ceres3, text_Ceres4, text_Ceres5, text_Ceres6};

    public String text_Jupiter0 = "Jupiter \n";
    public String text_Jupiter1 = "Magnetosfera planetei este cea mai mare din sistemul solar, \n";
    public String text_Jupiter2 = "de 20x mai mare decat a Pamantului. \n";
    public String text_Jupiter3 = "„Marea Pata Rosie”, o furtuna de 2x mai mare decat Pamantul, \n";
    public String text_Jupiter4 = "dateaza de mai mult de 150 de ani.";
    private String[] texts_Jup = {text_Jupiter0, text_Jupiter1, text_Jupiter2, text_Jupiter3, text_Jupiter4};

    public String text_Saturn0 = "Saturn \n";
    public String text_Saturn1 = "Descoperire: Planeta a fost descoperita in antichitate, dar Gali- \n";
    public String text_Saturn2 = "leo Galilei a avut contributii mari in cercetarea planetei. \n ";
    public String text_Saturn3 = "Nume: Astrul a fost numit dupa zeul roman al agriculturii. \n";
    public String text_Saturn4 = "Curiozitati: Saturn este un astru imens format din gaze \n";
    public String text_Saturn5 = "Saturn este mai voluminous, dar masa este mai mica in com- \n";
    public String text_Saturn6 = "paratie cu alte planete formate din roci. \n";
    public String text_Saturn7 = "Inelele spectaculoase ale lui Saturn sunt constituite din tone \n";
    public String text_Saturn8 = "de praf si particule de gheata, formand o masa de bulgari de \n";
    public String text_Saturn9 = "materie prafuita. \n";
    private String[] textsS = {text_Saturn0, text_Saturn1, text_Saturn2, text_Saturn3, text_Saturn4, text_Saturn5, text_Saturn6, text_Saturn7, text_Saturn8, text_Saturn9};

    public String text_Uranus0 = "Uranus \n";
    public String text_Uranus1 = "Are o inclinatie extrema, de 98 grade fata de axa, iar campul \n";
    public String text_Uranus2 = "magnetic este inclinat la 60 grade. Lipsa alinierii axei cu \n";
    public String text_Uranus3 = "campul magnetic si miscarea continua a celui din urma deter- \n";
    public String text_Uranus4 = "mina instabilitatea scutului magnetic impotriva vanturilor so- \n";
    public String text_Uranus5 = "lare.";
    private String[] texts_Ur = {text_Uranus0, text_Uranus1, text_Uranus2, text_Uranus3, text_Uranus4, text_Uranus5};

    public String text_Neptun0 = "Neptun: \n";
    public String text_Neptun1 = "Descoperire: Neptun a fost descoperita de astronomii Urbain \n";
    public String text_Neptun2 = "Le Verrier, John Couch Adams, Johann Gottfried Galle. \n";
    public String text_Neptun3 = "Nume: Neptun a fost numita dupa zeul roman al marilor. \n";
    public String text_Neptun4 = "Asezare: Neptun este cea de-a opta planeta de la Soare in sis- \n";
    public String text_Neptun5 = "temul nostru solar. \n";
    public String text_Neptun6 = "Curiozitati: Neptun este o planeta formata din gaze. \n";
    public String text_Neptun7 = "Atmosfera plina de metan face ca aceasta sa fie cea mai van- \n";
    public String text_Neptun8 = "toasa planeta. \n";
    public String text_Neptun9 = "Uneori, vanturile pot trece de valoarea de 2000 km/ora.";
    private String[] textsN = {text_Neptun0, text_Neptun1, text_Neptun2, text_Neptun3, text_Neptun4, text_Neptun5, text_Neptun6};

    public String text_Pluto0 = "Pluto \n";
    public String text_Pluto1 = "Este cea mai mare planeta pitica, iar o treime din masa aces- \n";
    public String text_Pluto2 = "teia contine apa; a fost descoperita in 1930. \n";
    public String text_Pluto3 = "Nu si-a parcurs intreaga orbita de cand a fost descoperita, de- \n";
    public String text_Pluto4 = "oarece sunt necesari 287 de ani pamantesti pentru a o com-. \n";
    public String text_Pluto5 = "pleta.";
    private String[] texts_Pl = {text_Pluto0, text_Pluto1, text_Pluto2, text_Pluto3, text_Pluto4, text_Pluto5};

    public Counter()
    {
        GreenfootImage table = getImage();
        table.rotate(90);
        table.scale(600, 400);
    }

    public void act()
    {
        GreenfootImage background = new GreenfootImage(back);
        String text = "";
        GreenfootImage txt;
        int y = 60;
        if (Greenfoot.isKeyDown("1") == true)
        {
            for (int i = 0; i < textsMer.length; i++)
            {
                txt = new GreenfootImage(textsMer[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("2") == true)
        {
            for (int i = 0; i < textsV.length; i++)
            {
                txt = new GreenfootImage(textsV[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("3") == true)
        {
            for (int i = 0; i < textsPam.length; i++)
            {
                txt = new GreenfootImage(textsPam[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("4") == true)
        {
            for (int i = 0; i < textsM.length; i++)
            {
                txt = new GreenfootImage(textsM[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("5") == true)
        {
            for (int i = 0; i < textsC.length; i++)
            {
                txt = new GreenfootImage(textsC[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("6") == true)
        {
            for (int i = 0; i < texts_Jup.length; i++)
            {
                txt = new GreenfootImage(texts_Jup[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("7") == true)
        {
            for (int i = 0; i < textsS.length; i++)
            {
                txt = new GreenfootImage(textsS[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("8") == true)
        {
            for (int i = 0; i < texts_Ur.length; i++)
            {
                txt = new GreenfootImage(texts_Ur[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("9") == true)
        {
            for (int i = 0; i < textsN.length; i++)
            {
                txt = new GreenfootImage(textsN[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
        else if (Greenfoot.isKeyDown("0") == true)
        {
            for (int i = 0; i < texts_Pl.length; i++)
            {
                txt = new GreenfootImage(texts_Pl[i], 24, Color.BLACK, transparent);
                background.drawImage(txt, 20, y);
                y += 30;
            }
            setImage(background);
        }
    }
}