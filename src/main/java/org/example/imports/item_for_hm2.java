package org.example.imports;
/*
2. Сведения о товаре состоят из наименования,
страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class item_for_hm2 {
    private String name;
    private String countryProduced;
    private Integer weight;
    private Integer price;
    private Integer sort;


}
