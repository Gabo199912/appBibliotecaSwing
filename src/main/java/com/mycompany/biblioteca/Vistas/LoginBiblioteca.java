package com.mycompany.biblioteca.Vistas;

import Modelos.UsuarioModelos;
import Modelos.librosModelos;
import Modelos.prestamoModelo;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LoginBiblioteca extends javax.swing.JFrame {

    DefaultTableModel TablaLibros = new DefaultTableModel();
    DefaultTableModel TablaUsuarios = new DefaultTableModel();
    DefaultTableModel TablaPrestamos = new DefaultTableModel();
    
    
    DefaultListModel ListaLibros = new DefaultListModel();
    DefaultListModel ListaUsuarios = new DefaultListModel();
    
    public LoginBiblioteca() {
        initComponents();
        TitulosTablaLibros();
        TituloTablaUsuario();
        TituloTablaPrestamos();
                
        
        DatosEnTablaLibro();
        datosTablaUsuarios();
        
        
        
        mostrarListaLibros();
        mostrarListaUsuarios();
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarLibros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEliminarLibro = new javax.swing.JTable();
        btnEliminarLibro = new javax.swing.JButton();
        txtEliminarLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAgregarLibro = new javax.swing.JTable();
        btnAgregarLibro = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbUsuariosTabla = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtEdadUsuario = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIdLibroPrestamo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsuarioPrestamo = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lsLibroLista = new javax.swing.JList<>();
        btnSolicitarLibro = new javax.swing.JButton();
        btnMostrarLibrosLista = new javax.swing.JButton();
        btnMostrarPersonaLista = new javax.swing.JButton();
        btnSolicitarUsuario = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTablaPrestamos = new javax.swing.JTable();
        btnSolicitarPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tbListarLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbListarLibros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Listar Libro", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEliminarLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbEliminarLibro);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 25, -1, 320));

        btnEliminarLibro.setText("Eliminar Libro");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));
        jPanel3.add(txtEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL INDICE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 30));

        jTabbedPane1.addTab("Eliminar Libro", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbAgregarLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbAgregarLibro);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 250));

        btnAgregarLibro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btnAgregarLibro.setText("AGREGAR LIBRO");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));
        jPanel4.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, 30));

        jLabel2.setText("TITULO");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel3.setText("GENERO");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));
        jPanel4.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 100, 30));

        jLabel4.setText("AUTOR");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));
        jPanel4.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 100, 30));

        jTabbedPane1.addTab("Agregar Libro", jPanel4);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbUsuariosTabla.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbUsuariosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbUsuariosTabla);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 260));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel6.setText("APELLIDO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txtApellidoUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txtApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 100, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel7.setText("EMAIL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        txtEmailUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, 30));

        btnAgregarUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btnAgregarUsuario.setText("AGREGAR USUARIO");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setText("EDAD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        txtEdadUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txtEdadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 110, 30));

        jTabbedPane1.addTab("Usuarios", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("INGRESA EL ID DEL LIBRO");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtIdLibroPrestamo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdLibroPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLibroPrestamoActionPerformed(evt);
            }
        });
        txtIdLibroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdLibroPrestamoKeyReleased(evt);
            }
        });
        jPanel5.add(txtIdLibroPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("INGRESA EL ID DEL USUARIO");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        txtUsuarioPrestamo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuarioPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioPrestamoActionPerformed(evt);
            }
        });
        jPanel5.add(txtUsuarioPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 30));

        lstUsuarios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lstUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lstUsuarios);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 260, 120));

        lsLibroLista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lsLibroLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lsLibroLista);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 120));

        btnSolicitarLibro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSolicitarLibro.setText("MOSTRAR LIBRO");
        btnSolicitarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarLibroActionPerformed(evt);
            }
        });
        jPanel5.add(btnSolicitarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        btnMostrarLibrosLista.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btnMostrarLibrosLista.setText("LISTAR LIBROS");
        btnMostrarLibrosLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosListaActionPerformed(evt);
            }
        });
        jPanel5.add(btnMostrarLibrosLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnMostrarPersonaLista.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btnMostrarPersonaLista.setText("LISTAR PERSONA");
        btnMostrarPersonaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonaListaActionPerformed(evt);
            }
        });
        jPanel5.add(btnMostrarPersonaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        btnSolicitarUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSolicitarUsuario.setText("MOSTRAR PERSONA");
        btnSolicitarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(btnSolicitarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        tbTablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tbTablaPrestamos);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 120));

        btnSolicitarPrestamo.setText("SOLICITAR");
        btnSolicitarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPrestamoActionPerformed(evt);
            }
        });
        jPanel5.add(btnSolicitarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jTabbedPane1.addTab("Prestar Libro", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdLibroPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLibroPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdLibroPrestamoActionPerformed

    private void txtUsuarioPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioPrestamoActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
       agregarUsuario();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        agregarLibro();// TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        eliminarLibroDeTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void txtIdLibroPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdLibroPrestamoKeyReleased
      
    }//GEN-LAST:event_txtIdLibroPrestamoKeyReleased

    private void btnSolicitarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarLibroActionPerformed
        solicitarLibro();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarLibroActionPerformed

    private void btnMostrarLibrosListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosListaActionPerformed
        mostrarListaLibros();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarLibrosListaActionPerformed

    private void btnMostrarPersonaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonaListaActionPerformed
        mostrarListaUsuarios();// TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarPersonaListaActionPerformed

    private void btnSolicitarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarUsuarioActionPerformed
       solicitarPersona(); // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarUsuarioActionPerformed

    private void btnSolicitarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPrestamoActionPerformed
       AgregarPrestamoUsuarioYLibro(); // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarPrestamoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBiblioteca().setVisible(true);
                
            }
        });
    }
    
    //----------------------------AGREGAR LOS DATOS A LAS TABLAS----------------------------------------
   public void agregarLibro(){
       String Titulo = txtTitulo.getText();
       String Genero = txtGenero.getText();
       String Autor = txtAutor.getText();
       
       
       librosModelos.listaLibrosModelos.add(new librosModelos(Titulo, Genero, Autor));
       
       txtTitulo.setText("");
       txtGenero.setText("");
       txtAutor.setText("");
       
       actualizarLibros();
   };
   
   
   
   public void agregarUsuario(){
       String nombre = txtNombreUsuario.getText();
       String apellido = txtApellidoUsuario.getText();
       String email = txtEmailUsuario.getText();
       
       
       
       try {
        int edad = Integer.parseInt( txtEdadUsuario.getText().trim());
        
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos(nombre, apellido, edad, email));
        JOptionPane.showMessageDialog(null, "Usuario ingresado con exito");
        
        limpiarCamposUsuario();
        actualizarUsuarios();
        
            
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "La edad debe ser un numero");
           txtEdadUsuario.setText("");
       }
   }
   
   //----------------------------------------------------------------------------------------------------
   
   
   
   
   
   
   
   //----------------------------ELIMINAR LOS DATOS DE LA TABLA----------------------------------------
   
   public void eliminarLibroDeTabla(){
       String valorNumerico = txtEliminarLibro.getText().trim();

    try {
        int indiceEliminado = Integer.parseInt(valorNumerico);
        if (indiceEliminado < 1 || indiceEliminado > librosModelos.listaLibrosModelos.size()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Id válido dentro del rango");
            txtEliminarLibro.setText("");
            return; 
        }

       
        librosModelos.listaLibrosModelos.remove(indiceEliminado - 1);
        actualizarLibros();
        JOptionPane.showMessageDialog(null, "Libro eliminado con éxito");
        txtEliminarLibro.setText("");

    } catch (NumberFormatException e) {
        
        JOptionPane.showMessageDialog(null, "Ingrese un número válido");
        txtEliminarLibro.setText("");
    }
          
   }
   
   
   //----------------------------------------------------------------------------------------------------
   
   
   
   
   
   
   
   //----------------------MUESTRA LOS DATOS DE LA LISTA-----------------------------------------
   
   public void mostrarListaLibros(){
       lsLibroLista.setModel(ListaLibros);
       
       ListaLibros.removeAllElements();
       for (int i = 0; i < librosModelos.listaLibrosModelos.size(); i++) {
           librosModelos libros = librosModelos.listaLibrosModelos.get(i);
           ListaLibros.addElement((i+1)+ ". " + libros.getTitulo());
           
       }
   }
   
   public void mostrarListaUsuarios(){
       lstUsuarios.setModel(ListaUsuarios);
       
       ListaUsuarios.removeAllElements();
       for (int i = 0; i < UsuarioModelos.listaUsuarios.size(); i++) {
           UsuarioModelos Usuarios = UsuarioModelos.listaUsuarios.get(i);
           ListaUsuarios.addElement((i+1)+ ". " + Usuarios.getNombre() + " " + Usuarios.getApellido());
           
       }
   }
   
   
   
   //----------------------------------------------------------------------------------------------------
   
   
   
      //----------------------MUESTRA EL USUARIO SELECCIONADO DE LA LISTA-----------------------------------------

   
   public void solicitarLibro(){
       
       
       try {
           int idLibroPrestamo = Integer.parseInt(txtIdLibroPrestamo.getText());
           txtIdLibroPrestamo.setText("");
           
           lsLibroLista.setModel(ListaLibros);
           ListaLibros.removeAllElements();
           

           librosModelos libros = librosModelos.listaLibrosModelos.get(idLibroPrestamo-1);
           ListaLibros.addElement((idLibroPrestamo)+ ". " + libros.getTitulo());
           
             
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ingrese un ID valido");
           txtIdLibroPrestamo.setText("");
       }
   }
   
   
   public void solicitarPersona(){
       try {
           int idPersonaPrestamo = Integer.parseInt(txtUsuarioPrestamo.getText());
           txtUsuarioPrestamo.setText("");
           
           lstUsuarios.setModel(ListaUsuarios);
           ListaUsuarios.removeAllElements();
           
           UsuarioModelos usuarios = UsuarioModelos.listaUsuarios.get(idPersonaPrestamo - 1);
           ListaUsuarios.addElement(idPersonaPrestamo + ". " + usuarios.getNombre() + " " + usuarios.getApellido());
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ingresa un ID correcto");
           txtUsuarioPrestamo.setText("");
       }
   }
   
   //----------------------------------------------------------------------------------------------------
   
   
   
   
   
   //----------------------AGREGA UN PRESTAMO EN LA TABLA-----------------------------------------
   
   
   public void AgregarPrestamoUsuarioYLibro(){
        
        String usuario =  (String)lstUsuarios.getModel().getElementAt(0);
        String libro = (String)lsLibroLista.getModel().getElementAt(0);
        
        prestamoModelo.prestamoModelos.add(new prestamoModelo(usuario, libro));
        
        
        
       actualizarTablaPrestamo();
        
   }
   
   
   
   
   
   //----------------------------------------------------------------------------------------------------
   
   
   

    
    
    //----------------------MUESTRA LOS TITULOS DE LAS TABLAS-----------------------------------------
    
    public void TitulosTablaLibros(){
        TablaLibros.addColumn("Id Libro");
        TablaLibros.addColumn("Titulo");
        TablaLibros.addColumn("Genero");
        TablaLibros.addColumn("Autor");
        
        tbAgregarLibro.setModel(TablaLibros);
        tbEliminarLibro.setModel(TablaLibros);
        tbListarLibros.setModel(TablaLibros);
    };
    
    
    
    public void TituloTablaUsuario(){
        TablaUsuarios.addColumn("NOMBRE");
        TablaUsuarios.addColumn("APELLIDO");
        TablaUsuarios.addColumn("CORREO");
        TablaUsuarios.addColumn("EDAD");
        
        tbUsuariosTabla.setModel(TablaUsuarios);
    };
    
    
    public void TituloTablaPrestamos(){
        TablaPrestamos.addColumn("TITULO LIBRO");
        TablaPrestamos.addColumn("NOMBRE DE PERSONA");
        
        tbTablaPrestamos.setModel(TablaPrestamos);
    }
    
    //----------------------------------------------------------------------------------------------------
    
    
    
    
    //-------------------MUESTRA LOS DATOS QUE TIENE EL ARREGLO EN LAS TABLAS---------------------
    
    public void DatosEnTablaLibro(){

        librosModelos.listaLibrosModelos.add(new librosModelos("1984", "Ciencia Ficción", "George Orwell"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Cien años de soledad", "Realismo mágico", "Gabriel García Márquez"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Orgullo y prejuicio", "Romance", "Jane Austen"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El señor de los anillos", "Fantasía", "J.R.R. Tolkien"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Don Quijote de la Mancha", "Aventura", "Miguel de Cervantes"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Crimen y castigo", "Drama", "Fiódor Dostoyevski"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Matar a un ruiseñor", "Ficción", "Harper Lee"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El principito", "Fantasía", "Antoine de Saint-Exupéry"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Los juegos del hambre", "Ciencia Ficción", "Suzanne Collins"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Harry Potter y la piedra filosofal", "Fantasía", "J.K. Rowling"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Los pilares de la tierra", "Histórico", "Ken Follett"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El código Da Vinci", "Misterio", "Dan Brown"));
        librosModelos.listaLibrosModelos.add(new librosModelos("It", "Terror", "Stephen King"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Drácula", "Terror", "Bram Stoker"));
        librosModelos.listaLibrosModelos.add(new librosModelos("La sombra del viento", "Misterio", "Carlos Ruiz Zafón"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El alquimista", "Ficción", "Paulo Coelho"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El retrato de Dorian Gray", "Filosofía", "Oscar Wilde"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Fundación", "Ciencia Ficción", "Isaac Asimov"));
        librosModelos.listaLibrosModelos.add(new librosModelos("El nombre del viento", "Fantasía", "Patrick Rothfuss"));
        librosModelos.listaLibrosModelos.add(new librosModelos("Rayuela", "Experimental", "Julio Cortázar"));

        actualizarLibros();
        
    };
    
    
    
    public void datosTablaUsuarios(){
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Angel Gabriel", "Vásquez Argueta", 25, "angelvasquez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("María Fernanda", "López Martínez", 30, "maria.lopez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("José Manuel", "González Pérez", 28, "jose.gonzalez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Carla Patricia", "Rodríguez Herrera", 22, "carla.rodriguez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Daniel Alejandro", "Ramírez Torres", 35, "daniel.ramirez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Laura Beatriz", "Hernández Díaz", 27, "laura.hernandez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Carlos Eduardo", "Sánchez López", 32, "carlos.sanchez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Andrea Sofía", "Morales Gutiérrez", 29, "andrea.morales@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Javier Esteban", "Castillo Ríos", 24, "javier.castillo@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Camila Isabel", "Ortiz Mendoza", 31, "camila.ortiz@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Luis Alberto", "Reyes Silva", 26, "luis.reyes@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Ana Victoria", "Gómez Chávez", 23, "ana.gomez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Roberto Carlos", "Pineda Flores", 33, "roberto.pineda@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Gabriela Alejandra", "Vargas Jiménez", 21, "gabriela.vargas@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Fernando Jesús", "Cortés Peña", 34, "fernando.cortes@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Elena Margarita", "Navarro León", 20, "elena.navarro@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Ricardo Andrés", "Delgado Soto", 36, "ricardo.delgado@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Patricia Eugenia", "Méndez Espinoza", 29, "patricia.mendez@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Diego Sebastián", "Vera Aguirre", 27, "diego.vera@gmail.com"));
        UsuarioModelos.listaUsuarios.add(new UsuarioModelos("Isabel Cristina", "Lara Fuentes", 22, "isabel.lara@gmail.com"));


        
        actualizarUsuarios();
    };
    //----------------------------------------------------------------------------------------------------
    
    
    
    
    
    //-------------------------------ACTUALIZAR CANTIDADES----------------------------------
    
    public void actualizarLibros(){
        TablaLibros.setRowCount(0);
        
        for(int i = 0; i<librosModelos.listaLibrosModelos.size(); i++){
            librosModelos libros = librosModelos.listaLibrosModelos.get(i);
            TablaLibros.addRow(new Object[]{(i+1), libros.getTitulo(), libros.getGenero(), libros.getAutor()});
        }
    }
    
    
    public void actualizarUsuarios(){
        TablaUsuarios.setRowCount(0);
        
        for (int i = 0; i < UsuarioModelos.listaUsuarios.size(); i++) {
            UsuarioModelos usuarios = UsuarioModelos.listaUsuarios.get(i);
            TablaUsuarios.addRow(new Object[]{(i+1), usuarios.getNombre(), usuarios.getApellido(), usuarios.getCorreo(), usuarios.getEdad()});
            
        }
    }
    
    
    public void actualizarTablaPrestamo(){
        TablaPrestamos.setRowCount(0);
        
        for (int i = 0; i < prestamoModelo.prestamoModelos.size(); i++) {
            prestamoModelo prestamos = prestamoModelo.prestamoModelos.get(i);
            TablaPrestamos.addRow(new Object[]{prestamos.getTituloLibro(), prestamos.getNombre()});
            
        }
    }
    
   
    
    //----------------------------------------------------------------------------------------------------
    
    
    
     //-------------------------------LIMPIAR PROPIEDADES----------------------------------
    
    public void limpiarCamposUsuario(){
        txtNombreUsuario.setText("");
        txtApellidoUsuario.setText("");
        txtEdadUsuario.setText("");
        txtEmailUsuario.setText("");
    }
    
        //----------------------------------------------------------------------------------------------------
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnMostrarLibrosLista;
    private javax.swing.JButton btnMostrarPersonaLista;
    private javax.swing.JButton btnSolicitarLibro;
    private javax.swing.JButton btnSolicitarPrestamo;
    private javax.swing.JButton btnSolicitarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lsLibroLista;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JTable tbAgregarLibro;
    private javax.swing.JTable tbEliminarLibro;
    private javax.swing.JTable tbListarLibros;
    private javax.swing.JTable tbTablaPrestamos;
    private javax.swing.JTable tbUsuariosTabla;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdadUsuario;
    private javax.swing.JTextField txtEliminarLibro;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdLibroPrestamo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuarioPrestamo;
    // End of variables declaration//GEN-END:variables
}
