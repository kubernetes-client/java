package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodDNSConfigFluentImpl<A extends V1PodDNSConfigFluent<A>> extends BaseFluent<A> implements V1PodDNSConfigFluent<A>{
  public V1PodDNSConfigFluentImpl() {
  }
  public V1PodDNSConfigFluentImpl(V1PodDNSConfig instance) {
    this.withNameservers(instance.getNameservers());

    this.withOptions(instance.getOptions());

    this.withSearches(instance.getSearches());

  }
  private List<String> nameservers;
  private ArrayList<V1PodDNSConfigOptionBuilder> options;
  private List<String> searches;
  public A addToNameservers(Integer index,String item) {
    if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
    this.nameservers.add(index, item);
    return (A)this;
  }
  public A setToNameservers(Integer index,String item) {
    if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
    this.nameservers.set(index, item); return (A)this;
  }
  public A addToNameservers(java.lang.String... items) {
    if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
    for (String item : items) {this.nameservers.add(item);} return (A)this;
  }
  public A addAllToNameservers(Collection<String> items) {
    if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
    for (String item : items) {this.nameservers.add(item);} return (A)this;
  }
  public A removeFromNameservers(java.lang.String... items) {
    for (String item : items) {if (this.nameservers!= null){ this.nameservers.remove(item);}} return (A)this;
  }
  public A removeAllFromNameservers(Collection<String> items) {
    for (String item : items) {if (this.nameservers!= null){ this.nameservers.remove(item);}} return (A)this;
  }
  public List<String> getNameservers() {
    return this.nameservers;
  }
  public String getNameserver(Integer index) {
    return this.nameservers.get(index);
  }
  public String getFirstNameserver() {
    return this.nameservers.get(0);
  }
  public String getLastNameserver() {
    return this.nameservers.get(nameservers.size() - 1);
  }
  public String getMatchingNameserver(Predicate<String> predicate) {
    for (String item: nameservers) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingNameserver(Predicate<String> predicate) {
    for (String item: nameservers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNameservers(List<String> nameservers) {
    if (nameservers != null) {this.nameservers = new ArrayList(); for (String item : nameservers){this.addToNameservers(item);}} else { this.nameservers = null;} return (A) this;
  }
  public A withNameservers(java.lang.String... nameservers) {
    if (this.nameservers != null) {this.nameservers.clear();}
    if (nameservers != null) {for (String item :nameservers){ this.addToNameservers(item);}} return (A) this;
  }
  public Boolean hasNameservers() {
    return nameservers != null && !nameservers.isEmpty();
  }
  public A addToOptions(Integer index,V1PodDNSConfigOption item) {
    if (this.options == null) {this.options = new ArrayList<V1PodDNSConfigOptionBuilder>();}
    V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);_visitables.get("options").add(index >= 0 ? index : _visitables.get("options").size(), builder);this.options.add(index >= 0 ? index : options.size(), builder); return (A)this;
  }
  public A setToOptions(Integer index,V1PodDNSConfigOption item) {
    if (this.options == null) {this.options = new ArrayList<V1PodDNSConfigOptionBuilder>();}
    V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);
    if (index < 0 || index >= _visitables.get("options").size()) { _visitables.get("options").add(builder); } else { _visitables.get("options").set(index, builder);}
    if (index < 0 || index >= options.size()) { options.add(builder); } else { options.set(index, builder);}
     return (A)this;
  }
  public A addToOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items) {
    if (this.options == null) {this.options = new ArrayList<V1PodDNSConfigOptionBuilder>();}
    for (V1PodDNSConfigOption item : items) {V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);_visitables.get("options").add(builder);this.options.add(builder);} return (A)this;
  }
  public A addAllToOptions(Collection<V1PodDNSConfigOption> items) {
    if (this.options == null) {this.options = new ArrayList<V1PodDNSConfigOptionBuilder>();}
    for (V1PodDNSConfigOption item : items) {V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);_visitables.get("options").add(builder);this.options.add(builder);} return (A)this;
  }
  public A removeFromOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items) {
    for (V1PodDNSConfigOption item : items) {V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);_visitables.get("options").remove(builder);if (this.options != null) {this.options.remove(builder);}} return (A)this;
  }
  public A removeAllFromOptions(Collection<V1PodDNSConfigOption> items) {
    for (V1PodDNSConfigOption item : items) {V1PodDNSConfigOptionBuilder builder = new V1PodDNSConfigOptionBuilder(item);_visitables.get("options").remove(builder);if (this.options != null) {this.options.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromOptions(Predicate<V1PodDNSConfigOptionBuilder> predicate) {
    if (options == null) return (A) this;
    final Iterator<V1PodDNSConfigOptionBuilder> each = options.iterator();
    final List visitables = _visitables.get("options");
    while (each.hasNext()) {
      V1PodDNSConfigOptionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodDNSConfigOption> getOptions() {
    return options != null ? build(options) : null;
  }
  public List<V1PodDNSConfigOption> buildOptions() {
    return options != null ? build(options) : null;
  }
  public V1PodDNSConfigOption buildOption(Integer index) {
    return this.options.get(index).build();
  }
  public V1PodDNSConfigOption buildFirstOption() {
    return this.options.get(0).build();
  }
  public V1PodDNSConfigOption buildLastOption() {
    return this.options.get(options.size() - 1).build();
  }
  public V1PodDNSConfigOption buildMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate) {
    for (V1PodDNSConfigOptionBuilder item: options) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate) {
    for (V1PodDNSConfigOptionBuilder item: options) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withOptions(List<V1PodDNSConfigOption> options) {
    if (this.options != null) { _visitables.get("options").removeAll(this.options);}
    if (options != null) {this.options = new ArrayList(); for (V1PodDNSConfigOption item : options){this.addToOptions(item);}} else { this.options = null;} return (A) this;
  }
  public A withOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... options) {
    if (this.options != null) {this.options.clear();}
    if (options != null) {for (V1PodDNSConfigOption item :options){ this.addToOptions(item);}} return (A) this;
  }
  public Boolean hasOptions() {
    return options != null && !options.isEmpty();
  }
  public V1PodDNSConfigFluent.OptionsNested<A> addNewOption() {
    return new V1PodDNSConfigFluentImpl.OptionsNestedImpl();
  }
  public V1PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(V1PodDNSConfigOption item) {
    return new V1PodDNSConfigFluentImpl.OptionsNestedImpl(-1, item);
  }
  public V1PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(Integer index,V1PodDNSConfigOption item) {
    return new V1PodDNSConfigFluentImpl.OptionsNestedImpl(index, item);
  }
  public V1PodDNSConfigFluent.OptionsNested<A> editOption(Integer index) {
    if (options.size() <= index) throw new RuntimeException("Can't edit options. Index exceeds size.");
    return setNewOptionLike(index, buildOption(index));
  }
  public V1PodDNSConfigFluent.OptionsNested<A> editFirstOption() {
    if (options.size() == 0) throw new RuntimeException("Can't edit first options. The list is empty.");
    return setNewOptionLike(0, buildOption(0));
  }
  public V1PodDNSConfigFluent.OptionsNested<A> editLastOption() {
    int index = options.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last options. The list is empty.");
    return setNewOptionLike(index, buildOption(index));
  }
  public V1PodDNSConfigFluent.OptionsNested<A> editMatchingOption(Predicate<V1PodDNSConfigOptionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<options.size();i++) { 
    if (predicate.test(options.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching options. No match found.");
    return setNewOptionLike(index, buildOption(index));
  }
  public A addToSearches(Integer index,String item) {
    if (this.searches == null) {this.searches = new ArrayList<String>();}
    this.searches.add(index, item);
    return (A)this;
  }
  public A setToSearches(Integer index,String item) {
    if (this.searches == null) {this.searches = new ArrayList<String>();}
    this.searches.set(index, item); return (A)this;
  }
  public A addToSearches(java.lang.String... items) {
    if (this.searches == null) {this.searches = new ArrayList<String>();}
    for (String item : items) {this.searches.add(item);} return (A)this;
  }
  public A addAllToSearches(Collection<String> items) {
    if (this.searches == null) {this.searches = new ArrayList<String>();}
    for (String item : items) {this.searches.add(item);} return (A)this;
  }
  public A removeFromSearches(java.lang.String... items) {
    for (String item : items) {if (this.searches!= null){ this.searches.remove(item);}} return (A)this;
  }
  public A removeAllFromSearches(Collection<String> items) {
    for (String item : items) {if (this.searches!= null){ this.searches.remove(item);}} return (A)this;
  }
  public List<String> getSearches() {
    return this.searches;
  }
  public String getSearch(Integer index) {
    return this.searches.get(index);
  }
  public String getFirstSearch() {
    return this.searches.get(0);
  }
  public String getLastSearch() {
    return this.searches.get(searches.size() - 1);
  }
  public String getMatchingSearch(Predicate<String> predicate) {
    for (String item: searches) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingSearch(Predicate<String> predicate) {
    for (String item: searches) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSearches(List<String> searches) {
    if (searches != null) {this.searches = new ArrayList(); for (String item : searches){this.addToSearches(item);}} else { this.searches = null;} return (A) this;
  }
  public A withSearches(java.lang.String... searches) {
    if (this.searches != null) {this.searches.clear();}
    if (searches != null) {for (String item :searches){ this.addToSearches(item);}} return (A) this;
  }
  public Boolean hasSearches() {
    return searches != null && !searches.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodDNSConfigFluentImpl that = (V1PodDNSConfigFluentImpl) o;
    if (nameservers != null ? !nameservers.equals(that.nameservers) :that.nameservers != null) return false;
    if (options != null ? !options.equals(that.options) :that.options != null) return false;
    if (searches != null ? !searches.equals(that.searches) :that.searches != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(nameservers,  options,  searches,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nameservers != null && !nameservers.isEmpty()) { sb.append("nameservers:"); sb.append(nameservers + ","); }
    if (options != null && !options.isEmpty()) { sb.append("options:"); sb.append(options + ","); }
    if (searches != null && !searches.isEmpty()) { sb.append("searches:"); sb.append(searches); }
    sb.append("}");
    return sb.toString();
  }
  class OptionsNestedImpl<N> extends V1PodDNSConfigOptionFluentImpl<V1PodDNSConfigFluent.OptionsNested<N>> implements V1PodDNSConfigFluent.OptionsNested<N>,Nested<N>{
    OptionsNestedImpl(Integer index,V1PodDNSConfigOption item) {
      this.index = index;
      this.builder = new V1PodDNSConfigOptionBuilder(this, item);
    }
    OptionsNestedImpl() {
      this.index = -1;
      this.builder = new V1PodDNSConfigOptionBuilder(this);
    }
    V1PodDNSConfigOptionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodDNSConfigFluentImpl.this.setToOptions(index,builder.build());
    }
    public N endOption() {
      return and();
    }
    
  }
  
}