public class Main
{
    public static void main(String[] args)
    {
        Game g[]=new Game[1];
        Player []p=new Player[6];
        p[0]=new Player(0, "Adrian");
        p[1]=new Player(1, "Lukasz");
        p[2]=new Player(2, "Stefan");
        p[3]=new Player(3, "Adam");
        p[4]=new Player(4, "Dupa");
        p[5]=new Player(5, "Chuj");

        g[0]=new Game("Poker Night",12, 2, 1, p);


        p[0].menu(g);



    }
}

