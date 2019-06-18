package poo;
import javax.swing.*;

public class Uso_Coche {

 
    public static void main(String[] args) {
     
        Coche Renault= new Coche();//INSTANCIAR UNA CLASE O EJEMPLAR DE CLASE
        
       
        System.out.println(Renault.dime_ruedas());
        Renault.dime_ruedas();//ejecuta la lógica del método getter dentro ejemplo: sout
        
        Coche micoche=new Coche();
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));//Si no llamo el método, me imprimira abajo null
        
        //micoche.color="rosa";//no es permitido xq s una característica 
        //unica del método establece color
        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dime_color());
        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene Asientos de cuero?"));
        System.out.println(micoche.dime_asientos());
        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_coche());
        System.out.println("El precio final del coche es "+micoche.precio_coche());
    }
    
}
