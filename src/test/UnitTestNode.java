package test;
import priorityqueue.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTestNode {
	Node node;
    @Before
    public void setUp() throws Exception {
         node = new Node();
    }
    @Test
    public void test_node_setContain_True() {
    	
    	node.setContain(6);
        Assert.assertEquals(node.getContain(),6);
    }
    @Test
    public void test_node_setNext_True() {
    	
    	Node fake_node = new Node();
    	node.setNext(fake_node);
        Assert.assertEquals(node.getNext(), fake_node);
    }
}

 