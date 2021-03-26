package com.codespark.springbootbasics.redisdata.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Redis library will automatically manage hash operations for the
 * entity i.e. a Redis hash.
 */
@Repository
public interface ReportRepository extends CrudRepository<Report, String> {

}
