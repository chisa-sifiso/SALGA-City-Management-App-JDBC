
package salgaapp;

public class City {
 private int id;
 private String name;
 private int populaton;
 private Mayor mayor;

    public City() {
    }

    public City(int id, String name, int populaton, Mayor mayor) {
        this.id = id;
        this.name = name;
        this.populaton = populaton;
        this.mayor = mayor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulaton() {
        return populaton;
    }

    public void setPopulaton(int populaton) {
        this.populaton = populaton;
    }

    public Mayor getMayor() {
        return mayor;
    }

    public void setMayor(Mayor mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", populaton=" + populaton + ", mayor=" + mayor + '}';
    }
 
}
