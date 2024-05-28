package n1exercici2;

import java.util.Scanner;

public class CalculoDni {
    private int dni;

    public CalculoDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public char calcularDni(int dni) {
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        char lletra = lletres.charAt(dni % lletres.length());
        char lletraQueCorrespon = lletra;
        return lletraQueCorrespon;
    }
}