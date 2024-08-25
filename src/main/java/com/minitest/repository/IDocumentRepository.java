package com.minitest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.swing.text.Document;

public interface IDocumentRepository extends PagingAndSortingRepository<Document, Long> {
    Page<Document> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
