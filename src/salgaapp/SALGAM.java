
package salgaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SALGAM implements SALGAInterface {
 private  Connection conn ;
    public SALGAM(String url,String name,String pwd) throws SQLException {
       conn = DriverManager.getConnection(url, name, pwd);
    }

    

    @Override
    public void addCity(City city, Mayor mayor) throws SQLException {
   PreparedStatement	ps = conn.prepareStatement("Insert into City Values(?,?,?,?)");
     ps.setInt(1, city.getId());
     ps.setString(2, city.getName());
     ps.setInt(3, city.getPopulaton());
     ps.setInt(4, city.getMayor().getUnique_id());
     
     PreparedStatement	ps2 = conn.prepareStatement("Insert into MAYORTBL Values(?,?,?)");
     ps2.setInt(1, mayor.getUnique_id());
     ps2.setString(2, mayor.getName());
     ps2.setString(3, mayor.getSurname());
     
        System.out.println(ps.executeUpdate()+" Table 1 has been updated");
        
        System.out.println(ps2.executeUpdate()+" Table 2 has been updated");
    }

    public void update(String city,String name,String surname) throws SQLException {
         PreparedStatemen ps2 = conn.prepareStatement("Update MayorTbl set name=? AND set surname=? where = ");
    }

    @Override
    public void update(City city, String name, String surname) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
