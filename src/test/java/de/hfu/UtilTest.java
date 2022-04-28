package de.hfu;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.fail;

import static org.junit.Assert.*;


public class UtilTest{

	@Test
public void testistErstesHalbjahr() {
	assertTrue(Util.istErstesHalbjahr(1));
	assertFalse(Util.istErstesHalbjahr(12));
	assertTrue(Util.istErstesHalbjahr(6));
	assertFalse(Util.istErstesHalbjahr(7));
	
	
}

}