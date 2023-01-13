package com.app.easymoviestracker.Repository;

import com.app.easymoviestracker.Entity.ExitDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExitDayRepository extends JpaRepository<ExitDay, Integer> {
}
