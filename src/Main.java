public class Main {
    public static void main(String[] args)  {
        int price = 16000;
        int milesBonus = 1;
        int rubles = 20;
        int finalBonus = price / rubles * milesBonus;
        System.out.println(finalBonus);
    }
}