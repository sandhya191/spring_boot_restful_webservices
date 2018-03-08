package com.examples.web.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Sandhya
 * A Demo Service that stores data in Heap.
 * A Simulation of a DB to demonstrate virtual memory.
 *
 */

@Component
public class UserDaoService {
	
	private static List<User> users=new ArrayList<>();
	
	private static int usersCount=3;
	
	static 
	{
		users.add(new User(1, "Bavaaaa", new Date()));
		users.add(new User(2,"Bava",new Date()));
		users.add(new User(3, "BavaKon", new Date()));
	}
	
	public List<User> findAll()
	{
		return users;
	}
	public User save(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	public User deleteById(int id)
	{
		Iterator<User>iterator=users.iterator();
		while(iterator.hasNext())
		{
		 User user=iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		
		return null;
	}
	

	}
