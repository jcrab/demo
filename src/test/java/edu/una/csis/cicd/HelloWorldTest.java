package edu.una.csis.cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class HelloWorldTest {
	
	@Test
	void testAdd() throws Exception {
		
		assertEquals(5, Calculator.add(1, 4));
	}

    @Test
    public void testUsingJavaNewFeature() {

        SequencedSet<String> alphabet = new LinkedHashSet<>();

        alphabet.add("A");

        assertEquals("A", alphabet.getFirst());
    }
    
    @Test
	public void testMath() throws Exception {
		assertEquals(4, 2 + 2, "bad math");
	}
}
