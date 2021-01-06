package com.nhandn.shop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    @Column(name = "middleName", length = 50, nullable = false)
    private String middleName;

    @Column(name = "lastName", length = 50, nullable = false)
    private String lastName;

    @Column(name = "mobile", length = 15, nullable = false)
    private String mobile;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "passwordHash", length = 32, nullable = false)
    private String passwordHash;

    @Column(name = "userName", length = 50, nullable = false)
    private String userName;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @Column(name = "isNotLocked", nullable = false)
    private Boolean isNotLocked;

    @Column(name = "admin", length = 1, nullable = false)
    private Integer admin;

    @Column(name = "vendor", length = 1, nullable = false)
    private Integer vendor;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "registeredAt", nullable = false)
    private Date registeredAt;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "lastLogin", nullable = false)
    private Date lastLogin;

    @Column(name = "intro", nullable = false)
    private String intro;

    @Column(name = "profile", nullable = false)
    private String profile;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // cascade = CascadeType.ALL save Role
    private List<Role> roles;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cart> carts;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", userName='" + userName + '\'' +
                ", isActive=" + isActive +
                ", isNotLocked=" + isNotLocked +
                ", admin=" + admin +
                ", vendor=" + vendor +
                ", registeredAt=" + registeredAt +
                ", lastLogin=" + lastLogin +
                ", intro='" + intro + '\'' +
                ", profile='" + profile + '\'' +
                ", roles=" + roles +
                ", carts=" + carts +
                ", products=" + products +
                ", transactions=" + transactions +
                ", orders=" + orders +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
