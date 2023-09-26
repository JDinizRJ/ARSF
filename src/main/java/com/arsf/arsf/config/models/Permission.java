package com.arsf.arsf.config.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbpermissions", schema = "rsf")
public class Permission {
    @Id
    @Column(name = "id_permission", nullable = false)
    private String idPermission;

    @Column(name = "permission_name", nullable = false)
    private String permissionName;

    @Column(name = "permission_type", nullable = false)
    private String permissionType;

    public String getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(String idPermission) {
        this.idPermission = idPermission;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }
}
