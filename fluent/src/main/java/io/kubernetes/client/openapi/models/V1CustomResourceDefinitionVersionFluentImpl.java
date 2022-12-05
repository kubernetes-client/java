package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceDefinitionVersionFluentImpl<A extends V1CustomResourceDefinitionVersionFluent<A>> extends BaseFluent<A> implements V1CustomResourceDefinitionVersionFluent<A>{
  public V1CustomResourceDefinitionVersionFluentImpl() {
  }
  public V1CustomResourceDefinitionVersionFluentImpl(V1CustomResourceDefinitionVersion instance) {
    this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());

    this.withDeprecated(instance.getDeprecated());

    this.withDeprecationWarning(instance.getDeprecationWarning());

    this.withName(instance.getName());

    this.withSchema(instance.getSchema());

    this.withServed(instance.getServed());

    this.withStorage(instance.getStorage());

    this.withSubresources(instance.getSubresources());

  }
  private ArrayList<V1CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
  private Boolean deprecated;
  private String deprecationWarning;
  private String name;
  private V1CustomResourceValidationBuilder schema;
  private Boolean served;
  private Boolean storage;
  private V1CustomResourceSubresourcesBuilder subresources;
  public A addToAdditionalPrinterColumns(Integer index,V1CustomResourceColumnDefinition item) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(index >= 0 ? index : _visitables.get("additionalPrinterColumns").size(), builder);this.additionalPrinterColumns.add(index >= 0 ? index : additionalPrinterColumns.size(), builder); return (A)this;
  }
  public A setToAdditionalPrinterColumns(Integer index,V1CustomResourceColumnDefinition item) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);
    if (index < 0 || index >= _visitables.get("additionalPrinterColumns").size()) { _visitables.get("additionalPrinterColumns").add(builder); } else { _visitables.get("additionalPrinterColumns").set(index, builder);}
    if (index < 0 || index >= additionalPrinterColumns.size()) { additionalPrinterColumns.add(builder); } else { additionalPrinterColumns.set(index, builder);}
     return (A)this;
  }
  public A addToAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
  }
  public A addAllToAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
  }
  public A removeFromAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items) {
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
  }
  public A removeAllFromAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items) {
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAdditionalPrinterColumns(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    if (additionalPrinterColumns == null) return (A) this;
    final Iterator<V1CustomResourceColumnDefinitionBuilder> each = additionalPrinterColumns.iterator();
    final List visitables = _visitables.get("additionalPrinterColumns");
    while (each.hasNext()) {
      V1CustomResourceColumnDefinitionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns != null ? build(additionalPrinterColumns) : null;
  }
  public List<V1CustomResourceColumnDefinition> buildAdditionalPrinterColumns() {
    return additionalPrinterColumns != null ? build(additionalPrinterColumns) : null;
  }
  public V1CustomResourceColumnDefinition buildAdditionalPrinterColumn(Integer index) {
    return this.additionalPrinterColumns.get(index).build();
  }
  public V1CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn() {
    return this.additionalPrinterColumns.get(0).build();
  }
  public V1CustomResourceColumnDefinition buildLastAdditionalPrinterColumn() {
    return this.additionalPrinterColumns.get(additionalPrinterColumns.size() - 1).build();
  }
  public V1CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    for (V1CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    for (V1CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAdditionalPrinterColumns(List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {
    if (this.additionalPrinterColumns != null) { _visitables.get("additionalPrinterColumns").removeAll(this.additionalPrinterColumns);}
    if (additionalPrinterColumns != null) {this.additionalPrinterColumns = new ArrayList(); for (V1CustomResourceColumnDefinition item : additionalPrinterColumns){this.addToAdditionalPrinterColumns(item);}} else { this.additionalPrinterColumns = null;} return (A) this;
  }
  public A withAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... additionalPrinterColumns) {
    if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.clear();}
    if (additionalPrinterColumns != null) {for (V1CustomResourceColumnDefinition item :additionalPrinterColumns){ this.addToAdditionalPrinterColumns(item);}} return (A) this;
  }
  public Boolean hasAdditionalPrinterColumns() {
    return additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty();
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn() {
    return new V1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl();
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(V1CustomResourceColumnDefinition item) {
    return new V1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl(-1, item);
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(Integer index,V1CustomResourceColumnDefinition item) {
    return new V1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl(index, item);
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(Integer index) {
    if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn() {
    if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
    return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn() {
    int index = additionalPrinterColumns.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  public V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<additionalPrinterColumns.size();i++) { 
    if (predicate.test(additionalPrinterColumns.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  public A withDeprecated(Boolean deprecated) {
    this.deprecated=deprecated; return (A) this;
  }
  public Boolean hasDeprecated() {
    return this.deprecated != null;
  }
  public String getDeprecationWarning() {
    return this.deprecationWarning;
  }
  public A withDeprecationWarning(String deprecationWarning) {
    this.deprecationWarning=deprecationWarning; return (A) this;
  }
  public Boolean hasDeprecationWarning() {
    return this.deprecationWarning != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSchema instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceValidation getSchema() {
    return this.schema!=null ?this.schema.build():null;
  }
  public V1CustomResourceValidation buildSchema() {
    return this.schema!=null ?this.schema.build():null;
  }
  public A withSchema(V1CustomResourceValidation schema) {
    _visitables.get("schema").remove(this.schema);
    if (schema!=null){ this.schema= new V1CustomResourceValidationBuilder(schema); _visitables.get("schema").add(this.schema);} else { this.schema = null; _visitables.get("schema").remove(this.schema); } return (A) this;
  }
  public Boolean hasSchema() {
    return this.schema != null;
  }
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema() {
    return new V1CustomResourceDefinitionVersionFluentImpl.SchemaNestedImpl();
  }
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(V1CustomResourceValidation item) {
    return new V1CustomResourceDefinitionVersionFluentImpl.SchemaNestedImpl(item);
  }
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema() {
    return withNewSchemaLike(getSchema());
  }
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema() {
    return withNewSchemaLike(getSchema() != null ? getSchema(): new V1CustomResourceValidationBuilder().build());
  }
  public V1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(V1CustomResourceValidation item) {
    return withNewSchemaLike(getSchema() != null ? getSchema(): item);
  }
  public Boolean getServed() {
    return this.served;
  }
  public A withServed(Boolean served) {
    this.served=served; return (A) this;
  }
  public Boolean hasServed() {
    return this.served != null;
  }
  public Boolean getStorage() {
    return this.storage;
  }
  public A withStorage(Boolean storage) {
    this.storage=storage; return (A) this;
  }
  public Boolean hasStorage() {
    return this.storage != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSubresources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceSubresources getSubresources() {
    return this.subresources!=null ?this.subresources.build():null;
  }
  public V1CustomResourceSubresources buildSubresources() {
    return this.subresources!=null ?this.subresources.build():null;
  }
  public A withSubresources(V1CustomResourceSubresources subresources) {
    _visitables.get("subresources").remove(this.subresources);
    if (subresources!=null){ this.subresources= new V1CustomResourceSubresourcesBuilder(subresources); _visitables.get("subresources").add(this.subresources);} else { this.subresources = null; _visitables.get("subresources").remove(this.subresources); } return (A) this;
  }
  public Boolean hasSubresources() {
    return this.subresources != null;
  }
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources() {
    return new V1CustomResourceDefinitionVersionFluentImpl.SubresourcesNestedImpl();
  }
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(V1CustomResourceSubresources item) {
    return new V1CustomResourceDefinitionVersionFluentImpl.SubresourcesNestedImpl(item);
  }
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources() {
    return withNewSubresourcesLike(getSubresources());
  }
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources() {
    return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): new V1CustomResourceSubresourcesBuilder().build());
  }
  public V1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(V1CustomResourceSubresources item) {
    return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceDefinitionVersionFluentImpl that = (V1CustomResourceDefinitionVersionFluentImpl) o;
    if (additionalPrinterColumns != null ? !additionalPrinterColumns.equals(that.additionalPrinterColumns) :that.additionalPrinterColumns != null) return false;
    if (deprecated != null ? !deprecated.equals(that.deprecated) :that.deprecated != null) return false;
    if (deprecationWarning != null ? !deprecationWarning.equals(that.deprecationWarning) :that.deprecationWarning != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
    if (served != null ? !served.equals(that.served) :that.served != null) return false;
    if (storage != null ? !storage.equals(that.storage) :that.storage != null) return false;
    if (subresources != null ? !subresources.equals(that.subresources) :that.subresources != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(additionalPrinterColumns,  deprecated,  deprecationWarning,  name,  schema,  served,  storage,  subresources,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty()) { sb.append("additionalPrinterColumns:"); sb.append(additionalPrinterColumns + ","); }
    if (deprecated != null) { sb.append("deprecated:"); sb.append(deprecated + ","); }
    if (deprecationWarning != null) { sb.append("deprecationWarning:"); sb.append(deprecationWarning + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (schema != null) { sb.append("schema:"); sb.append(schema + ","); }
    if (served != null) { sb.append("served:"); sb.append(served + ","); }
    if (storage != null) { sb.append("storage:"); sb.append(storage + ","); }
    if (subresources != null) { sb.append("subresources:"); sb.append(subresources); }
    sb.append("}");
    return sb.toString();
  }
  public A withDeprecated() {
    return withDeprecated(true);
  }
  public A withServed() {
    return withServed(true);
  }
  public A withStorage() {
    return withStorage(true);
  }
  class AdditionalPrinterColumnsNestedImpl<N> extends V1CustomResourceColumnDefinitionFluentImpl<V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>> implements V1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>,Nested<N>{
    AdditionalPrinterColumnsNestedImpl(Integer index,V1CustomResourceColumnDefinition item) {
      this.index = index;
      this.builder = new V1CustomResourceColumnDefinitionBuilder(this, item);
    }
    AdditionalPrinterColumnsNestedImpl() {
      this.index = -1;
      this.builder = new V1CustomResourceColumnDefinitionBuilder(this);
    }
    V1CustomResourceColumnDefinitionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluentImpl.this.setToAdditionalPrinterColumns(index,builder.build());
    }
    public N endAdditionalPrinterColumn() {
      return and();
    }
    
  }
  class SchemaNestedImpl<N> extends V1CustomResourceValidationFluentImpl<V1CustomResourceDefinitionVersionFluent.SchemaNested<N>> implements V1CustomResourceDefinitionVersionFluent.SchemaNested<N>,Nested<N>{
    SchemaNestedImpl(V1CustomResourceValidation item) {
      this.builder = new V1CustomResourceValidationBuilder(this, item);
    }
    SchemaNestedImpl() {
      this.builder = new V1CustomResourceValidationBuilder(this);
    }
    V1CustomResourceValidationBuilder builder;
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluentImpl.this.withSchema(builder.build());
    }
    public N endSchema() {
      return and();
    }
    
  }
  class SubresourcesNestedImpl<N> extends V1CustomResourceSubresourcesFluentImpl<V1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>> implements V1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>,Nested<N>{
    SubresourcesNestedImpl(V1CustomResourceSubresources item) {
      this.builder = new V1CustomResourceSubresourcesBuilder(this, item);
    }
    SubresourcesNestedImpl() {
      this.builder = new V1CustomResourceSubresourcesBuilder(this);
    }
    V1CustomResourceSubresourcesBuilder builder;
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluentImpl.this.withSubresources(builder.build());
    }
    public N endSubresources() {
      return and();
    }
    
  }
  
}