package com.huawei.cscloud.mavenarchetypewebappopex.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.cscloud.mavenarchetypewebappopex.pojo.User;

@RestController
@RequestMapping("api")
public class DataController {
	
	/**
	 * get request demo
	 * @param userId
	 * @return
	 */
	@GetMapping("getUserById")
	public Map<String,Object> getUserById(Integer userId)
	{
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("id", userId);
		resMap.put("name", "my name is Hanmeimei");
		return resMap;
	}
	
	/**
	 * requestParma demo
	 * @param userId
	 * @return
	 */
	@GetMapping("getUserByParamId")
	public Map<String,Object> getUserByParamId(@RequestParam("id") Integer userId)
	{
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("id", userId);
		resMap.put("name", "my name is Hanmeimei");
		return resMap;
	}
	
	/**
	 * pathVariable demo
	 * @param userId
	 * @return
	 */
	@GetMapping("getUserByPathId/{id}")
	public Map<String,Object> getUserByPathId(@PathVariable("id") Integer userId)
	{
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("id", userId);
		resMap.put("name", "my name is Hanmeimei");
		return resMap;
	}
	
	/**
	 * post request demo
	 * @param userName
	 * @return
	 */
	@PostMapping("getUserByName")
	public Map<String,Object> getUserByName(String userName)
	{
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("id", 1);
		resMap.put("name", userName);
		return resMap;
	}
	
	/**
	 * requestbody demo
	 * @param user
	 * @return
	 */
	@PostMapping("saveUser")
	public User saveUser(@RequestBody User user)
	{
		return user;
	}
	
	/**
	 * requestHeader demo
	 * @param user
	 * @return
	 */
	@PostMapping("saveUserByToken")
	public Map<String,Object> saveUser(@RequestHeader("token") String token, @RequestBody User user)
	{
		Map<String,Object> resMap = new HashMap<String,Object>();
		resMap.put("token", token);
		resMap.put("user",user);
		return resMap;
	}
	
	/**
	 * update demo
	 * @param userId
	 * @return
	 */
	@PutMapping("updateUser")
	public String updateUser(Integer userId)
	{
		return "user " +  userId + " is updated";
	}
	
	/**
	 * delete demo
	 * @param userId
	 * @return
	 */
	@DeleteMapping("deleteUser")
	public String deleteUser(Integer userId)
	{
		return "user " + userId + " is deleted";
	}

}
