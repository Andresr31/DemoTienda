/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autonoma.DemoTienda.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * Lee el archivo
 *
 * @author Carlos Andres Rojas Parra
 * @version 1.0.0
 */
public interface Lector {
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Lee el archivo
     * 
     * @param localizacionArchivo
     * @return
     * @throws IOException 
     */
     public abstract ArrayList<String> leer(String localizacionArchivo)
                                                    throws IOException;
     
     //////////////////////////////////////////////////////////////////////////
    
}
