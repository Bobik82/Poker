import java.awt.*;

public class Game
{

    public Table t=new Table();
    public Game()
    {
     gameInit(9);
 
     //t.pos[0].zajete=false;
     //t.pos[1].zajete=false;
     //t.pos[2].zajete=false;
     t.rozdajKarty();
     t.wyswietl();
    
    }

   void gameInit(int ileMiejsc)
    {
        t.seatInit(ileMiejsc);
    }


    void seatsStat()
    {
        for(int i=0;i<t.pos.length;i++)
        {
        t.pos[i].status();
        }
        System.out.println();
    }
}
