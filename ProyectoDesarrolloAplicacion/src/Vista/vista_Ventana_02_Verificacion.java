package Vista;
import Controlador.Controlador_Producto;
import Modelo.Modelo_BaseDatos_Producto;
import Modelo.Modelo_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class vista_Ventana_02_Verificacion extends javax.swing.JFrame {
    Modelo_BaseDatos_Producto modeloProducto = new Modelo_BaseDatos_Producto();
    Connection conexion = modeloProducto.getConexion();
    private LinkedList productos;
    private DefaultTableModel modelo;
    private int contenedor = 0;
    public vista_Ventana_02_Verificacion(LinkedList productos) {
        initComponents();
        this.productos = productos;
        cargar();
        cargarTotal();
    }
    
    
    public void cargar(){
        String [][][][] datos = {};
        String columna[] = {"nombre","tipoProducto","cantidad","nombreProveedor","sucursal"};
        modelo = new DefaultTableModel(datos, columna);
        tabla.setModel(modelo);

     }
    
    public void cargarTotal(){
        Modelo_Producto producto;
        for (int i = 0; i < productos.size(); i++) {
            producto = (Modelo_Producto) productos.get(i);
            modelo.insertRow(contenedor,new Object[]{});
            modelo.setValueAt(producto.getNombre(), contenedor, 0);
            modelo.setValueAt(producto.getTipoProducto(), contenedor, 1);
            modelo.setValueAt(String.valueOf(producto.getCantidad()), contenedor, 2);
            modelo.setValueAt(producto.getNombreProveedor(), contenedor, 3);
            modelo.setValueAt(producto.getSucursal(), contenedor, 4);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Resumen");

        jButton1.setText("Cancelar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Enviar Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(this, "¿QUIERES CANCELAR TU PRODUCTO?");
        if (respuesta == JOptionPane.YES_OPTION) {
            try{
                int fila = tabla.getSelectedRow();
                if (fila >= 0) {
                    modelo.removeRow(fila);
                    limpiar();
                    productos.remove(fila);
                    JOptionPane.showMessageDialog(null, "SE ELIMINO EL PRODUCTO");
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
                    productos.remove(fila);
                    limpiar();
                    dispose();
                    
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiar(){
        int eliminar = tabla.getRowCount();
        for (int i = eliminar-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "SE GUARDARON LOS CAMBIOS");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        for (int i = 0; i < tabla.getRowCount(); i++) {
            try {
                PreparedStatement pst = conexion.prepareStatement("INSERT INTO producto(nombre,tipoProducto,cantidad,nombreProveedor,sucursal) VALUES(?,?,?,?,?)");
                pst.setString(1,tabla.getValueAt(i, 0).toString());
                pst.setString(2,tabla.getValueAt(i, 1).toString());
                pst.setString(3,tabla.getValueAt(i, 2).toString());
                pst.setString(4, tabla.getValueAt(i, 3).toString());
                pst.setString(5, tabla.getValueAt(i, 4).toString());
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(vista_Ventana_02_Verificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Se esta enviando el pedido");
        vista_Ventana_03_BaseDatos ventana3 = new vista_Ventana_03_BaseDatos();
        ventana3.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
