import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Correccion extends JFrame {
    private JTextField textFieldUser;
    private JPasswordField passwordField;
    private JButton ingresarButton;
    private JComboBox comboBoxRoles;
    private JPanel Log;
    private JButton limpiarButton;

    public Correccion(){
        setTitle("Login");
        setSize(500,500);
        setContentPane(Log);
        setVisible(true);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUser.getText();
                String contrasenia = new String(passwordField.getPassword());
                String rol = (String) comboBoxRoles.getSelectedItem();
                if (usuario.equals("admin") && contrasenia.equals("123") && rol.equals("Administrador")) {
                    AdminForm adminForm = new AdminForm();
                    adminForm.setVisible(true);
                    dispose();
                }else if(!usuario.equals("admin") || !contrasenia.equals("123") || !usuario.equals("cajero") || !contrasenia.equals("24")){
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
                } else if (usuario.equals("cajero") && contrasenia.equals("24") && rol.equals("Cajero")) {
                    CajeroForm cajeroForm = new CajeroForm();
                    cajeroForm.setVisible(true);
                    dispose();
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldUser.setText("");
                passwordField.setText("");
                comboBoxRoles.setAction(null);
            }
        });
    }
}
