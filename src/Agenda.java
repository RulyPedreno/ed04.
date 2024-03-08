/**
 *Esta clase llamada Agenda nos permite crear diferentes Listas de contacto
 * y nos permite realizar algunas funciones, mediante métodos, con estos contactos.
 * @version 1.0
 * @since 2024
 * @author Raúl Pedreño
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Método contructor por defecto que crea una lista de contactos
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método addContact sirve para añadir un contacto a la lista previamente creada.
     * @param name el nombre del contacto que se quiere añadir.
     * @param phone el número de telèfono que queremos añadir.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}