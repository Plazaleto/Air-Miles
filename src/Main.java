public class Main {
    public static void main(String[] args)  {
        int ticketPrice = 16000;
        int bonus = 1;
        int rubles = 20;
        int finalBonus = ticketPrice / rubles * bonus;
        System.out.println(finalBonus);
    }
}