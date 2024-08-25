package com.minitest.service;

import com.minitest.dto.ICategoryDocumentNumber;
import com.minitest.model.Category;

import java.util.List;

public interface ICategoryService extends IGenericService<Category> {
    void deleteCategoryById(Long id);
    List<Category> findALl();
    List<ICategoryDocumentNumber> getCategoryDocumentNumber();
}
