import javax.swing.JOptionPane;
public class ExercicioWhile03{
    public static void main(String[] args){
        int pessoas = 0;
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Informe o peso Kg: "));

        while(peso > 0 && peso < 300){
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Informe o peso Kg: "));
            pessoas = pessoas + 1;
            
        }

        JOptionPane.showMessageDialog(null, "Pessoas que informaram idade foram: " + pessoas + " pessoas");
               
    }
}