package app;

import entidade.Usuario;
import java.util.Scanner;
import implement.UsuarioDAOImp;
import javax.swing.JOptionPane;
public class Aplicativo {
	public static  void main(String[] args) {
		
		
		Usuario u = new Usuario();
		
		try (Scanner scan = new Scanner(System.in)){
		System.out.print("Informe o nome: ");
		u.setNome(scan.nextLine());
		System.out.print("Informe o CPF: ");
		u.setCpf(scan.nextLine());
		System.out.print("Informe o Telefone: ");
		u.setTelefone(scan.nextLine());
		System.out.print("Informe o Endereço: ");
		u.setEndereco(scan.nextLine());
		System.out.print("Informe o Cargo: ");
		u.setCargo(scan.nextLine());
		
		
		if (new UsuarioDAOImp().salvar(u))
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso");
	else
		JOptionPane.showMessageDialog(null, "Falha na gravação");
	}
		}
}