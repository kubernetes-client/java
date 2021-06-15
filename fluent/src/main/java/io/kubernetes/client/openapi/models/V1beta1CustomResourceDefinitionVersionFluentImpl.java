package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

public class V1beta1CustomResourceDefinitionVersionFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
    private java.lang.Boolean deprecated;
    private java.lang.String deprecationWarning;
    private java.lang.String name;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder schema;
    private java.lang.Boolean served;
    private java.lang.Boolean storage;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder subresources;

    public V1beta1CustomResourceDefinitionVersionFluentImpl() {
    }

    public V1beta1CustomResourceDefinitionVersionFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion instance) {
        this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        this.withDeprecated(instance.getDeprecated());
        
        this.withDeprecationWarning(instance.getDeprecationWarning());
        
        this.withName(instance.getName());
        
        this.withSchema(instance.getSchema());
        
        this.withServed(instance.getServed());
        
        this.withStorage(instance.getStorage());
        
        this.withSubresources(instance.getSubresources());
    }

    public A addToAdditionalPrinterColumns(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(index >= 0 ? index : _visitables.get("additionalPrinterColumns").size(), builder);this.additionalPrinterColumns.add(index >= 0 ? index : additionalPrinterColumns.size(), builder); return (A)this;
    }

    public A setToAdditionalPrinterColumns(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);
        if (index < 0 || index >= _visitables.get("additionalPrinterColumns").size()) { _visitables.get("additionalPrinterColumns").add(builder); } else { _visitables.get("additionalPrinterColumns").set(index, builder);}
        if (index < 0 || index >= additionalPrinterColumns.size()) { additionalPrinterColumns.add(builder); } else { additionalPrinterColumns.set(index, builder);}
         return (A)this;
    }

    public A addToAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... items) {
        if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A addAllToAdditionalPrinterColumns(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> items) {
        if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A removeFromAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... items) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    public A removeAllFromAdditionalPrinterColumns(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> items) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromAdditionalPrinterColumns(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate) {
        if (additionalPrinterColumns == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> each = additionalPrinterColumns.iterator();
        final List visitables = _visitables.get("additionalPrinterColumns");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return build(additionalPrinterColumns);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> buildAdditionalPrinterColumns() {
        return build(additionalPrinterColumns);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index) {
        return this.additionalPrinterColumns.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn() {
        return this.additionalPrinterColumns.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildLastAdditionalPrinterColumn() {
        return this.additionalPrinterColumns.get(additionalPrinterColumns.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAdditionalPrinterColumns(java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
        if (this.additionalPrinterColumns != null) { _visitables.get("additionalPrinterColumns").removeAll(this.additionalPrinterColumns);}
        if (additionalPrinterColumns != null) {this.additionalPrinterColumns = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item : additionalPrinterColumns){this.addToAdditionalPrinterColumns(item);}} else { this.additionalPrinterColumns = null;} return (A) this;
    }

    public A withAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... additionalPrinterColumns) {
        if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.clear();}
        if (additionalPrinterColumns != null) {for (io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item :additionalPrinterColumns){ this.addToAdditionalPrinterColumns(item);}} return (A) this;
    }

    public java.lang.Boolean hasAdditionalPrinterColumns() {
        return additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.AdditionalPrinterColumnsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index) {
        if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn() {
        if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
        return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn() {
        int index = additionalPrinterColumns.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<additionalPrinterColumns.size();i++) { 
        if (predicate.test(additionalPrinterColumns.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public java.lang.Boolean getDeprecated() {
        return this.deprecated;
    }

    public A withDeprecated(java.lang.Boolean deprecated) {
        this.deprecated=deprecated; return (A) this;
    }

    public java.lang.Boolean hasDeprecated() {
        return this.deprecated != null;
    }

    public java.lang.String getDeprecationWarning() {
        return this.deprecationWarning;
    }

    public A withDeprecationWarning(java.lang.String deprecationWarning) {
        this.deprecationWarning=deprecationWarning; return (A) this;
    }

    public java.lang.Boolean hasDeprecationWarning() {
        return this.deprecationWarning != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDeprecationWarning instead.
     */
        public A withNewDeprecationWarning(java.lang.String original) {
        return (A)withDeprecationWarning(new String(original));
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

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSchema instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation getSchema() {
        return this.schema!=null?this.schema.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation buildSchema() {
        return this.schema!=null?this.schema.build():null;
    }

    public A withSchema(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation schema) {
        _visitables.get("schema").remove(this.schema);
        if (schema!=null){ this.schema= new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(schema); _visitables.get("schema").add(this.schema);} return (A) this;
    }

    public java.lang.Boolean hasSchema() {
        return this.schema != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.SchemaNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.SchemaNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema() {
        return withNewSchemaLike(getSchema());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema() {
        return withNewSchemaLike(getSchema() != null ? getSchema(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
        return withNewSchemaLike(getSchema() != null ? getSchema(): item);
    }

    public java.lang.Boolean getServed() {
        return this.served;
    }

    public A withServed(java.lang.Boolean served) {
        this.served=served; return (A) this;
    }

    public java.lang.Boolean hasServed() {
        return this.served != null;
    }

    public java.lang.Boolean getStorage() {
        return this.storage;
    }

    public A withStorage(java.lang.Boolean storage) {
        this.storage=storage; return (A) this;
    }

    public java.lang.Boolean hasStorage() {
        return this.storage != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubresources instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources getSubresources() {
        return this.subresources!=null?this.subresources.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources buildSubresources() {
        return this.subresources!=null?this.subresources.build():null;
    }

    public A withSubresources(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources subresources) {
        _visitables.get("subresources").remove(this.subresources);
        if (subresources!=null){ this.subresources= new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder(subresources); _visitables.get("subresources").add(this.subresources);} return (A) this;
    }

    public java.lang.Boolean hasSubresources() {
        return this.subresources != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.SubresourcesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl.SubresourcesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources() {
        return withNewSubresourcesLike(getSubresources());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources() {
        return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
        return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceDefinitionVersionFluentImpl that = (V1beta1CustomResourceDefinitionVersionFluentImpl) o;
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

    public class AdditionalPrinterColumnsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder builder;
        private final int index;

            AdditionalPrinterColumnsNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(this, item);
                        
            }

            AdditionalPrinterColumnsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionVersionFluentImpl.this.setToAdditionalPrinterColumns(index,builder.build());
            }

            public N endAdditionalPrinterColumn() {
                return and();
            }
    }


    public class SchemaNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder builder;

            SchemaNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(this, item);
                        
            }

            SchemaNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionVersionFluentImpl.this.withSchema(builder.build());
            }

            public N endSchema() {
                return and();
            }
    }


    public class SubresourcesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder builder;

            SubresourcesNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder(this, item);
                        
            }

            SubresourcesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionVersionFluentImpl.this.withSubresources(builder.build());
            }

            public N endSubresources() {
                return and();
            }
    }


}
