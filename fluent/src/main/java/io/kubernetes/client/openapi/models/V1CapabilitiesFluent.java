package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1CapabilitiesFluent<A extends io.kubernetes.client.openapi.models.V1CapabilitiesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAdd(int index,java.lang.String item);
    public A setToAdd(int index,java.lang.String item);
    public A addToAdd(java.lang.String... items);
    public A addAllToAdd(java.util.Collection<java.lang.String> items);
    public A removeFromAdd(java.lang.String... items);
    public A removeAllFromAdd(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAdd();
    public java.lang.String getAdd(int index);
    public java.lang.String getFirstAdd();
    public java.lang.String getLastAdd();
    public java.lang.String getMatchingAdd(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAdd(java.util.function.Predicate<java.lang.String> predicate);
    public A withAdd(java.util.List<java.lang.String> add);
    public A withAdd(java.lang.String... add);
    public java.lang.Boolean hasAdd();
    public A addNewAdd(java.lang.String original);
    public A addToDrop(int index,java.lang.String item);
    public A setToDrop(int index,java.lang.String item);
    public A addToDrop(java.lang.String... items);
    public A addAllToDrop(java.util.Collection<java.lang.String> items);
    public A removeFromDrop(java.lang.String... items);
    public A removeAllFromDrop(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getDrop();
    public java.lang.String getDrop(int index);
    public java.lang.String getFirstDrop();
    public java.lang.String getLastDrop();
    public java.lang.String getMatchingDrop(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingDrop(java.util.function.Predicate<java.lang.String> predicate);
    public A withDrop(java.util.List<java.lang.String> drop);
    public A withDrop(java.lang.String... drop);
    public java.lang.Boolean hasDrop();
    public A addNewDrop(java.lang.String original);
}
