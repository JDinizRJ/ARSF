package com.arsf.arsf.config.repositories;
import com.arsf.arsf.config.models.PrePermissionRoles;
import com.arsf.arsf.config.models.PrePermissionRolesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface PrePermissionRolesRepository extends JpaRepository <PrePermissionRoles, PrePermissionRolesPK> {

    List<PrePermissionRoles> findByIdRole (String idRole);

    @Transactional
    @Modifying
    @Query("DELETE FROM PrePermissionRoles p WHERE p.idFeature = :idFeature AND p.idRole = :idRole ")
    void deleteByFeatureAndRole(String idFeature, String idRole);

    @Transactional
    @Modifying
    @Query("DELETE FROM PrePermissionRoles p WHERE p.idFeature = :idFeature " +
            " AND p.idPermission = :idPermission " +
            " AND p.idRole = :idRole ")
    void deleteByFeatureAndPermissionAndRole(String idFeature, String idPermission, String idRole);
}
