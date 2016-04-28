package Collections;

public class PhoneBookEntry {
    public String name, address, phone;

    public PhoneBookEntry(String name) {
       this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }
 }
