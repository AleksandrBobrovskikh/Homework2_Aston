package HW2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Foots.getAnimal(-2));
        } catch (FootException e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getName() + " - " + e.getMessage());
            e.printStackTrace();
        }
    }
}