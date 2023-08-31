import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Painel{
JFrame janela = new JFrame();	

JPanel main = new JPanel(new GridLayout(2, 1));
JPanel painelPrinc = new JPanel(new GridLayout(3, 2));
JPanel painelSpr = new JPanel(new GridLayout(1, 4));
	
JTextField txt = new JTextField(5);

public Painel(){
	
	janela.setTitle("Painel");
	janela.setSize(300,300);
	janela.setLocation(500,250);

	TextField tfNome = new TextField();
	TextField tfIdade = new TextField();
	TextField tfEndereco = new TextField();

	Button btnOk = new Button("Ok");
	Button btnSair = new Button("Sair");
	Button btnMostrar = new Button("Mostrar");
	Button btnLimpar = new Button("Limpar");
	
	janela.add(main);

	painelPrinc.add(new Label("Nome: "));
	painelPrinc.add(tfNome);
	painelPrinc.add(new Label("Idade: "));
	painelPrinc.add(tfIdade);
	painelPrinc.add(new Label("Endereço: "));
	painelPrinc.add(tfEndereco);
	main.add(painelPrinc);

	painelSpr.add(btnOk);
	painelSpr.add(btnLimpar);
	painelSpr.add(btnMostrar);
	painelSpr.add(btnSair);

	main.add(painelSpr);
        janela.setVisible(true);    

}

public static void main(String[] args) {
	new Painel();
}
}