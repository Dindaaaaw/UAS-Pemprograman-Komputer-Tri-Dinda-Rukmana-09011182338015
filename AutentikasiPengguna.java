import java.util.Scanner;

public class AutentikasiPengguna {
    public static void main(String[] args) {
        // Menentukan nilai username dan password yang benar
        String usernameBenar = "dinooganteng";
        String passwordBenar = "dindaaaaw";

        // Meminta pengguna memasukkan username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai dengan nilai yang benar
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        // Menutup scanner
        scanner.close();
    }
}
