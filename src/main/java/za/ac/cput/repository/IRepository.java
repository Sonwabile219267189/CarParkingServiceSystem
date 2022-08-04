/* IRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   IRepository
   Date: 08April2022
*/

package za.ac.cput.repository;

public interface IRepository<T,ID> {
    public T create(T t);

    public T read(ID id);

    public T update(T t);

    public boolean delete(ID id);
}
