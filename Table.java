public class Table {

   public Deck talia=new Deck();
    int idTable;
    int []tableCrt=new int[5];

    public tSock []pos;
    float wpisowe;

    float blind;

    int cTs;
   int ilekart;

   public Table()
   {
       idTable=0;
       wpisowe=10;
       blind=2;
       talia.initDeck();
       seatInit(9);
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
        for(int i=0;i<pos.length;i++)
        {
            pos[i]=new tSock(i);
        }
    }

   public void rozdajKarty()
   {
       talia.wylosuj(ilekart);
       int m=0;
       int k=0;
       while (m< pos.length)
       {
           pos[m].hand[0]=talia.wylosowane[k];
           k++;
           pos[m].hand[1]=talia.wylosowane[k];
           m++;
           k++;
       }

       for(int kWs = 0; tableCrt.length > kWs; kWs++)
       {
           tableCrt[kWs]= talia.wylosowane[cTs+kWs];
       }
   }

   public void usiadz(int m, tSock pos[])
   {
       pos[m].zajete=true;
   }

   public void sprawdzMiejsca(tSock pos[], int ilosczajetych)
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
       pos[m].status(talia);
       System.out.println(pos[m].stack);
       for(int i=0;i< tableCrt.length;i++)
       {
           talia.showCrt(tableCrt[i]);
           System.out.println("");
       }
   }
    public void wyswietl()
    {
            for(int i=0;i<= pos.length;i++)
            {
                pos[i].status(talia);
                System.out.println("");
            }


    }
}
