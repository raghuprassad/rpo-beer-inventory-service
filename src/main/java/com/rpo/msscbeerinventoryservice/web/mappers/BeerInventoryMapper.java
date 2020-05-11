package com.rpo.msscbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;

import com.rpo.msscbeerinventoryservice.domain.BeerInventory;
import com.rpo.msscbeerinventoryservice.model.BeerInventoryDto;

/**
 * @author Raghavendra.Prasad
 *
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {
	
	BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
