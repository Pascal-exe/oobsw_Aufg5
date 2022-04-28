package de.hfu;

//import static org.junit.Assert.assertTrue;
import org.junit.Test;
//import static org.junit.Assert.fail;

import static org.junit.Assert.*;


public class QueueTest{


	@Test
public void Test() {

	Queue Testqueue = new Queue(3);
	
	//Anforderung 1: Enqueue und Dequeue
	Testqueue.enqueue(1);
	Testqueue.enqueue(2);
	Testqueue.enqueue(3);
	assertEquals(Testqueue.dequeue(),1);
	assertEquals(Testqueue.dequeue(),2);
	
	//Anforderung 2: Wenn Queue Voll, wird das letzte Element überschrieben
	Testqueue.enqueue(2);
	Testqueue.enqueue(1);
	Testqueue.enqueue(0);
	//Sollwerte: 320 -> Dequeue nimmt 3,2,0 raus
	assertEquals(Testqueue.dequeue(),3);
	assertEquals(Testqueue.dequeue(),2);
	assertEquals(Testqueue.dequeue(),0);
	
	//Anforderung 3: Exception bei dequeue auf leere Queue
	try{
		Testqueue.dequeue();
		fail("Erwartete Ausnahme wurde nicht geworfen");
		} catch(IllegalStateException e){
		}
	
	
	
	//assertEquals("Message",Testqueue,VergleichArray);
	
	
}

}