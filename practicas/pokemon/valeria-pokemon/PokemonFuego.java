class PokemonFuego extends Pokemon implements Elemental {

    public PokemonFuego (String nombre, int nivel){
        super(nombre, nivel);
    }
    @Override
    public String getElementType(){
        return "Fuego";
    }
    @Override
    public int getEdad(){
        return 15;
    }
    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " Lanza una llama");
    }
}