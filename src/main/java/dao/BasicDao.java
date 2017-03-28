package dao;


import db.Database;

public abstract class BasicDao<T>  implements IBasicDao<T> {

    Database database = new Database();

}
