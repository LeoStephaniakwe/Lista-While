import javax.swing.JOptionPane;

public class ExercicioWhile04{
    public static void main(String[] args){
        int carros = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros você quer cadastrar?")
        );
        int somaAno = 0;
        int numeroDoCadastro = 0;
        int contador = 0;
        int mediaAnoCarro = 0;
        double somaValor = 0;
        double mediaValor = 0;
<<<<<<< HEAD
        int modeloA = 0, 
        modeloG =0;
         while(contador < carros){
            String modelo = JOptionPane.showInputDialog("Qual o modelo");
            modelo = modelo.trim().toLowerCase();
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano?:"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor?"));
            contador = contador + 1;
            somaAno = somaAno + ano;
            somaValor = somaValor + valor;
            char letra = modelo.charAt(0);
            if(letra == 'a'){
                modeloA = modeloA + 1;
            }else if (letra == 'g'){
                modeloG = modeloG + 1;
            }     
        }   
            mediaAnoCarro = somaAno / carros;
            mediaValor = somaValor / carros;
            JOptionPane.showMessageDialog(null, "Média de Ano Veicular: " + mediaAnoCarro + 
                                          "\nMédia total de valores: R$" + mediaValor +
                                          "\nQuantidade de carros que começam com a letra \"A\" = " + modeloA + 
                                          "\nQuantidade de carros que começam com a letra \"G\" = " + modeloG );
=======


        while(contador < carros){
            String modelo = JOptionPane.showInputDialog("Qual o modelo");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano?:"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor?"));

            contador = contador + 1;
            somaAno = somaAno + ano;
            somaValor = somaValor + valor;

            char letra = carro.charAt(0);
            if(letra == 'g'){
            }else if(letra == 'a');
            }
        }   
            mediaAnoCarro = somaAno / carros;
            mediaValor = somaValor / carros;
        
            JOptionPane.showMessageDialog(null, "Média de Ano Veicular: " + mediaAnoCarro + 
                                          "\nMédia total de valores: R$" + mediaValor);
>>>>>>> ddae37a5082db2008f8a11bcbbf2781e15039239
    }
}