package com.rpo.msscbeerinventoryservice.services;

import com.rpo.msscbeerinventoryservice.model.BeerOrderDto;

/**
 * @author Raghavendra.Prasad
 *
 */
public interface AllocationService {
	
	Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
