package org.example.hm;

import org.example.imports.item_for_hm2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2. Сведения о товаре состоят из наименования,
страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class HM_2 {
    public static void main(String[] args) {
        item_for_hm2 item = new item_for_hm2 ("что-то_1","индия", 20, 2000, 3);
        item_for_hm2 item2 = new item_for_hm2 ("что-то_2","китай", 20, 232, 1);
        item_for_hm2 item3 = new item_for_hm2 ("что-то_3","россия", 20, 350, 3);
        item_for_hm2 item4 = new item_for_hm2 ("что-то_4","казахстан", 20, 120, 2);
        item_for_hm2 item5 = new item_for_hm2 ("что-то_5","узбекистан", 20, 120, 2);
        item_for_hm2 item6 = new item_for_hm2 ("что-то_6","сша", 20, 232, 1);

        List<item_for_hm2> listForItem = new ArrayList<>();
        listForItem.add(item);
        listForItem.add(item2);
        listForItem.add(item3);
        listForItem.add(item4);
        listForItem.add(item5);
        listForItem.add(item6);

        int minPrice = item.getPrice();


        Scanner scanner = new Scanner(System.in);
        int find_out = scanner.nextInt();
        System.out.print(Searcher(listForItem, find_out, minPrice));


    }

    public static List Searcher(List<item_for_hm2> listForItem, int find_out,  int minPrice) {
        List<String> listNames = new ArrayList<>();
        for (int i = 0; i < listForItem.size(); i++) {
            if(listForItem.get(i).getSort().equals(find_out)){
                if(listForItem.get(i).getPrice() == minPrice){
                    listNames.add(listForItem.get(i).getName());
                }
                if(listForItem.get(i).getPrice()  < minPrice ){
                    minPrice = listForItem.get(i).getPrice();
                    listNames.clear();
                    listNames.add(listForItem.get(i).getName());
                }
            }

        }
        return listNames;

    }

}
