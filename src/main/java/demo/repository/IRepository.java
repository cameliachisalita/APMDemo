package demo.repository;

import demo.model.Item;

public interface IRepository{

    void add (Item fruit) throws CapacityExceededException;
    Item[] all();
    int size();
}