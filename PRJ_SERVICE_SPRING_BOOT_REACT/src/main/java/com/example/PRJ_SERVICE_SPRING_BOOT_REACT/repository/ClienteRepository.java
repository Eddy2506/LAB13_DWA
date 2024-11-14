package com.example.PRJ_SERVICE_SPRING_BOOT_REACT.repository;

import com.example.PRJ_SERVICE_SPRING_BOOT_REACT.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
