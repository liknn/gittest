package cn.ssm.dao;

import cn.ssm.domain.User;

public interface UserDao {
	public abstract User findByUserName(String userName);
}
