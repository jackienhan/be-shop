package com.nhandn.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "t_order")
@Getter
@Setter
public class Order extends AbstractAuditEntity {

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

    @Column(name = "subTotal", nullable = false)
    private Float subTotal;

    @Column(name = "itemDiscount", nullable = false)
    private Float itemDiscount;

    @Column(name = "tax", nullable = false)
    private Float tax;

    @Column(name = "shipping", nullable = false)
    private Float shipping;

    @Column(name = "total", nullable = false)
    private Float total;

    @Column(name = "promo", length = 50, nullable = false)
    private String promo;

    @Column(name = "discount", nullable = false)
    private Float discount;

    @Column(name = "grandTotal", nullable = false)
    private Float grandTotal;

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

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", sessionId='" + sessionId + '\'' +
                ", token='" + token + '\'' +
                ", status=" + status +
                ", subTotal=" + subTotal +
                ", itemDiscount=" + itemDiscount +
                ", tax=" + tax +
                ", shipping=" + shipping +
                ", total=" + total +
                ", promo='" + promo + '\'' +
                ", discount=" + discount +
                ", grandTotal=" + grandTotal +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", content='" + content + '\'' +
                ", transactions=" + transactions +
                ", orderItems=" + orderItems +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
