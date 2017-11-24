package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import priorityqueue.List;

public class UnitTestList {
	List<String> list;
    @Before
    public void setUp() throws Exception {
    	list = new List<String>();
    }
    @Test
    public void ListAdd_AddAppleToTheList_True() {
    	
    	list.add("Apple");
    	Assert.assertEquals(list.get(0), "Apple");
    }
    @Test
    public void ListRemove_RemoveAppleFromTheList_True() {
    	
    	list.add("Apple");
    	list.remove("Apple");
    	Assert.assertEquals(list.get(0), null);
    }
    @Test
    public void ListGet_RemoveAppleFromTheList_True() {
    	
    	list.add("Apple");
    	Assert.assertEquals(list.get(0), "Apple");
    }
    
    @Test
    public void ListGet_GetApple1IndexFromTheList_True() {
    
    	list = new List<String>();
    	list.add("Apple");
    	list.add("Apple1");
    	list.add("Apple2");
    	Assert.assertEquals(list.indexOf("Apple1"), 1);
    	Assert.assertEquals(list.indexOf("Apple"), 2);
    	Assert.assertEquals(list.indexOf("Apple2"), 0);
    	
    	
    }
    @Test
    public void ListRemove_RemoveApple1FromTheList_True() {
    
    	list = new List<String>();
    	list.add("Apple");
    	list.add("Apple1");
    	list.add("Apple2");
    	list.remove("Apple1");
    	Assert.assertEquals(list.indexOf("Apple"), 1);
    	Assert.assertEquals(list.indexOf("Apple2"), 0);
    }
}
