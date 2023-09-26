package com.arsf.arsf.config.repositories;

import com.arsf.arsf.config.models.Feature;
import com.arsf.arsf.config.models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository <Permission, String>{

}
