package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_weak_method_1_a {
  Triangle_classification tester = new Triangle_classification();


	    @Test
	    public void Path1() {
	        String result = tester.classifyTriangle(10,3,20);
	        String expected ="Nottriangle";
	        assertEquals(expected, result);
	    }

	    @Test
	    public void Path2() {
	        String result = tester.classifyTriangle(16,30,5);
	        String expected ="Nottriangle";
	        assertEquals(expected, result);
	    }
	    @Test
	    public void Path3() {
	        String result = tester.classifyTriangle(20,10,4);
	        String expected ="Nottriangle";
	        assertEquals(expected, result);
	    }
	    @Test
	    public void Path4() {
	        String result = tester.classifyTriangle(6,6,6);
	        String expected ="equilateral";
	        assertEquals(expected, result);
	    }

	    @Test
	    public void Path5() {
	        String result = tester.classifyTriangle(10,12,12);
	        String expected ="isosceles";
	        assertEquals(expected, result);
	    }
	    @Test
	    public void Path6() {
	        String result = tester.classifyTriangle(10,10,8);
	        String expected ="isosceles";
	        assertEquals(expected, result);
	    }

	    @Test
	    public void Path7() {
	        String result = tester.classifyTriangle(10,7,10);
	        String expected ="isosceles";
	        assertEquals(expected, result);
	    }
	    @Test
	    public void Path8() {
	        String result = tester.classifyTriangle(14,12,10);
	        String expected ="Scalene";
	        assertEquals(expected, result);
	    }
}

//    Triangle_classification tester = new Triangle_classification();
//
//    @Test
//    public void testEquilateralTriangle() {
//        assertEquals("equilateral", Triangle_classification.classifyTriangle(3, 3, 3));
//    }
//
//    @Test
//    public void testIsoscelesTriangle1() {
//        assertEquals("isosceles", Triangle_classification.classifyTriangle(3, 3, 5));
//    }
//
//    @Test
//    public void testIsoscelesTriangle2() {
//        assertEquals("isosceles", Triangle_classification.classifyTriangle(5, 3, 3));
//    }
//
//    @Test
//    public void testScaleneTriangle() {
//        assertEquals("scalene", Triangle_classification.classifyTriangle(3, 4, 5));
//    }
//
//    @Test
//    public void testNotTriangle1() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(1, 2, 3));
//    }
//
//    @Test
//    public void testErrorNegativeSides() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(-1, 3, 3));
//    }
//
//    @Test
//    public void testErrorZeroSides() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(0, 4, 5));
//    }
//
//    @Test
//    public void testNotTriangle2() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(3, 5, 1));
//    }
//
//    @Test
//    public void testErrorZeroSide1() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(0, 5, 5));
//    }
//
//    @Test
//    public void testErrorZeroSide2() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(5, 0, 5));
//    }
//
//    @Test
//    public void testErrorZeroSide3() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(5, 5, 0));
//    }
//
//    @Test
//    public void testErrorNegativeSide1() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(-5, 5, 5));
//    }
//
//    @Test
//    public void testErrorNegativeSide2() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(5, -5, 5));
//    }
//
//    @Test
//    public void testErrorNegativeSide3() {
//        assertEquals("notTriangle", Triangle_classification.classifyTriangle(5, 5, -5));
//    }
//}


//    @Test
//    public void testEquilateralTriangle() {
//        // Test case Tc1
////        String result = tester.classifyTriangle(3, 3, 3);
//        assertEquals("equilateral", Triangle_classification.classifyTriangle(3, 3, 3));
//    }
//
//    @Test
//    public void testIsoscelesTriangle1() {
//        // Test case Tc2 (a == b)
////        String result = tester.classifyTriangle(3, 3, 5);
////        assertEquals("isosceles", Triangle_classification.Triangle_Types.isosceles.toString(), result);
//        assertEquals("isosceles", Triangle_classification.classifyTriangle(3, 3, 5));
//    }
//
//    @Test
//    public void testIsoscelesTriangle2() {
//        // Test case Tc3 (b == c)
//       // String result = tester.classifyTriangle(5, 3, 3);
//        assertEquals("isosceles",  Triangle_classification.classifyTriangle(5, 3, 3));
//    }
//
//    @Test
//    public void testScaleneTriangle() {
//        // Test case Tc4
//        //String result = tester.classifyTriangle(3, 4, 5);
//        assertEquals("Expected scalene",  Triangle_classification.classifyTriangle(3, 4, 5));
//    }
//
//    @Test
//    public void testNotTriangle1() {
//        // Test case Tc5 (a + b <= c)
//       // String result = tester.classifyTriangle(1, 2, 3);
//        assertEquals("notTriangle",  Triangle_classification.classifyTriangle(1, 2, 3));
//    }
////
//    @Test
//    public void testErrorNegativeSides() {
//        // Test case Tc6 (negative side lengths)
//        //String result = tester.classifyTriangle(-1, 3, 3);
//        assertEquals("ERROR", Triangle_classification.classifyTriangle(-1, 3, 3));
//    }
//
//    @Test
//    public void testErrorZeroSides() {
//        // Test case Tc7 (zero side lengths)
//        //String result = tester.classifyTriangle(0, 4, 5);
//        assertEquals("ERROR", Triangle_classification.classifyTriangle(0, 4, 5));
//    }
//
//    @Test
//    public void testNotTriangle2() {
//        // Test case Tc8 (b + c <= a)
//        //String result = tester.classifyTriangle(3, 5, 1);
//        assertEquals("ERROR",  Triangle_classification.classifyTriangle(3, 5, 1));
//    }

