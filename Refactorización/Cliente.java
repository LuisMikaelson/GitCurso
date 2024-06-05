package Refactorización;

import java.util.List;

public class Cliente<Compras> {
    private List<Compras> cmp;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String numeroDocumento;

    // Constructor para inicializar los atributos de la clase 
    public Cliente(String nombre, String apellido1, String apellido2, String numeroDocumento, List<Compras> cmp) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numeroDocumento = numeroDocumento;
        this.cmp = cmp;
    }

    // Método para imprimir la información personal del cliente usando ahora las variables del constructor
    public void impInfoPersonalCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        System.out.println("Número de documento: " + numeroDocumento);
    }

    // Método para imprimir toda la información del cliente
    public void impTodaInfoCliente() {
        impInfoPersonalCliente();
        for (Compras cmpLocal : cmp) {
            System.out.println(cmpLocal);
        }
    }
}
