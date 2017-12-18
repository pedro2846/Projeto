package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import entidade.Admin;
import entidade.Usuario;
import implement.UsuarioDAOImp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.CacheAdapterFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;

public class teladesistema extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtCargo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

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
		setBounds(100, 100, 377, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 361, 324);
		contentPane.add(tabbedPane);
		
		JPanel aba_login = new JPanel();
		tabbedPane.addTab("Login", null, aba_login, null);
		aba_login.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(29, 34, 46, 14);
		aba_login.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(178, 31, 86, 20);
		aba_login.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(29, 71, 46, 14);
		aba_login.add(lblSenha);
		
		JPanel aba_cadastrar = new JPanel();
		tabbedPane.addTab("Cadastrar", null, aba_cadastrar, null);
		
		aba_cadastrar.setVisible(false);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin adm = new Admin();
				
				adm.setLogin(txtLogin.getText());
				adm.setSenha(txtSenha.getPassword().toString());
				
				if (new UsuarioDAOImp().checkLogin(adm)) {
//					new tela 
					aba_cadastrar.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Falha ao logar");
				}
			}
		});
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(178, 68, 86, 20);
		aba_login.add(txtSenha);
		btnNewButton.setBounds(109, 115, 112, 20);
		aba_login.add(btnNewButton);
		
	
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(44, 14, 86, 14);
		aba_cadastrar.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(173, 11, 86, 20);
		aba_cadastrar.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(44, 45, 86, 14);
		aba_cadastrar.add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(173, 42, 86, 20);
		aba_cadastrar.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(44, 76, 86, 14);
		aba_cadastrar.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(173, 73, 86, 20);
		aba_cadastrar.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEndereço = new JLabel("Endere\u00E7o:");
		lblEndereço.setBounds(44, 107, 86, 14);
		aba_cadastrar.add(lblEndereço);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(173, 104, 86, 20);
		aba_cadastrar.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(44, 138, 86, 14);
		aba_cadastrar.add(lblCargo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(173, 135, 86, 20);
		aba_cadastrar.add(txtCargo);
		txtCargo.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(91, 209, 129, 23);
		aba_cadastrar.add(btnCadastrar);
		
		
		
		
	}
}
