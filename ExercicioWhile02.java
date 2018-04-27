import javax.swing.JOptionPane;
public class ExercicioWhile02{
    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite a idade desejada:"));
        
        while(idade < 129 ){
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite a idade desejada:"));
            
      
        }
            



    
    
    }
}