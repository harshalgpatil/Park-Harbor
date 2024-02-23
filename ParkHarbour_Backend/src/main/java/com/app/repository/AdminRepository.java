package com.app.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	List<Admin> findByAdmin_id(long admin_id);
}
