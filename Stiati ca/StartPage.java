import greenfoot.*;


public class StartPage extends World
{
    private Color transparent = new Color(0, 0, 0, 0);
    private GreenfootImage background = getBackground();

    private String text0 = "Extraterestrul nostru are nevoie de o noua casa, deoarece \n";
    private String text1 = "supernova unde a locuit a explodat. Ajuta-l sa gaseasca dru- \n";
    private String text2 = "mul spre alte planete, amintindu-si informatii despre spatiu. \n";
    private String text3 = "Indruma-l prin harta principala pentru a memora informatii \n";
    private String text4 = "despre corpurile ceresti. \n";
    private String text5 = "Cand esti gata, da click pe sageata din stanga jos a hartii prin-";
    private String text6 = "cipale si testeaza-i amintirile extraterestrului. \n";
    private String text7 = "El poate fi indrumat prin sagetile stanga, dreapta. \n";
    private String text8 = "Apasa spacebar pentru a continua. ";

    private String[] texts = {text0, text1, text2, text3, text4, text5, text6, text7, text8};
    public StartPage()
    {
        super(1600, 900, 1);
        Cerinta();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space") == true)
            Greenfoot.setWorld(new MyWorld());
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
}
