package MiniProyecto;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

public class AppContacto {

    private ArrayList<Contacto> contactos;
  
   

    public AppContacto() {
        contactos = new ArrayList<>();
        
       
                
    }

    public boolean existeContacto(Contacto contacto) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(contacto.getNombre()) && c.getTelefono().equals(contacto.getTelefono())) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarContacto(Contacto contacto) {
        if (!existeContacto(contacto)) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    public void eliminarContacto(Contacto contacto) {
    
    int confirmacion = JOptionPane.showConfirmDialog(null,"¿Estás seguro de que deseas eliminar este contacto?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

    
    if (confirmacion == JOptionPane.YES_OPTION) {
        contactos.remove(contacto); 
        JOptionPane.showMessageDialog(null, "Contacto eliminado.");
    } else {
        JOptionPane.showMessageDialog(null, "El contacto no fue eliminado.");
    }
}
    public void editarContacto(Contacto contactoViejo, Contacto contactoNuevo) {
  
    int confirmacion = JOptionPane.showConfirmDialog(null,
            "¿Estás seguro de que deseas editar este contacto?",
            "Confirmar Edición", JOptionPane.YES_NO_OPTION);

  
    if (confirmacion == JOptionPane.YES_OPTION) {
     
        for (int i = 0; i < contactos.size(); i++) {
            Contacto c = contactos.get(i);

            if (c.getNombre().equals(contactoViejo.getNombre()) || c.getTelefono().equals(contactoViejo.getTelefono())) {
                contactos.set(i, contactoNuevo); 
                JOptionPane.showMessageDialog(null, "Contacto editado.");
                break;
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "El contacto no fue editado.");
    }
}


    public void buscarContactos(String buscado) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equals(buscado) || c.getTelefono().equals(buscado)) {
                mostrarInformacionContacto(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Sin Resultados");
        }

    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

 private void mostrarInformacionContacto(Contacto contacto) {
   
    JFrame ventana = new JFrame("Información del Contacto");
    ventana.setSize(400, 400);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    
    JLabel labelIcono = new JLabel();
    labelIcono.setBounds(150, 10, 100, 100); 
    ImageIcon icono = contacto.getIcono();
    
   
    if (icono != null) {
        labelIcono.setIcon(icono);
    }

    
    JLabel labelNombre = new JLabel("Nombre: " + contacto.getNombre());
    labelNombre.setBounds(50, 120, 300, 25);
    
    JLabel labelApellido = new JLabel("Apellido: " + contacto.getApellido());
    labelApellido.setBounds(50, 150, 300, 25);
    
    JLabel labelTelefono = new JLabel("Teléfono: " + contacto.getTelefono());
    labelTelefono.setBounds(50, 180, 300, 25);
    
    JLabel labelCorreo = new JLabel("Correo: " + contacto.getEmail());
    labelCorreo.setBounds(50, 210, 300, 25);
    
    JLabel labelDireccion = new JLabel("Dirección: " + contacto.getDireccion());
    labelDireccion.setBounds(50, 240, 300, 25);
    
    JLabel labelEstadoCivil = new JLabel("Estado Civil: " + contacto.getEstadoCivil());
    labelEstadoCivil.setBounds(50, 270, 300, 25);
    
  
    JButton botonCerrar = new JButton("Cerrar");
    botonCerrar.setBounds(150, 320, 100, 30);
    botonCerrar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ventana.dispose(); 
        }
    });

  
    ventana.add(labelIcono);
    ventana.add(labelNombre);
    ventana.add(labelApellido);
    ventana.add(labelTelefono);
    ventana.add(labelCorreo);
    ventana.add(labelDireccion);
    ventana.add(labelEstadoCivil);
    ventana.add(botonCerrar);
    
    
    ventana.setVisible(true);
}
 public Contacto buscarContactoCompleto(String nombre, String telefono, String email) {
    for (Contacto c : contactos) {
        if (c.getNombre().equals(nombre) && c.getTelefono().equals(telefono) && c.getEmail().equals(email)) {
            return c; 
        }
    }
    return null; 
}



}
