package com.arsf.arsf.config.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.IdClass;

@Entity
@Table(name = "tbpermissionroles", schema = "rsf")
@IdClass(PermissionRolesPK.class)
public class PermissionRoles {
    @Id
    @Column(name = "id_feature", nullable = false)
    private String idFeature;

    @Id
    @Column(name = "id_permission", nullable = false)
    private String idPermission;

    @Id
    @Column(name = "id_role", nullable = false)
    private String idRole;

    public String getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(String idFeature) {
        this.idFeature = idFeature;
    }

    public String getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(String idPermission) {
        this.idPermission = idPermission;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

}
