

public class Game
{
	
    public Table t=new Table();
    public int tura=t.tura;
    public Game(int iloscgraczy)
    {
     gameInit(iloscgraczy);
 
     //t.pos[0].zajete=false;
     //t.pos[1].zajete=false;
     //t.pos[2].zajete=false;
     t.rozdajKarty();
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
   
    
  /*public  void graj(int player)
    {
    		t.wyswietlMiejsce(player);
    		System.out.println();
    		t.ruch(player);
    }*/
  public void next(int player)
  {
	  t.nexture(player, tura);
  }
}

    
