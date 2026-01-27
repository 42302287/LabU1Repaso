/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labu1repaso;

/**
 *
 * @author alopezorozco
 */
public class LabU1Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto carro = new Auto("Toyota", 0);
        // TODO 11:  Crea un objeto de tipo Auto inicializando
        // el objeto con los siguientes valores "Toyota" y 0.
        carro.acelerar();
        // TODO 12: Llama al método acelerar
        carro.mostrar();
        // TODO 13: Imprime los datos del objeto auto llamando
        // al método mostrarEstado()
        Camion camion = new Camion("Nissan", 0);
        
        camion.acelerar();
        
        camion.mostrar();
        // TODO 14: Realiza lo mismo pero ahora para un objeto
        // de tipo camion la marca será "Nissan" y 0 en velocidad
    }
    
}
