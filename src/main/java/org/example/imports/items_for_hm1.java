package org.example.imports;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
1. Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
@Data
@AllArgsConstructor
public class items_for_hm1 {
    private String name;
    private Integer price;
    private Integer grade;



}
