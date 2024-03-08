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

public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Contacto

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
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}