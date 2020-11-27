package com.iunode.blog.dao;

import com.iunode.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);

    @Query(value= "select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
