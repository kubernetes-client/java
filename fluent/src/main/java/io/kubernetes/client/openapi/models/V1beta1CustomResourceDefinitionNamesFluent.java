package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1beta1CustomResourceDefinitionNamesFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToCategories(int index,java.lang.String item);
    public A setToCategories(int index,java.lang.String item);
    public A addToCategories(java.lang.String... items);
    public A addAllToCategories(java.util.Collection<java.lang.String> items);
    public A removeFromCategories(java.lang.String... items);
    public A removeAllFromCategories(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getCategories();
    public java.lang.String getCategory(int index);
    public java.lang.String getFirstCategory();
    public java.lang.String getLastCategory();
    public java.lang.String getMatchingCategory(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingCategory(java.util.function.Predicate<java.lang.String> predicate);
    public A withCategories(java.util.List<java.lang.String> categories);
    public A withCategories(java.lang.String... categories);
    public java.lang.Boolean hasCategories();
    public A addNewCategory(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.String getListKind();
    public A withListKind(java.lang.String listKind);
    public java.lang.Boolean hasListKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withListKind instead.
     */
        public A withNewListKind(java.lang.String original);
    public java.lang.String getPlural();
    public A withPlural(java.lang.String plural);
    public java.lang.Boolean hasPlural();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPlural instead.
     */
        public A withNewPlural(java.lang.String original);
    public A addToShortNames(int index,java.lang.String item);
    public A setToShortNames(int index,java.lang.String item);
    public A addToShortNames(java.lang.String... items);
    public A addAllToShortNames(java.util.Collection<java.lang.String> items);
    public A removeFromShortNames(java.lang.String... items);
    public A removeAllFromShortNames(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getShortNames();
    public java.lang.String getShortName(int index);
    public java.lang.String getFirstShortName();
    public java.lang.String getLastShortName();
    public java.lang.String getMatchingShortName(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingShortName(java.util.function.Predicate<java.lang.String> predicate);
    public A withShortNames(java.util.List<java.lang.String> shortNames);
    public A withShortNames(java.lang.String... shortNames);
    public java.lang.Boolean hasShortNames();
    public A addNewShortName(java.lang.String original);
    public java.lang.String getSingular();
    public A withSingular(java.lang.String singular);
    public java.lang.Boolean hasSingular();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSingular instead.
     */
        public A withNewSingular(java.lang.String original);
}
