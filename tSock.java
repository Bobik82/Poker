

public class tSock {
    public int ID;
    public int[] hand=new int[2];
    public boolean zajete=false;
    public int position;
    public float stack;

    public int decyzja;
    public int zaklad;

    public tSock()
    {
        ID=999;
        hand[0]=-1;
        hand[1]=-1;
    }
    public tSock(int id)
    {
        ID=id;
        zajete=false;
    }

    public int status(Deck t)
    {
        if(!this.zajete)
        {
            System.out.print("Usiadz");
        }
        else
        {
                System.out.print("Zajete");
        }
        return 0;
    }
    public int showhand(Deck t)
    {
        t.showCrt(hand[0]);
        t.showCrt(hand[1]);
        return 0;
    }
}
