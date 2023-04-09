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

    public int losuj()
    {
        Random rand=new Random();
        return rand.nextInt(52);
    }


    public void wylosuj(int ile)
    {
        int i=0;
        int los;
        this.wylosowane = new int[ile];
        do
        {
            los=losuj();
                if(wylosowane[i]==los)
                {
                    los=losuj();
                }
                else
                {
                    wylosowane[i]=los;
                }
                i++;
        }
        while(i<ile);
    }
}
