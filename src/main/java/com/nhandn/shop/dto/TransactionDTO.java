package com.nhandn.shop.dto;


import com.nhandn.shop.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class TransactionDTO extends AbstractDTO {

    private Long id;
    private User userId;
    private OrderDTO orderId;
    private String code;
    private Long type;
    private Long mode;
    private Long status;
    private String content;

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderId=" + orderId +
                ", code='" + code + '\'' +
                ", type=" + type +
                ", mode=" + mode +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
