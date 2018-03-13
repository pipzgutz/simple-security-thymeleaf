package com.example.simplesecuritythymeleaf.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Philip Mark Gutierrez
 * @version 1.0
 * @since March 13, 2018
 */
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long id;

    private String role;

    public UserRole() {
    }

    public UserRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRole)) return false;
        UserRole that = (UserRole) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, role);
    }
}
