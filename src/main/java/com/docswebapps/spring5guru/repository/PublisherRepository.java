package com.docswebapps.spring5guru.repository;

import com.docswebapps.spring5guru.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dave Collier on 27/07/2017.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
