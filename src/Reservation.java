import java.util.Scanner;
public class Reservation {
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    // Appetizer appetizer = new Appetizer();
    public Reservation(){
        System.out.println("Order Selected!");
        System.out.println("Silakan Pilih Menu:\n1. Economy\n2. Bussiness\n3. Suite\n4. Kembali\nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.flush();
                Economy economy = new Economy();
                economy.Show();
                economy.Menu();
                break;
            case 2:
                System.out.flush();
                Bussiness bussiness = new Bussiness();
                bussiness.Show();
                break;
            case 3:
                System.out.flush();
                Suite suite = new Suite();
                suite.Show();
                break;
            case 4:
                Main.Menu();
                break;
            default:
                break;
        }
    }

}