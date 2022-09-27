package com.nejdangroup.pgk.services.interfaces;

import com.nejdangroup.pgk.models.Reminder;

public interface ReminderService {
    void saveReminder(Reminder reminder);

    void updateReminder(Reminder reminder);

    void deleteReminder(Long id);

    void getAllByUserId(Long id);
}
