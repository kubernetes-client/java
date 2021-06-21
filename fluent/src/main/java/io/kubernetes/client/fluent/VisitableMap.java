package io.kubernetes.client.fluent;

import java.util.stream.Collectors;
import java.lang.Iterable;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Spliterator;

public class VisitableMap extends java.util.HashMap<java.lang.String,java.util.List<io.kubernetes.client.fluent.Visitable<?>>> implements java.lang.Iterable<io.kubernetes.client.fluent.Visitable<?>> {


    public java.util.List<io.kubernetes.client.fluent.Visitable<?>> get(java.lang.Object key) {
        if (!containsKey(key)) {put(String.valueOf(key), new ArrayList());}
        return super.get(key);
    }

    public java.util.List<io.kubernetes.client.fluent.Visitable<?>> aggregate() {
        return values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
    }

    public java.util.Iterator<io.kubernetes.client.fluent.Visitable<?>> iterator() {
        return aggregate().iterator();
    }

    public void forEach(java.util.function.Consumer<? super io.kubernetes.client.fluent.Visitable<?>> action) {
        aggregate().forEach(action);
    }

    public java.util.Spliterator spliterator() {
        return aggregate().spliterator();
    }

}
