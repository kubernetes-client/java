package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2NamedResourcesInstanceFluent<A extends V1alpha2NamedResourcesInstanceFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesInstanceFluent() {
  }
  
  public V1alpha2NamedResourcesInstanceFluent(V1alpha2NamedResourcesInstance instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha2NamedResourcesAttributeBuilder> attributes;
  private String name;
  
  protected void copyInstance(V1alpha2NamedResourcesInstance instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesInstance());
    if (instance != null) {
          this.withAttributes(instance.getAttributes());
          this.withName(instance.getName());
        }
  }
  
  public A addToAttributes(int index,V1alpha2NamedResourcesAttribute item) {
    if (this.attributes == null) {this.attributes = new ArrayList<V1alpha2NamedResourcesAttributeBuilder>();}
    V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);
    if (index < 0 || index >= attributes.size()) { _visitables.get("attributes").add(builder); attributes.add(builder); } else { _visitables.get("attributes").add(index, builder); attributes.add(index, builder);}
    return (A)this;
  }
  
  public A setToAttributes(int index,V1alpha2NamedResourcesAttribute item) {
    if (this.attributes == null) {this.attributes = new ArrayList<V1alpha2NamedResourcesAttributeBuilder>();}
    V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);
    if (index < 0 || index >= attributes.size()) { _visitables.get("attributes").add(builder); attributes.add(builder); } else { _visitables.get("attributes").set(index, builder); attributes.set(index, builder);}
    return (A)this;
  }
  
  public A addToAttributes(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAttribute... items) {
    if (this.attributes == null) {this.attributes = new ArrayList<V1alpha2NamedResourcesAttributeBuilder>();}
    for (V1alpha2NamedResourcesAttribute item : items) {V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);_visitables.get("attributes").add(builder);this.attributes.add(builder);} return (A)this;
  }
  
  public A addAllToAttributes(Collection<V1alpha2NamedResourcesAttribute> items) {
    if (this.attributes == null) {this.attributes = new ArrayList<V1alpha2NamedResourcesAttributeBuilder>();}
    for (V1alpha2NamedResourcesAttribute item : items) {V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);_visitables.get("attributes").add(builder);this.attributes.add(builder);} return (A)this;
  }
  
  public A removeFromAttributes(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAttribute... items) {
    if (this.attributes == null) return (A)this;
    for (V1alpha2NamedResourcesAttribute item : items) {V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);_visitables.get("attributes").remove(builder); this.attributes.remove(builder);} return (A)this;
  }
  
  public A removeAllFromAttributes(Collection<V1alpha2NamedResourcesAttribute> items) {
    if (this.attributes == null) return (A)this;
    for (V1alpha2NamedResourcesAttribute item : items) {V1alpha2NamedResourcesAttributeBuilder builder = new V1alpha2NamedResourcesAttributeBuilder(item);_visitables.get("attributes").remove(builder); this.attributes.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromAttributes(Predicate<V1alpha2NamedResourcesAttributeBuilder> predicate) {
    if (attributes == null) return (A) this;
    final Iterator<V1alpha2NamedResourcesAttributeBuilder> each = attributes.iterator();
    final List visitables = _visitables.get("attributes");
    while (each.hasNext()) {
      V1alpha2NamedResourcesAttributeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2NamedResourcesAttribute> buildAttributes() {
    return this.attributes != null ? build(attributes) : null;
  }
  
  public V1alpha2NamedResourcesAttribute buildAttribute(int index) {
    return this.attributes.get(index).build();
  }
  
  public V1alpha2NamedResourcesAttribute buildFirstAttribute() {
    return this.attributes.get(0).build();
  }
  
  public V1alpha2NamedResourcesAttribute buildLastAttribute() {
    return this.attributes.get(attributes.size() - 1).build();
  }
  
  public V1alpha2NamedResourcesAttribute buildMatchingAttribute(Predicate<V1alpha2NamedResourcesAttributeBuilder> predicate) {
      for (V1alpha2NamedResourcesAttributeBuilder item : attributes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAttribute(Predicate<V1alpha2NamedResourcesAttributeBuilder> predicate) {
      for (V1alpha2NamedResourcesAttributeBuilder item : attributes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAttributes(List<V1alpha2NamedResourcesAttribute> attributes) {
    if (this.attributes != null) {
      this._visitables.get("attributes").clear();
    }
    if (attributes != null) {
        this.attributes = new ArrayList();
        for (V1alpha2NamedResourcesAttribute item : attributes) {
          this.addToAttributes(item);
        }
    } else {
      this.attributes = null;
    }
    return (A) this;
  }
  
  public A withAttributes(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAttribute... attributes) {
    if (this.attributes != null) {
        this.attributes.clear();
        _visitables.remove("attributes");
    }
    if (attributes != null) {
      for (V1alpha2NamedResourcesAttribute item : attributes) {
        this.addToAttributes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAttributes() {
    return this.attributes != null && !this.attributes.isEmpty();
  }
  
  public AttributesNested<A> addNewAttribute() {
    return new AttributesNested(-1, null);
  }
  
  public AttributesNested<A> addNewAttributeLike(V1alpha2NamedResourcesAttribute item) {
    return new AttributesNested(-1, item);
  }
  
  public AttributesNested<A> setNewAttributeLike(int index,V1alpha2NamedResourcesAttribute item) {
    return new AttributesNested(index, item);
  }
  
  public AttributesNested<A> editAttribute(int index) {
    if (attributes.size() <= index) throw new RuntimeException("Can't edit attributes. Index exceeds size.");
    return setNewAttributeLike(index, buildAttribute(index));
  }
  
  public AttributesNested<A> editFirstAttribute() {
    if (attributes.size() == 0) throw new RuntimeException("Can't edit first attributes. The list is empty.");
    return setNewAttributeLike(0, buildAttribute(0));
  }
  
  public AttributesNested<A> editLastAttribute() {
    int index = attributes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last attributes. The list is empty.");
    return setNewAttributeLike(index, buildAttribute(index));
  }
  
  public AttributesNested<A> editMatchingAttribute(Predicate<V1alpha2NamedResourcesAttributeBuilder> predicate) {
    int index = -1;
    for (int i=0;i<attributes.size();i++) { 
    if (predicate.test(attributes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching attributes. No match found.");
    return setNewAttributeLike(index, buildAttribute(index));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesInstanceFluent that = (V1alpha2NamedResourcesInstanceFluent) o;
    if (!java.util.Objects.equals(attributes, that.attributes)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(attributes,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attributes != null && !attributes.isEmpty()) { sb.append("attributes:"); sb.append(attributes + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class AttributesNested<N> extends V1alpha2NamedResourcesAttributeFluent<AttributesNested<N>> implements Nested<N>{
    AttributesNested(int index,V1alpha2NamedResourcesAttribute item) {
      this.index = index;
      this.builder = new V1alpha2NamedResourcesAttributeBuilder(this, item);
    }
    V1alpha2NamedResourcesAttributeBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2NamedResourcesInstanceFluent.this.setToAttributes(index,builder.build());
    }
    
    public N endAttribute() {
      return and();
    }
    
  
  }

}