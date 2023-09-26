package com.arsf.arsf.config.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbprepermissionroles", schema = "rsf")
@IdClass(PrePermissionRolesPK.class)
public class  PrePermissionRoles implements Serializable {
    @Id
    @Column(name = "id_feature", nullable = false)
    private String idFeature;

    @Id
    @Column(name = "id_permission", nullable = false)
    private String idPermission;

    @Id
    @Column(name = "id_role", nullable = false)
    private String idRole;

    @Column(name = "id_risk", nullable = true)
    private String idRisk;

    @Column(name = "approve", nullable = true)
    private String Approve;

    @Column(name = "dt_approve", nullable = true)
    private LocalDateTime dtApprove;

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

    public String getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(String idRisk) {
        this.idRisk = idRisk;
    }

    public String getApprove() {
        return Approve;
    }

    public void setApprove(String approve) {
        Approve = approve;
    }

    public LocalDateTime getDtApprove() {
        return dtApprove;
    }

    public void setDtApprove(LocalDateTime dtApprove) {
        this.dtApprove = dtApprove;
    }
}
