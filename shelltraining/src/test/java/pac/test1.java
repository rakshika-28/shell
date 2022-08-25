package pac;

import org.junit.Test;

import junit.framework.Assert;

public class test1 {
	kr calc;
	public void beforeanno()
	{
		calc=new kr();
	}
	
	@Test
	public void validadd() {
		int act=calc.add(10,20);
		int exres=30;
		Assert.assertEquals(exres,act);
	}
	public void validsub()
	{
		int act=calc.sub(20,10);
		int exres=10;
		Assert.assertEquals(exres, act);
	}

}
