package work_07.model.repository;

import java.util.List;
import java.util.Optional;

public interface Operational<T> {
    T create(T note);
    List<T> getAll();
    Optional<T> get(Long id);
    Optional<T> update(Long id, T nUpdate);
    boolean delete(Long id);
    void save(List<T> notes);
}
