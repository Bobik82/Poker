public class Main {

    public static void main(String[] args) {

        Deck a=new Deck();

        a.initDeck();
       //a.showAll();
        a.wylosuj(23);
        System.out.println();
        for(int i=0; i<a.wylosowane.length;i++)
        {
            a.talia[a.wylosowane[i]].show();
            if(i%2==1)
                System.out.println();
        }
    }

}

