
package proyecto_paper;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author hp
 */
public class Proyecto_Paper {

    public static String Verificar_senial_voltaje(int codigo, int tipo_rango,int valor_voltaje){
        String verificar = " El tipo de codigo es " + codigo + " de fábrica "
                + " contiene un rango de  " + tipo_rango + " con un valor de voltaje de  " + valor_voltaje + "%";
       
 return verificar;
    }
    
    public static String Comprobar_material_fundir( int codigo, String tipo_material, int peso, int cantidad ){
        String comprobar= " El tipo de codigo es " + codigo + " de fábrica "
                + " contiene un encendido tipo  " + tipo_material + " con un voltaje en la bateria de  " + peso + "%"
    +"y su cantidad es de " + cantidad +"gramos";
    
    return comprobar;
}
     
    public static String Ingresar_medidas_componente(int codigo, int antura, int ancho, int largo){
        
        String medidas_componente = "\n Su codigo de senial es " + codigo 
                + " la altura es " + antura + "su ancho es" +ancho+"su largo es" + largo+ "componente " ;
        
        return medidas_componente;
    }

    public static String Ingresar_cantidad_inyectores_trabajo(int codigo, String cantidad_material, String estado_inyectores, String tipo_inyeccion){
        
        String cantidad_inyectores = "\nel tipo de codigo es" + codigo + "la cantidad de material es"
                + cantidad_material+"requerida" 
                + "\n el estado de inyectores es " + estado_inyectores + "en condiciones normales y su tipo de inyeccion es" +tipo_inyeccion+ "";  

         
        
        return cantidad_inyectores;
    }
    
    public static String Comprobar_tiempo_inyeccion( int codigo, int tiempo, String rango_trabajo){
        String tiempo_inyeccion = "\tRESUSLTADOS: "
                + "\n el codigo es " + codigo + "y el tiempo es" + tiempo + "y su rango de trabajo es " +rango_trabajo+"";
        return tiempo_inyeccion;
    }
    
        public static String Comprobar_calidad_componente( int codigo, String estado_componente, int tiempo_fundido, String especificacion_componente){
        String calidad_componente = "\tRESUSLTADOS: "
                + "\n el codigo es " + codigo + "el estado del componente es" + estado_componente + ""
                + "y su tiempo de fundido es " + tiempo_fundido +""
                +"y la especifiacion del componente es " + especificacion_componente + "" ;
        return calidad_componente;
    }
    
public static void verificar(int codigo, int tipo_rango,int valor_voltaje, String tipo_material, int peso, int cantidad, int antura,
        int ancho, int largo, String cantidad_material, String estado_inyectores, String tipo_inyeccion, int tiempo, String rango_trabajo,
        String estado_componente, int tiempo_fundido, String especificacion_componente){
    
   int rangos_voltaje = 100;
   int rapidez_pulsos = 99;
     
    if (rangos_voltaje >= rapidez_pulsos){
        
        
        System.out.println(Verificar_senial_voltaje(codigo, tipo_rango, valor_voltaje));
        System.out.println(Comprobar_material_fundir(codigo, tipo_material, peso, cantidad ));
        System.out.println(Ingresar_medidas_componente(codigo, antura, ancho, largo));
        System.out.println(Ingresar_cantidad_inyectores_trabajo(codigo, cantidad_material, estado_inyectores, tipo_inyeccion));
        System.out.println(Comprobar_tiempo_inyeccion( codigo, tiempo, rango_trabajo));
         System.out.println(Comprobar_calidad_componente(codigo, estado_componente, tiempo_fundido, especificacion_componente));
    }else{
        System.out.println("Comprogar el material de inyección");
    }
    
}
    /*        
     * @param args the command line arguments
    
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int codigo = 99;
        int tipo_rango = 4;
        int valor_voltaje = 96;
        String tipo_material = "SMRT";
         int peso=15;
         int cantidad=48;
         int antura=24;
         int ancho=16;
         int largo=56;
        String cantidad_material="Infrarroja ADAS";
        String estado_inyectores="Senoidal";
        String tipo_inyeccion=" PROXIMIDAD";
        int tiempo= 0;
        String rango_trabajo="elevado";
        String estado_componente="muy buenas condiciones";
        int tiempo_fundido=45;
       String especificacion_componente="Exelentes condiciones";
        verificar (codigo, tipo_rango, valor_voltaje, tipo_material, peso, cantidad, antura,
         ancho, largo, cantidad_material, estado_inyectores, tipo_inyeccion, tiempo, rango_trabajo,
        estado_componente, tiempo_fundido, especificacion_componente);
      
    }
    
}