package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "cart")
@Getter
@Setter
public class Cart extends AbstractAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;

    @Column(name = "sessionId", length = 100, nullable = false)
    private String sessionId;

    @Column(name = "token", length = 100, nullable = false)
    private String token;

    @Column(name = "status", length = 6, nullable = false)
    private Long status;

    @Column(name = "line1", length = 50, nullable = false)
    private String line1;

    @Column(name = "line2", length = 50, nullable = false)
    private String line2;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "province", length = 50, nullable = false)
    private String province;

    @Column(name = "country", length = 50, nullable = false)
    private String country;

    @Column(name = "content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "cartId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> cartItems;

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", sessionId='" + sessionId + '\'' +
                ", token='" + token + '\'' +
                ", status=" + status +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", content='" + content + '\'' +
                ", cartItems=" + cartItems +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
