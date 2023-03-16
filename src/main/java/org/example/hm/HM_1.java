package org.example.hm;
/*
1. Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
import org.example.imports.items_for_hm1;

import java.util.ArrayList;
import java.util.List;

public class HM_1 {
    public static void main(String[] args) {
        items_for_hm1 item = new items_for_hm1("высший мандарин", 2340, 1);
        items_for_hm1 item1 = new items_for_hm1("мука", 200, 4);
        items_for_hm1 item2 = new items_for_hm1("жвачка", 34, 3);
        items_for_hm1 item3 = new items_for_hm1("высший торт", 2340, 2);

        List <items_for_hm1> listItem = new  ArrayList<>();
        listItem.add(item);
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);

        int maxPrice = item.getPrice();
        System.out.println(SearchPrice(listItem, maxPrice));
    }
    public static List SearchPrice(List <items_for_hm1> listItem, int maxPrice){
        List<Integer> listMAxPrice = new ArrayList<>();
        for (int i = 0; i < listItem.size(); i++) {
            if(listItem.get(i).getName().contains("высший") && listItem.get(i).getGrade() <= 2){
                if(listItem.get(i).getPrice() == maxPrice){
                    listMAxPrice.add(listItem.get(i).getPrice());
                }
                if(listItem.get(i).getPrice()  > maxPrice ){
                    maxPrice = listItem.get(i).getPrice();
                    listMAxPrice.clear();
                    listMAxPrice.add(listItem.get(i).getPrice());
                }
            }

        }
        return listMAxPrice;
    }
}