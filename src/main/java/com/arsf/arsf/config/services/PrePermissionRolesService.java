package com.arsf.arsf.config.services;
import com.arsf.arsf.config.models.PrePermissionRoles;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PrePermissionRolesService {
    List<PrePermissionRoles> getAllPermissions();

    Optional<PrePermissionRoles> getPermissionById(String idFeature, String idPermission, String idRole);

    PrePermissionRoles createPermission(PrePermissionRoles permission);

    PrePermissionRoles updatePermission(PrePermissionRoles permission);


    List<PrePermissionRoles> getPrePermissionRolesRoleById(String idRole);

    void deletePermissionsByFeatureAndRole(String idFeature, String idRole);

    void deleteByFeatureAndPermissionAndRole(String idFeature, String idPermission, String idRole);
}
