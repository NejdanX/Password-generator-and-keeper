package com.nejdangroup.pgk.repositories;

import com.nejdangroup.pgk.models.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface ReminderRepository extends JpaRepository<Reminder, Long> {

    @Query("SELECT r FROM Reminder r WHERE r.user_id = :user_id")
    List<Reminder> getAllByUserId(@Param("user_id") Long id);
}
