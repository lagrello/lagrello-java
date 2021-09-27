/*
 * Lagrello API
 * API specification for Lagrello, a simple to use authentication service
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@lagrello.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Paging;
import org.openapitools.client.model.Token;

/**
 * TokenList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T12:28:31.876+02:00[Europe/Stockholm]")
public class TokenList {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Token> data = new ArrayList<Token>();

  public static final String SERIALIZED_NAME_PAGING = "paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private Paging paging;


  public TokenList data(List<Token> data) {
    
    this.data = data;
    return this;
  }

  public TokenList addDataItem(Token dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Token> getData() {
    return data;
  }


  public void setData(List<Token> data) {
    this.data = data;
  }


  public TokenList paging(Paging paging) {
    
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(required = true, value = "")

  public Paging getPaging() {
    return paging;
  }


  public void setPaging(Paging paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenList tokenList = (TokenList) o;
    return Objects.equals(this.data, tokenList.data) &&
        Objects.equals(this.paging, tokenList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenList {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
