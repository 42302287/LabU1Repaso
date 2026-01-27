/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1repaso;

/**
 *
 * @author alopezorozco
 */
public class Vehiculo {

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   // TODO 1: Crea dos atributos privados    
   // marca de tipo String
   // velocidad de tipo entero
    private String marca;
    private int velocidad;
   // TODO 2:  Crea el constructor de Vehiculo que reciba
   // los parámetros de marca y velocidad
   
        public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
   // TODO 3: Define los getter y setter para cada uno de los atributos
        public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   // TODO 4: Crea el método acelerar() de tipo void
    public void acelerar()
    {
        velocidad+=10;
    }
   // este método incrementará la velocidad en 10 km/h cada vez que sea llamado
    
   // TODO 5: Crea el método frenar() de tipo void
    public void frenar()
    {
        velocidad-=10;
    }
   // este método decrementará la velocidad en 10 km/h cada vez que sea llamado
    
   // TODO 6: Crea el método mostrarEstado() de tipo void
    public void mostrar()
    {
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad: " + getVelocidad());
    }
    
   // imprime los datos de marca y velocidad.
   // Ejemplo de implementación para uno de los atributos:
   // System.out.println("Marca: " + getMarca());   



}
