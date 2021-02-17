package softsolution.UnitTest;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Test for mathUtil")
class MathUtilsTest {
	TestInfo testInfo;
	TestReporter testReporter;
MathUtils mathUtils;

@Nested
@Tag("Math")
@DisplayName("Add method test")
class TestADDS{
	@Test
	@DisplayName("test positive numbere")
 void addPositiveTest() {
	 assertEquals(3, mathUtils.add(1, 2),"method add tow positive number");
	 
 }
	@Test
	@DisplayName("test negatif numbere")
 void addNegativeTest() {
	 assertEquals(-3, mathUtils.add(-1, -2),()-> "method add tow negative number");
	 
 }
	
}





	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo=testInfo;
		this.testReporter=testReporter;
		mathUtils= new MathUtils();
		//testInfo.getTags().forEach(p->System.out.println(p));
	}
	@BeforeAll
	 void beforeAllInit() {
		System.out.println("need to run before all");
		
	}
	@AfterEach
	void cleanUp() {
		System.out.println("clean Up..");
	}
	@Test
	@Tag("Math")
	void testAdd() {
	 
		 
		int expected= 3;
		int actual =mathUtils.add(1, 2);
		assertEquals(expected, actual,"method add tow positive number");
	}
	@RepeatedTest(5)
	@DisplayName("test the compute the area of circle")
	//@EnabledOnOs(OS.LINUX)
	@Tag("CERCLE")
	void testcomputeCircleArea()
	{
		boolean assumption=true;
		assumeTrue(assumption);
		assertEquals(314.159,mathUtils.computeCircleArea(10),"Calculate circle Area ");
		
	}
	@Test
	@Disabled
	@Tag("Math")
	void testDevide()
	{
		
		
		assertThrows(ArithmeticException.class, ()->mathUtils.devide(15, 0),"Assert Throow");
		
	
	}
	@Test
	@DisplayName("mutiplay test")
	@Tag("Math")
	void multiplyTest(){
		testReporter.publishEntry("test reported"+testInfo.getDisplayName()+" "+testInfo.toString());
		assertAll(
				() -> assertEquals(4,mathUtils.multiply(2,2) , "Multiply 2*2"),
				() -> assertEquals(0,mathUtils.multiply(2,0) , "Multiply by 0"),
				() -> assertEquals(2,mathUtils.multiply(2,1) , "Multiply by 1")
				);
		
		
	}

}
