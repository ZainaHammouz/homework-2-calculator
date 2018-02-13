package calculater;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testtt {
	Controler c1;
	view v;
	model m;
	String[] ar= {"2","+","5","="}; 


	@Before
	public void setUp() throws Exception {
		c1 =new Controler();
		m= new model();
		v= new view();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void test() {
		assertEquals(7,c1.work(ar,m,v),0);
		ar[0]="2";
		ar[1]="/";
		ar[2]="0";
		ar[3]="=";
		assertEquals(1,c1.work(ar,m,v),0);
		ar[0]="2";
		ar[1]="%";
		ar[2]="0";
		ar[3]="=";
		assertEquals(1,c1.work(ar,m,v),0);
		ar[0]="-8";
		ar[1]="s";
		ar[2]="=";
		assertEquals(1,c1.work(ar,m,v),0);
		ar[0]="2";
		ar[1]="%";
		ar[2]="0";
		ar[3]="=";
		assertEquals(1,c1.work(ar,m,v),0);


		
	}

}

