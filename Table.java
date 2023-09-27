import java.util.Scanner;
public class Table {
	
	Scanner scan = new Scanner(System.in);
	int wybor;

   public Deck talia=new Deck();
    int idTable;
    public int Cws[];
    public Gracz []pos;
    public int wpisowe;
    public static int SB=30;
    public static int BB=60;

   public int pula;
   public int tura=0;
  public int ilekart;
  public int x;
  
   public Table()
   {
       idTable=0;
       wpisowe=10;
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
        pos=new Gracz[max];
        Cws=new int[5];
        for(int i=0;i<pos.length;i++)
        {
            pos[i]=new Gracz(i);
            pos[i].position=i;
            pos[i].stack=wpisowe*100;
            ilekart=i*2+7;
            if(pos[i].position==0)
        	{
        		pos[i].stack=pos[i].stack-SB;
        		pula=pula+SB;
        	}
        	else if(pos[i].position==1)
        	{
        		pos[i].stack=pos[i].stack-BB;
        		pula=pula+BB;
        	}
        }
    }
    public void preflop(int player)
    {
    	wyswietlMiejsce(player);
		System.out.println();
		ruch(player);
    }
    /*public void flop(int player)
    {
    	wyswietlMiejsce(player);
		System.out.println();
		wyswietlFlop();
		System.out.println();
		ruch(player);
    }*/
    /*public void turn(int player)
    {
    	wyswietlMiejsce(player);
		System.out.println();
		wyswietlTurn();
		System.out.println();
		ruch(player);
    }
    public void river(int player)
    {
    	wyswietlMiejsce(player);
		System.out.println();
		wyswietlRiver();
		System.out.println();
		ruch(player);
    }*/
    	
    public void nexture(int player,int  t)
    {
    	/*tura=t;
    	switch(tura)
    	{
    	case 0:*/
    		preflop(player);
    		/*break;
    	case 1:
    		//flop(player);
    		break;
    	case 2:
    		//turn(player);
    		break;
    	case 3:
    		//river(player);
    		break;
    		default:
    			tura=0;
    			break;
    	}
    	tura++;*/
    }
    public void ruch(int player)
    {
        System.out.println();
        System.out.print(pos[player].position+":	0. Pas	1. Sprawdzenie	2. Podbicie");
			wybor = scan.nextInt();
        switch(wybor)
        {
        case 0:
        	Fold(player);
        	System.out.println("FOLD");
        	break;
        case 1:
        	Call(player);
        	System.out.println("CALL");
        	//nexture(player, tura);
        	break;
        case 2:
        	Race(player);
        	System.out.println("Raise");
        	//nexture(player, tura);
        	break;
        default:
        	System.out.println("Bledny ruch");
        	break;
        }
    }
    
   public void Fold(int player) 
   {
	   
   }
   public void Call(int player) 
   {
	   pos[player].stack=pos[player].stack-SB;
	   pula=pula+SB;
   }
   public void Race(int player) 
   {
	   pos[player].stack=pos[player].stack-BB;
	   pula=pula+BB;
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
   
  
   

   public void usiadz(int m, Gracz pos[])
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
   }*/
   public void wyswietlMiejsce(int Gracz)
   {
     pos[Gracz].showhand(talia);
     System.out.println();
     System.out.println("Pula: "+pula);
   }
   
   public void wyswietlFlop()
   {
	   for(int i=0;i<3;i++)
	   {
		   talia.showCrt(Cws[i]);
	   }
   }
   public void wyswietlTurn()
   {
	   for(int i=0;i<4;i++)
	   {
		   talia.showCrt(Cws[i]);
	   }
   }
   
   public void wyswietlRiver()
   {
	   for(int i=0;i<5;i++)
	   {
		   talia.showCrt(Cws[i]);
	   }
   }
   
   
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
            System.out.println();
            System.out.println("Pula: "+pula);
    }
}
