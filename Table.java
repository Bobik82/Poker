public class Table {

   public Deck talia=new Deck();
    int idTable;
    public int Cws[];
    public tSock []pos;
    public int wpisowe;

    int blind;

  public int ilekart;
  public int x;
  
   public Table()
   {
       idTable=0;
       wpisowe=10;
       blind=2;
       talia.initDeck();
       seatInit(x);
   }

 /*  public Table(int id, int ile)
   {
       ID=id;
       miejsce=new tSock[ile];
       talia.initDeck();
       for(int i=0;i< ile;i++) {
           miejsce[i] = new tSock(i);
           ilekart = ile * 2 + 5;
           cTs=ilekart-5;
       }
       miejsce[ile-1]=new tSock();
   }*/

    void seatInit(int max)
    {
        pos=new tSock[max];
        Cws=new int[5];
        for(int i=0;i<pos.length;i++)
        {
            pos[i]=new tSock(i);
            pos[i].stack=wpisowe*100;
            ilekart=i*2+7;
        }
    }

   public void rozdajKarty()
   {
	  talia.wylosuj(ilekart);
	  int karta=0;
	  
	  for(int i=0;i<pos.length;i++)
	  {
		  pos[i].hand[0]=talia.wylosowane[karta];
		  karta++;
		  pos[i].hand[1]=talia.wylosowane[karta];
		  karta++;
	  }
	  karta=ilekart-5;
	  for(int j=0;j<Cws.length;j++)
	  {
		  Cws[j]=talia.wylosowane[karta];
		  karta++;
	  }
   }
  
   

   public void usiadz(int m, tSock pos[])
   {
       pos[m].zajete=true;
   }

  /*public void sprawdzMiejsca(tSock pos[], int ilosczajetych)
   {
       for(int i=0;i<pos.length;i++)
       {
           if (pos[i].zajete)
           {
               for (int j = 0; j < tableCrt.length; j++) {
                   talia.showCrt(tableCrt[j]);
                   System.out.println("");
               }
               ilosczajetych++;
           }

       }
   }
   public void wyswietlMiejsce(int m, tSock pos[])
   {
       pos[m].status();
       System.out.println(pos[m].stack);
       for(int i=0;i< tableCrt.length;i++)
       {
           talia.showCrt(tableCrt[i]);
           System.out.println("");
       }
   }*/
    public void wyswietl()
    {
    	int i;
            for(i=0;i< pos.length;i++)
            {
                pos[i].showhand(talia);
                System.out.println("");
            }
            for(int z = 0; Cws.length > z; z++)
            {
                talia.showCrt(Cws[z]);
            }
    }
}
