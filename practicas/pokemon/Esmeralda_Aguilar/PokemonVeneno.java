package practicas.pokemon.Esmeralda_Aguilar;

public class PokemonVeneno extends Pokemon implements Elemental {
    public PokemonVeneno(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public String getElemetType() {
        return "Veneno";
    }

    @Override
    public int getEdad() {
        return 25;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza picotazo venenoso! ");

    }
}
