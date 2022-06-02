public class Tugas2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 20; x++) {
            int i = 0;
            for (int j = 1; j <= x; j++) {
                if (x % j == 0)
                    i++;
            }
            if (i == 2)
                System.out.println(x + " Bilangan Prima ");
            else
                System.out.println(x + " Bukan Bilangan Prima ");
        }
    }
}
