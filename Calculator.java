import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String numero1, numero2;
        double result;
        char func;

        func = JOptionPane.showInputDialog("Digite qual função quer fazer (+, -, * ou /): ").charAt(0);
        numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        double numero1convertido = Double.parseDouble(numero1);
        double numero2convertido = Double.parseDouble(numero2);

        switch (func) {
            case '-':
                result = numero1convertido - numero2convertido;
                JOptionPane.showMessageDialog(null, "O resultado é: " + result);
                break;
            case '+':
                result = numero1convertido + numero2convertido;
                JOptionPane.showMessageDialog(null, "O resultado é: " + result);
                break;
            case '*':
                result = numero1convertido * numero2convertido;
                JOptionPane.showMessageDialog(null, "O resultado é: " + result);
                break;
            case '/':
                if (numero2convertido == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                } else {
                    result = numero1convertido / numero2convertido;
                    JOptionPane.showMessageDialog(null, "O resultado é: " + result);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha uma função valida!: ");
                break;
        }
    }
}
 


    