package com.visitor.vms.Service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visitor.vms.Model.Request;
import com.visitor.vms.Repo.Repo;
import com.visitor.vms.User.UserEntity;
 
	
@Service
public class VmsServiceIMPL implements VmsService {

	@Autowired
	Repo userRepo;
	
	@Override
	public Response addUser(Request request) {
		Response saveEntity=new Response();
		try {
			UserEntity entity=new UserEntity();
			entity.setFirstname(request.getFirstname());
			entity.setLastname(request.getLastname());
			entity.setMail(request.getMail());
			entity.setPassword(request.getPassword());
			userRepo.save(entity);
		//response.getMessage("User Registration successfull");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return saveEntity;
	}
	
	
	
	public Response updateUser(Request request) {
		Response response = new Response();
		try {
			UserEntity userEntity = new UserEntity();
			userEntity = userRepo.getOne(request.getBranchid());
			if(userEntity!=null) {
				userEntity.setFirstname(request.getFirstname());
				userEntity.setLastname(request.getLastname());
				userEntity.setMail(request.getMail());
				userEntity.setPassword(request.getPassword());
//				if(null!=userRepo.saveAndFlush(userEntity)) {
//					response.setMessage("Data Updated Successfully");
//				}else {
//					response.setMessage("Failed to Update");
//				}
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
				return response;
			}
}


