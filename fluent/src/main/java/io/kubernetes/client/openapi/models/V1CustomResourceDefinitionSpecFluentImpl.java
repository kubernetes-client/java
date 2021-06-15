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

public class V1CustomResourceDefinitionSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<A> {

    private io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder conversion;
    private java.lang.String group;
    private io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder names;
    private java.lang.Boolean preserveUnknownFields;
    private java.lang.String scope;
    private java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> versions;

    public V1CustomResourceDefinitionSpecFluentImpl() {
    }

    public V1CustomResourceDefinitionSpecFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec instance) {
        this.withConversion(instance.getConversion());
        
        this.withGroup(instance.getGroup());
        
        this.withNames(instance.getNames());
        
        this.withPreserveUnknownFields(instance.getPreserveUnknownFields());
        
        this.withScope(instance.getScope());
        
        this.withVersions(instance.getVersions());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConversion instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CustomResourceConversion getConversion() {
        return this.conversion!=null?this.conversion.build():null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversion buildConversion() {
        return this.conversion!=null?this.conversion.build():null;
    }

    public A withConversion(io.kubernetes.client.openapi.models.V1CustomResourceConversion conversion) {
        _visitables.get("conversion").remove(this.conversion);
        if (conversion!=null){ this.conversion= new io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder(conversion); _visitables.get("conversion").add(this.conversion);} return (A) this;
    }

    public java.lang.Boolean hasConversion() {
        return this.conversion != null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.ConversionNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion() {
        return withNewConversionLike(getConversion());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion() {
        return withNewConversionLike(getConversion() != null ? getConversion(): new io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item) {
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
        public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames getNames() {
        return this.names!=null?this.names.build():null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames buildNames() {
        return this.names!=null?this.names.build():null;
    }

    public A withNames(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames names) {
        _visitables.get("names").remove(this.names);
        if (names!=null){ this.names= new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(names); _visitables.get("names").add(this.names);} return (A) this;
    }

    public java.lang.Boolean hasNames() {
        return this.names != null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.NamesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames() {
        return withNewNamesLike(getNames());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames() {
        return withNewNamesLike(getNames() != null ? getNames(): new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
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

    public A addToVersions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(index >= 0 ? index : _visitables.get("versions").size(), builder);this.versions.add(index >= 0 ? index : versions.size(), builder); return (A)this;
    }

    public A setToVersions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);
        if (index < 0 || index >= _visitables.get("versions").size()) { _visitables.get("versions").add(builder); } else { _visitables.get("versions").set(index, builder);}
        if (index < 0 || index >= versions.size()) { versions.add(builder); } else { versions.set(index, builder);}
         return (A)this;
    }

    public A addToVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
    }

    public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> items) {
        if (this.versions == null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").add(builder);this.versions.add(builder);} return (A)this;
    }

    public A removeFromVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> items) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(item);_visitables.get("versions").remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate) {
        if (versions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> each = versions.iterator();
        final List visitables = _visitables.get("versions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder = each.next();
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
        public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> getVersions() {
        return build(versions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> buildVersions() {
        return build(versions);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildVersion(int index) {
        return this.versions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildFirstVersion() {
        return this.versions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildLastVersion() {
        return this.versions.get(versions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> versions) {
        if (this.versions != null) { _visitables.get("versions").removeAll(this.versions);}
        if (versions != null) {this.versions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder>(); for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item : versions){this.addToVersions(item);}} else { this.versions = null;} return (A) this;
    }

    public A withVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions) {
        if (this.versions != null) {this.versions.clear();}
        if (versions != null) {for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item :versions){ this.addToVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasVersions() {
        return versions != null && !versions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl.VersionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index) {
        if (versions.size() <= index) throw new RuntimeException("Can't edit versions. Index exceeds size.");
        return setNewVersionLike(index, buildVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion() {
        if (versions.size() == 0) throw new RuntimeException("Can't edit first versions. The list is empty.");
        return setNewVersionLike(0, buildVersion(0));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion() {
        int index = versions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
        return setNewVersionLike(index, buildVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate) {
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
        V1CustomResourceDefinitionSpecFluentImpl that = (V1CustomResourceDefinitionSpecFluentImpl) o;
        if (conversion != null ? !conversion.equals(that.conversion) :that.conversion != null) return false;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (names != null ? !names.equals(that.names) :that.names != null) return false;
        if (preserveUnknownFields != null ? !preserveUnknownFields.equals(that.preserveUnknownFields) :that.preserveUnknownFields != null) return false;
        if (scope != null ? !scope.equals(that.scope) :that.scope != null) return false;
        if (versions != null ? !versions.equals(that.versions) :that.versions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conversion,  group,  names,  preserveUnknownFields,  scope,  versions,  super.hashCode());
    }

    public class ConversionNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder builder;

            ConversionNestedImpl(io.kubernetes.client.openapi.models.V1CustomResourceConversion item) {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder(this, item);
                        
            }

            ConversionNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceDefinitionSpecFluentImpl.this.withConversion(builder.build());
            }

            public N endConversion() {
                return and();
            }
    }


    public class NamesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder builder;

            NamesNestedImpl(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(this, item);
                        
            }

            NamesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceDefinitionSpecFluentImpl.this.withNames(builder.build());
            }

            public N endNames() {
                return and();
            }
    }


    public class VersionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder builder;
        private final int index;

            VersionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(this, item);
                        
            }

            VersionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceDefinitionSpecFluentImpl.this.setToVersions(index,builder.build());
            }

            public N endVersion() {
                return and();
            }
    }


}
