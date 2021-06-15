package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1ContainerImageFluent<A extends io.kubernetes.client.openapi.models.V1ContainerImageFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToNames(int index,java.lang.String item);
    public A setToNames(int index,java.lang.String item);
    public A addToNames(java.lang.String... items);
    public A addAllToNames(java.util.Collection<java.lang.String> items);
    public A removeFromNames(java.lang.String... items);
    public A removeAllFromNames(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getNames();
    public java.lang.String getName(int index);
    public java.lang.String getFirstName();
    public java.lang.String getLastName();
    public java.lang.String getMatchingName(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingName(java.util.function.Predicate<java.lang.String> predicate);
    public A withNames(java.util.List<java.lang.String> names);
    public A withNames(java.lang.String... names);
    public java.lang.Boolean hasNames();
    public A addNewName(java.lang.String original);
    public java.lang.Long getSizeBytes();
    public A withSizeBytes(java.lang.Long sizeBytes);
    public java.lang.Boolean hasSizeBytes();
}
