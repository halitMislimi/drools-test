package ch.hug.service.drools;

import org.junit.jupiter.api.Test;


import static ch.hug.service.drools.DiscountRequest.ClientType.NORMAL;
import static ch.hug.service.drools.DiscountRequest.ClientType.VIP;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DroolsLevel2Test {

	DroolsService droolsService = new DroolsService();

	@Test
	public void testRule1()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(100L);
		request.setClientType(NORMAL.toString());
		request.setDiscountCode("Code1");

		droolsService.fireRules(request);

		assertEquals(20, request.getFullDiscountValue());
	}


	@Test
	public void testRule2()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(100L);
		request.setClientType(NORMAL.toString());
		request.setDiscountCode("Code2");

		droolsService.fireRules(request);

		assertEquals(20, request.getFullDiscountValue());
	}

	@Test
	public void testRule3()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(100L);
		request.setClientType(NORMAL.toString());
		request.setDiscountCode("Code3");

		droolsService.fireRules(request);

		assertEquals(30, request.getFullDiscountValue());
	}

	@Test
	public void testRule4()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(5500L);
		request.setClientType(VIP.toString());
		request.setDiscountCode("Code3");

		droolsService.fireRules(request);

		assertEquals(40, request.getFullDiscountValue());
	}


	@Test
	public void testRule5()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(5500L);
		request.setClientType(VIP.toString());

		droolsService.fireRules(request);

		assertEquals(30, request.getFullDiscountValue());
	}

	@Test
	public void testRule6()  {
		DiscountRequest request = new DiscountRequest();

		request.setAge(20);
		request.setAmount(550L);
		request.setDiscountCode("Code1");
		request.setClientType(NORMAL.toString());

		droolsService.fireRules(request);

		assertEquals(30, request.getFullDiscountValue());
	}
}
