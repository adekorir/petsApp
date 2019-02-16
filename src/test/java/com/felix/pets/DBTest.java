package com.felix.pets;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class DBTest {

    @Test
    public void testConnectionIsNotNull() throws SQLException {
        Assert.assertTrue(DB.connect() != null);
    }
}
