import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        var numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        var numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int resultado = 1;
        var operador = JOptionPane.showInputDialog("Digite o operador");
        Collection <String> historico =new ArrayList<>();

        switch (operador) {
            case "-" -> {
                resultado = (numero1 - numero2);
                historico.add(numero1 +"-"+ numero2 +"=" +resultado);
            }
            case "+" -> {
                resultado = (numero1 + numero2);
                historico.add(numero1 +"+"+ numero2 +"=" +resultado);
            }
            case "/" -> {
                resultado = (numero1 / numero2);
                historico.add(numero1 +"/"+ numero2 +"=" +resultado);
            }
            case "*" -> {
                resultado = (numero1 * numero2);
                historico.add(numero1 +"*"+ numero2 +"=" +resultado);
            }
            default -> System.out.println("Operador incorreto");
        }
        while (!operador.equalsIgnoreCase("fim")) {
            operador = JOptionPane.showInputDialog("Digite o operador");

            switch (operador) {
                case "-" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado - numero2);
                    historico.add(resultado +"-"+ numero2 +"=" +resultado);
                }
                case "+" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado + numero2);
                    historico.add(resultado +"+"+ numero2 +"=" +resultado);
                }
                case "/" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado / numero2);
                    historico.add(resultado +"/"+ numero2 +"=" +resultado);
                }
                case "*" -> {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    resultado = (resultado * numero2);
                    historico.add(resultado +"*"+ numero2 +"=" +resultado);
                }
                case "fim" -> {

                    historico.add("Resultado Final: "+resultado);
                    historico.forEach(System.out::println);
                }
                default -> System.out.println("Operador incorreto");
            }
        }
    }
    }
