package HW3;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(6);
        list.add(4);
        list.print();
        list.mergeSort();
        list.print();
        list.print() ;

    }
}
