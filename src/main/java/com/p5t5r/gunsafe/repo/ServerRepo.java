package com.p5t5r.gunsafe.repo;

import com.p5t5r.gunsafe.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
