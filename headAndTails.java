import java.util.Random;

class headAndTails {

  public static void main(String[] args) {
    int head=0;
    int tail=0;

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
      System.out.println("You won");
    }else{
      System.out.println("You lost");
    }
  }
}
