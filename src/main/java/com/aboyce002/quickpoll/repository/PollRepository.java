package com.aboyce002.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;
import com.aboyce002.quickpoll.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long>{
}
