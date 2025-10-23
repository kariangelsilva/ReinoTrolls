public abstract class Troll {
    private String nombre;
    private String secreto; 
    private int fuerza;
    private String color; 
    private static final String CLAVE_MODIFICACION = "Trolls123";

    public Troll(String nombre, String secreto, int fuerza, String color) {
        this.nombre = nombre;
        this.secreto = secreto;
        this.fuerza = fuerza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    public String setSecreto() {
        return secreto = "Secreto de " + nombre + ": (Protegido, necesita permiso)";
    }
    public String getSecreto() {
        return  secreto;
    }

    public void modificarSecreto(String nuevoSecreto, String clave) {
        if (clave.equals(CLAVE_MODIFICACION)) {
            this.secreto = nuevoSecreto;
            System.out.println("Secreto de " + nombre + " modificado exitosamente.");
        } else {
            System.out.println("Error: Clave incorrecta mula. No se puede modificar el secreto de " + nombre + ".");
        }
    }

    
    public int getFuerza() {
        return fuerza;
    }

    
    public void setFuerza(int nuevaFuerza, String clave) {
        if (clave.equals(CLAVE_MODIFICACION)) {
            this.fuerza =  nuevaFuerza; 
            System.out.println("Fuerza de " + nombre + " modificado a " + fuerza + ".");
        } else {
            System.out.println("Error: Clave incorrecta o mula. No se puede modificar la fuera de " + nombre + ".");
        }
    }


    public void mostrarFuerza() {
        System.out.println(nombre + " demustra su fuerza: " + fuerza);
    }

    public void mostrarColor() {
        System.out.println(nombre + " tienes un color: " + color);
    }


    public abstract void actuar();
    public abstract void usarHabilidadUnica();
}





