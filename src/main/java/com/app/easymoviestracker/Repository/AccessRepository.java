package com.app.easymoviestracker.Repository;

import com.app.easymoviestracker.Entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepository extends JpaRepository<Access, Integer> {
}
