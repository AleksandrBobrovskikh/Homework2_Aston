
public class Main {
    public static void main(String[] args) {
        try {
            String result = Foots.getAnimal(-2);
            System.out.println(result);
        } catch (FootException e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getName() + " - " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class FootException extends Exception {

    public FootException(String message) {
        super(message);
    }
}

class Foots {

    public static String getAnimal(int num) throws FootException {
        if (num == 4) {
            return "Это собака или кот";
        } else if (num == 8) {
            return "Это павук))";
        } else if (num >= 0) {
            return "Я не знаю что это!!!";
        } else {
            throw new FootException("Не может быть отрицательное количество ног");
        }
    }
}

