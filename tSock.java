

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

    }
    public tSock(int id)
    {
        ID=id;
        zajete=true;
    }

    public void status(Deck d)
    {
        System.out.println("Miejsce: "+ID);
     if(!zajete)
     {
         System.out.println("Zajete");
     }
     else
         System.out.println("Usiadz");
    }
    public int showhand(Deck t)
    {
        t.showCrt(hand[0]);
        t.showCrt(hand[1]);
        return 0;
    }
}
