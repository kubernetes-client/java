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

public interface V1NodeSpecFluent<A extends io.kubernetes.client.openapi.models.V1NodeSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConfigSource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeConfigSource getConfigSource();
    public io.kubernetes.client.openapi.models.V1NodeConfigSource buildConfigSource();
    public A withConfigSource(io.kubernetes.client.openapi.models.V1NodeConfigSource configSource);
    public java.lang.Boolean hasConfigSource();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSource();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A> editConfigSource();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSource();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);
    public java.lang.String getExternalID();
    public A withExternalID(java.lang.String externalID);
    public java.lang.Boolean hasExternalID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withExternalID instead.
     */
        public A withNewExternalID(java.lang.String original);
    public java.lang.String getPodCIDR();
    public A withPodCIDR(java.lang.String podCIDR);
    public java.lang.Boolean hasPodCIDR();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPodCIDR instead.
     */
        public A withNewPodCIDR(java.lang.String original);
    public A addToPodCIDRs(int index,java.lang.String item);
    public A setToPodCIDRs(int index,java.lang.String item);
    public A addToPodCIDRs(java.lang.String... items);
    public A addAllToPodCIDRs(java.util.Collection<java.lang.String> items);
    public A removeFromPodCIDRs(java.lang.String... items);
    public A removeAllFromPodCIDRs(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getPodCIDRs();
    public java.lang.String getPodCIDR(int index);
    public java.lang.String getFirstPodCIDR();
    public java.lang.String getLastPodCIDR();
    public java.lang.String getMatchingPodCIDR(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingPodCIDR(java.util.function.Predicate<java.lang.String> predicate);
    public A withPodCIDRs(java.util.List<java.lang.String> podCIDRs);
    public A withPodCIDRs(java.lang.String... podCIDRs);
    public java.lang.Boolean hasPodCIDRs();
    public A addNewPodCIDR(java.lang.String original);
    public java.lang.String getProviderID();
    public A withProviderID(java.lang.String providerID);
    public java.lang.Boolean hasProviderID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProviderID instead.
     */
        public A withNewProviderID(java.lang.String original);
    public A addToTaints(int index,io.kubernetes.client.openapi.models.V1Taint item);
    public A setToTaints(int index,io.kubernetes.client.openapi.models.V1Taint item);
    public A addToTaints(io.kubernetes.client.openapi.models.V1Taint... items);
    public A addAllToTaints(java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items);
    public A removeFromTaints(io.kubernetes.client.openapi.models.V1Taint... items);
    public A removeAllFromTaints(java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items);
    public A removeMatchingFromTaints(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTaints instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1Taint> getTaints();
    public java.util.List<io.kubernetes.client.openapi.models.V1Taint> buildTaints();
    public io.kubernetes.client.openapi.models.V1Taint buildTaint(int index);
    public io.kubernetes.client.openapi.models.V1Taint buildFirstTaint();
    public io.kubernetes.client.openapi.models.V1Taint buildLastTaint();
    public io.kubernetes.client.openapi.models.V1Taint buildMatchingTaint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);
    public java.lang.Boolean hasMatchingTaint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);
    public A withTaints(java.util.List<io.kubernetes.client.openapi.models.V1Taint> taints);
    public A withTaints(io.kubernetes.client.openapi.models.V1Taint... taints);
    public java.lang.Boolean hasTaints();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaint();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaintLike(io.kubernetes.client.openapi.models.V1Taint item);
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> setNewTaintLike(int index,io.kubernetes.client.openapi.models.V1Taint item);
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editTaint(int index);
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editFirstTaint();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editLastTaint();
    public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editMatchingTaint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);
    public java.lang.Boolean getUnschedulable();
    public A withUnschedulable(java.lang.Boolean unschedulable);
    public java.lang.Boolean hasUnschedulable();
    public interface ConfigSourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<N>> {

            public N and();
            public N endConfigSource();    }


    public interface TaintsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TaintFluent<io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<N>> {

            public N and();
            public N endTaint();    }


}
