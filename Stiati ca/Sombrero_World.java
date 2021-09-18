import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Sombrero_World extends World
{
    private String text0 = "Sombrero, este o galaxie care face parte din constelatia Fecioara.";
    private String text1 = "Aceasta galaxie este foarte cunoscuta pentru faptul ca poseda in centrul ei o masiva gaura neagra.";
    private String text2 = "Aceasta gaura neagra are masa echivalenta cu masa unui miliard de sori.";
    private String text3 = "Galaxia Sombrero este una dintre cele mai neobisnuite galaxii vizibile de pe Pamant.";
    private String text4 = "Inelul care inconjoara proeminenta galaxiei are toate elementele necesare pentru nasterea de noi stele.";
    private String[] texts = {text0, text1, text2, text3, text4};
    private Color transparent = new Color(0, 0, 0, 0);
    private GreenfootImage background = getBackground();

    public Sombrero_World()
    {    
        super(1600, 900, 1);
        Cerinta();
        prepare();
    }

    private void Cerinta()
    {
        GreenfootImage txt;
        int y = 60;
        for (int i = 0; i < texts.length; i++)
        {
            txt = new GreenfootImage(texts[i], 25, Color.WHITE, transparent);
            background.drawImage(txt, (getWidth() - txt.getWidth()) / 2, y);
            y += 30;
        }
    }
    
    private void prepare()
    {
        Previous previous2 = new Previous();
        addObject(previous2,1508,75);
    }
}