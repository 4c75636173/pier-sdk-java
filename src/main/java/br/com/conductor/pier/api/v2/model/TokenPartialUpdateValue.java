package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{token_partial_update_description}}}
 **/

@ApiModel(description = "{{{token_partial_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TokenPartialUpdateValue   {
  
  private Long base = null;
  private String owner = null;
  private String criadoPor = null;
  private String alteradoPor = null;
  private Long idAplicacao = null;

  
  /**
   * {{{token_dto_base_value}}}
   **/
  public TokenPartialUpdateValue base(Long base) {
    this.base = base;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "{{{token_dto_base_value}}}")
  @JsonProperty("base")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * {{{token_dto_owner_value}}}
   **/
  public TokenPartialUpdateValue owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "[Produção] Emissor Tal", value = "{{{token_dto_owner_value}}}")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * {{{token_dto_criado_por_value}}}
   **/
  public TokenPartialUpdateValue criadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "fulano.detal", value = "{{{token_dto_criado_por_value}}}")
  @JsonProperty("criadoPor")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * {{{token_dto_alterado_por_value}}}
   **/
  public TokenPartialUpdateValue alteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
    return this;
  }
  
  @ApiModelProperty(example = "beltrano.detal", value = "{{{token_dto_alterado_por_value}}}")
  @JsonProperty("alteradoPor")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * {{{token_dto_id_application_value}}}
   **/
  public TokenPartialUpdateValue idAplicacao(Long idAplicacao) {
    this.idAplicacao = idAplicacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{token_dto_id_application_value}}}")
  @JsonProperty("idAplicacao")
  public Long getIdAplicacao() {
    return idAplicacao;
  }
  public void setIdAplicacao(Long idAplicacao) {
    this.idAplicacao = idAplicacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPartialUpdateValue tokenPartialUpdateValue = (TokenPartialUpdateValue) o;
    return Objects.equals(this.base, tokenPartialUpdateValue.base) &&
        Objects.equals(this.owner, tokenPartialUpdateValue.owner) &&
        Objects.equals(this.criadoPor, tokenPartialUpdateValue.criadoPor) &&
        Objects.equals(this.alteradoPor, tokenPartialUpdateValue.alteradoPor) &&
        Objects.equals(this.idAplicacao, tokenPartialUpdateValue.idAplicacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, owner, criadoPor, alteradoPor, idAplicacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPartialUpdateValue {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    criadoPor: ").append(toIndentedString(criadoPor)).append("\n");
    sb.append("    alteradoPor: ").append(toIndentedString(alteradoPor)).append("\n");
    sb.append("    idAplicacao: ").append(toIndentedString(idAplicacao)).append("\n");
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

