/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.models;


/**
 *
 * @author Educacion
 */
public class Administrador extends Persona{
    
    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private String username;
    private String password;

    ////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Administrador(String username, String password, String nombre, String cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.username = username;
        this.password = password;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Metodos de acceso

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
    
}
