
package salgaapp;

import java.sql.SQLException;

public interface SALGAInterface {
 public void addCity(City city,Mayor mayor) throws SQLException; 
 public void update(City city,String name,String surname) throws SQLException;
}
