package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import entidade.Usuario;
import implement.UsuarioDAOImp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class teladesistema extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teladesistema frame = new teladesistema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public teladesistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 27, 67, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(175, 24, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(22, 52, 67, 14);
		contentPane.add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(175, 49, 86, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(22, 77, 67, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(175, 74, 86, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEndereço = new JLabel("Endere\u00E7o:");
		lblEndereço.setBounds(22, 102, 67, 14);
		contentPane.add(lblEndereço);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(175, 99, 86, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(22, 127, 67, 14);
		contentPane.add(lblCargo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(175, 124, 86, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u= new Usuario();

				u.setNome(txtNome.getText());
				u.setCpf(txtCPF.getText());
				u.setTelefone(txtTelefone.getText());
				u.setEndereco(txtEndereco.getText());
				u.setCargo(txtCargo.getText());
				
				if (new UsuarioDAOImp().salvar(u)) {
					JOptionPane.showMessageDialog(null, "Dados gravados com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Falha na gravação");
				}
			}
		});
		btnCadastrar.setBounds(79, 185, 136, 23);
		contentPane.add(btnCadastrar);
	}
}
