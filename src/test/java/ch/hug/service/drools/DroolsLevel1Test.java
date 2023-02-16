package ch.hug.service.drools;

import org.junit.jupiter.api.Test;


import static ch.hug.service.drools.DiscountRequest.ClientType.NORMAL;
import static ch.hug.service.drools.DiscountRequest.ClientType.VIP;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DroolsLevel1Test {

	DroolsService droolsService = new DroolsService();

	@Test
	public void testRule1()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(100L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(0, request.getDiscountValue());
	}


	@Test
	public void testRule2()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(600L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(10, request.getDiscountValue());
	}

	@Test
	public void testRule3()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(2500L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(15, request.getDiscountValue());
	}

	@Test
	public void testRule4()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(5500L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(20, request.getDiscountValue());
	}




	@Test
	public void testRule5()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(600L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(15, request.getDiscountValue());
	}


	@Test
	public void testRule6()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(2500L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(20, request.getDiscountValue());
	}


	@Test
	public void testRule7()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(5500L);
		request.setClientType(NORMAL.toString());


		droolsService.fireRules(request);

		assertEquals(25, request.getDiscountValue());
	}

	@Test
	public void testRule8()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(600L);
		request.setClientType(VIP.toString());


		droolsService.fireRules(request);

		assertEquals(20, request.getDiscountValue());
	}


	@Test
	public void testRule9()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(2500L);
		request.setClientType(VIP.toString());


		droolsService.fireRules(request);

		assertEquals(25, request.getDiscountValue());
	}

	@Test
	public void testRule10()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(5500L);
		request.setClientType(VIP.toString());


		droolsService.fireRules(request);

		assertEquals(30, request.getDiscountValue());
	}

	@Test
	public void testRule11()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(550L);
		request.setClientType(VIP.toString());


		droolsService.fireRules(request);

		assertEquals(25, request.getDiscountValue());
	}


	@Test
	public void testRule12()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(2500L);
		request.setClientType(VIP.toString());


		droolsService.fireRules(request);

		assertEquals(30, request.getDiscountValue());
	}


	@Test
	public void testRule13()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(70);
		request.setAmount(5500L);
		request.setClientType(VIP.toString());

		droolsService.fireRules(request);

		assertEquals(35, request.getDiscountValue());
	}



}
