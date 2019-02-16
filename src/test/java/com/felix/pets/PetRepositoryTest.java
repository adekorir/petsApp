package com.felix.pets;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PetRepositoryTest {

    @Test
    public void testPetsHasData() {
        assertTrue(new PetsRepository().getAll().size() != 0);
    }
}
