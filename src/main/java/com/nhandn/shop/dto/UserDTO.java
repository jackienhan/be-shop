package com.nhandn.shop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO extends AbstractDTO {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String passwordHash;
    private String userName;
    private Boolean isActive;
    private Boolean isNotLocked;
    private Long admin;
    private Long vendor;
    private Date registeredAt;
    private Date lastLogin;
    private String intro;
    private String profile;
    private List<RoleDTO> roles;
    private List<CartDTO> carts;
    private List<ProductDTO> products;
    private List<TransactionDTO> transactions;
    private List<OrderDTO> orders;

    @Override
    public String toString() {
        return "UserDTO{" +
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
                ", updatedAt=" + updatedAt +
                '}';
    }
}
