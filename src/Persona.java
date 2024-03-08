/**
 * Esta clase llamada CONTACTO nos permite crea un objeto llamado contacto con un atributo
 * llamado NAME que será el nombre del contacto y con otro atributo en forma de lista llamada
 * @author Raul Pedreño
 * @since 2024
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Metodo constructor Contacto para añadir un objeto contacto
     * @param name será el nombre del contacto
     * @param phone será el número de teléfono asociado al contacto
     */

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }


    public String getName() {
        return name;
    }

    /** Método setName, sirve para poder modificar el nombre
     * @param name el nombre del contacto
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Método getPhone con el que obtendremos la lista de los números asociados
     * al contacto citado
     * @return la lista de números de teléfono del contacto.
     */
    public List<String> getPhones() {
        return phones;
    }

    /** Método set Phones sirve para modificar los números de telefonos asociados a un contacto
     * @param phones los teléfonos asociados al contacto
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}