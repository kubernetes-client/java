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

public interface V1beta1CustomResourceDefinitionVersionFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> predicate);
    public java.lang.Boolean getDeprecated();
    public A withDeprecated(java.lang.Boolean deprecated);
    public java.lang.Boolean hasDeprecated();
    public java.lang.String getDeprecationWarning();
    public A withDeprecationWarning(java.lang.String deprecationWarning);
    public java.lang.Boolean hasDeprecationWarning();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDeprecationWarning instead.
     */
        public A withNewDeprecationWarning(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSchema instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation getSchema();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation buildSchema();
    public A withSchema(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation schema);
    public java.lang.Boolean hasSchema();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchema();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> withNewSchemaLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editSchema();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchema();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<A> editOrNewSchemaLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation item);
    public java.lang.Boolean getServed();
    public A withServed(java.lang.Boolean served);
    public java.lang.Boolean hasServed();
    public java.lang.Boolean getStorage();
    public A withStorage(java.lang.Boolean storage);
    public java.lang.Boolean hasStorage();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubresources instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources getSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources buildSubresources();
    public A withSubresources(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources subresources);
    public java.lang.Boolean hasSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> withNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresources();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<A> editOrNewSubresourcesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources item);
    public interface AdditionalPrinterColumnsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.AdditionalPrinterColumnsNested<N>> {

            public N and();
            public N endAdditionalPrinterColumn();    }


    public interface SchemaNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceValidationFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SchemaNested<N>> {

            public N and();
            public N endSchema();    }


    public interface SubresourcesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent.SubresourcesNested<N>> {

            public N and();
            public N endSubresources();    }


}
