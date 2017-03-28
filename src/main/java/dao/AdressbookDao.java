package dao;


import entity.Adressbook;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdressbookDao extends BasicDao<Adressbook> {

    @Override
    public List<Adressbook> selectAll() {
        return null;
    }

    @Override
    public Adressbook selectById(long id) {
        String sql = " SELECT * FROM informationschema.adressbook " +
                " WHERE id = " + id;
        ResultSet rs = database.query(sql);
        List<Adressbook> addressbooks = convertReslutSetToAddressBook(rs);
        return addressbooks.get(0);
    }
    @Override
    public boolean update (Adressbook object) {
        String sql = " UPDATE informationschema.adressbook SET " +
                " Name = '" + object.getName() + "' , " +
                " Surname = '" +object.getSurname() + " ' ," +
                " Age = " +object.getAge() + "," +
                " CellPhone = " +object.getCellPhone() + "," +
                " Adress = '" +object.getAddress() +"' "+
                " WHERE id in (1)";
        return database.update(sql);
    }
    public List<Adressbook> selectByName (String name) {
        String sql = " SELECT * FROM informationschema.adressbook " +
                " WHERE name = '" + name + "'";
        ResultSet rs = database.query(sql);
        List<Adressbook> addressbooks = convertReslutSetToAddressBook(rs);
        return addressbooks;
    }
    @Override
    public boolean insert(Adressbook object) {
        String sql = " INSERT INTO informationschema.adressbook " +
                     " VALUES (" +
                    object.getId() + "," +
                     "'" +  object.getName() + "'," +
                     "'" +  object.getSurname() + "'," +
                     object.getAge() + "," +
                     object.getCellPhone() + ","+
                     "'" +  object.getAddress() + "'" +
                     ")";

        return database.execute(sql);
    }
    @Override
    public boolean deleteById(Adressbook object) {
        String sql = "DELETE FROM informationschema.adressbook " +
                "WHERE id = 1";
        return database.deleteById(sql);


    }
    public List<Adressbook> convertReslutSetToAddressBook(ResultSet rs) {
        List<Adressbook> addressbooks = new ArrayList<Adressbook>();
        //STEP 5: Extract data from result set
        try {
            while (rs.next()) {
                Adressbook addressbook = new Adressbook();

                //Retrieve by column name
                addressbook.setId(rs.getLong("id"));
                addressbook.setAge(rs.getInt("age"));
                addressbook.setName(rs.getString("name"));
                addressbook.setSurname(rs.getString("surname"));

                addressbooks.add(addressbook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addressbooks;
    }
}
