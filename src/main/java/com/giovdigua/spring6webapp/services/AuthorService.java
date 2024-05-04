package com.giovdigua.spring6webapp.services;

import com.giovdigua.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
