package com.minitest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.swing.text.Document;

public interface IDocumentService extends IGenericService<Document> {
    Page<Document> findAll(Pageable pageable);
    Page<Document> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
