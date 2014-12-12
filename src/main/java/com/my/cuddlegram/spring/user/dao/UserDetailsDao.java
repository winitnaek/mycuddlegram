package com.my.cuddlegram.spring.user.dao;

import com.my.cuddlegram.spring.user.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);
	
	UserAttempts getUserAttempts(String username);

}