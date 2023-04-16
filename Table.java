public class Table {

    Deck talia=new Deck();
    tSock[] miejsce=new tSock[9];

    int []tableCrt=new int[5];

    int cTs=0;
   int ilekart=0;
   public Table(int ile)
   {
       talia.initDeck();
       for(int i=0;i< ile;i++) {
           miejsce[i] = new tSock(i);
           ilekart = ile * 2 + 5;
           cTs=ilekart-5;
       }
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


   public void wyswietlMiejsce(int m)
   {
       miejsce[m].status(talia);
       System.out.println();
       for(int i=0;i< tableCrt.length;i++)
       {
           talia.showCrt(tableCrt[i]);
           System.out.print(" ");
       }
   }
    public void wyswietl()
    {
        for(int i=0;i< miejsce.length;i++)
        {
            if(miejsce[i]!=null) {
                miejsce[i].status(talia);
                System.out.println();
            }
            else
                System.out.println("Puste miejsce");
        }

        for(int i=0;i< tableCrt.length;i++)
        {
            talia.showCrt(tableCrt[i]);
            System.out.print(" ");
        }
    }
}
