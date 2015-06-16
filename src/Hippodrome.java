import java.util.ArrayList;

/**
 * Created by Nikolay on 16.06.2015.
 */
public class Hippodrome
{

    public static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public Horse getWinner(){
        Horse winner=horses.get(0);
        for (Horse horse : horses)
        {
            double maxDistance=0;

            if (horse.distance>maxDistance){
                maxDistance = horse.distance;
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i <= 100; i++)
        {
            move();
            print();
            Thread.sleep(500);
            System.out.println(100-i);

        }
    }
    public void move(){
        for(Horse h : horses){
            h.move();
        }
    }
    public void print(){
        for (Horse horse : horses)
        {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse alfa =new Horse("alfa",3,0);
        Horse beta =new Horse("beta",3,0);
        Horse gamma =new Horse("gamma",3,0);

        game.horses.add(alfa);
        game.horses.add(beta);
        game.horses.add(gamma);

        game.run();
        game.printWinner();
    }
}