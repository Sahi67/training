package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scheduledtxn
 */
@Validated


public class Scheduledtxn  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("txndate")
  private DateTime txndate = null;

  @JsonProperty("merchant")
  private String merchant = null;

  @JsonProperty("txnvalue")
  private Long txnvalue = null;

  @JsonProperty("startdate")
  private DateTime startdate = null;

  @JsonProperty("enddate")
  private DateTime enddate = null;

  @JsonProperty("paymentcount")
  private Long paymentcount = null;

  @JsonProperty("totalvalue")
  private Long totalvalue = null;

  public Scheduledtxn id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Scheduledtxn txndate(DateTime txndate) {
    this.txndate = txndate;
    return this;
  }

  /**
   * Get txndate
   * @return txndate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DateTime getTxndate() {
    return txndate;
  }

  public void setTxndate(DateTime txndate) {
    this.txndate = txndate;
  }

  public Scheduledtxn merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
   **/
  @Schema(example = "doggie", description = "")
  
    public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public Scheduledtxn txnvalue(Long txnvalue) {
    this.txnvalue = txnvalue;
    return this;
  }

  /**
   * Get txnvalue
   * @return txnvalue
   **/
  @Schema(example = "100", description = "")
  
    public Long getTxnvalue() {
    return txnvalue;
  }

  public void setTxnvalue(Long txnvalue) {
    this.txnvalue = txnvalue;
  }

  public Scheduledtxn startdate(DateTime startdate) {
    this.startdate = startdate;
    return this;
  }

  /**
   * Get startdate
   * @return startdate
   **/
  @Schema(description = "")
  
    @Valid
    public DateTime getStartdate() {
    return startdate;
  }

  public void setStartdate(DateTime startdate) {
    this.startdate = startdate;
  }

  public Scheduledtxn enddate(DateTime enddate) {
    this.enddate = enddate;
    return this;
  }

  /**
   * Get enddate
   * @return enddate
   **/
  @Schema(description = "")
  
    @Valid
    public DateTime getEnddate() {
    return enddate;
  }

  public void setEnddate(DateTime enddate) {
    this.enddate = enddate;
  }

  public Scheduledtxn paymentcount(Long paymentcount) {
    this.paymentcount = paymentcount;
    return this;
  }

  /**
   * Get paymentcount
   * @return paymentcount
   **/
  @Schema(example = "12", description = "")
  
    public Long getPaymentcount() {
    return paymentcount;
  }

  public void setPaymentcount(Long paymentcount) {
    this.paymentcount = paymentcount;
  }

  public Scheduledtxn totalvalue(Long totalvalue) {
    this.totalvalue = totalvalue;
    return this;
  }

  /**
   * Get totalvalue
   * @return totalvalue
   **/
  @Schema(example = "1200", description = "")
  
    public Long getTotalvalue() {
    return totalvalue;
  }

  public void setTotalvalue(Long totalvalue) {
    this.totalvalue = totalvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheduledtxn scheduledtxn = (Scheduledtxn) o;
    return Objects.equals(this.id, scheduledtxn.id) &&
        Objects.equals(this.txndate, scheduledtxn.txndate) &&
        Objects.equals(this.merchant, scheduledtxn.merchant) &&
        Objects.equals(this.txnvalue, scheduledtxn.txnvalue) &&
        Objects.equals(this.startdate, scheduledtxn.startdate) &&
        Objects.equals(this.enddate, scheduledtxn.enddate) &&
        Objects.equals(this.paymentcount, scheduledtxn.paymentcount) &&
        Objects.equals(this.totalvalue, scheduledtxn.totalvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, txndate, merchant, txnvalue, startdate, enddate, paymentcount, totalvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheduledtxn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    txndate: ").append(toIndentedString(txndate)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    txnvalue: ").append(toIndentedString(txnvalue)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    paymentcount: ").append(toIndentedString(paymentcount)).append("\n");
    sb.append("    totalvalue: ").append(toIndentedString(totalvalue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}