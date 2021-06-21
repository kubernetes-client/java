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

public class V1beta1CustomResourceDefinitionSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder conversion;
    private java.lang.String group;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder names;
    private java.lang.Boolean preserveUnknownFields;
    private java.lang.String scope;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder subresources;
    private io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder validation;
    private java.lang.String version;
    private java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> versions;

    public V1beta1CustomResourceDefinitionSpecFluentImpl() {
    }

    public V1beta1CustomResourceDefinitionSpecFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec instance) {
        this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        this.withConversion(instance.getConversion());
        
        this.withGroup(instance.getGroup());
        
        this.withNames(instance.getNames());
        
        this.withPreserveUnknownFields(instance.getPreserveUnknownFields());
        
        this.withScope(instance.getScope());
        
        this.withSubresources(instance.getSubresources());
        
        this.withValidation(instance.getValidation());
        
        this.withVersion(instance.getVersion());
        
        this.withVersions(instance.getVersions());
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

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.AdditionalPrinterColumnsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.AdditionalPrinterColumnsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.AdditionalPrinterColumnsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index) {
        if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn() {
        if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
        return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn() {
        int index = additionalPrinterColumns.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<additionalPrinterColumns.size();i++) { 
        if (predicate.test(additionalPrinterColumns.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
        return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConversion instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion getConversion() {
        return this.conversion!=null?this.conversion.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion buildConversion() {
        return this.conversion!=null?this.conversion.build():null;
    }

    public A withConversion(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion conversion) {
        _visitables.get("conversion").remove(this.conversion);
        if (conversion!=null){ this.conversion= new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder(conversion); _visitables.get("conversion").add(this.conversion);} return (A) this;
    }

    public java.lang.Boolean hasConversion() {
        return this.conversion != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion() {
        return withNewConversionLike(getConversion());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion() {
        return withNewConversionLike(getConversion() != null ? getConversion(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion item) {
        return withNewConversionLike(getConversion() != null ? getConversion(): item);
    }

    public java.lang.String getGroup() {
        return this.group;
    }

    public A withGroup(java.lang.String group) {
        this.group=group; return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return this.group != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original) {
        return (A)withGroup(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNames instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames getNames() {
        return this.names!=null?this.names.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames buildNames() {
        return this.names!=null?this.names.build():null;
    }

    public A withNames(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames names) {
        _visitables.get("names").remove(this.names);
        if (names!=null){ this.names= new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder(names); _visitables.get("names").add(this.names);} return (A) this;
    }

    public java.lang.Boolean hasNames() {
        return this.names != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames() {
        return withNewNamesLike(getNames());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames() {
        return withNewNamesLike(getNames() != null ? getNames(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item) {
        return withNewNamesLike(getNames() != null ? getNames(): item);
    }

    public java.lang.Boolean getPreserveUnknownFields() {
        return this.preserveUnknownFields;
    }

    public A withPreserveUnknownFields(java.lang.Boolean preserveUnknownFields) {
        this.preserveUnknownFields=preserveUnknownFields; return (A) this;
    }

    public java.lang.Boolean hasPreserveUnknownFields() {
        return this.preserveUnknownFields != null;
    }

    public java.lang.String getScope() {
        return this.scope;
    }

    public A withScope(java.lang.String scope) {
        this.scope=scope; return (A) this;
    }

    public java.lang.Boolean hasScope() {
        return this.scope != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withScope instead.
     */
        public A withNewScope(java.lang.String original) {
        return (A)withScope(new String(original));
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

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresources() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.SubresourcesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.SubresourcesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editSubresources() {
        return withNewSubresourcesLike(getSubresources());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresources() {
        return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
        return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildValidation instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation getValidation() {
        return this.validation!=null?this.validation.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation buildValidation() {
        return this.validation!=null?this.validation.build():null;
    }

    public A withValidation(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation validation) {
        _visitables.get("validation").remove(this.validation);
        if (validation!=null){ this.validation= new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(validation); _visitables.get("validation").add(this.validation);} return (A) this;
    }

    public java.lang.Boolean hasValidation() {
        return this.validation != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidation() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.ValidationNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidationLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.ValidationNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editValidation() {
        return withNewValidationLike(getValidation());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidation() {
        return withNewValidationLike(getValidation() != null ? getValidation(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidationLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
        return withNewValidationLike(getValidation() != null ? getValidation(): item);
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public A withVersion(java.lang.String version) {
        this.version=version; return (A) this;
    }

    public java.lang.Boolean hasVersion() {
        return this.version != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original) {
        return (A)withVersion(new String(original));
    }

    public A addToVersions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(index >= 0 ? index : _visitables.get("versions").size(), builder);this.versions.add(index >= 0 ? index : versions.size(), builder); return (A)this;
    }

    public A setToVersions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);
        if (index < 0 || index >= _visitables.get("versions").size()) { _visitables.get("versions").add(builder); } else { _visitables.get("versions").set(index, builder);}
        if (index < 0 || index >= versions.size()) { versions.add(builder); } else { versions.set(index, builder);}
         return (A)this;
    }

    public A addToVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... items) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
    }

    public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> items) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
    }

    public A removeFromVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... items) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> items) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate) {
        if (versions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> each = versions.iterator();
        final List visitables = _visitables.get("versions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildVersions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> getVersions() {
        return build(versions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> buildVersions() {
        return build(versions);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildVersion(int index) {
        return this.versions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildFirstVersion() {
        return this.versions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildLastVersion() {
        return this.versions.get(versions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> versions) {
        if (this.versions != null) { _visitables.get("versions").removeAll(this.versions);}
        if (versions != null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item : versions){this.addToVersions(item);}} else { this.versions = null;} return (A) this;
    }

    public A withVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... versions) {
        if (this.versions != null) {this.versions.clear();}
        if (versions != null) {for (io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item :versions){ this.addToVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasVersions() {
        return versions != null && !versions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index) {
        if (versions.size() <= index) throw new RuntimeException("Can't edit versions. Index exceeds size.");
        return setNewVersionLike(index, buildVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion() {
        if (versions.size() == 0) throw new RuntimeException("Can't edit first versions. The list is empty.");
        return setNewVersionLike(0, buildVersion(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion() {
        int index = versions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
        return setNewVersionLike(index, buildVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<versions.size();i++) { 
        if (predicate.test(versions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching versions. No match found.");
        return setNewVersionLike(index, buildVersion(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceDefinitionSpecFluentImpl that = (V1beta1CustomResourceDefinitionSpecFluentImpl) o;
        if (additionalPrinterColumns != null ? !additionalPrinterColumns.equals(that.additionalPrinterColumns) :that.additionalPrinterColumns != null) return false;
        if (conversion != null ? !conversion.equals(that.conversion) :that.conversion != null) return false;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (names != null ? !names.equals(that.names) :that.names != null) return false;
        if (preserveUnknownFields != null ? !preserveUnknownFields.equals(that.preserveUnknownFields) :that.preserveUnknownFields != null) return false;
        if (scope != null ? !scope.equals(that.scope) :that.scope != null) return false;
        if (subresources != null ? !subresources.equals(that.subresources) :that.subresources != null) return false;
        if (validation != null ? !validation.equals(that.validation) :that.validation != null) return false;
        if (version != null ? !version.equals(that.version) :that.version != null) return false;
        if (versions != null ? !versions.equals(that.versions) :that.versions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(additionalPrinterColumns,  conversion,  group,  names,  preserveUnknownFields,  scope,  subresources,  validation,  version,  versions,  super.hashCode());
    }

    public class AdditionalPrinterColumnsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>,io.kubernetes.client.fluent.Nested<N> {
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
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.setToAdditionalPrinterColumns(index,builder.build());
            }

            public N endAdditionalPrinterColumn() {
                return and();
            }
    }


    public class ConversionNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder builder;

            ConversionNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder(this, item);
                        
            }

            ConversionNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.withConversion(builder.build());
            }

            public N endConversion() {
                return and();
            }
    }


    public class NamesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder builder;

            NamesNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder(this, item);
                        
            }

            NamesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.withNames(builder.build());
            }

            public N endNames() {
                return and();
            }
    }


    public class SubresourcesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder builder;

            SubresourcesNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder(this, item);
                        
            }

            SubresourcesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.withSubresources(builder.build());
            }

            public N endSubresources() {
                return and();
            }
    }


    public class ValidationNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder builder;

            ValidationNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(this, item);
                        
            }

            ValidationNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.withValidation(builder.build());
            }

            public N endValidation() {
                return and();
            }
    }


    public class VersionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder builder;
        private final int index;

            VersionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(this, item);
                        
            }

            VersionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceDefinitionSpecFluentImpl.this.setToVersions(index,builder.build());
            }

            public N endVersion() {
                return and();
            }
    }


}
