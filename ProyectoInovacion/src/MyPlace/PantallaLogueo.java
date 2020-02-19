package MyPlace;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PantallaLogueo extends JFrame {

    JLabel lbnombreMyPlace,lbUsuario,lbContracena;
    JTextField txtUsuario,txtContacena;
    JButton btnRegistrarce, btnEntrar,btnOlvideContra;      
    
    public PantallaLogueo(String titulo) {
        super(titulo);

        lbContracena = new JLabel("Contraceña: ");
        lbUsuario = new JLabel("Usuario: ");
        lbnombreMyPlace = new JLabel("MY PLACE");
        txtContacena = new JTextField("********");
        txtUsuario = new JTextField("Nombre de usuario o correo");
        btnEntrar = new JButton("Entrar");
        btnRegistrarce = new JButton("Registrarme");
        btnOlvideContra = new JButton("Olvide mi contaseña");
        
        
        
        JPanel pUsuario = new JPanel();
        JPanel pContraceña = new JPanel();
        JPanel pBotones = new JPanel();
        FlowLayout fl = new FlowLayout();
        pUsuario.setLayout(fl);
        pContraceña.setLayout(fl);
        pBotones.setLayout(fl);
        
        pUsuario.add(lbUsuario);
        pUsuario.add(txtUsuario);
        
        pContraceña.add(lbContracena);
        pContraceña.add(txtContacena);
        
        pBotones.add(btnRegistrarce);
        pBotones.add(btnEntrar);
        
        
        //Panel PRINCIPAL
        JPanel ventana = new JPanel();
        GridLayout grid = new GridLayout(5, 1);
        ventana.setLayout(grid);
        //Llenado del panel principal
        ventana.add(lbnombreMyPlace);
        ventana.add(pUsuario);
        ventana.add(pContraceña);
        ventana.add(pBotones);
        ventana.add(btnOlvideContra);
        
        Container cp = getContentPane();
        cp.add(ventana, BorderLayout.CENTER);
        
        setSize(480, 800);//Relacion de aspecto
        setVisible(true);
    }

    public static void main(String[] args) {
        PantallaLogueo pantalla = new PantallaLogueo("Logueo");
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
