package com.ifmo.lesson4;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /**
     * Ссылка на первый элемент списка.
     */
    private Item head;

    /**
     * Добавляет значение в конец списка.
     *
     * param value Значение, которое будет добавлено.
     */

    LinkedList(Item head) {
        this.head = head;
    }

    public void add(Object val) {
        // TODO implement
        Item item = new Item(val);
        if (head != null)  {
            Item rt = head;
            while (rt.next != null)
                rt = rt.next;
            rt.next = item;
        }
        else head = item;
    }

    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */

    public Object get(int i) {
        // TODO implement
        Item item = head;
        if (item == null)
            return null;
        if (i == 0) return item;
        for (int k = 0; k < i; k++) {
            if (item != null && item.next != null) item = item.next;
            else return null;
        }
        return item;
    }

    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */

    public Object remove(int i) {
        // TODO implement
        Item item = head;
        Item del = (Item) get(i); // 15
        if (del == head) {
            head = head.next;
            return del;
        }
        while (item.next != del) {
            if (item.next == null) return null;
            item = item.next;
        }
        item.next = del.next;
        return del;
    }

    /*public static void main(String[] args) {
        LinkedList list = new LinkedList(new Item(9));
        list.add(15);
        list.add(71);
        Item check = (Item) list.get(0);
        System.out.println(check.value);
        check = (Item) list.get(1);
        System.out.println(check.value);
        check = (Item) list.get(2);
        System.out.println(check.value);
        check = (Item) list.remove(1);
        System.out.println(check.value);
        check = (Item) list.remove(1);
        System.out.println(check.value);
        check = (Item) list.remove(0);
        System.out.println(check.value);
    }*/
}
