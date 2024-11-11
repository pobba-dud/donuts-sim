import java.util.Random;
class Main {
  public static void main(String[] args) {
    int day = 0;
    int max2 = 10000;
    boolean check = false;
      while (check == false){
      Random rand = new Random(); 
      int upperbound = max2;
      int int_random = rand.nextInt(upperbound); 
     int min = 0;
      int max = max2; 
      
      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
      System.out.print(random_int);
      System.out.print(":");
      System.out.println(int_random);
    day = day +1;
        System.out.println("Day: " + day);
      if (int_random==random_int){
        System.out.println("correct on day: " + day);
        check = true;
      }
      }
    System.out.println("done");
  }
}