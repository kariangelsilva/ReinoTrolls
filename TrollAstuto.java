public class TrollAstuto extends Troll {
    public TrollAstuto(String nombre, String secreto, int fuerza, String color) {
        super(nombre, secreto, fuerza, color);
    }

    @Override
    public void actuar() {
        System.out.println(getNombre() + " confunde a sus enemigos con un truco astuto.");
    }

    @Override
    public void usarHabilidadUnica() {
        System.out.println(getNombre() + " cambia de forma para engañar a sus opomrntes.");
    }
}
