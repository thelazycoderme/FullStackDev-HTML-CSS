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
    private long id;

    //foreign key
//
//    @OneToOne
//    @JoinColumn(name = "order_product_id")
//    private Order_product order_product;
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
