package ch.hug.service.drools;

import lombok.Data;

@Data
public class DiscountRequest {

	private Long amount;

	private Integer age;

	private String clientType;

	private String discountCode;

	private Integer discountValue = 0;

	private Integer fullDiscountValue = 0;

	public enum ClientType {
		NORMAL, VIP
	}

}
