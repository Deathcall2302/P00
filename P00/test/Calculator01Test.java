
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class Calculator01Test {
int a, b;
Calculator01 cal;

  @Before
  public void setUp() throws Exception {
    a = 4321;
    b = 1234;
    cal = new Calculator01();

  }

  @Test
  // Unit test for addition
  public void testadd() {
    

    int actual = cal.add(a,b);
    int expected = 5555;
    assertEquals(expected,actual);

  }
  
  @Test
  // Unit test for subtraction
  public void testsub() {
    
    // Arrange
    int a = 4321;
    int b = 1234;
    Calculator01 cal = new Calculator01();
    
    // Actual
    int actual = cal.sub(a,b);
    int expected = 3087;
    
    // Assertion
    assertEquals(expected,actual);
  }
  
  @Test
  // Unit test for multiplication
  public void testmul() {
    
    // Arrange
    int a = 4321;
    int b = 1234;
    Calculator01 cal = new Calculator01();
    
    // Actual
    int actual = cal.mul(a,b);
    int expected = 5332114;
    
    // Assertion
    assertEquals(expected,actual);
  }
  
  @Test
  // Unit test for division
  public void testdiv() {
    
    // Arrange
    int a = 4321;
    int b = 1234;
    Calculator01 cal = new Calculator01();
    
    // Actual
    int actual = cal.div(a,b);
    int expected = 3;
    
    // Assertion
    assertEquals(expected,actual);
  }
  @After
  public void tearDown() throws Exception {
  }

}





