package com.arsf.arsf.config.models;
import java.io.Serializable;


public class PrePermissionRolesPK implements Serializable {
    private String idFeature;
    private String idPermission;
    private String idRole;

    public PrePermissionRolesPK() {
        // Construtor padrão vazio necessário para o Hibernate
    }

    public PrePermissionRolesPK(String idFeature, String idPermission, String idRole) {
        this.idFeature = idFeature;
        this.idPermission = idPermission;
        this.idRole = idRole;
    }

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

