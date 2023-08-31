import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaTimeThread extends JDialog {
	
	
	private JPanel jpanel = new JPanel(new GridBagLayout()); /*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Time Thread1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("start");
	private JButton jButton2 = new JButton("stop");
	

	public TelaTimeThread() { /*Construtor. execulta o que tiver dentro no momento da abertura ou execução*/
		
		/*Inicia das configurações iniciais de uma tela*/
		setTitle("Minha tela de de time com Thread"); /*titulo da tela*/
		setSize(new Dimension(240, 240)); /*Tamanho da tela*/
		setLocationRelativeTo(null); 
		setResizable(false);
		/*Primeira parte concluida para criação de uma tela*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*controlar de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize( new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jpanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize( new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		/*teste delinha*/
		
		//-------------------------------------
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jpanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jpanel.add(jButton2, gridBagConstraints);
		
		
		add(jpanel, BorderLayout.WEST);
		/*Sempre sera o ultimo comando*/
		setVisible(true); /*Torna uma tela visivel para o usuario*/

	}

}
