/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1PodDNSConfigFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<A> {
  public V1PodDNSConfigFluentImpl() {}

  public V1PodDNSConfigFluentImpl(io.kubernetes.client.openapi.models.V1PodDNSConfig instance) {
    this.withNameservers(instance.getNameservers());

    this.withOptions(instance.getOptions());

    this.withSearches(instance.getSearches());
  }

  private java.util.List<java.lang.String> nameservers;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>
      options;
  private java.util.List<java.lang.String> searches;

  public A addToNameservers(java.lang.Integer index, java.lang.String item) {
    if (this.nameservers == null) {
      this.nameservers = new java.util.ArrayList<java.lang.String>();
    }
    this.nameservers.add(index, item);
    return (A) this;
  }

  public A setToNameservers(java.lang.Integer index, java.lang.String item) {
    if (this.nameservers == null) {
      this.nameservers = new java.util.ArrayList<java.lang.String>();
    }
    this.nameservers.set(index, item);
    return (A) this;
  }

  public A addToNameservers(java.lang.String... items) {
    if (this.nameservers == null) {
      this.nameservers = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.nameservers.add(item);
    }
    return (A) this;
  }

  public A addAllToNameservers(java.util.Collection<java.lang.String> items) {
    if (this.nameservers == null) {
      this.nameservers = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.nameservers.add(item);
    }
    return (A) this;
  }

  public A removeFromNameservers(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.nameservers != null) {
        this.nameservers.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromNameservers(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.nameservers != null) {
        this.nameservers.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getNameservers() {
    return this.nameservers;
  }

  public java.lang.String getNameserver(java.lang.Integer index) {
    return this.nameservers.get(index);
  }

  public java.lang.String getFirstNameserver() {
    return this.nameservers.get(0);
  }

  public java.lang.String getLastNameserver() {
    return this.nameservers.get(nameservers.size() - 1);
  }

  public java.lang.String getMatchingNameserver(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : nameservers) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNameserver(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : nameservers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNameservers(java.util.List<java.lang.String> nameservers) {
    if (nameservers != null) {
      this.nameservers = new java.util.ArrayList();
      for (java.lang.String item : nameservers) {
        this.addToNameservers(item);
      }
    } else {
      this.nameservers = null;
    }
    return (A) this;
  }

  public A withNameservers(java.lang.String... nameservers) {
    if (this.nameservers != null) {
      this.nameservers.clear();
    }
    if (nameservers != null) {
      for (java.lang.String item : nameservers) {
        this.addToNameservers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNameservers() {
    return nameservers != null && !nameservers.isEmpty();
  }

  public A addNewNameserver(java.lang.String original) {
    return (A) addToNameservers(new String(original));
  }

  public A addToOptions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodDNSConfigOption item) {
    if (this.options == null) {
      this.options =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
    _visitables.get("options").add(index >= 0 ? index : _visitables.get("options").size(), builder);
    this.options.add(index >= 0 ? index : options.size(), builder);
    return (A) this;
  }

  public A setToOptions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodDNSConfigOption item) {
    if (this.options == null) {
      this.options =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
    if (index < 0 || index >= _visitables.get("options").size()) {
      _visitables.get("options").add(builder);
    } else {
      _visitables.get("options").set(index, builder);
    }
    if (index < 0 || index >= options.size()) {
      options.add(builder);
    } else {
      options.set(index, builder);
    }
    return (A) this;
  }

  public A addToOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items) {
    if (this.options == null) {
      this.options =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : items) {
      io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
      _visitables.get("options").add(builder);
      this.options.add(builder);
    }
    return (A) this;
  }

  public A addAllToOptions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> items) {
    if (this.options == null) {
      this.options =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : items) {
      io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
      _visitables.get("options").add(builder);
      this.options.add(builder);
    }
    return (A) this;
  }

  public A removeFromOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... items) {
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : items) {
      io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
      _visitables.get("options").remove(builder);
      if (this.options != null) {
        this.options.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromOptions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> items) {
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : items) {
      io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(item);
      _visitables.get("options").remove(builder);
      if (this.options != null) {
        this.options.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromOptions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>
          predicate) {
    if (options == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> each =
        options.iterator();
    final List visitables = _visitables.get("options");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> getOptions() {
    return options != null ? build(options) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> buildOptions() {
    return options != null ? build(options) : null;
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildOption(
      java.lang.Integer index) {
    return this.options.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildFirstOption() {
    return this.options.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildLastOption() {
    return this.options.get(options.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigOption buildMatchingOption(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder item : options) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingOption(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder item : options) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withOptions(
      java.util.List<io.kubernetes.client.openapi.models.V1PodDNSConfigOption> options) {
    if (this.options != null) {
      _visitables.get("options").removeAll(this.options);
    }
    if (options != null) {
      this.options = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : options) {
        this.addToOptions(item);
      }
    } else {
      this.options = null;
    }
    return (A) this;
  }

  public A withOptions(io.kubernetes.client.openapi.models.V1PodDNSConfigOption... options) {
    if (this.options != null) {
      this.options.clear();
    }
    if (options != null) {
      for (io.kubernetes.client.openapi.models.V1PodDNSConfigOption item : options) {
        this.addToOptions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasOptions() {
    return options != null && !options.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> addNewOption() {
    return new io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl.OptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(
      io.kubernetes.client.openapi.models.V1PodDNSConfigOption item) {
    return new io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl.OptionsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodDNSConfigOption item) {
    return new io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl.OptionsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A> editOption(
      java.lang.Integer index) {
    if (options.size() <= index)
      throw new RuntimeException("Can't edit options. Index exceeds size.");
    return setNewOptionLike(index, buildOption(index));
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A>
      editFirstOption() {
    if (options.size() == 0)
      throw new RuntimeException("Can't edit first options. The list is empty.");
    return setNewOptionLike(0, buildOption(0));
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A>
      editLastOption() {
    int index = options.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last options. The list is empty.");
    return setNewOptionLike(index, buildOption(index));
  }

  public io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<A>
      editMatchingOption(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < options.size(); i++) {
      if (predicate.test(options.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching options. No match found.");
    return setNewOptionLike(index, buildOption(index));
  }

  public A addToSearches(java.lang.Integer index, java.lang.String item) {
    if (this.searches == null) {
      this.searches = new java.util.ArrayList<java.lang.String>();
    }
    this.searches.add(index, item);
    return (A) this;
  }

  public A setToSearches(java.lang.Integer index, java.lang.String item) {
    if (this.searches == null) {
      this.searches = new java.util.ArrayList<java.lang.String>();
    }
    this.searches.set(index, item);
    return (A) this;
  }

  public A addToSearches(java.lang.String... items) {
    if (this.searches == null) {
      this.searches = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.searches.add(item);
    }
    return (A) this;
  }

  public A addAllToSearches(java.util.Collection<java.lang.String> items) {
    if (this.searches == null) {
      this.searches = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.searches.add(item);
    }
    return (A) this;
  }

  public A removeFromSearches(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.searches != null) {
        this.searches.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromSearches(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.searches != null) {
        this.searches.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getSearches() {
    return this.searches;
  }

  public java.lang.String getSearch(java.lang.Integer index) {
    return this.searches.get(index);
  }

  public java.lang.String getFirstSearch() {
    return this.searches.get(0);
  }

  public java.lang.String getLastSearch() {
    return this.searches.get(searches.size() - 1);
  }

  public java.lang.String getMatchingSearch(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : searches) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSearch(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : searches) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSearches(java.util.List<java.lang.String> searches) {
    if (searches != null) {
      this.searches = new java.util.ArrayList();
      for (java.lang.String item : searches) {
        this.addToSearches(item);
      }
    } else {
      this.searches = null;
    }
    return (A) this;
  }

  public A withSearches(java.lang.String... searches) {
    if (this.searches != null) {
      this.searches.clear();
    }
    if (searches != null) {
      for (java.lang.String item : searches) {
        this.addToSearches(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSearches() {
    return searches != null && !searches.isEmpty();
  }

  public A addNewSearch(java.lang.String original) {
    return (A) addToSearches(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodDNSConfigFluentImpl that = (V1PodDNSConfigFluentImpl) o;
    if (nameservers != null ? !nameservers.equals(that.nameservers) : that.nameservers != null)
      return false;
    if (options != null ? !options.equals(that.options) : that.options != null) return false;
    if (searches != null ? !searches.equals(that.searches) : that.searches != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nameservers, options, searches, super.hashCode());
  }

  public class OptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluentImpl<
          io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodDNSConfigFluent.OptionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    OptionsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodDNSConfigOption item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(this, item);
    }

    OptionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodDNSConfigFluentImpl.this.setToOptions(index, builder.build());
    }

    public N endOption() {
      return and();
    }
  }
}
