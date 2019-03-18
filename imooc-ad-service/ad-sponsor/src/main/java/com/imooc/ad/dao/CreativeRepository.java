package com.imooc.ad.dao;

import com.imooc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/07     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-07 10:07
 * @date 2019-03-07 10:07
 * @since 1.0.0
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
