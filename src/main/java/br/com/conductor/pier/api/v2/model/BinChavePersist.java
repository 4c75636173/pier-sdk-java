package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BinChavePersist   {
  
  private String chave = null;
  private String checkValue = null;
  private Boolean flagDescriptografado = null;
  private Long idBin = null;
  private Long idTipoChave = null;
  private String label = null;
  private String validade = null;

  
  /**
   **/
  public BinChavePersist chave(String chave) {
    this.chave = chave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
  }

  
  /**
   **/
  public BinChavePersist checkValue(String checkValue) {
    this.checkValue = checkValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("checkValue")
  public String getCheckValue() {
    return checkValue;
  }
  public void setCheckValue(String checkValue) {
    this.checkValue = checkValue;
  }

  
  /**
   **/
  public BinChavePersist flagDescriptografado(Boolean flagDescriptografado) {
    this.flagDescriptografado = flagDescriptografado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagDescriptografado")
  public Boolean getFlagDescriptografado() {
    return flagDescriptografado;
  }
  public void setFlagDescriptografado(Boolean flagDescriptografado) {
    this.flagDescriptografado = flagDescriptografado;
  }

  
  /**
   **/
  public BinChavePersist idBin(Long idBin) {
    this.idBin = idBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idBin")
  public Long getIdBin() {
    return idBin;
  }
  public void setIdBin(Long idBin) {
    this.idBin = idBin;
  }

  
  /**
   **/
  public BinChavePersist idTipoChave(Long idTipoChave) {
    this.idTipoChave = idTipoChave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoChave")
  public Long getIdTipoChave() {
    return idTipoChave;
  }
  public void setIdTipoChave(Long idTipoChave) {
    this.idTipoChave = idTipoChave;
  }

  
  /**
   **/
  public BinChavePersist label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  public BinChavePersist validade(String validade) {
    this.validade = validade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validade")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinChavePersist binChavePersist = (BinChavePersist) o;
    return Objects.equals(this.chave, binChavePersist.chave) &&
        Objects.equals(this.checkValue, binChavePersist.checkValue) &&
        Objects.equals(this.flagDescriptografado, binChavePersist.flagDescriptografado) &&
        Objects.equals(this.idBin, binChavePersist.idBin) &&
        Objects.equals(this.idTipoChave, binChavePersist.idTipoChave) &&
        Objects.equals(this.label, binChavePersist.label) &&
        Objects.equals(this.validade, binChavePersist.validade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave, checkValue, flagDescriptografado, idBin, idTipoChave, label, validade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinChavePersist {\n");
    
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    checkValue: ").append(toIndentedString(checkValue)).append("\n");
    sb.append("    flagDescriptografado: ").append(toIndentedString(flagDescriptografado)).append("\n");
    sb.append("    idBin: ").append(toIndentedString(idBin)).append("\n");
    sb.append("    idTipoChave: ").append(toIndentedString(idTipoChave)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
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

