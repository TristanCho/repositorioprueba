
//TEST DE REPO1
package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    //Constructor
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
        color = "rojo";
        peso_total = peso_plataforma = 2000;
        asientos_cuero = true;
        climatizador = true;
    }

    public String dime_datos_generales() {// MÉTODO GETTER

        return "La plataforma del vehiculo tiene " + ruedas + " ruedas"
                + ". Mide " + largo / 2000 + " metros con un ancho de " + ancho + " cm "
                + ",un peso de " + peso_plataforma + " kilos ";
    }

    public void establece_color(String color_coche) {// MÉTODO SETTER DEBE LLEVAR VOID XQ NO DEVUELVE NADA
        //color = "azul";//puede ser fijo
        color = color_coche;//puede ser variable String color_coche
    }

    public String dime_color() {//Getter

        return "El color del coche es:" + color;
    }

    public String dime_ruedas() {

        //System.out.println("Las Ruedas del coche son::::::::");
        return "El coche tiene " + ruedas + " ruedas";
    }

    public void configura_asientos(String asientos_cuero) {//SETTER

        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() {//Getter
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public void configura_climatizador(String climatizador) {//SETTER

        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    
    public String dime_climatizador(){//GETTER
        if(climatizador==true){
            return "El coche tiene climatizador";
        }else{
            return "El coche leva aire acondicionado";
        }
    }
    
    public String dime_peso_coche(){//Método NO RECOMENDADO SETTER Y GETTER
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;
        if(asientos_cuero==true){
           peso_total=peso_total+50; 
        }else{
           peso_total=peso_total; 
        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }else{
            peso_total=peso_total;
        }
     return "El peso del coche es "+peso_total;  
    }
    
    public int precio_coche(){//SETTER
        
        int precio_final=10000;
        
        if(asientos_cuero==true){
            precio_final+=2000;//lo anterior más asientos de cuero +=
        }
        if(climatizador=true){
            precio_final+=1500;//lo anterior más el climatizador +=
        }
        
        return precio_final;
    }
    
   
    
}
