//verificador de senha segura

import java.util.Scanner;

public class questao_2
{
    public static void main(String[] args) {
        System.out.println("Digite a senha: ");
        Scanner sc = new Scanner(System.in);
        String password = new String();
        password = sc.nextLine();
        if (strongPassword(password) == false){
            System.out.println("Senha fraca!");
            if (password.length() < 6){
                System.out.print("Para ser segura, faltam " + (6 - password.length()) + " caracteres.");
            }
        }
        else{
            System.out.println("Senha forte!");
        }
    }
    public static boolean strongPassword(String password) {
        if (password.length() < 6) return false;

        boolean findNumber = false;
        boolean findUpper = false;
        boolean findTiny = false;
        boolean findSymbol = false;
        for (char c : password.toCharArray()) {
            if (c >= '0' && c <= '9') {
                findNumber = true;
            } else if (c >= 'A' && c <= 'Z') {
                findUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                findTiny = true;
            } else {
                findSymbol = true;
            }
        }
        return findNumber && findUpper && findTiny && findSymbol;
    }
}
