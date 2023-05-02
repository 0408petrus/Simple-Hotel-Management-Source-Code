import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("\n--- Halo Selamat Datang di Program Perhotelan ---\n");
        System.out.print("Silakan Pilh Menu:\n1. Reservasi\n2. Perhitungan Hari ini\n3. Keuntungan\n4. Keluar\nPilih: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Reservation();
                break;
            case 2: new Inspect();

                break;
            case 3: new Show();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Menu();
    }
}