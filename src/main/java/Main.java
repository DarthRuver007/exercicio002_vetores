

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nomes[] = new String [100];
        float notas[] = new float [100];
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        
        for (int i=0; i<N; i++){
            nomes [i] = JOptionPane.showInputDialog("Digite o nome [" +(i + 1)+"]");
            notas [i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota [" +(i + 1)+"]"));
        }
        float soma = 0;
        for (int i=0; i<N;i++){
            soma = soma + notas[i];
        }
        float media = soma/N;
        System.out.println("A média das notas é: "+media);
        for (int i=0; i<N;i++){
            System.out.println("Nome: "+nomes[i]+"\nNota: "+notas[i]);
        }
    }
}
