import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class MW_Map extends World
{
    public MW_Map()
    {
        super(1600, 900, 1);
        prepare();
    }
    
    private void prepare()
    {
        SolarSystemMap solarsystemmap = new SolarSystemMap();
        addObject(solarsystemmap, getWidth() / 2, 611);
        Counter counter = new Counter();
        addObject(counter, getWidth() / 2, 268);
        Cerinta();
        Previous previous = new Previous();
        addObject(previous,1508,75);
    }
    
    public void Cerinta()
    {
        GreenfootImage background = getBackground();
        String text = "Apasati pe tasta corespunzatoare planetei pentru a afla informatii despre aceasta.";
        Color transparent = new Color(0, 0, 0, 0);
        GreenfootImage txt_im = new GreenfootImage(text, 30, Color.WHITE, transparent);
        background.drawImage(txt_im, (getWidth() - txt_im.getWidth()) / 2, 30);
    }
}