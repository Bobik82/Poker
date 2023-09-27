 import java.util.Random;

public class Deck{

    Card[] talia=new Card[52];
    int[] wylosowane;
    int k=0;
    public void initDeck()
    {
        while(k<talia.length)
        {
            for(int j=0;j<4;j++)
            {
                for(int i=0;i<13;i++)
                {
                    this.talia[k]=new Card(i,j);
                    k++;
                }
            }
        }
    }

    public void showAll()
    {
        for(k=0;k<talia.length;k++)
        {
            if(k%13==0)
                System.out.println();
            talia[k].show();
        }
    }

    public void showCrt(int i)
    {
        talia[i].show();
    }

    public int losuj()
    {
        Random rand=new Random();
        return rand.nextInt(52);
    }

    boolean czyWylosowana(int los, int tab[], int ile)
    {
        if(ile<0)
            return false;
        int i=0;
        do
        {
            if(tab[i] == los)
                return true;
            i++;
        }while(i<ile);
        return false;
    }
    public void wylosuj(int ile)
    {
        int wylosowanych=0;
        int los;
        this.wylosowane = new int[ile];
        do
        {
          los=losuj();
           if(czyWylosowana(los, wylosowane, wylosowanych)==false)
           {
               wylosowane[wylosowanych]=los;
               wylosowanych++;
           }
        }
        while(wylosowanych<ile);
    }
}
