package com.example.simplesecuritythymeleaf.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Philip Mark Gutierrez
 * @version 1.0
 * @since March 13, 2018
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String email;

    private String password;

    private Boolean enabled;

    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private List<UserRole> userRoles;

    public User(String email, String password, Boolean enabled, List<UserRole> userRoles) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.userRoles = userRoles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(enabled, user.enabled) &&
                Objects.equals(userRoles, user.userRoles);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, email, password, enabled, userRoles);
    }
}
