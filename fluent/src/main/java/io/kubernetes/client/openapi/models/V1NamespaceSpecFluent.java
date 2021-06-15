package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1NamespaceSpecFluent<A extends io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToFinalizers(int index,java.lang.String item);
    public A setToFinalizers(int index,java.lang.String item);
    public A addToFinalizers(java.lang.String... items);
    public A addAllToFinalizers(java.util.Collection<java.lang.String> items);
    public A removeFromFinalizers(java.lang.String... items);
    public A removeAllFromFinalizers(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getFinalizers();
    public java.lang.String getFinalizer(int index);
    public java.lang.String getFirstFinalizer();
    public java.lang.String getLastFinalizer();
    public java.lang.String getMatchingFinalizer(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingFinalizer(java.util.function.Predicate<java.lang.String> predicate);
    public A withFinalizers(java.util.List<java.lang.String> finalizers);
    public A withFinalizers(java.lang.String... finalizers);
    public java.lang.Boolean hasFinalizers();
    public A addNewFinalizer(java.lang.String original);
}
