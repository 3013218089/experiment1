import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest{
	
	@Parameters
	public static Collection prepareData(){
	return Arrays.asList(new Object[][]{{1,3,5,"Not triangle"},{1,2,-3,"Illegal"},{3,4,5,"Scalene"},
			{2,2,2,"Equilateral"},{2,3,3,"Isosceles"}});
	}
	public TriangleTest(int param1,int param2,int param3,String result){
	this.param1 = param1;
	this.param2 = param2;
	this.param3 = param3;
	this.result = result;
	}
	@Test
	public void Test(){
	triangle.setData(new int[]{param1,param2,param3});
	assertEquals(result, triangle.checkTriangle());
	}
	private int param1,param2,param3;
	private String result;
	private static Triangle triangle = new Triangle();
}