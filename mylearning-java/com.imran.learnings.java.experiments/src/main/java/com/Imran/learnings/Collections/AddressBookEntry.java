package com.Imran.learnings.Collections;

public class AddressBookEntry implements Comparable<AddressBookEntry>
{

    private String name;

    public AddressBookEntry(String name)
    {
        this.name = name;
    }

    //Prefeered
    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public int compareTo(AddressBookEntry another)
    {
        return this.name.compareToIgnoreCase(another.name);
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof AddressBookEntry))
        {
            return false;
        }
        // type cast o to AddressBookEntry so that we can compare data members
        return this.name.equalsIgnoreCase(((AddressBookEntry) o).name);
    }

    // Consistent with equals(). Two objects which are equal have the same hash code.
    @Override
    public int hashCode()
    {
        return name.length();
    }


}
