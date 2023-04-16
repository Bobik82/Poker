import java.awt.*;

public class tSock {
    public int ID;
    public int[] hand=new int[2];
    public boolean zajete;
    public int position;

    public tSock(int id)
    {
        ID=id;
        zajete=true;
    }

    public void status(Deck t)
    {
        if(!this.zajete)
        {
            System.out.print("Usiadz");
        }
        else
        {
            if(hand!=null)
            {
                t.showCrt(hand[0]);
                t.showCrt(hand[1]);
            }
            else
                System.out.print("Bez kart");
        }
    }
}
