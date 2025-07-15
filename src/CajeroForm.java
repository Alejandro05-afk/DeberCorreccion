import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajeroForm extends JFrame {
    private JButton registrarButton;
    private JButton limpiarButton;
    private JTextField textFieldNombres;
    private JTextField textFieldApellidos;
    private JTextField textFieldEdad;
    private JTextField textFieldProductos;
    private JPanel Cajero;

    public CajeroForm(){
        setTitle("Cajero");
        setSize(500,500);
        setContentPane(Cajero);
        setVisible(true);


        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres = textFieldNombres.getText().trim();
                String apellidos = textFieldApellidos.getText().trim();
                String edadTexto = textFieldEdad.getText().trim();
                String productos = textFieldProductos.getText().trim();

                if (nombres.isEmpty() || apellidos.isEmpty() || edadTexto.isEmpty() || productos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
                    return;
                }
                int edad = Integer.parseInt(edadTexto);

                if (edad < 18) {
                    JOptionPane.showMessageDialog(null, "Debe ser mayor de edad.");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro exitoso.");
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNombres.setText("");
                textFieldApellidos.setText("");
                textFieldProductos.setText("");
                textFieldEdad.setText("");
            }
        });
    }
}
