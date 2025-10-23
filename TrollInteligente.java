public class TrollInteligente extends Troll {
    public TrollInteligente(String nombre, String secreto, int fuerza, String color) {
        super(nombre, secreto, fuerza, color);
    }

    @Override
    public void actuar() {
        System.out.println(getNombre() + "busca ver lo bueno en todo y todos.");
    }

    @Override
    public void usarHabilidadUnica() {
        System.out.println(getNombre() + " brillante (literalmente cubierto de brillantina), confiado y divertido");
    }
}
