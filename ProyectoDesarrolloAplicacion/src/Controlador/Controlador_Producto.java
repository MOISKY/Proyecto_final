package Controlador;
import Modelo.Modelo_BaseDatos_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_Producto{
    public static Modelo_BaseDatos_Producto conexion = new Modelo_BaseDatos_Producto();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String nombre,String tipoProducto,int cantidad,String nombreProveedor,String sucursal){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO producto (nombre,tipoProducto,cantidad,nombreProveedor,sucursal) VALUES(?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, nombre);
            sentencia_Preparada.setString(2, tipoProducto);
            sentencia_Preparada.setString(3, String.valueOf(cantidad));
            sentencia_Preparada.setString(4, nombreProveedor);
            sentencia_Preparada.setString(5, sucursal);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}
