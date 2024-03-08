/**
 * Esta clase llamada CONTACTO nos permite crea un objeto llamado contacto con un atributo
 * llamado NAME que será el nombre del contacto y con otro atributo en forma de lista llamada
 * @author Raul Pedreño
 * @since 2024
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Metodo constructor Contacto para añadir un objeto contacto
     * @param name será el nombre del contacto
     * @param phone será el número de teléfono asociado al contacto
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Metodo getName, sirve para extraer el nombre del contacto asociado
     * @return el nombre del contacto
     */

    public String getName() {
        return this.name;
    }

    /**
     * Método geetPhones con el que obtenemos la lista de los números asociados
     * al contacto asociado
     * @return la lista de números de telefono de contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}