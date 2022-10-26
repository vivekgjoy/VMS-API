package com.visitor.vms.Controller;

import java.util.List;


import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.visitor.vms.Model.Request;
import com.visitor.vms.Repo.Repo;
import com.visitor.vms.Service.VmsService;
import com.visitor.vms.User.UserEntity;

@RestController
@CrossOrigin(origins = "http://localhost:63331")

public class ApiControllers {
	@Autowired
	Repo myRepo;
	@Autowired
	VmsService vmsService;
	
	@GetMapping(value = "/")
	public String getPage() {
		return "Welcome...";
	}
	
	@GetMapping(value="/get")
	public List<UserEntity> getUsers() 
	{
		return myRepo.findAll();
	}
	
	@PostMapping(value="/saveuser")
	public Response Saveuser (@RequestBody Request request)
	{
		Response res = vmsService.addUser(request);
//		System.out.println("Firstname..."+request.getFirstname());
//		System.out.println("Lastname..."+request.getLastname());
//		System.out.println("Email id..."+request.getMail());
//		System.out.println("Password..."+request.getPassword());
		return res;
	}
	
		@RequestMapping(value="/updateUser/{branchid}", method=RequestMethod.PUT)
		public Response updateUser(@RequestBody Request request) {
		Response response = vmsService.updateUser(request);
		return response;
	}
	
}

