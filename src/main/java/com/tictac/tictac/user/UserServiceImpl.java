package com.tictac.tictac.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUsers(UserModel userModel) throws InterruptedException {
		User user = new User(null, userModel.getFirstName(),userModel.getLastName(),userModel.getContactNo(),Boolean.TRUE);
		userRepository.save(user);
		
	}

	@Override
	public UserModel getUserByUid(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
		
	}

}
