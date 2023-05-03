public class Table {

    Deck talia=new Deck();
    tSock[] miejsce;

    int ilosczajetych;
    int ID;

    int []tableCrt=new int[5];

    float wpisowe;

    float blind;

    int cTs=0;
   int ilekart=0;

   public Table(int id)
   {
       ID=id;
       miejsce=new tSock[2];
       talia.initDeck();
       for(int i=0;i< 2;i++) {
           miejsce[i] = new tSock(i);
           ilekart = 2 * 2 + 5;
           cTs=ilekart-5;
       }
   }
   public Table(int id, int ile)
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
   }

   public void rozdajKarty()
   {
       talia.wylosuj(ilekart);
       int m=0;
       int k=0;
       while (m< miejsce.length)
       {
           miejsce[m].hand[0]=talia.wylosowane[k];
           k++;
           miejsce[m].hand[1]=talia.wylosowane[k];
           m++;
           k++;
       }

       for(int kWs=0;kWs<tableCrt.length;kWs++)
       {
           tableCrt[kWs]= talia.wylosowane[cTs+kWs];
       }
   }

   public void usiadz(int m, Player p)
   {
       p.T.miejsce[m]=miejsce[m];
       miejsce[m].zajete=true;
       miejsce[m].stack=p.Stack;
   }

   public void sprawdzMiejsca()
   {
       for(int i=0;i<miejsce.length;i++)
       {
           if (miejsce[i].zajete)
               ilosczajetych++;
       }
   }
   public void wyswietlMiejsce(int m)
   {
       miejsce[m].status(talia);
       System.out.println(miejsce[m].stack);
       for(int i=0;i< tableCrt.length;i++)
       {
           talia.showCrt(tableCrt[i]);
           System.out.println("");
       }
   }
    public void wyswietl()
    {
        for(int i=0;i< miejsce.length;i++)
        {
            if(miejsce[i]!=null) {
                miejsce[i].status(talia);
                System.out.println("");

            }
            else
                System.out.println("Puste miejsce");
        }


    }
}
