package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adminportal.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
