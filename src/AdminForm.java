import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminForm extends JFrame {
    private JTextField textFieldCodigo;
    private JTextField textFieldProduct;
    private JTextField textFieldPrecio;
    private JTextField textFieldStock;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JPanel Admin;

    public AdminForm(){
        setTitle("Administrador");
        setSize(500,500);
        setContentPane(Admin);
        setVisible(true);


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codi = textFieldCodigo.getText();
                String producto = textFieldProduct.getText();
                String precio = textFieldPrecio.getText();
                String stock = textFieldStock.getText();
                if(codi.isEmpty() || producto.isEmpty() || precio.isEmpty() || stock.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Los campos estan vacios");
                }else{
                    JOptionPane.showMessageDialog(null,"Registro exitoso");
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldCodigo.setText("");
                textFieldPrecio.setText("");
                textFieldProduct.setText("");
                textFieldStock.setText("");
            }
        });
    }
}
