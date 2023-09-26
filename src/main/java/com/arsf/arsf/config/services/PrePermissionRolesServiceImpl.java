package com.arsf.arsf.config.services;

import com.arsf.arsf.config.models.PrePermissionRoles;
import com.arsf.arsf.config.models.PrePermissionRolesPK;
import com.arsf.arsf.config.repositories.PrePermissionRolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrePermissionRolesServiceImpl implements PrePermissionRolesService {
    private final PrePermissionRolesRepository repository;

    @Autowired
    public PrePermissionRolesServiceImpl(PrePermissionRolesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PrePermissionRoles> getAllPermissions() {
        return repository.findAll();
    }

    @Override
    public Optional<PrePermissionRoles> getPermissionById(String idFeature, String idPermission, String idRole) {
        return repository.findById(new PrePermissionRolesPK( idFeature, idPermission, idRole));
    }

    @Override
    public PrePermissionRoles createPermission(PrePermissionRoles permission) {
        return repository.save(permission);
    }

    @Override
    public PrePermissionRoles updatePermission(PrePermissionRoles permission) {
        return repository.save(permission);
    }

    @Override
    public List<PrePermissionRoles> getPrePermissionRolesRoleById(String idRole){
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
