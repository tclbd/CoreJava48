
package com.jee.d08112021;

import java.util.List;

public interface ISystem<I> {
    I insert(I i);
    I update(I i);
    boolean delete(int id);
    I get();
    List<I> getAll();
}
