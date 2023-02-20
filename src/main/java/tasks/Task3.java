package tasks;

public class Task3 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6};
        for (int j : x) {
            if (j % 3 == 0) {
                System.out.print(j + ", ");
            }
        }
    }
}

