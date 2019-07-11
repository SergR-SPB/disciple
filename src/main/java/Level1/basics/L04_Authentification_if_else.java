package Level1.basics;

import java.util.Scanner;

public class L04_Authentification_if_else {
    public static void main(String[] args) {
        String login = "Admin";
        String login1 = "User";
        String password = "passwordAd";
        String password1 ="passwordUs";
        String string = "Hello";

        Scanner scanner = new Scanner(System.in);
        System.out.println("In put LOGIN:");

        String usersLogin = scanner.next();
// -- Ternary (--if--elce)
        string+= usersLogin.equals("Admin")?" Admin":" User";
        System.out.println(string);

        System.out.println("In put password:");
        String userPassword = scanner.next();
        String st = userPassword.equals("passwordAd") | userPassword.equals("passwordUs")
                & usersLogin.equals("Admin") | usersLogin.equals("User")
                ?"Great, you are logged in."
                :"You are not logged in!!";
        System.out.println(st);

// --if--else

        if (login.equals(usersLogin)){
            System.out.println("In put PASSWORD:");
            String usersPassword = scanner.next();

            if (password.equals(usersPassword)){
                System.out.println("Hello "+usersLogin+", you are logged in system");
            }else {
                System.out.println("You have entered an incorrect password!");
            }
        }else {
            System.out.println("No user with that name!");
        }


    }

}
