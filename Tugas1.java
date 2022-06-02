public class Tugas1 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 50) {
            if (x % 3 == 0) {
                System.out.println("Angka " + x + " habis dibagi 3");
            } else if (x % 5 == 0) {
                System.out.println("Angka " + x + " habis dibagi 5");
            } else {
                System.out.println("Angka " + x);
            }
            x++;
        }
    }
}