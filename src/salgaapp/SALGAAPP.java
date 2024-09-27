
package salgaapp;

import java.sql.SQLException;

public class SALGAAPP {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
       Mayor may = new Mayor(2, "Sifiso", "Vinjwa");
       City obj = new City(5,"PLK",500,may);
       SALGAM sm = new SALGAM("jdbc:derby://localhost:1527/SALGADB","Mrabulo","12345");
       sm.addCity(obj, may);
    }
    
}
