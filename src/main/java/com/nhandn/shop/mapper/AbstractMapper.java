package com.nhandn.shop.mapper;

import com.nhandn.shop.dto.AbstractDTO;
import com.nhandn.shop.mapper.help.CycleAvoidingMappingContext;
import com.nhandn.shop.model.AbstractEntity;
import org.mapstruct.Context;

public interface AbstractMapper<D extends AbstractDTO, E extends AbstractEntity> {

  // TODO: @InheritInverseConfiguration()
  E toEntity(D dto, @Context CycleAvoidingMappingContext context);

  D toDto(E entity, @Context CycleAvoidingMappingContext context);

}
