package work_07.util.mapper;

public interface Mappable<E, T> {
    E toInput(T string);
    T toOutput(E note);
}
