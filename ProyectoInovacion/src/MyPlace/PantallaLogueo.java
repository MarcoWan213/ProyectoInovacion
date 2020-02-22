package MyPlace;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.FocusListener;

public class PantallaLogueo extends JFrame {

    RegistroDeUsuarios registro = new RegistroDeUsuarios("Registrarce");

    JLabel lbnombreMyPlace, lbUsuario, lbContracena;
    JTextField txtUsuario, txtContacena;
    JButton btnRegistrarce, btnEntrar, btnOlvideContra;
    JRadioButton rbtnF, rbtnM;
    Choice lista;

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
        lista = new Choice();

        //Grupo de RadioButtons
        rbtnM = new JRadioButton("Seguro", false);
        rbtnF = new JRadioButton("Invitado", true);
        ButtonGroup grupoSexos = new ButtonGroup();
        grupoSexos.add(rbtnM);
        grupoSexos.add(rbtnF);

        JPanel pUsuario = new JPanel();
        JPanel pContraceña = new JPanel();
        JPanel pBotones = new JPanel();
        JPanel pBoton = new JPanel();
        JPanel paneCheckBox = new JPanel();
        JPanel paneDivicionBtn = new JPanel();
        FlowLayout fl = new FlowLayout();
        GridLayout gl = new GridLayout(2, 2);
        paneDivicionBtn.setLayout(gl);
        pUsuario.setLayout(fl);
        pContraceña.setLayout(fl);
        pBotones.setLayout(gl);
        pBoton.setLayout(fl);
        paneCheckBox.setLayout(fl);

        lista.addItem("CEZ");
        lista.addItem("SIGLO XXI");
        lista.addItem("ISPANO");

        paneCheckBox.add(rbtnM);
        paneCheckBox.add(rbtnF);

        btnRegistrarce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                registro.setVisible(true);
                setVisible(false);
            }
        });

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String texto = "El usuario " + txtUsuario.getText() + " a iniciado sesion correctamente a la escuela "
                        + ""+ lista.getSelectedItem();
                JOptionPane.showMessageDialog(null, texto);
            }
        });

        pUsuario.add(lbUsuario);
        pUsuario.add(txtUsuario);

        pContraceña.add(lbContracena);
        pContraceña.add(txtContacena);
        pContraceña.add(paneCheckBox);

        pBotones.add(btnRegistrarce);
        pBotones.add(btnEntrar);
        pBotones.add(lista);

        pBoton.add(btnOlvideContra);

        //KeyListener para tecla enter
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    pBoton.setBackground(new java.awt.Color(200, 10, 215));
                }

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        //MouseListener para seleccionar todo el texto
        FocusListener ff = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (fe.getSource() == txtContacena) {
                    Object o = fe.getSource();
                    if (o instanceof javax.swing.JTextField) {
                        javax.swing.JTextField txt = (javax.swing.JTextField) o;
                        txt.setSelectionStart(0);
                        txt.setSelectionEnd(txt.getText().length());
                    }
                }
                if (fe.getSource() == txtUsuario) {
                    Object o = fe.getSource();
                    if (o instanceof javax.swing.JTextField) {
                        javax.swing.JTextField txt = (javax.swing.JTextField) o;
                        txt.setSelectionStart(0);
                        txt.setSelectionEnd(txt.getText().length());
                    }
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (fe.getSource() == txtContacena) {

                }
            }
        };

        txtContacena.addFocusListener(ff);
        txtUsuario.addFocusListener(ff);

        //Panel PRINCIPAL
        JPanel ventana = new JPanel();
        GridLayout grid = new GridLayout(5, 1);
        ventana.setLayout(grid);
        //Llenado del panel principal
        ventana.add(lbnombreMyPlace);
        ventana.add(pUsuario);
        ventana.add(pContraceña);
        ventana.add(pBotones);
        ventana.add(pBoton);

        Container cp = getContentPane();
        cp.add(ventana, BorderLayout.CENTER);

        lbnombreMyPlace.setHorizontalAlignment(SwingConstants.CENTER);

        //Colores Layouts
        ventana.setBackground(new java.awt.Color(110, 170, 215));
        pUsuario.setBackground(new java.awt.Color(100, 170, 215));
        pContraceña.setBackground(new java.awt.Color(90, 170, 215));

        pBotones.setBackground(new java.awt.Color(90, 170, 215));

        pBoton.setBackground(new java.awt.Color(105, 170, 215));
        rbtnF.setBackground(new java.awt.Color(90, 170, 215));
        rbtnM.setBackground(new java.awt.Color(90, 170, 215));
        paneCheckBox.setBackground(new java.awt.Color(90, 170, 215));

        lbnombreMyPlace.setFont(new java.awt.Font("Tahoma", 1, 26));

        setSize(480, 800);//Relacion de aspecto
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PantallaLogueo pantalla = new PantallaLogueo("Logueo");
    }
}
