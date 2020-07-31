import java.util.Random;
import java.util.Scanner;

class headAndTails {

  public static void main(String[] args) {
    int head=0;
    int tail=0;

    System.out.println("Who are you?");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("Hello, " + name + "!");

    System.out.println("Tossing a coin...");

    for(int i=1;i<4;i++){
      Random r = new Random();
      int rand = r.nextInt(2);
      if(rand == 0){
        System.out.println("Round " + i +": Heads");
        head++;
      }else{
        System.out.println("Round " + i +": Tails");
        tail++;
      }
    }
    System.out.println("Heads: " + head + ", Tails: " + tail);

    if(head > tail){
      System.out.println(name + " won");
    }else{
      System.out.println(name + " lost");
    }
  }
}
