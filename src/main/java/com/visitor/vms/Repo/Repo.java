package com.visitor.vms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.visitor.vms.User.UserEntity;

public interface Repo extends JpaRepository<UserEntity, Integer> {

}
