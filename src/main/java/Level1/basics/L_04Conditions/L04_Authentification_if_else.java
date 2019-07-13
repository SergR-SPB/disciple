package Level1.basics.L_04Conditions;

import java.util.Scanner;

public class L04_Authentification_if_else {
    public static void main(String[] args) {
        String login = "Admin";
        String login1 = "User";
        String password = "passwordAd";
        String password1 ="passwordUs";
        String string = "Hello ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input LOGIN:");

        String usersLogin = scanner.next();
// -- Ternary (--if--elce)
        string+= usersLogin.equals(login)?login:login1;
        System.out.println(string);

        System.out.println("Input password:");
        String userPassword = scanner.next();
        String st = userPassword.equals(password) | userPassword.equals(password1)
                & usersLogin.equals(login) | usersLogin.equals(login1)
                ?"Great, you are logged in."
                :"You are not logged in!!";
        System.out.println(st);

        System.out.println
                ("-----------------**---------------------");

// --if--else

        if (login.equals(usersLogin)){
            System.out.println("Input PASSWORD:");
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
