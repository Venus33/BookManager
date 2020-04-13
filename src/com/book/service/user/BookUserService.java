package com.book.service.user;

import com.book.pojo.BookUser;

public interface BookUserService {
	//����һ���û���¼�ķ���
		BookUser loginValidate( String userId,String userPsw);
		//����һ���û�ע��ķ���
		boolean saveUser(BookUser user);
}
