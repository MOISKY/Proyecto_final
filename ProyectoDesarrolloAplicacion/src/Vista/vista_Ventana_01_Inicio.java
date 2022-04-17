package Vista;
import Modelo.Modelo_Producto;
import Controlador.Controlador_Producto;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import java.lang.Character;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
public class vista_Ventana_01_Inicio extends javax.swing.JFrame {
    private int contador = 0;
    private Character caracter;
    private LinkedList productos = new LinkedList();
    private ButtonGroup grupoBotones = new ButtonGroup();
    private ButtonGroup grupoListas = new ButtonGroup();
    private Controlador_Producto producto  = new Controlador_Producto();
    public vista_Ventana_01_Inicio() {
        initComponents();
        grupoBotones.add(campo1);
        grupoBotones.add(campo2);
        grupoBotones.add(campo3);
        
        grupoListas.add(lista1);
        grupoListas.add(lista2);
        grupoListas.add(lista3);
        grupoListas.add(lista4);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        tipoProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        campo1 = new javax.swing.JRadioButton();
        campo2 = new javax.swing.JRadioButton();
        campo3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lista1 = new javax.swing.JCheckBox();
        lista2 = new javax.swing.JCheckBox();
        lista3 = new javax.swing.JCheckBox();
        lista4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de Producto:");

        nombreProducto.setColumns(15);

        tipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "comic", "novela", "Iibro", "enciclopedia" }));

        jLabel2.setText("Tipo de Producto: ");

        jLabel3.setText("Cantidad");

        cantidad.setColumns(15);

        campo1.setText("panini");

        campo2.setText("pearson");

        campo3.setText("conamat");

        jLabel4.setText("Sucursal");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Proveedor");

        lista1.setText("Sanborns");

        lista2.setText("Sams");

        lista3.setText("Oficce Deapott");

        lista4.setText("Fabricas de Francia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(campo2)
                        .addComponent(campo1)
                        .addComponent(jLabel5)
                        .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(nombreProducto)
                        .addComponent(jLabel1)
                        .addComponent(tipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(campo3)
                    .addComponent(lista1)
                    .addComponent(lista2)
                    .addComponent(lista3)
                    .addComponent(lista4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(tipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lista2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lista3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lista4)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (noEsAlphanumerico(nombreProducto.getText()) == false)
            if(!"".equals(tipoProducto.getSelectedItem().toString()))  
                if (Integer.parseInt(cantidad.getText()) > 0)
                    if(!"No hay ningun seleccionado".equals(this.getProveedor())) 
                        if(!"No hay ningun seleccionado".equals(getSucursal())){
                            productos.add(new Modelo_Producto(nombreProducto.getText(),tipoProducto.getSelectedItem().toString(),Integer.parseInt(cantidad.getText()),this.getProveedor(),getSucursal().toString()));
                            vista_Ventana_02_Verificacion nuevaVentana = new vista_Ventana_02_Verificacion(productos);
                            nuevaVentana.setVisible(true);
                            //contador ++;
                            //producto.guardar(nombreProducto.getText(), tipoProducto.getSelectedItem().toString(),Integer.parseInt(cantidad.getText()), this.getProveedor(),this.getSucursal());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Escoja una sucursal");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Escoja un proveedor");
                    }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Escriba un numero correctamente");
                }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un tipo de producto");
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "Escriba correctamente el nombre del producto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean noEsAlphanumerico(String texto){
        boolean bandera = false;
        for (int i = 0; i < texto.length(); i++) {
            if (!caracter.isLetterOrDigit(texto.charAt(i))) {
                bandera = true;
                break;
            }
        }
        if (bandera == true ) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getProveedor(){
        if (this.campo1.isSelected()) {
            return this.campo1.getText();
        }
        else
            if (this.campo2.isSelected()){
                return this.campo2.getText();
            }
            else
                if (this.campo3.isSelected()) {
                    return campo3.getText();
        }
        return "No hay ningun seleccionado";
    }
    
    public String getSucursal(){
        if (this.lista1.isSelected()) {
            return lista1.getText();
        } else if (this.lista2.isSelected()) {
            return lista2.getText();
        } else if (this.lista3.isSelected()) {
            return lista3.getText();
        } else if (this.lista4.isSelected()) {
            return lista4.getText();
        }
        return "No hay ningun seleccionado";
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        nombreProducto.setText("");
        tipoProducto.setSelectedIndex(0);
        cantidad.setText("");
        grupoBotones.clearSelection();
        grupoListas.clearSelection();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton campo1;
    private javax.swing.JRadioButton campo2;
    private javax.swing.JRadioButton campo3;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox lista1;
    private javax.swing.JCheckBox lista2;
    private javax.swing.JCheckBox lista3;
    private javax.swing.JCheckBox lista4;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JComboBox<String> tipoProducto;
    // End of variables declaration//GEN-END:variables
}
