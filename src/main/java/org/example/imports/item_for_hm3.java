package org.example.imports;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
@Data
@AllArgsConstructor
public class item_for_hm3 {
    private String name;
    private String surnameAuthor;
    private Integer year_pr;
    private Integer price;
    private Integer qwOfpages;

}
