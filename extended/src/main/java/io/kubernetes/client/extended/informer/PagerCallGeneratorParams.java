package io.kubernetes.client.extended.informer;

import io.kubernetes.client.extended.pager.Pager;
import io.kubernetes.client.util.CallGeneratorParams;

/**
 * Created by 烛坤 on 2019/10/18.
 *
 * @author 烛坤
 * @date 2019/10/18
 */
public class PagerCallGeneratorParams extends CallGeneratorParams {

  private static final int DEFAULT_PAGE_SIZE = 500;

  private Pager.PagerParams pagerParams;

  public PagerCallGeneratorParams(Boolean watch, String resourceVersion, Integer timeoutSeconds) {
    super(watch, resourceVersion, timeoutSeconds);
  }

  public PagerCallGeneratorParams(
      Boolean watch,
      String resourceVersion,
      Integer timeoutSeconds,
      Pager.PagerParams pagerParams) {
    this(watch, resourceVersion, timeoutSeconds);
    this.pagerParams = pagerParams;
  }

  public static PagerCallGeneratorParams to(CallGeneratorParams params) {
    return new PagerCallGeneratorParams(
        params.watch, params.resourceVersion, params.timeoutSeconds);
  }

  public static PagerCallGeneratorParams copy(
      CallGeneratorParams params, Pager.PagerParams pagerParams) {

    return new PagerCallGeneratorParams(
        params.watch, params.resourceVersion, params.timeoutSeconds, pagerParams);
  }

  public Pager.PagerParams getPagerParams() {
    return pagerParams;
  }

  public Integer getLimit() {
    return getPagerParams() == null ? null : getPagerParams().getLimit();
  }

  public String getContinueToken() {
    return getPagerParams() == null ? null : getPagerParams().getContinueToken();
  }

  public int getDefaultLimit() {
    return DEFAULT_PAGE_SIZE;
  }
}
