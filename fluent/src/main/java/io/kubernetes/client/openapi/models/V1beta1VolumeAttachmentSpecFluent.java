package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1VolumeAttachmentSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getAttacher();
    public A withAttacher(java.lang.String attacher);
    public java.lang.Boolean hasAttacher();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAttacher instead.
     */
        public A withNewAttacher(java.lang.String original);
    public java.lang.String getNodeName();
    public A withNodeName(java.lang.String nodeName);
    public java.lang.Boolean hasNodeName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNodeName instead.
     */
        public A withNewNodeName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSource getSource();
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSource buildSource();
    public A withSource(io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSource source);
    public java.lang.Boolean hasSource();
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource();
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSource item);
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<A> editSource();
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource();
    public io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSource item);
    public interface SourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSourceFluent<io.kubernetes.client.openapi.models.V1beta1VolumeAttachmentSpecFluent.SourceNested<N>> {

            public N and();
            public N endSource();    }


}
