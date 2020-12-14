package com.nhandn.shop.service;

import com.nhandn.shop.dto.AbstractDTO;
import com.nhandn.shop.model.AbstractEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AbstractService<D extends AbstractDTO, E extends AbstractEntity> {

  D save(D dto);

  E save(E entity);

  D saveAndFlush(D dto);

  E saveAndFlush(E entity);

  D save();

  List<D> save(List<D> dtos);

  D findById(long id);

  void delete(long id);

  void delete(D dto);

  List<D> findAll();

  D findById(Object id);

  E findEntityById(Object id);

  void delete(Object dto);

  Pageable getPageable(Integer page, Integer size, boolean sortASC, String by);

  /**
   * get Pageable object with sortable
   *
   * @param page Integer
   * @param size Integer
   * @return Pageable
   */
  Pageable getPageable(Integer page, Integer size);

  void resetCycleAvoidingMappingContext();
}
