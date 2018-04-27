import javax.swing.JOptionPane;

public class ExercicioWhile05{

    public static void main(String[] args){
        
        
        
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite  um numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
        
        int opcao = JOptionPane.showOptionDialog(
            null,"Escolha a operação desejada!", "Calculadora",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                "SOMA", "SUBTRACAO","MULTIPLICACAO" ,"DIVIDIR" , "SAIR"}, "" );
        System.out.print(opcao);

        while(opcao < 4){
            if(opcao == 0){
                double soma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "Soma do valores = " + soma);
            }if (opcao == 1){
                double subtracao = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da subtracao = " + subtracao);
            }if(opcao == 2){
                double multiplicacao = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação" + multiplicacao);
            }if (opcao == 3){
                double divisao = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Multiplicação = " + divisao);
            }

            opcao = JOptionPane.showOptionDialog(
                null,"Escolha a operação desejada!", "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                "SOMA", "SUBTRACAO","MULTIPLICACAO" ,"DIVIDIR" , "SAIR"}, "" );
                System.out.print(opcao);
        
                    
        } 
    }
}       
        



