/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoplantilla;

/**
 *
 * @author lcesary
 */
public class Cliente {
    public static void main(String[] args) {
        AccesoPlataforma loginestudiante = new AccesoEstudiantes();
        String codigo = "212169602";
        String contraseña = "1234";
        loginestudiante.validarInformacion(codigo,contraseña);
        
        AccesoPlataforma loginprofesores = new AccesoProfesores();
        codigo = "1111";
        contraseña = "123";
        loginprofesores.validarInformacion(codigo,contraseña);
    }
    
}
