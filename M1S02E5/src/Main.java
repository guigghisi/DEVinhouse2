import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        for (int i =0; i<10;i++){
            nomes.add(JOptionPane.showInputDialog("Digite o nome da pessoa"));
        }
        for(int i=0;i<10;i++){
            System.out.println("Posição:"+i+" Nome:"+ nomes.get(i)
            );
        }

    }
}