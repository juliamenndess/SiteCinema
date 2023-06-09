package Projeto.persistencia.interfaces;

public interface IPersistencia<T> {
    boolean inserir(T item);

    boolean remover(T item);

    boolean alterar(T item, T item2);

    T recuperar(T item);

}
