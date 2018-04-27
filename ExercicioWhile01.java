import javax.swing.JOptionPane;
public class ExercicioWhile01{
    public static void main(String [] args){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome ou tecle \"Sair\" para cancelar a operação.");
        
        /*while = (!nome.equalsIgnoreCase("Sair"))
        */
        while(!nome.equalsIgnoreCase("sair")){
            nome = JOptionPane.showInputDialog(null, "Digite o nome ou tecle \"Sair\" para cancelar a operação.");
        }

    }
}
   
