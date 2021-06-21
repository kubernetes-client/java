package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

public interface V1CustomResourceDefinitionSpecFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConversion instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CustomResourceConversion getConversion();
    public io.kubernetes.client.openapi.models.V1CustomResourceConversion buildConversion();
    public A withConversion(io.kubernetes.client.openapi.models.V1CustomResourceConversion conversion);
    public java.lang.Boolean hasConversion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(io.kubernetes.client.openapi.models.V1CustomResourceConversion item);
    public java.lang.String getGroup();
    public A withGroup(java.lang.String group);
    public java.lang.Boolean hasGroup();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNames instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames getNames();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames buildNames();
    public A withNames(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames names);
    public java.lang.Boolean hasNames();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);
    public java.lang.Boolean getPreserveUnknownFields();
    public A withPreserveUnknownFields(java.lang.Boolean preserveUnknownFields);
    public java.lang.Boolean hasPreserveUnknownFields();
    public java.lang.String getScope();
    public A withScope(java.lang.String scope);
    public java.lang.Boolean hasScope();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withScope instead.
     */
        public A withNewScope(java.lang.String original);
    public A addToVersions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);
    public A setToVersions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);
    public A addToVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);
    public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> items);
    public A removeFromVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... items);
    public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> items);
    public A removeMatchingFromVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildVersions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> getVersions();
    public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> buildVersions();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildVersion(int index);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildFirstVersion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildLastVersion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate);
    public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate);
    public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion> versions);
    public A withVersions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion... versions);
    public java.lang.Boolean hasVersions();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion item);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index);
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion();
    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionBuilder> predicate);
    public interface ConversionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.ConversionNested<N>> {

            public N and();
            public N endConversion();    }


    public interface NamesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.NamesNested<N>> {

            public N and();
            public N endNames();    }


    public interface VersionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersionFluent<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent.VersionsNested<N>> {

            public N and();
            public N endVersion();    }


}
