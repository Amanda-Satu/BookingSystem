package za.ac.cput.domain.Factory.Repository;

/* author:sphesihle slingile
230310257
date: 28 March 2025
 */
public interface IRepository <T,ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}

