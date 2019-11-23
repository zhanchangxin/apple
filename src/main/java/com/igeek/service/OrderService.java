package com.igeek.service;

import com.igeek.entity.UserAddress;

import java.util.List;

/**
 * @author zhan
 * @create 2019-11-21 19:47
 * @describe (describe)
 */
public interface OrderService {
	public List<UserAddress> initOrder(String userId);
}
