package com.felix.pets;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class DBTest {

    @Test
    public void testConnectionIsNotNull() throws SQLException {
        assertTrue(DB.connect() != null);
    }
}
