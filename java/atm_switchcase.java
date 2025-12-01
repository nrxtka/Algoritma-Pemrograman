import java.util.Scanner;

public class atm_switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String valid;
        int nim;          // sebagai saldo
        int pilihan;
        float jumlah;
        String tujuan;

        System.out.print("Silahkan Masukkan Nama Anda: ");
        nama = input.nextLine();

        System.out.print("Apakah Nama sudah benar? (ya/tidak): ");
        valid = input.nextLine();

        if (valid.equalsIgnoreCase("ya")) {

            System.out.print("Silahkan Masukkan NIM Anda: ");
            nim = input.nextInt();

            System.out.println("\n===== DATA ANDA =====");
            System.out.println("Nama  : " + nama);
            System.out.println("Saldo : Rp " + nim);

            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\nSaldo Anda: Rp " + nim);
                    break;

                case 2:
                    System.out.print("\nMasukkan jumlah penarikan Rp: ");
                    jumlah = input.nextFloat();

                    if (jumlah > nim) {
                        System.out.println("Saldo anda tidak cukup");
                    } else {
                        nim -= jumlah;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Sisa Saldo: Rp." + nim);
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan jumlah setoran Rp: ");
                    jumlah = input.nextFloat();

                    nim += jumlah;
                    System.out.println("Sisa Saldo: Rp." + nim);
                    break;

                case 4:
                    input.nextLine(); // pembersih enter
                    System.out.print("\nMasukkan nama penerima transfer: ");
                    tujuan = input.nextLine();

                    System.out.print("Masukkan jumlah transfer: Rp.");
                    jumlah = input.nextFloat();

                    if (jumlah > nim) {
                        System.out.println("Saldo anda tidak cukup");
                    } else {
                        nim -= jumlah;
                        System.out.println("Transfer ke " + tujuan + " berhasil.");
                        System.out.println("Sisa Saldo: Rp." + nim);
                    }
                    break;

                case 5:
                    System.out.println("Anda Keluar, Terimakasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } else {
            System.out.println("Nama salah, silahkan ulangi");
            return;
        }
    }
}
