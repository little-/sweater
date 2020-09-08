package com.example.sweater.repository;
import com.example.sweater.domain.message;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepository extends CrudRepository<message, Long> {
}
