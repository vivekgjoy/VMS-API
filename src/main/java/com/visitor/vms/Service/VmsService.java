package com.visitor.vms.Service;

import org.apache.catalina.connector.Response;

import com.visitor.vms.Model.Request;

public interface VmsService {
	
	public Response addUser (Request request);
//	public Response saveUser (Integer branchid,Request saverequest);
	public Response updateUser(Request request);
//	public Response updateService (Response incomingResponse);
}
