
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yushe
 */
public class HelloUser {

    String userName;

    public void greetUser() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Please enter your name: ");
        String n = reader.nextLine();
        System.out.println("Hello "+n+" !");
    }
}
