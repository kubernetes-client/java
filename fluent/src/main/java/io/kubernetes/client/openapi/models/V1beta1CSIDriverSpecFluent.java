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

public interface V1beta1CSIDriverSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getAttachRequired();
    public A withAttachRequired(java.lang.Boolean attachRequired);
    public java.lang.Boolean hasAttachRequired();
    public java.lang.String getFsGroupPolicy();
    public A withFsGroupPolicy(java.lang.String fsGroupPolicy);
    public java.lang.Boolean hasFsGroupPolicy();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsGroupPolicy instead.
     */
        public A withNewFsGroupPolicy(java.lang.String original);
    public java.lang.Boolean getPodInfoOnMount();
    public A withPodInfoOnMount(java.lang.Boolean podInfoOnMount);
    public java.lang.Boolean hasPodInfoOnMount();
    public java.lang.Boolean getRequiresRepublish();
    public A withRequiresRepublish(java.lang.Boolean requiresRepublish);
    public java.lang.Boolean hasRequiresRepublish();
    public java.lang.Boolean getStorageCapacity();
    public A withStorageCapacity(java.lang.Boolean storageCapacity);
    public java.lang.Boolean hasStorageCapacity();
    public A addToTokenRequests(int index,io.kubernetes.client.openapi.models.V1beta1TokenRequest item);
    public A setToTokenRequests(int index,io.kubernetes.client.openapi.models.V1beta1TokenRequest item);
    public A addToTokenRequests(io.kubernetes.client.openapi.models.V1beta1TokenRequest... items);
    public A addAllToTokenRequests(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1TokenRequest> items);
    public A removeFromTokenRequests(io.kubernetes.client.openapi.models.V1beta1TokenRequest... items);
    public A removeAllFromTokenRequests(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1TokenRequest> items);
    public A removeMatchingFromTokenRequests(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTokenRequests instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1TokenRequest> getTokenRequests();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1TokenRequest> buildTokenRequests();
    public io.kubernetes.client.openapi.models.V1beta1TokenRequest buildTokenRequest(int index);
    public io.kubernetes.client.openapi.models.V1beta1TokenRequest buildFirstTokenRequest();
    public io.kubernetes.client.openapi.models.V1beta1TokenRequest buildLastTokenRequest();
    public io.kubernetes.client.openapi.models.V1beta1TokenRequest buildMatchingTokenRequest(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> predicate);
    public java.lang.Boolean hasMatchingTokenRequest(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> predicate);
    public A withTokenRequests(java.util.List<io.kubernetes.client.openapi.models.V1beta1TokenRequest> tokenRequests);
    public A withTokenRequests(io.kubernetes.client.openapi.models.V1beta1TokenRequest... tokenRequests);
    public java.lang.Boolean hasTokenRequests();
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequest();
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequestLike(io.kubernetes.client.openapi.models.V1beta1TokenRequest item);
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> setNewTokenRequestLike(int index,io.kubernetes.client.openapi.models.V1beta1TokenRequest item);
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> editTokenRequest(int index);
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> editFirstTokenRequest();
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> editLastTokenRequest();
    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<A> editMatchingTokenRequest(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> predicate);
    public A addToVolumeLifecycleModes(int index,java.lang.String item);
    public A setToVolumeLifecycleModes(int index,java.lang.String item);
    public A addToVolumeLifecycleModes(java.lang.String... items);
    public A addAllToVolumeLifecycleModes(java.util.Collection<java.lang.String> items);
    public A removeFromVolumeLifecycleModes(java.lang.String... items);
    public A removeAllFromVolumeLifecycleModes(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getVolumeLifecycleModes();
    public java.lang.String getVolumeLifecycleMode(int index);
    public java.lang.String getFirstVolumeLifecycleMode();
    public java.lang.String getLastVolumeLifecycleMode();
    public java.lang.String getMatchingVolumeLifecycleMode(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingVolumeLifecycleMode(java.util.function.Predicate<java.lang.String> predicate);
    public A withVolumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes);
    public A withVolumeLifecycleModes(java.lang.String... volumeLifecycleModes);
    public java.lang.Boolean hasVolumeLifecycleModes();
    public A addNewVolumeLifecycleMode(java.lang.String original);
    public interface TokenRequestsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent.TokenRequestsNested<N>> {

            public N and();
            public N endTokenRequest();    }


}
