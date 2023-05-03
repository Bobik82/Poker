import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Player {
    int ID;
    String Name;
    float Cash;

    float Stack;

    int gra;
    int stol;
    int sock;

    int m;
    Game G;
    Table T;
    boolean running=true;

    Scanner scanner=new Scanner(System.in);

    public Player(int id, String n)
    {
        ID=id;
        Name=n;
        Cash=30000;

    }

    public void menu(Game []g) {
        while (running) {
            System.out.println(this.Name + "         " + this.Cash);
            for (int i = 0; i < g.length; i++) {
                System.out.println(g[i].nazwa);
            }
            System.out.println("Wybierz gre: ");
            gra = scanner.nextInt();
            switch (gra) {
                case 0 -> G = g[0];


                case 1 -> G = g[1];


                default -> running = false;
            }
            if (G == g[0]) {
                for (int i = 0; i < G.t.length; i++) {
                    System.out.println(G.t[i].ID);
                }
                System.out.println("Wybierz stol: ");
                stol = scanner.nextInt();
                switch (stol) {
                    case 0 -> T=G.t[0];
                    case 1 -> T=G.t[1];
                    default -> running = false;
                }
            } else {
                for (int i = 0; i < G.t.length; i++) {
                    System.out.println(G.t[i].ID);
                }
                System.out.println("Wybierz stol: ");
                stol = scanner.nextInt();
                switch (stol) {
                    case 0 -> T=G.t[0];
                    case 1 -> T=G.t[1];
                    default -> running = false;
                }
            }
            sitting(T);
        }
    }
    public void sitting(Table t)
    {
        t.wyswietl();
        System.out.println("Wybierz miejsce: ");
        sock=scanner.nextInt();
        switch (sock)
        {
            case 0->t.usiadz(0, this);
            case 1->t.usiadz(1, this);
            case 2->t.usiadz(2, this);
            case 3->t.usiadz(3, this);
            case 4->t.usiadz(4, this);
            case 5->t.usiadz(5, this);
                default->running=false;
        }
        System.out.println("Wielkosc stacka: ");
        float stack;
        stack=scanner.nextFloat();
        m=sock;
        Stack=stack;
        Cash=Cash-stack;
        game();
    }

    public void game()
    {

        T.wyswietlMiejsce(m);
        G.waitToPlayers(T);
    }

    public void ruch()
    {
        int d=scanner.nextInt();
        float z=scanner.nextFloat();
        T.wyswietlMiejsce(T.miejsce[m].status(T.talia));
        System.out.println("1-Pas ");
        System.out.println("2-Sprawdz ");
        System.out.println("3-Zaklad ");
        System.out.println("Podejmij decyzje: ");
        T.miejsce[T.miejsce[m].ID].decyzja=d;
        switch(d)
        {
            case 1->System.out.println("1-Pas ");
            case 2->System.out.println("1-Sprawdzam ");
            case 3->System.out.println("1-Podbijam ");
        }
    }
}
