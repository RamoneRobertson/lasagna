public class Main {
    public static void main(String[] args){
        Lasagna lasagna1 = new Lasagna();

        System.out.println(lasagna1.expectedMinutesInOven());
        System.out.println(lasagna1.remainingMinutesInOven(30));
        System.out.println(lasagna1.preparationTimeInMinutes(10));
        System.out.println(lasagna1.totalTimeInMinutes(3, 20));
    }
}
