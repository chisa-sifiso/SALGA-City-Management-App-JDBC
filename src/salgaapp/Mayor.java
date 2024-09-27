
package salgaapp;

public class Mayor {
    private int unique_id;
    private String name;
    private String surname;

    public Mayor(int unique_id, String name, String surname) {
        this.unique_id = unique_id;
        this.name = name;
        this.surname = surname;
    }

    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Mayor{" + "unique_id=" + unique_id + ", name=" + name + ", surname=" + surname + '}';
    }
    
}
