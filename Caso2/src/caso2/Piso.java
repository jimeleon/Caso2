/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author Jimena
 */
public class Piso {
    //Codigo para la clase de los pisos 
    
    //Variables 
    
    private Piso[][] pisos;
    
    
    //Constructores 
    
    public Piso (int pisos, int numhabitacion){
        this.pisos = pisos;
        numhabitacion =  new Habitaciones [pisos][numhabitacion];
        for (int i = 0; i< pisos; i++){
            for (int j = 0; j< numhabitacion; j++){
                numhabitacion[i][j] = new Habitaciones();
            }
        }
}
   
              
    //Getters y Setters 
    
    public String getpisos (){return pisos;}
    public void setpisos (String habitacion) {this.pisos = habitacion;}
    public Piso [][] getPiso () {return habitacion;}

    }
    
    
    //Metodos para mostar la matriz 

public void mostrarmatriz (){
for (int i = 0; j<5; i++){
    System.out.println("");
}
}
]



