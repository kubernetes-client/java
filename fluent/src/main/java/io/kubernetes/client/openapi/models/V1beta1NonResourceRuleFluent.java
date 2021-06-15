package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1beta1NonResourceRuleFluent<A extends io.kubernetes.client.openapi.models.V1beta1NonResourceRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToNonResourceURLs(int index,java.lang.String item);
    public A setToNonResourceURLs(int index,java.lang.String item);
    public A addToNonResourceURLs(java.lang.String... items);
    public A addAllToNonResourceURLs(java.util.Collection<java.lang.String> items);
    public A removeFromNonResourceURLs(java.lang.String... items);
    public A removeAllFromNonResourceURLs(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getNonResourceURLs();
    public java.lang.String getNonResourceURL(int index);
    public java.lang.String getFirstNonResourceURL();
    public java.lang.String getLastNonResourceURL();
    public java.lang.String getMatchingNonResourceURL(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingNonResourceURL(java.util.function.Predicate<java.lang.String> predicate);
    public A withNonResourceURLs(java.util.List<java.lang.String> nonResourceURLs);
    public A withNonResourceURLs(java.lang.String... nonResourceURLs);
    public java.lang.Boolean hasNonResourceURLs();
    public A addNewNonResourceURL(java.lang.String original);
    public A addToVerbs(int index,java.lang.String item);
    public A setToVerbs(int index,java.lang.String item);
    public A addToVerbs(java.lang.String... items);
    public A addAllToVerbs(java.util.Collection<java.lang.String> items);
    public A removeFromVerbs(java.lang.String... items);
    public A removeAllFromVerbs(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getVerbs();
    public java.lang.String getVerb(int index);
    public java.lang.String getFirstVerb();
    public java.lang.String getLastVerb();
    public java.lang.String getMatchingVerb(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingVerb(java.util.function.Predicate<java.lang.String> predicate);
    public A withVerbs(java.util.List<java.lang.String> verbs);
    public A withVerbs(java.lang.String... verbs);
    public java.lang.Boolean hasVerbs();
    public A addNewVerb(java.lang.String original);
}
