package com.fastcode.example.domain.Temp;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.fastcode.example.domain.Temp.FilmCategory
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class FilmCategoryId implements Serializable {
    static {
        // register persistent class in JVM
        try {
            Class.forName("com.fastcode.example.domain.Temp.FilmCategory");
        } catch (Exception e) {}
    }

    public int categoryId;
    public int filmId;

    public FilmCategoryId() {}

    public FilmCategoryId(String str) {
        fromString(str);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String toString() {
        return String.valueOf(categoryId) + "::" + String.valueOf(filmId);
    }

    public int hashCode() {
        int rs = 17;
        rs = rs * 37 + categoryId;
        rs = rs * 37 + filmId;
        return rs;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;

        FilmCategoryId other = (FilmCategoryId) obj;
        return (categoryId == other.categoryId) && (filmId == other.filmId);
    }

    private void fromString(String str) {
        Tokenizer toke = new Tokenizer(str);
        str = toke.nextToken();
        categoryId = Integer.parseInt(str);
        str = toke.nextToken();
        filmId = Integer.parseInt(str);
    }

    protected static class Tokenizer {

        private final String str;
        private int last;

        public Tokenizer(String str) {
            this.str = str;
        }

        public String nextToken() {
            int next = str.indexOf("::", last);
            String part;
            if (next == -1) {
                part = str.substring(last);
                last = str.length();
            } else {
                part = str.substring(last, next);
                last = next + 2;
            }
            return part;
        }
    }
}
