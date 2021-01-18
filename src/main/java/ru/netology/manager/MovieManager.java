package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];
    private int length = 10;
    private int custom;

    public MovieManager(int custom) {
        this.custom = custom;
    }

    public MovieManager() {
    }


    public void add(MovieItem item) {

        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public MovieItem[] getAll() {
        int temp = items.length;

        if (custom <= 0) {
            if (length < temp) {

                temp = length;
            }
        } else {
            if (custom < temp) {
                temp = custom;
            }
        }
        MovieItem[] result = new MovieItem[temp];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
