public class Hambrienta implements EstadoDeAnimo {
    /**
     * Cuando la mascota está hambrienta, al jugar no pasa nada.
     * @param mascota
     */
    public void jugar(Tamagochi mascota) {
        //NO HACE NADA - Pero se define para que los estados sean polimórficos.
    }

    /**
     * Cuando la mascota está hambrienta y come, se pone Contenta.
     * @param mascota
     */
    public void comer(Tamagochi mascota) {
        mascota.setEstadoDeAnimo(new Contenta());
    }

    /**
     * La mascota no puede jugar si está hambrienta.
     */
    public Boolean podesJugar() {
        return false;
    }
}
