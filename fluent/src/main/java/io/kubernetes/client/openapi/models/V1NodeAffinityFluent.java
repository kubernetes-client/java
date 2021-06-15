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

public interface V1NodeAffinityFluent<A extends io.kubernetes.client.openapi.models.V1NodeAffinityFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);
    public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);
    public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);
    public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items);
    public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);
    public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(java.util.Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items);
    public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution();
    public java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> predicate);
    public java.lang.Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> predicate);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution);
    public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution);
    public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index);
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution();
    public A withRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution);
    public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution();
    public io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
    public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<io.kubernetes.client.openapi.models.V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> {

            public N and();
            public N endPreferredDuringSchedulingIgnoredDuringExecution();    }


    public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorFluent<io.kubernetes.client.openapi.models.V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> {

            public N and();
            public N endRequiredDuringSchedulingIgnoredDuringExecution();    }


}
