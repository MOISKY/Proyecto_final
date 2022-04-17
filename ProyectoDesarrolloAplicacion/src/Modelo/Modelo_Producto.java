package Modelo;
public class Modelo_Producto {
    private String nombre;
    private String tipoProducto;
    private int cantidad;
    private String nombreProveedor;
    private String sucursal;

    public Modelo_Producto(String nombre, String tipoProducto, int cantidad, String nombreProveedor, String sucursal) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.nombreProveedor = nombreProveedor;
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    public String mostrar(){
        return "\nNombre de Producto: "+this.nombre+"\ntipo de Producto: "+this.tipoProducto+"\nCantidad: "+this.cantidad+"\nNombre de proveedor: "+this.nombreProveedor+"\nSucursal: "+this.sucursal;
    }
}
