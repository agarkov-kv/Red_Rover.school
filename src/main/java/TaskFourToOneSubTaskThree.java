public class TaskFourToOneSubTaskThree {
    public static void main(String[] args) {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}
