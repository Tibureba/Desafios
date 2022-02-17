import java.util.Scanner;

public class questao_1
{
    public static void main(String[] args) {
        int n, i, j, k, esp;
        System.out.println("Digite o tamanho da escada");
        Scanner readKeyboard = new Scanner(System.in);
        n = readKeyboard.nextInt();
        esp = n-1;
        for(i=1; i<=n; i++){
            for(j=1; j<=esp; j++){
                System.out.print(" "); //adicao de espaco
            }
            for(k=1; k<=n-esp; k++){
                System.out.print("*"); //adicao de asterisco
            }
            System.out.print("\n"); //pula para proxima linha
            esp--;
        }
    }
}
