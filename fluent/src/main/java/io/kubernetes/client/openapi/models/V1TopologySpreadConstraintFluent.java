package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1TopologySpreadConstraintFluent<A extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLabelSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();
    public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);
    public java.lang.Boolean hasLabelSelector();
    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector();
    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editLabelSelector();
    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelector();
    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public java.lang.Integer getMaxSkew();
    public A withMaxSkew(java.lang.Integer maxSkew);
    public java.lang.Boolean hasMaxSkew();
    public java.lang.String getTopologyKey();
    public A withTopologyKey(java.lang.String topologyKey);
    public java.lang.Boolean hasTopologyKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTopologyKey instead.
     */
        public A withNewTopologyKey(java.lang.String original);
    public java.lang.String getWhenUnsatisfiable();
    public A withWhenUnsatisfiable(java.lang.String whenUnsatisfiable);
    public java.lang.Boolean hasWhenUnsatisfiable();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withWhenUnsatisfiable instead.
     */
        public A withNewWhenUnsatisfiable(java.lang.String original);
    public interface LabelSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<N>> {

            public N and();
            public N endLabelSelector();    }


}
