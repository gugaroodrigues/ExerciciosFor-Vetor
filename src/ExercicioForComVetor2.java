import javax.swing.JOptionPane;
public class ExercicioForComVetor2 {

	public static void main(String[] args) {
    
		int[] idades = new int [7];
        
        for(int i = 0; i < 7; i++){
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(
            		                        null, "Digite uma idade"));
        }
        
        for(int i = 0; i< 7; i++){
        	
        	JOptionPane.showMessageDialog(null, "Sua " +(i+1) + "° idade é: " + idades[i]);
        	
        }

	}

}
