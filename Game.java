import java.awt.*;

public class Game
{

    public Table t=new Table(5);
    public Game()
    {
     gameInit(5, 20);
     t.pos[0].zajete=false;
     t.pos[1].zajete=false;
     seatsStat();
    }

   void gameInit(int ileMiejsc, float w)
    {
        t.seatInit(ileMiejsc);
        t.wpisowe=w;
    }


    void seatsStat()
    {
        System.out.println("Wpisowe do stolika: "+t.wpisowe);
        for(int i=0;i<t.pos.length;i++)
            t.pos[i].showMiejsca();
    }



    /*void graj()
    {
        int i=0;
    while(i<=9)
        {
            t.wyswietl(miejsce);
            i++;
        }
    }*/
}
