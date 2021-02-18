package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrderStatus {
    @Id
    @GeneratedValue
    private Long id;

    //foreign key
//
    @OneToOne
    @JoinColumn(name = "orderProductId")
    private OrderProduct orderProduct;


    private enum from_status
    {
     ORDER_PLACED,CANCELLED,ORDER_REJECTED,ORDER_CONFIRMED,ORDER_SHIPPED,
        DELIVERED,RETURN_REQUESTED,RETURN_REJECTED,RETURN_APPROVED,PICK_UP_INITIATED,
        PICK_UP_COMPLETED,REFUND_INITIATED,REFUND_COMPLETED;
    }
    private enum to_status
    {
        CANCELLED,
        ORDER_CONFIRMED,
                ORDER_REJECTED,
        REFUND_INITIATED,
                CLOSED,
                ORDER_SHIPPED,
        DELIVERED,
                RETURN_REQUESTED,
                RETURN_REJECTED,
        RETURN_APPROVED,
        PICK_UP_INITIATED,
                PICK_UP_COMPLETED,
                REFUND_COMPLETED,
        }
        private String TRANSITION_NOTES_COMMENTS;
}
