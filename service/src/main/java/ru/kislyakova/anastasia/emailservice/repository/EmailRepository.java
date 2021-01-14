package ru.kislyakova.anastasia.emailservice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kislyakova.anastasia.emailmodel.entity.Email;

import java.util.List;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {
    @Override
    List<Email> findAll();
    @Query(value = "select e from Email e where e.mailingId = ?1 and e.mailingAttempt = ?2 and e.recipient = ?3")
    Email findByMailingIdAttemptAndRecipient(int mailingId, int mailingAttempt, String recipient);
}
