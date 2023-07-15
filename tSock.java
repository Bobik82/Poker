

public class tSock {
    public int ID;

    public int posCrt;
    public int[] hand=new int[2];
    public boolean zajete=false;


    public tSock()
    {
        ID=999;

    }
    public tSock(int id)
    {
        ID=id;
        zajete=false;
    }

    public void setPosCrt(int karta)
    {
        posCrt=karta;
    }
    public void showMiejsca()
    {
        System.out.println("Miejsce: "+ID);
     if(!zajete)
     {
         System.out.println("Usiadz");
     }
     else
         System.out.println("Zajete");
    }
    public int showhand(Deck t)
    {
        t.showCrt(hand[0]);
        t.showCrt(hand[1]);
        return 0;
    }

    public void zajeteERR()
    {
        System.out.println("To miejsce jest zjete");
    }
}
