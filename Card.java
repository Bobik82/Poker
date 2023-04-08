
public class Card {
    int v;
    int c;
    public Card(int i, int j)
    {
        this.v=i;
        this.c=j;
    }

    public void show()
    {
        switch (this.v) {
            case 0 -> System.out.print(2);
            case 1 -> System.out.print(3);
            case 2 -> System.out.print(4);
            case 3 -> System.out.print(5);
            case 4 -> System.out.print(6);
            case 5 -> System.out.print(7);
            case 6 -> System.out.print(8);
            case 7 -> System.out.print(9);
            case 8 -> System.out.print("T");
            case 9 -> System.out.print("J");
            case 10 -> System.out.print("Q");
            case 11 -> System.out.print("K");
            case 12 -> System.out.print("A");
        }


        switch (this.c) {
            case 0 -> System.out.print("Kier");
            case 1 -> System.out.print("Karo");
            case 2 -> System.out.print("Pik");
            case 3 -> System.out.print("Trefl");
        }
        System.out.print(" ");
    }

}
