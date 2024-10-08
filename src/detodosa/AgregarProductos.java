package detodosa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class AgregarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarProductos
     */
    private CategoriaData cd;
    private ProductoData pd;
    private DefaultTableModel modelo;
    private Producto productoElegido;
    
    public AgregarProductos() {
        initComponents();
        cd = new CategoriaData();
        modelo= new DefaultTableModel();
        pd = new ProductoData();
        llenarCombos();
        DesactivarCampos();
        ArmarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSStock = new javax.swing.JSpinner();
        jCcategoriasProducto = new javax.swing.JComboBox<>();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCcategorias = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("De todo S.A: Productos");
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setText("Filtrar por categoria:");

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProductos);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodigoFocusLost(evt);
            }
        });
        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jTDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripcionFocusLost(evt);
            }
        });
        jTDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescripcionActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion:");

        jTPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPrecioFocusLost(evt);
            }
        });
        jTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(347, 347, 347))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTDescripcion))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(47, 47, 47)
                                    .addComponent(jTPrecio)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCcategoriasProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(183, 183, 183))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCcategoriasProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-add-product-48.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-aprobar-y-actualizar-48.png"))); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.setEnabled(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Gestion de productos");
        jLabel7.setPreferredSize(new java.awt.Dimension(900, 900));

        jCcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jBBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBCerrar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBNuevo)
                                .addGap(44, 44, 44)
                                .addComponent(jBGuardar)
                                .addGap(44, 44, 44)
                                .addComponent(jBActualizar)
                                .addGap(44, 44, 44)
                                .addComponent(jBEliminar)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBBuscar)
                        .addGap(158, 158, 158)
                        .addComponent(jBCerrar)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBActualizar)
                    .addComponent(jBEliminar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioActionPerformed

    private void jTDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescripcionActionPerformed

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       Producto pn=new Producto();
          
        pn.setCodigo(Integer.parseInt(jTCodigo.getText()));
        pn.setDescripcion(jTDescripcion.getText());
        pn.setPrecio(Double.parseDouble(jTPrecio.getText()));
        pn.setCategoria((Categoria)jCcategoriasProducto.getSelectedItem());
        pn.setStock((Integer)jSStock.getValue());
        
        pd.guardarProducto(pn);
        limpiarCampos();
        
         DesactivarCampos();
       jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       jBGuardar.setEnabled(true);
        limpiarCampos();
        activarCampos();
       jBActualizar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jCcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcategoriasActionPerformed
        LlenarTabla();
    }//GEN-LAST:event_jCcategoriasActionPerformed

    private void jTCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodigoFocusLost
        String val="[0-9]*";
        if(!jTCodigo.getText().matches(val)){
        
            JOptionPane.showMessageDialog(this, "Debe ingresar unicamente numeros");
            jTCodigo.requestFocus();
    }//GEN-LAST:event_jTCodigoFocusLost

    }
    private void jTDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripcionFocusLost
        if(jTDescripcion.getText().length()==0){
          JOptionPane.showMessageDialog(this,"La descripcion no puede estar vacia");
          jTDescripcion.requestFocus();
        }
    }//GEN-LAST:event_jTDescripcionFocusLost

    private void jTPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPrecioFocusLost
     try{
        String precio=jTPrecio.getText();
        double prec=Double.parseDouble(precio);
        }catch(NumberFormatException NFE){
        
            JOptionPane.showMessageDialog(this, "ingresa un precio válido");
            jTPrecio.requestFocus();
        }   
    }//GEN-LAST:event_jTPrecioFocusLost

    private void jTProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProductosMouseClicked
        jBActualizar.setEnabled(true);
        jBEliminar.setEnabled(true);
        int filaElegida=jTProductos.getSelectedRow();
        
        if(filaElegida!=-1){
                int idProducto=(Integer)jTProductos.getValueAt(filaElegida, 0);
                int codigo=(Integer)jTProductos.getValueAt(filaElegida, 1);
                String descripcion=(String)jTProductos.getValueAt(filaElegida, 2);
                double precio=(Double)jTProductos.getValueAt(filaElegida,3);
                Categoria catTabla=(Categoria)jTProductos.getValueAt(filaElegida, 4);
                int stock=(Integer)jTProductos.getValueAt(filaElegida, 5);
                
                jTCodigo.setText(codigo+"");
                jTDescripcion.setText(descripcion);
                jTPrecio.setText(precio+"");
                jCcategoriasProducto.setSelectedItem(catTabla);
                jSStock.setValue(stock);
                
                activarCampos();
                productoElegido=new Producto();
                productoElegido.setIdProducto(idProducto);
                productoElegido.setCodigo(codigo);
                productoElegido.setDescripcion(descripcion);
                productoElegido.setPrecio(precio);
                productoElegido.setCategoria(catTabla);
                productoElegido.setStock(stock);
        }
    }//GEN-LAST:event_jTProductosMouseClicked

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int codigo=Integer.parseInt(jTCodigo.getText());
                String descripcion=jTDescripcion.getText();
                double precio=Double.parseDouble(jTPrecio.getText());
                Categoria catNueva=(Categoria)jCcategoriasProducto.getSelectedItem();
                int stock=(Integer)jSStock.getValue();
                
                
                productoElegido.setCodigo(codigo);
                productoElegido.setDescripcion(descripcion);
                productoElegido.setPrecio(precio);
                productoElegido.setStock(stock);
                productoElegido.setCategoria(catNueva);
                
                 pd.modificarProducto(productoElegido);
                 productoElegido=null;
                limpiarCampos();
                DesactivarCampos();
                LlenarTabla();
                jBActualizar.setEnabled(false);
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        pd.borraProducto(productoElegido);
        DesactivarCampos();
        LlenarTabla();
        jBEliminar.setEnabled(false);
    }//GEN-LAST:event_jBEliminarActionPerformed
    
    private void llenarCombos(){
       
        for(Categoria c:cd.obtenerCategorias()){
        
            jCcategorias.addItem(c);
            jCcategoriasProducto.addItem(c);
            
        }
    }
 public void activarCampos(){
 jTCodigo.setEnabled(true);
 jTDescripcion.setEnabled(true);
 jTPrecio.setEnabled(true);
 jSStock.setEnabled(true);
 jCcategoriasProducto.setEnabled(true);
 }
  private void DesactivarCampos(){
 jTCodigo.setEnabled(false);
 jTDescripcion.setEnabled(false);
 jTPrecio.setEnabled(false);
 jSStock.setEnabled(false);
 jCcategoriasProducto.setEnabled(false);
 }
  private void limpiarCampos(){
    
        jTCodigo.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jCcategoriasProducto.setSelectedIndex(0);
        jSStock.setValue(0);
        
    }
  private void ArmarCabecera(){
  ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Codigo");
        columnas.add("Descripcion");
        columnas.add("Precio");
        columnas.add("Categoria");
        columnas.add("Stock");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jTProductos.setModel(modelo);
  }
  private void LlenarTabla(){
         BorrarFilas();    
         Categoria elegida=(Categoria)jCcategorias.getSelectedItem();
        
        if(elegida!=null){
        
            for(Producto p:pd.obtenerProductos()){
            
                if(p.getCategoria().equals(elegida)){
                
                    modelo.addRow(new Object[]{p.getIdProducto(),p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getCategoria(),p.getStock()});
                }
            }
        }
  }
  private void BorrarFilas(){
         int a = modelo.getRowCount()-1;

                for(int i=a;i>=0;i--){
   
                    modelo.removeRow(i );
            }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<Categoria> jCcategorias;
    private javax.swing.JComboBox<Categoria> jCcategoriasProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
