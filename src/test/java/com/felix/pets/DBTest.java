package com.felix.pets;

import static org.junit.Assert.*;
import org.junit.Test;

import java.sql.SQLException;

public class DBTest {

    @Test
    public void testConnectionIsNotNull() throws SQLException {
        assertTrue(DB.connect() != null);
    }
}
