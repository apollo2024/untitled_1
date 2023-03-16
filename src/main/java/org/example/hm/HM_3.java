package org.example.hm;
/*
3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

import org.example.imports.item_for_hm3;

import java.util.ArrayList;
import java.util.List;

public class HM_3 {
    public static void main(String[] args) {
        item_for_hm3 book = new item_for_hm3  ("что-то_1","кто-та", 2017, 2000, 320);
        item_for_hm3 book1 = new item_for_hm3 ("что-то_2","кта-та1", 1967, 232, 180);
        item_for_hm3 book2 = new item_for_hm3 ("что-то_3","кто-то2", 2001, 350, 167);
        item_for_hm3 book3 = new item_for_hm3 ("что-то_4","ктА-тА3", 2023, 120, 17);
        item_for_hm3 book4 = new item_for_hm3 ("что-то_5","кто-то4", 1956, 120, 430);
        item_for_hm3 book5 = new item_for_hm3 ("что-то_6","кта-то5", 2011, 232, 103);

        List<item_for_hm3> listForBooks = new ArrayList<>();
        listForBooks.add(book);
        listForBooks.add(book1);
        listForBooks.add(book2);
        listForBooks.add(book3);
        listForBooks.add(book4);
        listForBooks.add(book5);

        System.out.println(GetName(listForBooks));
    }
    public static List GetName (List<item_for_hm3> listForBooks){
        List<String> names = new ArrayList<>();
        for (int i = 0; i < listForBooks.size(); i++) {
            if (ISJust(listForBooks, i) ==  true){
                if (listForBooks.get(i).getYear_pr() >= 2010 && listForBooks.get(i).getSurnameAuthor().toLowerCase().contains("а")){
                    names.add(listForBooks.get(i).getName());
                }
            }
        }
        return names;
    }
    public static Boolean ISJust (List<item_for_hm3> listForBooks, int counter){
        Integer cr = 0;
        for (int i = 2; i < listForBooks.get(counter).getQwOfpages(); i++) {
            if (listForBooks.get(counter).getQwOfpages() % i == 0){
                return  false;
            }
        }

        return true;
    }

}
