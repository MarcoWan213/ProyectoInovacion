
package MyPlace;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class RegistroDeUsuarios extends JFrame {
 JLabel NombreProyecto, CreaTuCuenta;
 JTextField NombreUsuario, ApellidoUsuario, Correo;
 JButton Facebook, Google, Cancelar, CrearCuenta;
 private JPasswordField Contrasenia, VerificarContrasenia;

    
        public RegistroDeUsuarios(String titulo) {
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 800);

        NombreProyecto=new JLabel ("MY PLACE");
        CreaTuCuenta=new JLabel ("Crea tu cuenta de MY PLACE");
        NombreUsuario=new JTextField("Nombre");
        ApellidoUsuario=new JTextField("Apellido");
        Correo=new JTextField("Correo electrónico");
        Contrasenia=new JPasswordField ("Contraseña");
        VerificarContrasenia=new JPasswordField ("Verificar contraseña");
        Facebook=new JButton("Conectarse con Facebook");
        Google=new JButton("Conectarse con una cuenta Google");
        Cancelar=new JButton("Cancelar");
        CrearCuenta=new JButton("Crear");
        
        JPanel Nombres=new JPanel (new FlowLayout ());
        Nombres.add(NombreUsuario);
        Nombres.add(ApellidoUsuario);
        
        JPanel Contrasenias=new JPanel (new FlowLayout ());
        Contrasenias.add(Contrasenia);
        Contrasenias.add(VerificarContrasenia);
        
        JPanel ComandoBotones=new JPanel (new FlowLayout ());
        ComandoBotones.add(Cancelar);
        ComandoBotones.add(CrearCuenta);
        
        JPanel PanelLlenado = new JPanel(new GridLayout(8, 1));
        PanelLlenado.add(NombreProyecto);
        PanelLlenado.add(CreaTuCuenta);
        PanelLlenado.add(Nombres);
        PanelLlenado.add(Correo);
        PanelLlenado.add(Contrasenias);
        PanelLlenado.add(Facebook);
        PanelLlenado.add(Google);
        PanelLlenado.add(ComandoBotones);

        Container contenedor = getContentPane();
        contenedor.add (PanelLlenado);
        
        setVisible(true);
    }

    



   public static void main(String[] args) {
        RegistroDeUsuarios nuevo = new RegistroDeUsuarios("Cuenta nueva");
    } 
}
