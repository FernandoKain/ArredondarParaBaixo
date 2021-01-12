/* Programa que realiza o arredondamento para baixo.
 */
package arredondarparabaixo;

import javax.swing.JOptionPane;

public class ArredondarParaBaixo {

    public static void main(String[] args) {
        // TODO code application logic here
        //Inserir uma nota "quebrada" com separação por ponto.
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da prova: ")); 
                   
        JOptionPane.showMessageDialog(null, 
                "Nota original " + nota + "\nArredondada para baixo: " + Math.floor(nota));
       
        System.exit(0);
    }
}
