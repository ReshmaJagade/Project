package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserRepository;
import com.app.pojos.User;

@Service // => spring bean class containing B.L
@Transactional // => automatic Tx management (done by spring supplied hibernate tx mgr
				// configured in hibernate-persistece.xml file
public class UserServiceImpl implements IUserService {
	// dependency
	@Autowired // autowire=byType =>SC searches for any spring bean that has imple. IUserDao n
				// supplies it's instance
	private IUserRepository userDao;

	@Override
	public User validateUser(String username, String password) {
		User u=userDao.findByUserName(username,password);
	
		return u;
	}
	@Override
	public User addUser(User user) {
		
		User u=userDao.save(user);
		return u;
		
	}
	@Override
	public String deleteUser(String username) {
		User u=userDao.findByUserName1(username);
				userDao.delete(u);
				return "User details deleted for with username="+username;
	}

}
