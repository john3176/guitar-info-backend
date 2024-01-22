package com.info.guitar.domain.product.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Guitar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long guitarTypeId;

    @Column(nullable = false)
    private Long brandId;

    @Column(nullable = false)
    private Long pickupNum;

    private Long firstPickupId;

    private Long secondPickupId;

    private Long thirdPickupId;

    @Column(nullable = false)
    private Long neckWoodTypeId;

    @Column(nullable = false)
    private Long bodyWoodTypeId;
}
