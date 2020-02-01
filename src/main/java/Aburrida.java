public class Aburrida implements EstadoDeAnimo
{

    /**
     * Si la mascota está aburrida, al jugar se pone Contenta.
     * @param mascota
     */
    public void jugar(Tamagochi mascota) {
        mascota.setEstadoDeAnimo(new Contenta());
    }

    /**
     * Si está aburrida, y hace más de 80 minutos que está aburrida,
     * entonces se pone contenta.
     * Si está aburrida desde hace 80 minutos o menos,
     * entonces no le pasa nada, no cambia nada.
     *
     */
    public void comer(Tamagochi mascota) {
        if (mascota.masDe80minAburrida())
            mascota.setEstadoDeAnimo (new Contenta());
    }

    /**
     * La mascota puede jugar cuando está aburrida.
     */
    public Boolean podesJugar(){
        return true;
    }
}