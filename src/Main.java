import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Informe a quantidade de bolas desejadas no cesto");
        int qntBallsBasket = n.nextInt();


        Basket basket = new Basket(qntBallsBasket);
        System.out.println(" Para criar nova criança digite: 1 ");
        System.out.println("Caso queira encerrar o programa digite: 2");
        int item = n.nextInt();
        //List<ThreadChild> childCount = new ArrayList<>();

        do{

            System.out.println("- Informe o nome da criança: ");
            String idThread = n.next();
            System.out.println("- Criança estará com bola? (S/N) ");
            String ball = n.next();
            System.out.println("- Informe quanto tempo a criança brincará: (s) ");
            int playingTime = n.nextInt();
            System.out.println("- Informe quanto tempo a criança descansará: (s) ");
            int quietTime = n.nextInt();
            AddChild addChild = new AddChild(idThread, ball, playingTime, quietTime);
            addChild.newChild();

            System.out.println(" Para criar nova criança digite: 1 ");
            System.out.println("Caso queira encerrar o programa digite: 2");
            item = n.nextInt();
        } while (item == 1);
    }
}

//o cesto deve estar inicialmente vazio

/*
System.out.println("- Informe um número: ");
                int idThread = n.nextInt();
                System.out.println("- Criança estará com bola? (S/N) ");
                String ball = n.next();
                System.out.println("- Informe quanto tempo a criança brincará: (s) ");
                int playingTime = n.nextInt();
                System.out.println("- Informe quanto tempo a criança descansará: (s) ");
                int quietTime = n.nextInt();
                AddChild addChild = new AddChild(idThread, ball, playingTime, quietTime, basket);
                addChild.newChild();
 */