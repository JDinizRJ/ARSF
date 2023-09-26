package com.arsf.arsf.config.endpoints;

import com.arsf.arsf.config.models.PrePermissionRoles;
import com.arsf.arsf.config.services.PrePermissionRolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prepermissionrole")
public class PrePermissionRolesController {

    private final PrePermissionRolesService prepermissionRolesService;

    @Autowired
    public PrePermissionRolesController(PrePermissionRolesService prepermissionRolesService) {
        this.prepermissionRolesService = prepermissionRolesService;
    }

    @GetMapping("/role/{id}")
    public ResponseEntity<List<PrePermissionRoles>> getPrePermissionRolesRoleById(@PathVariable String id) {
        List<PrePermissionRoles> prepermissionroles = prepermissionRolesService.getPrePermissionRolesRoleById(id);
        if (!prepermissionroles.isEmpty()) {
            return new ResponseEntity<>(prepermissionroles, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<PrePermissionRoles> getAllPermissions() {
        return prepermissionRolesService.getAllPermissions();
    }

    @GetMapping("/key/{idFeature}/{idPermission}/{idRole}")
    public Optional<PrePermissionRoles> getPermissionById(
            @PathVariable String idFeature,
            @PathVariable String idPermission,
            @PathVariable String idRole) {
        return prepermissionRolesService.getPermissionById(idFeature, idPermission, idRole);
    }
    @DeleteMapping("/delete/{idFeature}/{idPermission}/{idRole}")
    public void deletePermission(
            @PathVariable String idFeature,
            @PathVariable  String idPermission,
            @PathVariable  String idRole ) {
        {
            prepermissionRolesService.deleteByFeatureAndPermissionAndRole(idFeature, idPermission, idRole);
        }
    }
    @DeleteMapping("/deleterole/{idFeature}/{idRole}")
    public void deletePermissionsByFeatureAndRole (
            @PathVariable String idFeature,
            @PathVariable String idRole){
        {
            prepermissionRolesService.deletePermissionsByFeatureAndRole(idFeature, idRole);
        }
    }

    @PostMapping
    public PrePermissionRoles createPermission(@RequestBody PrePermissionRoles permission) {
        return prepermissionRolesService.createPermission(permission);
    }

    @PutMapping
    public PrePermissionRoles updatePermission(@RequestBody PrePermissionRoles permission) {
        return prepermissionRolesService.updatePermission(permission);
    }

}