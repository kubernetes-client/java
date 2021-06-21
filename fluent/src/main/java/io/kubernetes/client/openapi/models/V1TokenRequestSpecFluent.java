package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1TokenRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAudiences(int index,java.lang.String item);
    public A setToAudiences(int index,java.lang.String item);
    public A addToAudiences(java.lang.String... items);
    public A addAllToAudiences(java.util.Collection<java.lang.String> items);
    public A removeFromAudiences(java.lang.String... items);
    public A removeAllFromAudiences(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAudiences();
    public java.lang.String getAudience(int index);
    public java.lang.String getFirstAudience();
    public java.lang.String getLastAudience();
    public java.lang.String getMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);
    public A withAudiences(java.util.List<java.lang.String> audiences);
    public A withAudiences(java.lang.String... audiences);
    public java.lang.Boolean hasAudiences();
    public A addNewAudience(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBoundObjectRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1BoundObjectReference getBoundObjectRef();
    public io.kubernetes.client.openapi.models.V1BoundObjectReference buildBoundObjectRef();
    public A withBoundObjectRef(io.kubernetes.client.openapi.models.V1BoundObjectReference boundObjectRef);
    public java.lang.Boolean hasBoundObjectRef();
    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef();
    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item);
    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef();
    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef();
    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item);
    public java.lang.Long getExpirationSeconds();
    public A withExpirationSeconds(java.lang.Long expirationSeconds);
    public java.lang.Boolean hasExpirationSeconds();
    public interface BoundObjectRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<N>> {

            public N and();
            public N endBoundObjectRef();    }


}
