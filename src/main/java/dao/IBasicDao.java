package dao;

import java.util.List;

public interface IBasicDao<T> {
        List <T> selectAll();
        T selectById(long id);
        boolean update (T object);
        boolean insert (T object);
        boolean deleteById (T object);
}
