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
public abstract class AccesoPlataforma {
    
       protected String password;
        protected String documento;
        protected BaseDatos bd = new BaseDatos();
        //protected Salida salida = new SalidaConsola;
        //protected Entrada entrada = new EntradaConsola;
        
        public final void validarInformacion(String codigo, String contraseña){
            recopilarInformacion(codigo,contraseña);
            
            if (verificarIdentidad()== true) {
                mostrarPaginaPrincipal();
            }else{
                System.out.println("verificar sus datos\\n conectece con soporte.");
                //salida.imprimir("verificar sus datos\n conectece con soporte.")
            }
        }
    
    public abstract void recopilarInformacion(String codigo,String contraseña);
    public abstract boolean verificarIdentidad();
    public abstract void mostrarPaginaPrincipal();
}
