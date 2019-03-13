package io.kubernetes.client.util;

public class PagerParams {

  private Integer limit;
  private String _continue;

  public PagerParams() {}

  public PagerParams(Integer limit, String _continue) {
    this.limit = limit;
    this._continue = _continue;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public String getContinue() {
    return _continue;
  }

  public void setContinue(String _continue) {
    this._continue = _continue;
  }
}
