package com.liyu.dao;

import com.liyu.entity.User;

/**
 * user数据层访问接口
 * @author liyu
 * @version 1.0 2017-12-07
 */
public interface UserDao {

	public abstract User findByUsername(String username);
	
}
