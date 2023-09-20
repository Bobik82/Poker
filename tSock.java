

public class tSock {
    public int ID;
    public int[] hand=new int[2];
    public boolean zajete=false;
    public int position;
    public int stack;

    public int decyzja;
    public int zaklad;

    public tSock()
    {
        ID=999;

    }
    public tSock(int id)
    {
        ID=id;
        zajete=true;
    }

    public int status(int id)
    {
        int ile=0;

        if(this.zajete==true)
            return ile;
        else return 0;
    }
    public void status()
    {
        System.out.println("Miejsce: "+ID);
     if(!zajete)
     {
         System.out.println("Zajete");
     }
     else
         System.out.println("Usiadz");
    }
    
    public void Add_crt(int nrcrt, int crt)
    {
    	this.hand[nrcrt]=crt;
    }
    
    public int showhand(Deck t)
    {
    	switch(ID)
    	{
    	case 0:
    		System.out.print("SB: ");
    		break;
    	case 1:
    		System.out.print("BB: ");
    		break;
    	case 2:
    		System.out.print("EP1: ");
    		break;
    	case 3:
    		System.out.print("EP2: ");
    		break;
    	case 4:
    		System.out.print("MP1: ");
    		break;
    	case 5:
    		System.out.print("MP2: ");
    		break;
    	case 6:
    		System.out.print("MP3: ");
    		break;
    	case 7:
    		System.out.print("CO: ");
    		break;
    	case 8:
    		System.out.print("BU: ");
    		break;
    	}
        t.showCrt(hand[0]);
        t.showCrt(hand[1]);
        System.out.print(stack);
        return 0;
    }
}
