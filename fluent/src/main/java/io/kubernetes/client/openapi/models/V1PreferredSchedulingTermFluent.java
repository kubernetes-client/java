package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1PreferredSchedulingTermFluent<A extends io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreference instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeSelectorTerm getPreference();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildPreference();
    public A withPreference(io.kubernetes.client.openapi.models.V1NodeSelectorTerm preference);
    public java.lang.Boolean hasPreference();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editPreference();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference();
    public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public java.lang.Integer getWeight();
    public A withWeight(java.lang.Integer weight);
    public java.lang.Boolean hasWeight();
    public interface PreferenceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<N>> {

            public N and();
            public N endPreference();    }


}
