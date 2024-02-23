package PBO;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        Random random = new Random();
        String nama, password;
        User user = new User("haha", "hehe");
        User user1 = new User();

        System.out.print("Masukkan username anda: ");
        nama = gg.next();
        user.setUsername(nama);
        System.out.print("Masukkan password anda: ");
        password = gg.next();
        user.setPassword(password);

        System.out.print("Apakah anda sudah menikah?\n1.Sudah menikah 2.Belum menikah:");
        int pilihan = gg.nextInt();

        int ID = random.nextInt(200) +1;
        user.setId(ID);

        System.out.println("Username anda : " + user.getUsername());
        System.out.println("Password anda : " + user.getPassword());
        if (pilihan == 1 ) {
            user.setStatus(true);
        } else {
            user.setStatus(false);
        }
        System.out.println("ID anda: "+user.getId());
    }
}
