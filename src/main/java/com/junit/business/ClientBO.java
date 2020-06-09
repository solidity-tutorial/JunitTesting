package com.junit.business;

import java.util.List;

import com.junit.business.exception.DifferentCurrenciesException;
import com.junit.model.Amount;
import com.junit.model.Product;

public interface ClientBO {
	Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException;

}