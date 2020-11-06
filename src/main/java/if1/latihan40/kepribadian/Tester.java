/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan40.kepribadian;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        User user = new User();
        user.masukkanWarna();
        user.masukkanNama();
        user.menentukanKepribadian();
        System.out.println("Developed by : Ivan Faathirza");
    }
}