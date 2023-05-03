import java.awt.*;

public class Game {

    Table []t;
    String nazwa;
    int maxPlayers;

    Player []gracze;
    float wpisowe;
    float stawki;

    public Game(String n, int lgraczy, float w, float s, Player[]p)
    {
        t=new Table[2];
        nazwa=n;
        maxPlayers=lgraczy;
        wpisowe=w;
        stawki=s;


        gracze=p;

        for(int i=0;i<t.length;i++)
        {
            int id=i;
            t[i]=new Table(id, 6);
            for (int j=0;j<gracze.length;j++)
            {
                gracze[j].T=t[i];
                t[i].sprawdzMiejsca();
            }
        }
    }

    public void waitToPlayers(Table t)
    {
        System.out.println("oczekiwanie");
        t.sprawdzMiejsca();
        if(t.ilosczajetych>=2)
        preflop(t);
        else
        {
            t.sprawdzMiejsca();
        }
    }


    public void preflop(Table t)
    {
        for(int i=0;i<t.miejsce.length;i++)
        if(t.miejsce[i].zajete==true)
        {
            t.rozdajKarty();
        }
        for(int i=0;i< gracze.length;i++)
        gracze[i].ruch();
    }

    public void showTables(String name)
    {
        for (int i=0;i<t.length;i++)
        {
            System.out.println("Stol: "+t[i].ID);
        }
    }

    public void showTable(Table t)
    {
            t.wyswietl();
    }

}
