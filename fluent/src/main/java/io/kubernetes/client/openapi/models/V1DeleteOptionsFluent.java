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

public interface V1DeleteOptionsFluent<A extends io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToDryRun(int index,java.lang.String item);
    public A setToDryRun(int index,java.lang.String item);
    public A addToDryRun(java.lang.String... items);
    public A addAllToDryRun(java.util.Collection<java.lang.String> items);
    public A removeFromDryRun(java.lang.String... items);
    public A removeAllFromDryRun(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getDryRun();
    public java.lang.String getDryRun(int index);
    public java.lang.String getFirstDryRun();
    public java.lang.String getLastDryRun();
    public java.lang.String getMatchingDryRun(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingDryRun(java.util.function.Predicate<java.lang.String> predicate);
    public A withDryRun(java.util.List<java.lang.String> dryRun);
    public A withDryRun(java.lang.String... dryRun);
    public java.lang.Boolean hasDryRun();
    public A addNewDryRun(java.lang.String original);
    public java.lang.Long getGracePeriodSeconds();
    public A withGracePeriodSeconds(java.lang.Long gracePeriodSeconds);
    public java.lang.Boolean hasGracePeriodSeconds();
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.Boolean getOrphanDependents();
    public A withOrphanDependents(java.lang.Boolean orphanDependents);
    public java.lang.Boolean hasOrphanDependents();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreconditions instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1Preconditions getPreconditions();
    public io.kubernetes.client.openapi.models.V1Preconditions buildPreconditions();
    public A withPreconditions(io.kubernetes.client.openapi.models.V1Preconditions preconditions);
    public java.lang.Boolean hasPreconditions();
    public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions();
    public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item);
    public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A> editPreconditions();
    public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions();
    public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item);
    public java.lang.String getPropagationPolicy();
    public A withPropagationPolicy(java.lang.String propagationPolicy);
    public java.lang.Boolean hasPropagationPolicy();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPropagationPolicy instead.
     */
        public A withNewPropagationPolicy(java.lang.String original);
    public interface PreconditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PreconditionsFluent<io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<N>> {

            public N and();
            public N endPreconditions();    }


}
