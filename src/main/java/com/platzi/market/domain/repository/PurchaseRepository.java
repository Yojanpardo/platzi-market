package com.platzi.market.domain.repository;

import com.platzi.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getAllByClient(String clientId);
    Purchase save(Purchase purchase);
    Optional<Purchase> getPurchase(int purchaseId);
}
