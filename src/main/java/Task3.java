public class Task3 {
    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 3 == 0) {
                System.out.print(x[i] + ", ");
            }
        }
    }
}

