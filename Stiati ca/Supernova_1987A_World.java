import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Supernova_1987A_World extends World
{
    private Color transparent = new Color(0, 0, 0, 0);
    private GreenfootImage background = getBackground();
    private String text0 = "Supernova 1987A";
    private String text1 = "Supernova este o explozie stelara care este extrem de luminoasa si poate fi mult mai stralucitoare decat o intreaga galaxie.";
    private String text2 = "O supernova, dupa explozia sa, poate emite tot atata energie cat emite Soarele pe toata durata vietii sale.";
    private String text3 = "Cauza stralucirii mai intense este datorata productiei excesive de heliu, din straturile exterioare ale corpului ceresc respectiv.";
    private String[] texts = {text0, text1, text2, text3};

    public Supernova_1987A_World()
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
            txt = new GreenfootImage(texts[i], 30, Color.WHITE, transparent);
            background.drawImage(txt, (getWidth() - txt.getWidth()) / 2, y);
            y += 30;
        }
    }

    private void prepare()
    {
        Previous previous3 = new Previous();
        addObject(previous3,1508,75);
    }
}
