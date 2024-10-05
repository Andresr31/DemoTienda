
package autonoma.DemoTienda.models;

import java.util.ArrayList;

/**
 *
 * @author Educacion
 */
public class Tienda {
    
    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private String nombre;
    private String direccion;
    private Inventario inventario;
    private Administrador administrador;
    
    
    ////////////////////////////////////////////////////////////////////////////
    // Constructor

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();       
        
    }
    ////////////////////////////////////////////////////////////////////////////
    // Metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Inventario getInventario() {
        return inventario;
    }


    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return this.inventario.getProductos();
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Metodos de gestión de productos o CRUD de productos
    
    ////////////////////////////////////////////////////////////////////////////
    public boolean agregarProducto(Producto producto){
        return this.inventario.agregarProducto(producto);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Producto buscarProducto(Producto producto){
        
        return this.inventario.buscarProducto(producto);
    }
    
    public Producto buscarProducto(long id){
        
        return this.inventario.buscarProducto(id);
    }
    
    public Producto buscarProducto(String nombre){
        
        return this.inventario.buscarProducto(nombre);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Producto actualizarProducto(long id, Producto producto)
    {
        return this.inventario.actualizarProducto(id, producto);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Producto eliminarProducto(long id){
        
        return this.inventario.eliminarProducto(id);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public String mostrarInventario(){
       
        return this.inventario.mostrarInventario();
    }
    ////////////////////////////////////////////////////////////////////////////
    public boolean iniciarSesion(String user, String password){
        return this.administrador.getUsername().equals(user) && this.administrador.getPassword().equals(password);
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
}
