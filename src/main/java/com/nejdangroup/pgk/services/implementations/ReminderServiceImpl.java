package com.nejdangroup.pgk.services.implementations;

import com.nejdangroup.pgk.models.Reminder;
import com.nejdangroup.pgk.repositories.ReminderRepository;
import com.nejdangroup.pgk.services.interfaces.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;


public class ReminderServiceImpl implements ReminderService {

    private final ReminderRepository reminderRepository;

    @Autowired
    protected ReminderServiceImpl(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @Override
    public void saveReminder(Reminder reminder) {
        reminderRepository.saveAndFlush(reminder);
    }

    @Override
    public void updateReminder(Reminder reminder) {
        reminderRepository.saveAndFlush(reminder);
    }

    @Override
    public void deleteReminder(Long id) {
        reminderRepository.deleteById(id);
    }

    @Override
    public void getAllByUserId(Long id) {
        reminderRepository.getAllByUserId(id);
    }
}
