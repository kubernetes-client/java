package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1alpha1FlowSchemaListFluent<A extends io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToItems(int index,io.kubernetes.client.openapi.models.V1alpha1FlowSchema item);
    public A setToItems(int index,io.kubernetes.client.openapi.models.V1alpha1FlowSchema item);
    public A addToItems(io.kubernetes.client.openapi.models.V1alpha1FlowSchema... items);
    public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1FlowSchema> items);
    public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha1FlowSchema... items);
    public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1FlowSchema> items);
    public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildItems instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1FlowSchema> getItems();
    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1FlowSchema> buildItems();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchema buildItem(int index);
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchema buildFirstItem();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchema buildLastItem();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchema buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaBuilder> predicate);
    public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaBuilder> predicate);
    public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1alpha1FlowSchema> items);
    public A withItems(io.kubernetes.client.openapi.models.V1alpha1FlowSchema... items);
    public java.lang.Boolean hasItems();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> addNewItem();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1alpha1FlowSchema item);
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> setNewItemLike(int index,io.kubernetes.client.openapi.models.V1alpha1FlowSchema item);
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> editItem(int index);
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> editFirstItem();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> editLastItem();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaBuilder> predicate);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaFluent<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.ItemsNested<N>> {

            public N and();
            public N endItem();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ListMetaFluent<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaListFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


}
