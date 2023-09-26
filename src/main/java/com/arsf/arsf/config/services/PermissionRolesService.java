package com.arsf.arsf.config.services;
import com.arsf.arsf.config.models.PermissionRoles;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public interface PermissionRolesService {

    List<PermissionRoles> getAllPermissions();

    Optional<PermissionRoles> getPermissionById(String idFeature, String idPermission, String idRole);

    PermissionRoles createPermission(PermissionRoles permission);

    PermissionRoles updatePermission(PermissionRoles permission);


    List<PermissionRoles> getPermissionRolesRoleById(String idRole);

    void deletePermissionsByFeatureAndRole(String idFeature, String idRole);

    void deleteByFeatureAndPermissionAndRole(String idFeature, String idPermission, String idRole);


}
