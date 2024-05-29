package com.mvclib.repository;

import com.mvclib.model.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepositoryPS extends PagingAndSortingRepository<Book, Long> {
}
