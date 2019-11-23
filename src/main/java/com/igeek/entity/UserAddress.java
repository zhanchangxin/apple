package com.igeek.entity;

import java.io.Serializable;

/**
 * @author zhan
 * @create 2019-11-21 19:37
 * @describe (describe)
 */
public class UserAddress implements Serializable {
	private String id;
	private String userId;
	private String userAddress;
	private String consignee;
	private String phone;

	@Override
	public String toString() {
		return "UserAddress{" +
				"id='" + id + '\'' +
				", userId='" + userId + '\'' +
				", userAddress='" + userAddress + '\'' +
				", consignee='" + consignee + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}

	public UserAddress() {
	}

	public UserAddress(String id, String userId, String userAddress, String consignee, String phone) {
		this.id = id;
		this.userId = userId;
		this.userAddress = userAddress;
		this.consignee = consignee;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
