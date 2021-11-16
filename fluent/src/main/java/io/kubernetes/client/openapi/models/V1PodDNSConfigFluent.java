package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodDNSConfigFluent<A extends io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToNameservers(java.lang.Integer index,java.lang.String item);
  public A setToNameservers(java.lang.Integer index,java.lang.String item);
  public A addToNameservers(java.lang.String... items);
  public A addAllToNameservers(java.util.Collection<java.lang.String> items);
  public A removeFromNameservers(java.lang.String... items);
  public A removeAllFromNameservers(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getNameservers();
  public java.lang.String getNameserver(java.lang.Integer index);
  public java.lang.String getFirstNameserver();
  public java.lang.String getLastNameserver();
  public java.lang.String getMatchingNameserver(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingNameserver(java.util.function.Predicate<java.lang.String> predicate);
  public A withNameservers(java.util.List<java.lang.String> nameservers);
  public A withNameservers(java.lang.String... nameservers);
  public java.lang.Boolean hasNameservers();
  public A addNewNameserver(java.lang.String arg0);
  public A addToOptions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PodDNSConfigOption item);
  public A setToOptions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PodDNSConfigOption item);
  public A addToOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items);
  public A addAllToOptions(java.util.Collection<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> items);
  public A removeFromOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items);
  public A removeAllFromOptions(java.util.Collection<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> items);
  public A removeMatchingFromOptions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildOptions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> getOptions();
  public java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> buildOptions();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildOption(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildFirstOption();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildLastOption();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildMatchingOption(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> predicate);
  public java.lang.Boolean hasMatchingOption(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> predicate);
  public A withOptions(java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> options);
  public A withOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... options);
  public java.lang.Boolean hasOptions();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> addNewOption();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(io.kubernetes.client.openapi.models.V1PodDNSConfigOption item);
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PodDNSConfigOption item);
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> editOption(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> editFirstOption();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> editLastOption();
  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> editMatchingOption(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> predicate);
  public A addToSearches(java.lang.Integer index,java.lang.String item);
  public A setToSearches(java.lang.Integer index,java.lang.String item);
  public A addToSearches(java.lang.String... items);
  public A addAllToSearches(java.util.Collection<java.lang.String> items);
  public A removeFromSearches(java.lang.String... items);
  public A removeAllFromSearches(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getSearches();
  public java.lang.String getSearch(java.lang.Integer index);
  public java.lang.String getFirstSearch();
  public java.lang.String getLastSearch();
  public java.lang.String getMatchingSearch(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingSearch(java.util.function.Predicate<java.lang.String> predicate);
  public A withSearches(java.util.List<java.lang.String> searches);
  public A withSearches(java.lang.String... searches);
  public java.lang.Boolean hasSearches();
  public A addNewSearch(java.lang.String arg0);
  public interface OptionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<N>>{
    public N and();
    public N endOption();
    
  }
  
}