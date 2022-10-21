package com.visitor.vms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.visitor.vms.User.UserEntity;

@Repository
public interface Repo extends JpaRepository<UserEntity, Integer> {

}
