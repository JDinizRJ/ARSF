package com.arsf.arsf.config.repositories;

import com.arsf.arsf.config.models.PermissionRoles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface PermissionRolesRepository extends JpaRepository <PermissionRoles, String> {

    List<PermissionRoles> findByIdRole(String idRole);


    @Transactional
    @Modifying
    @Query("DELETE FROM PermissionRoles p WHERE p.idFeature = :idFeature AND p.idRole = :idRole ")
    void deleteByFeatureAndRole(String idFeature, String idRole);

    @Transactional
    @Modifying
    @Query("DELETE FROM PermissionRoles p WHERE p.idFeature = :idFeature " +
            " AND p.idPermission = :idPermission " +
            " AND p.idRole = :idRole ")
    void deleteByFeatureAndPermissionAndRole(String idFeature, String idPermission, String idRole);

}
