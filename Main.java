import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	Game g=new Game(5);
    	//System.out.println("MENU");
    	//System.out.println("0-Rozpocznij  rozgrywke 1-Pokaz cale rozdanie");
    	//int wybormenu = scan.nextInt();
    	//switch(wybormenu) 
    		//{
    	//case 0:
    		//System.out.println("Wybierz miejsce(0-4 max): ");
        	//int wyborgracza = scan.nextInt();
             //switch(wyborgracza)
             //{
             //case 0:
            	 //g.graj(0);
            	 //break;
             //case 1:
            	 //g.graj(1);
            	 //break;
             //case 2:
            	 g.graj(2);
            	 //break;
             //case 3:
            	 g.graj(3);
            	 //break;
             //case 4:
            	 g.graj(4);
            	 //break;
            	 g.graj(0);
            	 g.graj(1);
            	 System.out.println("BOARD:");
            	 System.out.println();
            	 g.t.wyswietlFlop();
            	 System.out.println();
            	 System.out.println();
            	 for (int i=0; i<5; i++)
            	 {
            		 g.graj(i);
            	 }
            	 System.out.println("BOARD:");
            	 System.out.println();
            	 g.t.wyswietlTurn();
            	 System.out.println();
            	 System.out.println();
            	 for (int i=0; i<5; i++)
            		 g.graj(i);;
            	 System.out.println("BOARD:");
            	 System.out.println();
            	 g.t.wyswietlRiver();
            	 System.out.println();
            	 System.out.println();
            	 for (int i=0; i<5; i++)
            		 g.graj(i);
            	 System.out.println();
            	 System.out.println("SHOWDOWN:");
            	 System.out.println();
            	 g.t.wyswietl();
             //}          
    		//break;
    	//case 1:
    		//g.t.wyswietl();
    		//break;
    		//}        
         //pobranie blindów
        System.out.println();      
        //g.t.wyswietl();	//wypisanie po pobraniu blindów
    /*/    
        int wybor;
        System.out.println();
        System.out.print("EP1:	1. Pas	2. Sprawdzenie	3. Podbicie");
        Scanner scan = new Scanner(System.in);
        wybor = scan.nextInt();
        if (wybor==2) //sprawdzenie
        {   
        }/*/
    }
    public  void graj(int player)
    {
        	Table t=new Table();
    		t.wyswietlMiejsce(player);
    		System.out.println();
    		t.ruch(player);
    }
}
