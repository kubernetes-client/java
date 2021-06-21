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

public interface V1APIResourceListFluent<A extends io.kubernetes.client.openapi.models.V1APIResourceListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getGroupVersion();
    public A withGroupVersion(java.lang.String groupVersion);
    public java.lang.Boolean hasGroupVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroupVersion instead.
     */
        public A withNewGroupVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public A addToResources(int index,io.kubernetes.client.openapi.models.V1APIResource item);
    public A setToResources(int index,io.kubernetes.client.openapi.models.V1APIResource item);
    public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items);
    public A addAllToResources(java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items);
    public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items);
    public A removeAllFromResources(java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items);
    public A removeMatchingFromResources(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResources instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> getResources();
    public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> buildResources();
    public io.kubernetes.client.openapi.models.V1APIResource buildResource(int index);
    public io.kubernetes.client.openapi.models.V1APIResource buildFirstResource();
    public io.kubernetes.client.openapi.models.V1APIResource buildLastResource();
    public io.kubernetes.client.openapi.models.V1APIResource buildMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
    public java.lang.Boolean hasMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
    public A withResources(java.util.List<io.kubernetes.client.openapi.models.V1APIResource> resources);
    public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources);
    public java.lang.Boolean hasResources();
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> addNewResource();
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> addNewResourceLike(io.kubernetes.client.openapi.models.V1APIResource item);
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> setNewResourceLike(int index,io.kubernetes.client.openapi.models.V1APIResource item);
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editResource(int index);
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editFirstResource();
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editLastResource();
    public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
    public interface ResourcesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1APIResourceFluent<io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<N>> {

            public N and();
            public N endResource();    }


}
