import java.util.Scanner;
public class Economy{
    public static float harga;
    public void Show(){
        System.out.println("This is Economy Class Menu");
    }

    int[] biayaProduksi = new int[] {20000,23000,18000};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Makanan:" +
                        "\n1. Kamar Tipe-A " + 1.25*biayaProduksi[0] +
                        "\n2. Kamar Tipe-B " + 1.25*biayaProduksi[1] +
                        "\n3. Kamar Tipe-C" + 1.25*biayaProduksi[2] +
                        "\n4.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                harga+=1.25*biayaProduksi[0];
                Menu();
                break;
            case 2:
                harga+=1.25*biayaProduksi[1];
                Menu();
                break;
            case 3:
                harga+=1.25*biayaProduksi[2];
                Menu();
                break;
            case 4:
                new Reservation();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}