package com.visitor.vms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.visitor.vms.Model.Requestid;
import com.visitor.vms.Model.Responseid;
import com.visitor.vms.Repo.Repo;
import com.visitor.vms.Service.VmsService;
import com.visitor.vms.User.UserEntity;




@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ApiControllers {
	
	@Autowired
	private Repo myRepo;
	
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
	public Responseid Saveuser (@RequestBody Requestid request) 
	{
		Responseid res = VmsService.addUser(request);
		System.out.println("email id..."+request.getEmail());
		System.out.println("Password..."+request.getPassword());
		
		return res;	
	}
}
	
//	@PostMapping("/register") 
//	  public ResponseDto register(@RequestBody RequestDto request) {
//		  Response response = registerService.addUser(request);
//	  System.out.println("username.."+requestdto.getUsername());
//	  System.out.println("password..."+requestdto.getPassword());
//	  System.out.println("email..."+requestdto.getEmail());
//	  System.out.println("mobilenumber..."+requestdto.getMobilenumber());
//	  
//	  return response;
//	  
//	  }


