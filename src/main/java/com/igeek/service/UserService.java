package com.igeek.service;

import com.igeek.entity.UserAddress;

import java.util.List;

/**
 * @author zhan
 * @create 2019-11-21 19:35
 * @describe (describe)
 */
public interface UserService {
	public List<UserAddress> getUserAddressList(String userId);
}
