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
	
	janela.add(main);
	painelPrinc.add(new Button("a"));
	painelPrinc.add(new Button("a"));
	painelPrinc.add(new Button("a"));
	painelPrinc.add(new Button("a"));
	painelPrinc.add(new Button("a"));
	painelPrinc.add(new Button("a"));
	main.add(painelPrinc);
	painelSpr.add(new Button("a"));
	painelSpr.add(new Button("a"));
	painelSpr.add(new Button("a"));
	painelSpr.add(new Button("a"));
	main.add(painelSpr);
        janela.setVisible(true);    

}

public static void main(String[] args) {
	new Painel();
}
}