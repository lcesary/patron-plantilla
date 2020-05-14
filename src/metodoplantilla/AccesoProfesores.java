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
public class AccesoProfesores extends AccesoPlataforma{
    
     public void recopilarInformacion(String codigo, String contraseña){
        documento = codigo;
        password = contraseña;
        }
        public boolean verificarIdentidad(){
            boolean resultado ;
            String doc = bd.consulta(documento);
            boolean pass = bd.validar(documento,password);
            if (pass == true && doc != null && doc.equals("docente")) {
               resultado = true; 
            }else{
                resultado = false;
            }
            return resultado;
        }
        
        public void mostrarPaginaPrincipal(){
            System.out.println("se encuentra en el aplicativo de Docente");
        }
}
