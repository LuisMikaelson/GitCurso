package Refactorizacion;

import java.util.List;

public class Cliente2 {
    private List<Compras> cmp;
    private Persona persona;
    private String estadoCivil;
    private int cantidadHijos;
    private int cantidadHermanos;
    private String nombrePadre;
    private String nombreMadre;

    public Cliente2(Persona persona, String estadoCivil, int cantidadHijos, int cantidadHermanos, String nombrePadre, String nombreMadre, List<Compras> cmp) {
        this.persona = persona;
        this.estadoCivil = estadoCivil;
        this.cantidadHijos = cantidadHijos;
        this.cantidadHermanos = cantidadHermanos;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
        this.cmp = cmp;
        imprimirInformacionFamiliar();
    }

    public void impInfoPersonalCliente() {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido 1: " + persona.getApellido1());
        System.out.println("Apellido 2: " + persona.getApellido2());
        System.out.println("Número de documento: " + persona.getNumeroDocumento());
    }

    public void impTodaInfoCliente() {
        impInfoPersonalCliente();
        for (Compras cmpLocal : cmp) {
            System.out.println(cmpLocal);
        }
    }

    private void imprimirInformacionFamiliar() {
        System.out.println("Información familiar:");
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Cantidad de hijos: " + cantidadHijos);
        System.out.println("Cantidad de hermanos: " + cantidadHermanos);
        System.out.println("Nombre Padre: " + nombrePadre);
        System.out.println("Nombre Madre: " + nombreMadre);
    }
}
