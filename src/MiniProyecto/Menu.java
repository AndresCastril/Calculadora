package MiniProyecto;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Menu {

    private AppContacto appContactos;
    private DefaultTableModel modeloTabla;
    private JTable tablaContactos;
    private ImageIcon iconoSeleccionado;

    public Menu(AppContacto appContactos) {
        this.appContactos = appContactos;
        this.iconoSeleccionado = null;
        modeloTabla = new DefaultTableModel(); 
        tablaContactos = new JTable(modeloTabla); 

        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Correo");
    }

    public void mostrar() {
        JFrame ventana = new JFrame("CONTACTOS");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setLayout(null);

        JTextField campoBuscar = new JTextField();
        campoBuscar.setBounds(20, 20, 300, 30);
        ventana.add(campoBuscar);

        JButton buscar = new JButton("Buscar");
        buscar.setBounds(320, 20, 100, 30);
        ventana.add(buscar);

        JTable tablaResultados = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaContactos); 
        scroll.setBounds(50, 100, 700, 300); 
        ventana.add(scroll);

        buscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buscado = campoBuscar.getText();
                appContactos.buscarContactos(buscado);
                ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {        
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                    buscar.doClick();                   
                }                                      
            }                                           
        });    
                ventana.requestFocusInWindow();
            }
        });  
        

        JButton botonAñadir = new JButton("Agregar");
        botonAñadir.setBounds(425, 20, 150, 30);
        ventana.add(botonAñadir);

        botonAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioAñadirContacto();
            }
        });
        
        ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {        
                if (e.getKeyCode() == KeyEvent.VK_N) {  
                    botonAñadir.doClick();                   
                }                                      
            }                                           
        });    
        
        JButton botonEditar = new JButton("Editar");
        botonEditar.setBounds(580, 20, 150, 30);
        ventana.add(botonEditar);

        botonEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                int filaSeleccionada = tablaContactos.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    
                    String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
                    String telefono = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
                    String correo = (String) modeloTabla.getValueAt(filaSeleccionada, 2);

                   
                    Contacto contactoSeleccionado = appContactos.buscarContactoCompleto(nombre, telefono, correo);

                   
                    EditarContacto(contactoSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona un contacto para editar. \n (darle click a un contacto en la tabla para seleccionar)");
                }
            }
        });
        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(20, 60, 150, 30); 
        ventana.add(botonEliminar);

        botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                int filaSeleccionada = tablaContactos.getSelectedRow();

                if (filaSeleccionada >= 0) {
                    
                    String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
                    String telefono = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
                    String correo = (String) modeloTabla.getValueAt(filaSeleccionada, 2);

                   
                    Contacto contactoSeleccionado = appContactos.buscarContactoCompleto(nombre, telefono, correo);
                    eliminarContacto(contactoSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona un contacto para editar. \n (darle click a un contacto en la tabla para seleccionar)");
                }
            }
        });
        ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {        
                if (e.getKeyCode() == KeyEvent.VK_E) {  
                    botonEditar.doClick();                   
                }                                      
            }                                           
        });  
        ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {        
                if (e.getKeyCode() == KeyEvent.VK_D) {  
                    botonEliminar.doClick();                   
                }                                      
            }                                           
        });   
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                ventana.requestFocus(); 
            }
        });
        
        
        
        ventana.setVisible(true);
    }
    private void eliminarContacto(Contacto contactoEliminado){
        appContactos.eliminarContacto(contactoEliminado);
        actualizarTablaResultados(appContactos.getContactos());
    }

    private void actualizarTablaResultados(ArrayList<Contacto> resultados) {
        modeloTabla.setRowCount(0);

        for (Contacto c : resultados) {
            modeloTabla.addRow(new Object[]{c.getNombre(), c.getTelefono(), c.getEmail()});
        }

    }

    private void EditarContacto(Contacto contactoViejo) {
        
        JFrame ventana = new JFrame("Editar Contacto");
        ventana.setSize(400, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.requestFocusInWindow();

        // Cargar los campos con los datos del contacto viejo
        JTextField campoNombre = new JTextField(contactoViejo.getNombre());
        campoNombre.setBounds(150, 20, 200, 25);
        JTextField campoApellido = new JTextField(contactoViejo.getApellido());
        campoApellido.setBounds(150, 60, 200, 25);
        JTextField campoTelefono = new JTextField(contactoViejo.getTelefono());
        campoTelefono.setBounds(150, 100, 200, 25);
        JTextField campoCorreo = new JTextField(contactoViejo.getEmail());
        campoCorreo.setBounds(150, 140, 200, 25);
        JTextField campoDireccion = new JTextField(contactoViejo.getDireccion());
        campoDireccion.setBounds(150, 180, 200, 25);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(50, 20, 100, 25);
        JLabel labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(50, 60, 100, 25);
        JLabel labelTelefono = new JLabel("Teléfono:");
        labelTelefono.setBounds(50, 100, 100, 25);
        JLabel labelCorreo = new JLabel("Correo:");
        labelCorreo.setBounds(50, 140, 100, 25);
        JLabel labelDireccion = new JLabel("Dirección:");
        labelDireccion.setBounds(50, 180, 100, 25);

        JLabel labelEstadoCivil = new JLabel("Estado Civil:");
        labelEstadoCivil.setBounds(50, 220, 100, 25);
        ventana.add(labelNombre);
        ventana.add(labelApellido);
        ventana.add(labelTelefono);
        ventana.add(labelCorreo);
        ventana.add(labelDireccion);
        ventana.add(labelEstadoCivil);

        // Estado civil
        String estadoCivil = contactoViejo.getEstadoCivil();
        ButtonGroup grupoEstadoCivil = new ButtonGroup();
        JRadioButton soltero = new JRadioButton("Soltero", estadoCivil.equals("Soltero"));
        soltero.setBounds(150, 220, 100, 25);
        JRadioButton casado = new JRadioButton("Casado", estadoCivil.equals("Casado"));
        casado.setBounds(250, 220, 100, 25);
        JRadioButton unionLibre = new JRadioButton("Unión Libre", estadoCivil.equals("Unión Libre"));
        unionLibre.setBounds(150, 250, 100, 25);
        JRadioButton divorciado = new JRadioButton("Divorciado", estadoCivil.equals("Divorciado"));
        divorciado.setBounds(250, 250, 100, 25);

        grupoEstadoCivil.add(soltero);
        grupoEstadoCivil.add(casado);
        grupoEstadoCivil.add(unionLibre);
        grupoEstadoCivil.add(divorciado);

        JButton botonImagen = new JButton("Cambiar Imagen");
        botonImagen.setBounds(50, 290, 150, 25);

        ventana.add(botonImagen);

        // Icono
        JLabel labelImagen = new JLabel();
        labelImagen.setBounds(210, 290, 100, 100);
        if (contactoViejo.getIcono() != null) {
            labelImagen.setIcon(contactoViejo.getIcono());
        }

        botonImagen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser selectorImagen = new JFileChooser();
                int resultado = selectorImagen.showOpenDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    String rutaImagen = selectorImagen.getSelectedFile().getAbsolutePath();
                    ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
                    Image imagenOriginal = iconoOriginal.getImage();
                    Image imagenRedimensionada = imagenOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    iconoSeleccionado = new ImageIcon(imagenRedimensionada); // Correcto, porque es un atributo de clase
                    labelImagen.setIcon(iconoSeleccionado); // Muestra la imagen en el JLabel
                }
            }
        });

        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(50, 400, 100, 30);

        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los nuevos datos ingresados
                String nuevoNombre = campoNombre.getText();
                String nuevoApellido = campoApellido.getText();
                String nuevoTelefono = campoTelefono.getText();
                String nuevoCorreo = campoCorreo.getText();
                String nuevaDireccion = campoDireccion.getText();

                String nuevoEstadoCivil = "";
                if (soltero.isSelected()) {
                    nuevoEstadoCivil = "Soltero";
                } else if (casado.isSelected()) {
                    nuevoEstadoCivil = "Casado";
                } else if (unionLibre.isSelected()) {
                    nuevoEstadoCivil = "Unión Libre";
                } else if (divorciado.isSelected()) {
                    nuevoEstadoCivil = "Divorciado";
                }

                Contacto contactoNuevo = new Contacto(nuevoNombre, nuevoApellido, nuevoTelefono, nuevoCorreo, nuevaDireccion, nuevoEstadoCivil, iconoSeleccionado);

                appContactos.editarContacto(contactoViejo, contactoNuevo);

                actualizarTablaResultados(appContactos.getContactos());

                ventana.dispose();
            }
        });
        ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {        
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                    botonGuardar.doClick();                   
                }                                      
            }                                           
        });   

        ventana.add(campoNombre);
        ventana.add(campoApellido);
        ventana.add(campoTelefono);
        ventana.add(campoCorreo);
        ventana.add(campoDireccion);
        ventana.add(soltero);
        ventana.add(casado);
        ventana.add(unionLibre);
        ventana.add(divorciado);
        ventana.add(botonGuardar);
        ventana.add(labelImagen);

        ventana.setVisible(true);
    }

    private void mostrarFormularioAñadirContacto() {
        JFrame ventana = new JFrame("Añadir Contacto");
        ventana.setSize(400, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(150, 20, 200, 25);
        JTextField campoApellido = new JTextField();
        campoApellido.setBounds(150, 60, 200, 25);
        JTextField campoTelefono = new JTextField();
        campoTelefono.setBounds(150, 100, 200, 25);
        JTextField campoCorreo = new JTextField();
        campoCorreo.setBounds(150, 140, 200, 25);
        JTextField campoDireccion = new JTextField();
        campoDireccion.setBounds(150, 180, 200, 25);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(50, 20, 100, 25);
        JLabel labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(50, 60, 100, 25);
        JLabel labelTelefono = new JLabel("Teléfono:");
        labelTelefono.setBounds(50, 100, 100, 25);
        JLabel labelCorreo = new JLabel("Correo:");
        labelCorreo.setBounds(50, 140, 100, 25);
        JLabel labelDireccion = new JLabel("Dirección:");
        labelDireccion.setBounds(50, 180, 100, 25);

        JLabel labelEstadoCivil = new JLabel("Estado Civil:");
        labelEstadoCivil.setBounds(50, 220, 100, 25);
        ButtonGroup grupoEstadoCivil = new ButtonGroup();
        JRadioButton soltero = new JRadioButton("Soltero");
        soltero.setBounds(150, 220, 100, 25);
        JRadioButton casado = new JRadioButton("Casado");
        casado.setBounds(250, 220, 100, 25);
        JRadioButton unionLibre = new JRadioButton("Unión Libre");
        unionLibre.setBounds(150, 250, 100, 25);
        JRadioButton divorciado = new JRadioButton("Divorciado");
        divorciado.setBounds(250, 250, 100, 25);

        grupoEstadoCivil.add(soltero);
        grupoEstadoCivil.add(casado);
        grupoEstadoCivil.add(unionLibre);
        grupoEstadoCivil.add(divorciado);
        ventana.requestFocusInWindow();


        JButton botonImagen = new JButton("Seleccionar Imagen");
        botonImagen.setBounds(50, 290, 150, 25);
        JLabel labelImagen = new JLabel();
        labelImagen.setBounds(210, 290, 100, 100);

        JButton botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(50, 400, 100, 30);
        JButton botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(200, 400, 100, 30);

        ventana.add(labelNombre);
        ventana.add(campoNombre);
        ventana.add(labelApellido);
        ventana.add(campoApellido);
        ventana.add(labelTelefono);
        ventana.add(campoTelefono);
        ventana.add(labelCorreo);
        ventana.add(campoCorreo);
        ventana.add(labelDireccion);
        ventana.add(campoDireccion);
        ventana.add(labelEstadoCivil);
        ventana.add(soltero);
        ventana.add(casado);
        ventana.add(unionLibre);
        ventana.add(divorciado);
        ventana.add(botonImagen);
        ventana.add(labelImagen);
        ventana.add(botonGuardar);
        ventana.add(botonCancelar);
        

        botonImagen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser selectorImagen = new JFileChooser();
                int resultado = selectorImagen.showOpenDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    String rutaImagen = selectorImagen.getSelectedFile().getAbsolutePath();
                    ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
                    Image imagenOriginal = iconoOriginal.getImage();
                    Image imagenRedimensionada = imagenOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    iconoSeleccionado = new ImageIcon(imagenRedimensionada); // Correcto, porque es un atributo de clase
                    labelImagen.setIcon(iconoSeleccionado);
                    ventana.requestFocusInWindow();// Muestra la imagen en el JLabel
                }
            }
        });
        

        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String telefono = campoTelefono.getText();
                String correo = campoCorreo.getText();
                String direccion = campoDireccion.getText();

                String estadoCivil = "";
                if (soltero.isSelected()) {
                    estadoCivil = "Soltero";
                } else if (casado.isSelected()) {
                    estadoCivil = "Casado";
                } else if (unionLibre.isSelected()) {
                    estadoCivil = "Unión Libre";
                } else if (divorciado.isSelected()) {
                    estadoCivil = "Divorciado";
                }

                Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, correo, direccion, estadoCivil, iconoSeleccionado);

                if (appContactos.existeContacto(nuevoContacto)) {
                    JOptionPane.showMessageDialog(null, "El contacto ya existe.");
                } else {
                    appContactos.agregarContacto(nuevoContacto);
                    actualizarTablaResultados(appContactos.getContactos());
                    ventana.dispose();
                }
            }
        });
        ventana.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {
                ventana.requestFocusInWindow();
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                    botonGuardar.doClick();                   
                }                                      
            }                                           
        });   

        botonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });
        ventana.add(labelImagen);
        ventana.add(botonImagen);
        ventana.setVisible(true);
    }

}
