package com.tictac.tictac.user;

import java.util.List;

public interface UserService {

	public void addUsers(UserModel user) throws InterruptedException;

	public UserModel getUserByUid(String uid);

	public List<User> getUsers();
}
