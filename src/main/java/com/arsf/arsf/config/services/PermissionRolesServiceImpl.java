package com.arsf.arsf.config.services;

import com.arsf.arsf.config.models.PermissionRoles;
import com.arsf.arsf.config.models.PermissionRolesPK;
import com.arsf.arsf.config.repositories.PermissionRolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionRolesServiceImpl implements PermissionRolesService {
    private final PermissionRolesRepository repository;

    @Autowired
    public PermissionRolesServiceImpl(PermissionRolesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PermissionRoles> getAllPermissions() {
        return repository.findAll();
    }

    @Override
    public Optional<PermissionRoles> getPermissionById(String idFeature, String idPermission, String idRole) {
        return repository.findById(String.valueOf(new PermissionRolesPK( idFeature, idPermission,  idRole)));
    }

    @Override
    public PermissionRoles createPermission(PermissionRoles permission) {
        return repository.save(permission);
    }

    @Override
    public PermissionRoles updatePermission(PermissionRoles permission) {
        return repository.save(permission);
    }

    @Override
    public List<PermissionRoles> getPermissionRolesRoleById(String idRole){
        return repository.findByIdRole(idRole);
    };

    @Override
    public void deletePermissionsByFeatureAndRole(String idFeature, String idRole) {
        repository.deleteByFeatureAndRole(idFeature, idRole);
    }
    @Override
    public void deleteByFeatureAndPermissionAndRole(String idFeature, String idPermission, String idRole){
        repository.deleteByFeatureAndPermissionAndRole(idFeature,  idPermission,  idRole );
    };
}
