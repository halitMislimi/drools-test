package ch.hug.service.drools;

import lombok.Data;


/**
 * The Class DiscountRequest.
 */
@Data
public class DiscountRequest {

	/** The amount. */
	private Long amount;

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	
	public void setMaximumFullDiscountValue() {
		if( this.fullDiscountValue > 40) {
			this.fullDiscountValue = 40;
		}
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Gets the client type.
	 *
	 * @return the client type
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * Sets the client type.
	 *
	 * @param clientType the new client type
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/**
	 * Gets the discount code.
	 *
	 * @return the discount code
	 */
	public String getDiscountCode() {
		return discountCode;
	}

	/**
	 * Sets the discount code.
	 *
	 * @param discountCode the new discount code
	 */
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	/**
	 * Gets the discount value.
	 *
	 * @return the discount value
	 */
	public Integer getDiscountValue() {
		return discountValue;
	}

	/**
	 * Sets the discount value.
	 *
	 * @param discountValue the new discount value
	 */
	public void setDiscountValue(Integer discountValue) {
		this.discountValue = discountValue;
	}

	/**
	 * Gets the full discount value.
	 *
	 * @return the full discount value
	 */
	public Integer getFullDiscountValue() {
		return fullDiscountValue;
	}

	/**
	 * Sets the full discount value.
	 *
	 * @param fullDiscountValue the new full discount value
	 */
	public void setFullDiscountValue(Integer fullDiscountValue) {
		this.fullDiscountValue = fullDiscountValue;
		this.setMaximumFullDiscountValue();
	}

	/** The age. */
	private Integer age;

	/** The client type. */
	private String clientType;

	/** The discount code. */
	private String discountCode;

	/** The discount value. */
	private Integer discountValue = 0;

	/** The full discount value. */
	private Integer fullDiscountValue = 0;

	/**
	 * The Enum ClientType.
	 */
	public enum ClientType {
		
		/** The normal. */
		NORMAL, 
 /** The vip. */
 VIP
	}

}
