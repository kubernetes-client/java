package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1ConfigMapProjectionFluentImpl<A extends io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> items;
    private java.lang.String name;
    private java.lang.Boolean optional;

    public V1ConfigMapProjectionFluentImpl() {
    }

    public V1ConfigMapProjectionFluentImpl(io.kubernetes.client.openapi.models.V1ConfigMapProjection instance) {
        this.withItems(instance.getItems());
        
        this.withName(instance.getName());
        
        this.withOptional(instance.getOptional());
    }

    public A addToItems(int index,io.kubernetes.client.openapi.models.V1KeyToPath item) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();}
        io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,io.kubernetes.client.openapi.models.V1KeyToPath item) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();}
        io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);
        if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
        if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
         return (A)this;
    }

    public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();}
        for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>();}
        for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
        for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
        for (io.kubernetes.client.openapi.models.V1KeyToPath item : items) {io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate) {
        if (items == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> each = items.iterator();
        final List visitables = _visitables.get("items");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildItems instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> getItems() {
        return build(items);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> buildItems() {
        return build(items);
    }

    public io.kubernetes.client.openapi.models.V1KeyToPath buildItem(int index) {
        return this.items.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1KeyToPath buildFirstItem() {
        return this.items.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1KeyToPath buildLastItem() {
        return this.items.get(items.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1KeyToPath buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1KeyToPathBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1KeyToPathBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> items) {
        if (this.items != null) { _visitables.get("items").removeAll(this.items);}
        if (items != null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1KeyToPathBuilder>(); for (io.kubernetes.client.openapi.models.V1KeyToPath item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
    }

    public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
        if (this.items != null) {this.items.clear();}
        if (items != null) {for (io.kubernetes.client.openapi.models.V1KeyToPath item :items){ this.addToItems(item);}} return (A) this;
    }

    public java.lang.Boolean hasItems() {
        return items != null && !items.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> addNewItem() {
        return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl.ItemsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1KeyToPath item) {
        return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> setNewItemLike(int index,io.kubernetes.client.openapi.models.V1KeyToPath item) {
        return new io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl.ItemsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> editItem(int index) {
        if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
        return setNewItemLike(index, buildItem(index));
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> editFirstItem() {
        if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
        return setNewItemLike(0, buildItem(0));
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> editLastItem() {
        int index = items.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
        return setNewItemLike(index, buildItem(index));
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate) {
        int index = -1;
        for (int i=0;i<items.size();i++) { 
        if (predicate.test(items.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
        return setNewItemLike(index, buildItem(index));
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public java.lang.Boolean getOptional() {
        return this.optional;
    }

    public A withOptional(java.lang.Boolean optional) {
        this.optional=optional; return (A) this;
    }

    public java.lang.Boolean hasOptional() {
        return this.optional != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ConfigMapProjectionFluentImpl that = (V1ConfigMapProjectionFluentImpl) o;
        if (items != null ? !items.equals(that.items) :that.items != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(items,  name,  optional,  super.hashCode());
    }

    public class ItemsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1KeyToPathFluentImpl<io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<N>> implements io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent.ItemsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1KeyToPathBuilder builder;
        private final int index;

            ItemsNestedImpl(int index,io.kubernetes.client.openapi.models.V1KeyToPath item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(this, item);
                        
            }

            ItemsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1KeyToPathBuilder(this);
                        
            }

            public N and() {
                return (N) V1ConfigMapProjectionFluentImpl.this.setToItems(index,builder.build());
            }

            public N endItem() {
                return and();
            }
    }


}
