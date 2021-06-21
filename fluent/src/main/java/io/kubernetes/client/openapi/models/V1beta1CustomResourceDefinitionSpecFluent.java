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

public interface V1beta1CustomResourceDefinitionSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAdditionalPrinterColumns(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public A setToAdditionalPrinterColumns(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public A addToAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... items);
    public A addAllToAdditionalPrinterColumns(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> items);
    public A removeFromAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... items);
    public A removeAllFromAdditionalPrinterColumns(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> items);
    public A removeMatchingFromAdditionalPrinterColumns(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> buildAdditionalPrinterColumns();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildLastAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate);
    public java.lang.Boolean hasMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate);
    public A withAdditionalPrinterColumns(java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition> additionalPrinterColumns);
    public A withAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition... additionalPrinterColumns);
    public java.lang.Boolean hasAdditionalPrinterColumns();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConversion instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion getConversion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion buildConversion();
    public A withConversion(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion conversion);
    public java.lang.Boolean hasConversion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion item);
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
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames getNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames buildNames();
    public A withNames(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames names);
    public java.lang.Boolean hasNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item);
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
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubresources instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources getSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources buildSubresources();
    public A withSubresources(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources subresources);
    public java.lang.Boolean hasSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildValidation instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation getValidation();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation buildValidation();
    public A withValidation(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation validation);
    public java.lang.Boolean hasValidation();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidation();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidationLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editValidation();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidation();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidationLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item);
    public java.lang.String getVersion();
    public A withVersion(java.lang.String version);
    public java.lang.Boolean hasVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original);
    public A addToVersions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item);
    public A setToVersions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item);
    public A addToVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... items);
    public A addAllToVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> items);
    public A removeFromVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... items);
    public A removeAllFromVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> items);
    public A removeMatchingFromVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildVersions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> getVersions();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> buildVersions();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildVersion(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildFirstVersion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildLastVersion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion buildMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate);
    public java.lang.Boolean hasMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate);
    public A withVersions(java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion> versions);
    public A withVersions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion... versions);
    public java.lang.Boolean hasVersions();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> predicate);
    public interface AdditionalPrinterColumnsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>> {

            public N and();
            public N endAdditionalPrinterColumn();    }


    public interface ConversionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ConversionNested<N>> {

            public N and();
            public N endConversion();    }


    public interface NamesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.NamesNested<N>> {

            public N and();
            public N endNames();    }


    public interface SubresourcesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.SubresourcesNested<N>> {

            public N and();
            public N endSubresources();    }


    public interface ValidationNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.ValidationNested<N>> {

            public N and();
            public N endValidation();    }


    public interface VersionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent.VersionsNested<N>> {

            public N and();
            public N endVersion();    }


}
