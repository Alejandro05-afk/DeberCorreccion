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
                String usuario = textFieldUser.getText().trim();
                String contrasenia = new String(passwordField.getPassword()).trim();
                String rol = (String) comboBoxRoles.getSelectedItem();

                // Verificación de campos vacíos
                if (usuario.isEmpty() || contrasenia.isEmpty() || rol == null || rol.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                    return;
                }

                // Validación de credenciales
                if (usuario.equals("cajero") && contrasenia.equals("24") && rol.equals("Cajero")) {
                    CajeroForm cajeroForm = new CajeroForm();
                    cajeroForm.setVisible(true);
                    dispose();
                } else if (usuario.equals("admin") && contrasenia.equals("123") && rol.equals("Administrador")) {
                    AdminForm adminForm = new AdminForm();
                    adminForm.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario, contraseña o rol incorrecto.");
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
