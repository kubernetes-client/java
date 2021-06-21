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

public interface V1PodAntiAffinityFluent<A extends io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);
    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);
    public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);
    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);
    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);
    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);
    public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution();
    public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> predicate);
    public java.lang.Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> predicate);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution);
    public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> predicate);
    public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public A addToRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);
    public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items);
    public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);
    public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items);
    public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution();
    public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> predicate);
    public java.lang.Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> predicate);
    public A withRequiredDuringSchedulingIgnoredDuringExecution(java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution);
    public A withRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution);
    public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> predicate);
    public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> {

            public N and();
            public N endPreferredDuringSchedulingIgnoredDuringExecution();    }


    public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> {

            public N and();
            public N endRequiredDuringSchedulingIgnoredDuringExecution();    }


}
