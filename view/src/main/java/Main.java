
public class Main {
    public static void main(String[] args) {
        FirstLevel f1 = new FirstLevel();
        int[] arr = {1, 2, 3, 4, 4, 5, 3, 5, 6};
        System.out.println("---Level 1---");
        System.out.println("1 task: " + f1.returnNumberOfUniqueSymbols(arr));
        System.out.println("2 task: " + f1.moveOfHorse(1, 1, 2, 3));
        System.out.println("3 task: " + f1.areaOfTriangle(0, 0, 9, 0, 7, 9));
    }
}
