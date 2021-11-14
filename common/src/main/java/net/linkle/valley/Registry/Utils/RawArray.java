package net.linkle.valley.Registry.Utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;

/** A basic array that can access raw array. */
public class RawArray<T> extends AbstractList<T>{
    
    public T[] items;
    public int size;
    
    public RawArray(Class<T> clazz) {
        this(clazz, 16);
    }
    
    @SuppressWarnings("unchecked")
    public RawArray(Class<T> clazz, int size) {
        items = (T[])Array.newInstance(clazz, size);
    }

    @Override
    public T get(int index) {
        return null;
    }
    
    @Override
    public boolean add(T e) {
        if (size >= items.length) {
            resize();
        }
        items[size++] = e;
        return true;
    }
    
    @Override
    public T[] toArray() {
        return Arrays.copyOf(items, size);
    }
    
    protected void resize() {
        items = Arrays.copyOf(items, size * 2);
    }

    @Override
    public int size() {
        return size;
    }
}
