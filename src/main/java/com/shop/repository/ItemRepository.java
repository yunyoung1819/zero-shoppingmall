package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>,
        QuerydslPredicateExecutor<Item>, ItemRepositoryCustom {

    // 쿼리 메소드를 이용한 상품 조회
    List<Item> findByItemNm(String itemNm);

    // OR 조건 처리하기
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    // 파라미터로 넘어온 price 변수보다 값이 작은 상품 데이터를 조회
    List<Item> findByPriceLessThan(Integer price);

    // OrderBy로 정렬 처리하기
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    // @Query를 이용한 검색 처리하기
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

    // @Query-nativeQuery 속성
    @Query(value = "select * from item i where i.item_detail like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);

}
