package com.visitor.vms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visitor.vms.Model.Requestid;
import com.visitor.vms.Model.Responseid;
import com.visitor.vms.Repo.Repo;
import com.visitor.vms.User.UserEntity;
 
	
@Service
public class VmsServiceIMPL implements VmsService {

	@Autowired
	Repo repo;
	
	public Responseid addUser(Requestid request) {
		Responseid saveEntity=new Responseid();
		try {
			UserEntity entity=new UserEntity();
			entity.setFirstname(request.getFirstname());
			entity.setLastname(request.getLastname());
			entity.setEmail(request.getEmail());
			entity.setPassword(request.getPassword());
			repo.save(entity);
			saveEntity.setMessage("Registration successfull");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return saveEntity;
	}

}
