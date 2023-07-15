public class Table
{
  int tableID;

  public tSock []soc;

  public Deck talia=new Deck();

  public Table(int id, int ile)
  {
      tableID=id;
      initSocs(ile);
      talia.initDeck();
  }

  public void initSocs(int miejsce)
  {
      soc=new tSock[miejsce];
      for (int i=0; i< soc.length;i++)
      {
          soc[i]=new tSock(i);
      }
  }


  public void usiadz(int id)
  {
      if(soc[id].zajete)
          soc[id].zajeteERR();
      soc[id].zajete=true;
  }

  public int graczy()
  {
      int ile=0;
      for (int i=0;i< soc.length;i++)
      {
          if((soc[i].zajete==true))
              ile++;
      }
      return ile;
  }

  public int losujKolejnosc()
  {
    for(int i=0;i<graczy();i++)
    {


    }
  }

  public void infoTable()
  {
      System.out.println("Stól ID: "+tableID);
      System.out.println("Ilosc graczy: "+graczy()+"/"+ soc.length);

  }
  public void showTable()
  {
      for (int i=0;i< soc.length;i++)
      {
          soc[i].showMiejsca();
      }
  }

}
