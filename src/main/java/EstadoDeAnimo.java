public interface EstadoDeAnimo {  /**
 * Cada implementación de Estado define que pasa con la mascota al jugar.
 * @param mascota
 */
void jugar(Tamagochi mascota);

    /**
     * Cada implementacion de Estado define que pasa con la mascota al comer.
     * @param mascota
     */
    void comer(Tamagochi mascota);

    /**
     * Cada implementación de estado define cuando la mascota puede jugar.
     */
    Boolean podesJugar();
}

