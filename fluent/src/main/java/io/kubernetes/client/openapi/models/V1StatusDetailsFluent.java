package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1StatusDetailsFluent<A extends io.kubernetes.client.openapi.models.V1StatusDetailsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToCauses(int index,io.kubernetes.client.openapi.models.V1StatusCause item);
    public A setToCauses(int index,io.kubernetes.client.openapi.models.V1StatusCause item);
    public A addToCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);
    public A addAllToCauses(java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items);
    public A removeFromCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);
    public A removeAllFromCauses(java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items);
    public A removeMatchingFromCauses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildCauses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> getCauses();
    public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> buildCauses();
    public io.kubernetes.client.openapi.models.V1StatusCause buildCause(int index);
    public io.kubernetes.client.openapi.models.V1StatusCause buildFirstCause();
    public io.kubernetes.client.openapi.models.V1StatusCause buildLastCause();
    public io.kubernetes.client.openapi.models.V1StatusCause buildMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
    public java.lang.Boolean hasMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
    public A withCauses(java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> causes);
    public A withCauses(io.kubernetes.client.openapi.models.V1StatusCause... causes);
    public java.lang.Boolean hasCauses();
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCause();
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCauseLike(io.kubernetes.client.openapi.models.V1StatusCause item);
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> setNewCauseLike(int index,io.kubernetes.client.openapi.models.V1StatusCause item);
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editCause(int index);
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editFirstCause();
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editLastCause();
    public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editMatchingCause(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> predicate);
    public java.lang.String getGroup();
    public A withGroup(java.lang.String group);
    public java.lang.Boolean hasGroup();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Integer getRetryAfterSeconds();
    public A withRetryAfterSeconds(java.lang.Integer retryAfterSeconds);
    public java.lang.Boolean hasRetryAfterSeconds();
    public java.lang.String getUid();
    public A withUid(java.lang.String uid);
    public java.lang.Boolean hasUid();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original);
    public interface CausesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatusCauseFluent<io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<N>> {

            public N and();
            public N endCause();    }


}
