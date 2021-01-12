/*Programa que realiza arredondamento, no caso, de uma quantidade de ônibus conforme o número de passageiros.
 */
package arredondamentoparacima;

import javax.swing.JOptionPane;

public class ArredondamentoParaCima {


    public static void main(String[] args) {
        // TODO code application logic here
        final float LOTACAO_ONIBUS = 50;
        
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de passageiros:"));
        float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        
        JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros 
                + "\nQuantidade Calculada: " + qtdeOnibus
                + "\nQuantidade de Ônibus necessários: " + (int)Math.ceil(qtdeOnibus));
        System.exit(0);
        
    }
    
}
