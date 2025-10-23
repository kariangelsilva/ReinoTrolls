public class TrollFuerzaOculta extends Troll {
    public TrollFuerzaOculta(String nombre, String secreto, int fuerza, String color) {
        super(nombre, secreto, fuerza, color);
    }

    @Override
    public void actuar() {
        System.out.println(getNombre() + " permanece quirto, ocultando su poder.");
    }

    @Override
    public void usarHabilidadUnica() {
        System.out.println(getNombre() + " revela su fuerza oculta, destruyendo una montaña con su musica.");
    }

    @Override
    public void mostrarFuerza() {
        System.out.println(getNombre() + " no muestra su fuerza fácilmente... Solo en el momento de alegria y celebracion.");
    }
}

