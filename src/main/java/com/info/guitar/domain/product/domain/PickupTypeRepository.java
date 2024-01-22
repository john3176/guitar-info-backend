package com.info.guitar.domain.product.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PickupTypeRepository extends JpaRepository<PickupType, Long> {

}
