package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentSpecFluent<A extends V1VolumeAttachmentSpecFluent<A>> extends Fluent<A>{
  public String getAttacher();
  public A withAttacher(String attacher);
  public Boolean hasAttacher();
  public String getNodeName();
  public A withNodeName(String nodeName);
  public Boolean hasNodeName();
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSource getSource();
  public V1VolumeAttachmentSource buildSource();
  public A withSource(V1VolumeAttachmentSource source);
  public Boolean hasSource();
  public V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource();
  public V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(V1VolumeAttachmentSource item);
  public V1VolumeAttachmentSpecFluent.SourceNested<A> editSource();
  public V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource();
  public V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(V1VolumeAttachmentSource item);
  public interface SourceNested<N> extends Nested<N>,V1VolumeAttachmentSourceFluent<V1VolumeAttachmentSpecFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}