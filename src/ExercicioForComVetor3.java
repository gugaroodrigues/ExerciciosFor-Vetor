import javax.swing.JOptionPane;
public class ExercicioForComVetor3 {

	public static void main(String[] args) {
		int registros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de resgistros"));
		double[] preco = new double[registros];
		double total = 0;
		
		
		for(int i = 0; i < registros; i++) {
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um pre�o de cada vez: ", 
					"CAIXA", JOptionPane.INFORMATION_MESSAGE));
			   total += preco[i]; 
		}
		
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a op��o desejada", "CAIXA ",0,
				JOptionPane.INFORMATION_MESSAGE,null, new Object[]{
						"Pre�os", "Total"}, "Total");
		if (opcao == 0){			
		   for(int  i = 0;  i< registros; i++){
			   JOptionPane.showMessageDialog(null, "Pre�os digitados: " + preco[i]);
		}
		
		} if(opcao == 1){
			   JOptionPane.showMessageDialog(null, "Total: " + total);
		}
		

	}
}
