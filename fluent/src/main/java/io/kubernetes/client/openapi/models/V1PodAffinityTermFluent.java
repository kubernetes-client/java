package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1PodAffinityTermFluent<A extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLabelSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();
    public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);
    public java.lang.Boolean hasLabelSelector();
    public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelector();
    public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A> editLabelSelector();
    public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelector();
    public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public A addToNamespaces(int index,java.lang.String item);
    public A setToNamespaces(int index,java.lang.String item);
    public A addToNamespaces(java.lang.String... items);
    public A addAllToNamespaces(java.util.Collection<java.lang.String> items);
    public A removeFromNamespaces(java.lang.String... items);
    public A removeAllFromNamespaces(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getNamespaces();
    public java.lang.String getNamespace(int index);
    public java.lang.String getFirstNamespace();
    public java.lang.String getLastNamespace();
    public java.lang.String getMatchingNamespace(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingNamespace(java.util.function.Predicate<java.lang.String> predicate);
    public A withNamespaces(java.util.List<java.lang.String> namespaces);
    public A withNamespaces(java.lang.String... namespaces);
    public java.lang.Boolean hasNamespaces();
    public A addNewNamespace(java.lang.String original);
    public java.lang.String getTopologyKey();
    public A withTopologyKey(java.lang.String topologyKey);
    public java.lang.Boolean hasTopologyKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTopologyKey instead.
     */
        public A withNewTopologyKey(java.lang.String original);
    public interface LabelSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<N>> {

            public N and();
            public N endLabelSelector();    }


}
