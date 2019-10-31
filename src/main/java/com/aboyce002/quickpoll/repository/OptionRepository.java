package com.aboyce002.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;
import com.aboyce002.quickpoll.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long>{
}
