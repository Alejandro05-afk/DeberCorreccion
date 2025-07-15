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
                String nombres = textFieldNombres.getText();
                String apellidos = textFieldApellidos.getText();
                int edad = Integer.parseInt(textFieldEdad.getText());
                String productos = textFieldProductos.getText();

                if(nombres.isEmpty() || apellidos.isEmpty() || productos.isEmpty() || edad == 0){
                    JOptionPane.showMessageDialog(null,"Los campos estan vacios");
                }else if (edad < 18){
                    JOptionPane.showMessageDialog(null,"No es mayor de edad");
                }else {
                    JOptionPane.showMessageDialog(null,"Registro exitoso");
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
