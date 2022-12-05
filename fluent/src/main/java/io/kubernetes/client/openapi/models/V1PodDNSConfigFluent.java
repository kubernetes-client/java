package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
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
public interface V1PodDNSConfigFluent<A extends V1PodDNSConfigFluent<A>> extends Fluent<A>{
  public A addToNameservers(Integer index,String item);
  public A setToNameservers(Integer index,String item);
  public A addToNameservers(java.lang.String... items);
  public A addAllToNameservers(Collection<String> items);
  public A removeFromNameservers(java.lang.String... items);
  public A removeAllFromNameservers(Collection<String> items);
  public List<String> getNameservers();
  public String getNameserver(Integer index);
  public String getFirstNameserver();
  public String getLastNameserver();
  public String getMatchingNameserver(Predicate<String> predicate);
  public Boolean hasMatchingNameserver(Predicate<String> predicate);
  public A withNameservers(List<String> nameservers);
  public A withNameservers(java.lang.String... nameservers);
  public Boolean hasNameservers();
  public A addToOptions(Integer index,V1PodDNSConfigOption item);
  public A setToOptions(Integer index,V1PodDNSConfigOption item);
  public A addToOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items);
  public A addAllToOptions(Collection<V1PodDNSConfigOption> items);
  public A removeFromOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items);
  public A removeAllFromOptions(Collection<V1PodDNSConfigOption> items);
  public A removeMatchingFromOptions(Predicate<V1PodDNSConfigOptionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodDNSConfigOption> getOptions();
  public List<V1PodDNSConfigOption> buildOptions();
  public V1PodDNSConfigOption buildOption(Integer index);
  public V1PodDNSConfigOption buildFirstOption();
  public V1PodDNSConfigOption buildLastOption();
  public V1PodDNSConfigOption buildMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate);
  public Boolean hasMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate);
  public A withOptions(List<V1PodDNSConfigOption> options);
  public A withOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... options);
  public Boolean hasOptions();
  public V1PodDNSConfigFluent.OptionsNested<A> addNewOption();
  public V1PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(V1PodDNSConfigOption item);
  public V1PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(Integer index,V1PodDNSConfigOption item);
  public V1PodDNSConfigFluent.OptionsNested<A> editOption(Integer index);
  public V1PodDNSConfigFluent.OptionsNested<A> editFirstOption();
  public V1PodDNSConfigFluent.OptionsNested<A> editLastOption();
  public V1PodDNSConfigFluent.OptionsNested<A> editMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate);
  public A addToSearches(Integer index,String item);
  public A setToSearches(Integer index,String item);
  public A addToSearches(java.lang.String... items);
  public A addAllToSearches(Collection<String> items);
  public A removeFromSearches(java.lang.String... items);
  public A removeAllFromSearches(Collection<String> items);
  public List<String> getSearches();
  public String getSearch(Integer index);
  public String getFirstSearch();
  public String getLastSearch();
  public String getMatchingSearch(Predicate<String> predicate);
  public Boolean hasMatchingSearch(Predicate<String> predicate);
  public A withSearches(List<String> searches);
  public A withSearches(java.lang.String... searches);
  public Boolean hasSearches();
  public interface OptionsNested<N> extends Nested<N>,V1PodDNSConfigOptionFluent<V1PodDNSConfigFluent.OptionsNested<N>>{
    public N and();
    public N endOption();
    
  }
  
}