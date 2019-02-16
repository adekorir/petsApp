package com.felix.pets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetsRepository {

    public List<Pet> getAll() {
        List<Pet> list = new ArrayList<>();
        String sql = "SELECT * FROM pet";
        try (ResultSet rs = DB.connect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                Pet pet = new Pet();
                pet.setName(rs.getString("name"));
                pet.setOwner(rs.getString("owner"));
                pet.setSpecies(rs.getString("species"));
                pet.setSex(rs.getString("sex"));
                pet.setBirth(rs.getDate("birth"));
                pet.setDeath(rs.getDate("death"));
                list.add(pet);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
