import java.awt.*;

public class Game
{

    public Table t=new Table();
    public Game()
    {
     gameInit(5, 20);
     seatsStat();
    }

   void gameInit(int ileMiejsc, float w)
    {
        t.seatInit(ileMiejsc);
        t.wpisowe=w;
    }


    void seatsStat()
    {
        for(int i=0;i<t.pos.length;i++)
        t.pos[i].status(t.talia);
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
