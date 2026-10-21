package com.unisystechhub.desingpatterns.behavioural.iterator;

public class NameIterator implements Iterator<String>{
    private final String[] names;
    private int index;

    public NameIterator(String... names) {
        this.names = names.clone();
    }
    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more names");
        }
        return names[index++];
    }


}
