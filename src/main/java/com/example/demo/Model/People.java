package com.example.demo.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class People<T extends Person> implements Iterable<T> {

    private List<T> perList;

    public People(List<T> perList) {
        this.perList = perList;
    }

    public void add(T person) {
        perList.add(person);
    }

    public void remove(T person) {
        perList.remove(person);
    }

    public int size() {
        return perList.size();
    }

    public void clear() {
        perList.clear();
    }

    public void addAll(Iterable<T> iterable) {
        iterable.forEach(perList::add);
    }

    public T findById(long id) {
        T t =null;

        for(T person: perList) {
            if(person.getId() == id) {
                t = person;
            }
        }
        if(t ==null) {
            throw new NullPointerException();
        }
        return t;
    }

    public List<T> findAll() {
        return perList;
    }

    @Override
    public Iterator<T> iterator() {
        return perList.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof People)) {
            return false;
        }
        People<?> people = (People<?>) o;
        return Objects.equals(perList, people.perList);
    }


    public int hashCOde() {
        return Objects.hash(perList);
    }

    @Override
    public String toString() {
        return "People{" +
                "perList=" + perList +
                '}';
    }
}
