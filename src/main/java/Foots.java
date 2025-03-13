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