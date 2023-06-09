package Projeto.persistencia.implementacoes;

import java.util.ArrayList;

import java.util.List;

import Projeto.persistencia.interfaces.IPersistencia;

public class Persistencia<T> implements IPersistencia<T> {
    private List<T> lista = new ArrayList<>();

    public boolean inserir(T item) {
        if (lista.contains(item)) {
            return false;
        }
        lista.add(item);
        return true;
    }

    public boolean remover(T item) {
        if (!lista.contains(item)) {
            return false;
        }
        lista.remove(item);
        return true;
    }

    public boolean alterar(T item, T item2) {
        if (!lista.contains(item)) {
            return false;
        }
        lista.remove(item);
        lista.add(item);
        return true;
    }

    public T recuperar(T item) {
        var index = lista.indexOf(item);
        if (index == -1) {
            return null;
        }
        return lista.get(index);
    }
}
