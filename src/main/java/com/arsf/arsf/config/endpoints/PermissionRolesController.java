package com.arsf.arsf.config.endpoints;

import com.arsf.arsf.config.models.PermissionRoles;
import com.arsf.arsf.config.services.PermissionRolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/permissionrole")
public class PermissionRolesController {

    private final PermissionRolesService permissionRolesService;

    @Autowired
    public PermissionRolesController(PermissionRolesService permissionRolesService) {
        this.permissionRolesService = permissionRolesService;
    }

    @GetMapping("/role/{id}")
    public ResponseEntity<List<PermissionRoles>> getPermissionRolesRoleById(@PathVariable String id) {
        List<PermissionRoles> permissionroles = permissionRolesService.getPermissionRolesRoleById (id);
        if (!permissionroles.isEmpty()) {
            return new ResponseEntity<>(permissionroles, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<PermissionRoles> getAllPermissions() {
        return permissionRolesService.getAllPermissions();
    }

    @GetMapping("/key/{idFeature}/{idPermission}/{idRole}")
    public Optional<PermissionRoles> getPermissionById(
            @PathVariable String idFeature,
            @PathVariable String idPermission,
            @PathVariable String idRole) {
        return permissionRolesService.getPermissionById(idFeature, idPermission, idRole);
    }
    @DeleteMapping("/delete/{idFeature}/{idPermission}/{idRole}")
    public void deletePermission(
            @PathVariable String idFeature,
            @PathVariable  String idPermission,
            @PathVariable  String idRole ) {
        {
            permissionRolesService.deleteByFeatureAndPermissionAndRole(idFeature, idPermission, idRole);
        }
    }
    @DeleteMapping("/deleterole/{idFeature}/{idRole}")
    public void deletePermissionsByFeatureAndRole (
            @PathVariable String idFeature,
            @PathVariable String idRole){
        {
            permissionRolesService.deletePermissionsByFeatureAndRole(idFeature, idRole);
        }
    }

    @PostMapping
    public PermissionRoles createPermission(@RequestBody PermissionRoles permission) {
        return permissionRolesService.createPermission(permission);
    }

    @PutMapping
    public PermissionRoles updatePermission(@RequestBody PermissionRoles permission) {
        return permissionRolesService.updatePermission(permission);
    }


}
