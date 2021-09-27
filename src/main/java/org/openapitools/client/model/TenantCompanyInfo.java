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

/**
 * TenantCompanyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-27T12:28:31.876+02:00[Europe/Stockholm]")
public class TenantCompanyInfo {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ORG_NUMBER = "OrgNumber";
  @SerializedName(SERIALIZED_NAME_ORG_NUMBER)
  private String orgNumber;

  public static final String SERIALIZED_NAME_VA_T_NUMBER = "VATNumber";
  @SerializedName(SERIALIZED_NAME_VA_T_NUMBER)
  private String vaTNumber;


  public TenantCompanyInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of your company.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The full name of your company.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TenantCompanyInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The first line of the address for your company.
   * @return address
  **/
  @ApiModelProperty(required = true, value = "The first line of the address for your company.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TenantCompanyInfo city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city in which the address is located.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city in which the address is located.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public TenantCompanyInfo postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the address.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "The postal code for the address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public TenantCompanyInfo country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country in which the address is located. This should be given as an ISO 3361-1 country code (two letter abbreviation).
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The country in which the address is located. This should be given as an ISO 3361-1 country code (two letter abbreviation).")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TenantCompanyInfo orgNumber(String orgNumber) {
    
    this.orgNumber = orgNumber;
    return this;
  }

   /**
   * Your company&#39;s organization number.
   * @return orgNumber
  **/
  @ApiModelProperty(required = true, value = "Your company's organization number.")

  public String getOrgNumber() {
    return orgNumber;
  }


  public void setOrgNumber(String orgNumber) {
    this.orgNumber = orgNumber;
  }


  public TenantCompanyInfo vaTNumber(String vaTNumber) {
    
    this.vaTNumber = vaTNumber;
    return this;
  }

   /**
   * A value added tax identification number, identifier used in many countries, including the countries of the European Union, for value added tax purposes.
   * @return vaTNumber
  **/
  @ApiModelProperty(required = true, value = "A value added tax identification number, identifier used in many countries, including the countries of the European Union, for value added tax purposes.")

  public String getVaTNumber() {
    return vaTNumber;
  }


  public void setVaTNumber(String vaTNumber) {
    this.vaTNumber = vaTNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantCompanyInfo tenantCompanyInfo = (TenantCompanyInfo) o;
    return Objects.equals(this.name, tenantCompanyInfo.name) &&
        Objects.equals(this.address, tenantCompanyInfo.address) &&
        Objects.equals(this.city, tenantCompanyInfo.city) &&
        Objects.equals(this.postalCode, tenantCompanyInfo.postalCode) &&
        Objects.equals(this.country, tenantCompanyInfo.country) &&
        Objects.equals(this.orgNumber, tenantCompanyInfo.orgNumber) &&
        Objects.equals(this.vaTNumber, tenantCompanyInfo.vaTNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, city, postalCode, country, orgNumber, vaTNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantCompanyInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    orgNumber: ").append(toIndentedString(orgNumber)).append("\n");
    sb.append("    vaTNumber: ").append(toIndentedString(vaTNumber)).append("\n");
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

