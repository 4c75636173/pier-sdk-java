package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import java.util.Date;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.AjusteResponse;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidade;
import br.com.conductor.pier.api.v2.model.Conta;
import br.com.conductor.pier.api.v2.model.BoletoDeFatura;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.FaturaConsignadaResponse;
import br.com.conductor.pier.api.v2.model.FaturaConsignadaDetalheResponse;
import br.com.conductor.pier.api.v2.model.DetalhesFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferencias;
import br.com.conductor.pier.api.v2.model.CartaoImpressao;
import br.com.conductor.pier.api.v2.model.PageFaturasConsignadas;
import br.com.conductor.pier.api.v2.model.PageFaturas;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventos;
import br.com.conductor.pier.api.v2.model.LinkPageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtraso;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentes;
import br.com.conductor.pier.api.v2.model.PageContas;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class ContaApi {
  private ApiClient apiClient;

  public ContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lan\u00C3\u00A7a um ajuste para a conta do id informado
   * Este recurso insere um ajuste para a conta do id informado
   * @param id Id Conta
   * @param idTipoAjuste C\u00C3\u00B3digo identificador do tipo de ajuste.
   * @param dataAjuste Data do ajuste.
   * @param valorAjuste Valor do ajuste
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return AjusteResponse
   */
  public AjusteResponse ajustarContaUsingPOST(Long id, Long idTipoAjuste, Date dataAjuste, BigDecimal valorAjuste, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'idTipoAjuste' is set
     if (idTipoAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'dataAjuste' is set
     if (dataAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'valorAjuste' is set
     if (valorAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/ajustes-financeiros".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorAjuste", valorAjuste));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<AjusteResponse> returnType = new GenericType<AjusteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o dos limites da conta
   * Esse recurso permite realizar a altera\u00C3\u00A7\u00C3\u00A3o dos Limites de uma determinada Conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param limiteGlobal Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.
   * @return LimiteDisponibilidade
   */
  public LimiteDisponibilidade alterarLimiteUsingPUT(Long id, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteGlobal' is set
     if (limiteGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteCompra' is set
     if (limiteCompra == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteCompra' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteParcelado' is set
     if (limiteParcelado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteParcelado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteParcelas' is set
     if (limiteParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteParcelas' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteSaqueGlobal' is set
     if (limiteSaqueGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteSaqueGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteSaquePeriodo' is set
     if (limiteSaquePeriodo == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteSaquePeriodo' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteConsignado' is set
     if (limiteConsignado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteConsignado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalCompra' is set
     if (limiteInternacionalCompra == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalCompra' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalParcelado' is set
     if (limiteInternacionalParcelado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalParcelas' is set
     if (limiteInternacionalParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelas' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalSaqueGlobal' is set
     if (limiteInternacionalSaqueGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaqueGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalSaquePeriodo' is set
     if (limiteInternacionalSaquePeriodo == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaquePeriodo' when calling alterarLimiteUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<LimiteDisponibilidade> returnType = new GenericType<LimiteDisponibilidade>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o do dia de vencimento das faturas da conta
   * Esse recurso permite alterar o vencimento de uma conta especifica.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param novoDiaVencimento Novo dia de vencimento.
   * @return Conta
   */
  public Conta alterarVencimentoUsingPUT(Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimentoUsingPUT");
     }
     
     // verify the required parameter 'novoDiaVencimento' is set
     if (novoDiaVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimentoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-vencimento".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "novo_dia_vencimento", novoDiaVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   *  Ativa o servi\u00C3\u00A7o de envio de fatura por email
   * Este recurso ativa o servi\u00C3\u00A7o de envio de fatura por email
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @return Object
   */
  public Object ativarEnvioFaturaEmailUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmailUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta os dados de um determinado boleto da fatura
   * Este recurso consulta um boleto da fatura
   * @param id Id Conta
   * @return BoletoDeFatura
   */
  public BoletoDeFatura consultarBoletoEmitidoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitidoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/consultar-ficha-compensacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<BoletoDeFatura> returnType = new GenericType<BoletoDeFatura>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a d\u00C3\u00ADvida atualizada do cliente
   * Este recurso consulta a d\u00C3\u00ADvida atualizada do cliente
   * @param id Id Conta
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataVencimento Data do vencimento
   * @param idEscritorioCobranca C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do escrit\u00C3\u00B3rio de cobran\u00C3\u00A7a
   * @return DividaClienteResponse
   */
  public DividaClienteResponse consultarDividaAtualizadaClienteUsingGET(Long id, Integer page, Integer limit, Date dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaClienteUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/recuperar-divida-atualizada".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEscritorioCobranca", idEscritorioCobranca));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<DividaClienteResponse> returnType = new GenericType<DividaClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar a fatura consignadas abertas da conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar a fatura consignada em aberto
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param dataVencimento Data Vencimento.
   * @return FaturaConsignadaResponse
   */
  public FaturaConsignadaResponse consultarFaturaConsignadaAbertaUsingGET(Long id, Date dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarFaturaConsignadaAbertaUsingGET");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarFaturaConsignadaAbertaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas-consignadas/consultar-fatura-aberta".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<FaturaConsignadaResponse> returnType = new GenericType<FaturaConsignadaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de uma determinada fatura consignada
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar uma fatura, atrav\u00C3\u00A9s do id da conta e o id da fatura.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idFatura C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da fatura (id_fatura).
   * @return FaturaConsignadaDetalheResponse
   */
  public FaturaConsignadaDetalheResponse consultarFaturaConsignadaUsingGET(Long id, Long idFatura) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarFaturaConsignadaUsingGET");
     }
     
     // verify the required parameter 'idFatura' is set
     if (idFatura == null) {
        throw new ApiException(400, "Missing the required parameter 'idFatura' when calling consultarFaturaConsignadaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas-consignadas/{id_fatura}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_fatura" + "\\}", apiClient.escapeString(idFatura.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<FaturaConsignadaDetalheResponse> returnType = new GenericType<FaturaConsignadaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Fatura da Conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar os detalhes de uma fatura vinculados a uma determinada conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idFatura C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da fatura (id_fatura).
   * @return DetalhesFaturaResponse
   */
  public DetalhesFaturaResponse consultarFaturaUsingGET(Long id, Long idFatura) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarFaturaUsingGET");
     }
     
     // verify the required parameter 'idFatura' is set
     if (idFatura == null) {
        throw new ApiException(400, "Missing the required parameter 'idFatura' when calling consultarFaturaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/{id_fatura}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_fatura" + "\\}", apiClient.escapeString(idFatura.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<DetalhesFaturaResponse> returnType = new GenericType<DetalhesFaturaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Lan\u00C3\u00A7amentos Futuros da Fatura de uma Conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar os detalhes dos lan\u00C3\u00A7amentos futuros de uma fatura vinculados a uma determinada conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idFatura C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da fatura (id_fatura).
   * @return DetalhesFaturaResponse
   */
  public DetalhesFaturaResponse consultarLancamentosFuturosFaturaUsingGET(Long id, Long idFatura) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLancamentosFuturosFaturaUsingGET");
     }
     
     // verify the required parameter 'idFatura' is set
     if (idFatura == null) {
        throw new ApiException(400, "Missing the required parameter 'idFatura' when calling consultarLancamentosFuturosFaturaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/{id_fatura}/lancamentos-futuros".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_fatura" + "\\}", apiClient.escapeString(idFatura.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<DetalhesFaturaResponse> returnType = new GenericType<DetalhesFaturaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os limites da conta
   * Este m\u00C3\u00A9todo permite consultar os Limites configurados para uma determinada Conta, a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param id Id Conta
   * @return LimiteDisponibilidade
   */
  public LimiteDisponibilidade consultarLimiteDisponibilidadeUsingGET1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET1");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<LimiteDisponibilidade> returnType = new GenericType<LimiteDisponibilidade>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta os detalhes de uma determinada transfer\u00C3\u00AAncia
   * Este m\u00C3\u00A9todo permite consultar os detalhes de uma determinada transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito realizada entre contas.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idTransferencia C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id_transferencia).
   * @return PageTransferencias
   */
  public PageTransferencias consultarUsingGET21(Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarUsingGET21");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_transferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransferencias> returnType = new GenericType<PageTransferencias>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de uma determinada conta
   * Este m\u00C3\u00A9todo permite consultar dados de uma determinada conta a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @return Conta
   */
  public Conta consultarUsingGET3(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET3");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desativa o servi\u00C3\u00A7o de envio de fatura por email
   * Este recurso desativa o servi\u00C3\u00A7o de envio de fatura por email
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @return Object
   */
  public Object desativarEnvioFaturaEmailUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmailUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gera um boleto de recarga
   * Este recurso gera um boleto de recarga
   * @param id Id Conta
   * @param valor 
   * @param dataVencimento 
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return BoletoDeFatura
   */
  public BoletoDeFatura gerarBoletoRecargaUsingPOST(Long id, BigDecimal valor, Date dataVencimento, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecargaUsingPOST");
     }
     
     // verify the required parameter 'valor' is set
     if (valor == null) {
        throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecargaUsingPOST");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecargaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/gerar-boleto-recarga".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<BoletoDeFatura> returnType = new GenericType<BoletoDeFatura>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o para impress\u00C3\u00A3o avulsa
   * Este recurso permite que seja gerado um novo Cart\u00C3\u00A3o para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00C3\u00A1 preciso informar o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cart\u00C3\u00A3o que dever\u00C3\u00A1 ser gerado para impress\u00C3\u00A3o. Esta funcionalidade poder\u00C3\u00A1 ser utilizada para realizar a impress\u00C3\u00A3o de cart\u00C3\u00B5es em Lojas, Quiosques, Escrit\u00C3\u00B3rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de Cart\u00C3\u00B5es habilidade para o fazer, no local.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idPessoa C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa (id).
   * @param idTipoPlastico C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do TipoPlastico (id).
   * @return CartaoImpressao
   */
  public CartaoImpressao gerarCartaoUsingPOST(Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoUsingPOST");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_pessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_tipo_plastico", idTipoPlastico));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<CartaoImpressao> returnType = new GenericType<CartaoImpressao>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as faturas consignadas da conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar todo o Hist\u00C3\u00B3rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataVencimento Apresenta a data de vencimento da fatura.
   * @return PageFaturasConsignadas
   */
  public PageFaturasConsignadas listarFaturasConsignadasUsingGET(Long id, Integer page, Integer limit, Date dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarFaturasConsignadasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas-consignadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageFaturasConsignadas> returnType = new GenericType<PageFaturasConsignadas>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as faturas da conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar todo o Hist\u00C3\u00B3rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataVencimento Data de Vencimento da Fatura.
   * @return PageFaturas
   */
  public PageFaturas listarFaturasUsingGET(Long id, Integer page, Integer limit, Date dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarFaturasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageFaturas> returnType = new GenericType<PageFaturas>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o hist\u00C3\u00B3rico de altera\u00C3\u00A7\u00C3\u00B5es de limites da conta
   * Este recurso consulta o hist\u00C3\u00B3rico com as altera\u00C3\u00A7\u00C3\u00B5es de limites da conta informada
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageHistoricoEventos
   */
  public PageHistoricoEventos listarHistoricoAlteracoesLimitesUsingGET(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-alteracoes-limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageHistoricoEventos> returnType = new GenericType<PageHistoricoEventos>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o hist\u00C3\u00B3rico de entradas/sa\u00C3\u00ADdas de assessorias de cobran\u00C3\u00A7a
   * Permite listar todos os registros de entrada e sa\u00C3\u00ADda da Conta em arquivos de integra\u00C3\u00A7\u00C3\u00A3o com empresas de assessorias de cobran\u00C3\u00A7a a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta).
   * @param id Id Conta
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return LinkPageHistoricoAssessoriaResponse
   */
  public LinkPageHistoricoAssessoriaResponse listarHistoricoAssessoriaUsingGET(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoriaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-assessorias-cobranca".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<LinkPageHistoricoAssessoriaResponse> returnType = new GenericType<LinkPageHistoricoAssessoriaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o historico de atrasos das faturas
   * Este recurso lista o hist\u00C3\u00B3rico do pagamento de faturas em atraso
   * @param id Id Conta
   * @return PageHistoricoAtraso
   */
  public PageHistoricoAtraso listarHistoricoAtrasosFaturasUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-faturas-atrasos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageHistoricoAtraso> returnType = new GenericType<PageHistoricoAtraso>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transa\u00C3\u00A7\u00C3\u00B5es n\u00C3\u00A3o processadas da conta
   * Este m\u00C3\u00A9todo permite que sejam listadas todas as transa\u00C3\u00A7\u00C3\u00B5es n\u00C3\u00A3o processadas da Conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageTransacoesCorrentes
   */
  public PageTransacoesCorrentes listarNaoProcessadasUsingGET(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/nao-processadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransacoesCorrentes> returnType = new GenericType<PageTransacoesCorrentes>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transa\u00C3\u00A7\u00C3\u00B5es processadas da conta
   * Este m\u00C3\u00A9todo permite que sejam listadas todas as transa\u00C3\u00A7\u00C3\u00B5es processadas da Conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataVencimento Data de vencimento do extrato no formato yyyy-MM-dd.
   * @return PageTransacoesCorrentes
   */
  public PageTransacoesCorrentes listarProcessadasUsingGET(Long id, Integer page, Integer limit, Date dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/processadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransacoesCorrentes> returnType = new GenericType<PageTransacoesCorrentes>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transfer\u00C3\u00AAncias realizadas pela conta
   * Este m\u00C3\u00A9todo permite que sejam listadas as transfer\u00C3\u00AAncias realizadas pela conta existentes na base do emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param idTransferencia C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id).
   * @param idContaOrigem C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 debitado para a transfer\u00C3\u00AAncia. (id).
   * @param idContaDestino C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 creditado para a transfer\u00C3\u00AAncia. (id).
   * @param valorTransferencia Valor estabelecido para ser transferido.
   * @param dataTransferencia Data estabelecida para ocorrer a transfer\u00C3\u00AAncia.
   * @return PageTransferencias
   */
  public PageTransferencias listarUsingGET20(Long id, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, Date dataTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET20");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTransferencia", idTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idContaOrigem", idContaOrigem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idContaDestino", idContaDestino));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorTransferencia", valorTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataTransferencia", dataTransferencia));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransferencias> returnType = new GenericType<PageTransferencias>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista contas existentes na base de dados do Emissor
   * Este recurso permite listar contas existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param idProduto C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).
   * @param idOrigemComercial C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).
   * @param idStatusConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   * @param diaVencimento Apresenta o dia de vencimento.
   * @param melhorDiaCompra Apresenta o melhor dia de compra.
   * @param dataStatusConta Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.
   * @param dataCadastro Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   * @param dataUltimaAlteracaoVencimento Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   * @return PageContas
   */
  public PageContas listarUsingGET3(Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, Date dataStatusConta, Date dataCadastro, Date dataUltimaAlteracaoVencimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageContas> returnType = new GenericType<PageContas>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a reativa\u00C3\u00A7\u00C3\u00A3o de contas que foram desativadas por inadimpl\u00C3\u00AAncia
   * Este recurso permite reativar contas que foram desativadas por inadimpl\u00C3\u00AAncia. Para isso, ser\u00C3\u00A1 preciso informar o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   * @param id Id Conta
   * @return Object
   */
  public Object reativarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/reativar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite listar uma linha do tempo com os eventos da conta
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transa\u00C3\u00A7\u00C3\u00B5es, fechamento da fatura, pagamentos, gera\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00B5es e altera\u00C3\u00A7\u00C3\u00A3o de limite s\u00C3\u00A3o exemplos de eventos contemplados por esta funcionalidade. Neste m\u00C3\u00A9todo, as opera\u00C3\u00A7\u00C3\u00B5es s\u00C3\u00A3o ordenadas de forma decrescente.
   * @param id Id Conta
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse transacoesUsingGET(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transacoesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/timeline".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransacaoResponse> returnType = new GenericType<PageTransacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza uma transfer\u00C3\u00AAncia de Cr\u00C3\u00A9dito para outro cliente do mesmo Emissor
   * Este m\u00C3\u00A9todo permite que um portador de um cart\u00C3\u00A3o possa realizar auma transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para outro cliente do mesmo emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do cliente portador do cart\u00C3\u00A3o que ser\u00C3\u00A1 debitado (id).
   * @param idContaDestino C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do cliente portador do cart\u00C3\u00A3o que ser\u00C3\u00A1 creditado (id).
   * @param valorTransferencia Valor da Transfer\u00C3\u00AAncia.
   * @return PageTransferencias
   */
  public PageTransferencias transferirUsingPOST1(Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferirUsingPOST1");
     }
     
     // verify the required parameter 'idContaDestino' is set
     if (idContaDestino == null) {
        throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferirUsingPOST1");
     }
     
     // verify the required parameter 'valorTransferencia' is set
     if (valorTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferirUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_conta_destino", idContaDestino));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor_transferencia", valorTransferencia));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransferencias> returnType = new GenericType<PageTransferencias>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

