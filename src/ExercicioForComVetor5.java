import javax.swing.JOptionPane;

public class ExercicioForComVetor5{

	public static void main(String[] args) {
		
		int cadastro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de jogos que deseja cadastrar: ",
				 "SISTEMA ESTOQUE", JOptionPane.INFORMATION_MESSAGE));
		String nomes[] = new String[cadastro];
		int numeroDeJogos [] = new int [cadastro];
		int totalDeJogos = 0;
		int i = 0;
		
		for( i = 0; i < cadastro; i++) {
			nomes[i] = JOptionPane.showInputDialog(null, "Nome do " + (i + 1) + "° Jogo: ","SISTEMA ESTOQUE",
					JOptionPane.INFORMATION_MESSAGE);
			numeroDeJogos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do " + (i + 1) + "° Jogo: ",
					"SISTEMA ESTOQUE", JOptionPane.INFORMATION_MESSAGE));
			totalDeJogos += numeroDeJogos[i];
		}
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a Opção que deseja: ", "SISTEMA ESTOQUE",0,
				JOptionPane.INFORMATION_MESSAGE,null, new Object[]{
						"Jogos no Sitema", "Total Sistema"
				           },"Jogos no Sitema");
		
		if(opcao == 0) {
			for(i = 0; i < cadastro; i++){
			JOptionPane.showMessageDialog(null, "Nome do jogo " + nomes[i] + "        total: " + numeroDeJogos[i],
					"SISTEMA ESTOQUE", JOptionPane.INFORMATION_MESSAGE);
			}
		}else{
			JOptionPane.showMessageDialog(null, "Total de Jogos no Sistema:      " + totalDeJogos,
					"SISTEMA ESTOQUE", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	
		
}


