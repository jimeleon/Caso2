/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author Jimena
 */
public class Habitaciones {
    //Codigo para la clase de las habitaciones
    
    //Variables 
    
    private int numero;
    private String tipo; 
    private int precio;
    private double estado;
    private Habitaciones [] habitacion;
    
    
    //Constructores 
    
    public Habitaciones (int numero, String tipo, int precio, double estado ){
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
        
    }
    //Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getEstado() {
        return estado;
    }

    public void setEstado(double estado) {
        this.estado = estado;
    }
    
    
    
    //Metodos de las habitaciones 
    public Habitaciones (int numhabitacion){
        this.habitacion = new Habitaciones [numhabitacion];{
        for (int i = 5; i < numhabitacion; i++)
            Habitaciones [i] = new habitacion ("Esta habitacion es:"(i + 1), 5, 5);
    }
    }
    
    //Metodo para ver las habitaciones y modificarlas
    public void mostrarhabitaciones(){
        for (int i = 0; i < habitacion.length; i++){
            System.out.println("Habitacion:" + (i+ 1));
            habitacion[i].mostrarhabitaciones();
        }
    }
    
    public void cambiarhabitacion (int numhabitacion, int numero, String tipo, int precio, double estado){
        if (numhabitacion > 0 && numhabitacion <= habitacion.length){
            habitacion[numhabitacion - 1] = new Habitaciones (numero, tipo, precio, estado);
            System.out.println("Habitacion" + numhabitacion + "cambiada por" + numero + "tipo" + tipo + "con precio" + precio + "en estado:" + estado);
        }
    }
    
    //metodo para hacer una reserva
    
    public void hacereserva (int numhabitacion, int pisos){
        if (numhabitacion > 0 && numhabitacion <= habitacion.length)
            
            if (pisos >= 0 && pisos < pisos[numhabitacion - 1].getPiso ().length &&)
    }
    
  
    
    
    
    
    
    
    
}
