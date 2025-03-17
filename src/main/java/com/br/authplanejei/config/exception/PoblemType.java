package com.br.authplanejei.config.exception;

public enum PoblemType
{
	MENSAGEM_INCOMPREENSIVEL("Mensagem incompreensível", "mensagem-incompreensivel"),
	RECURSO_NAO_ENCONTRADO("Recurso nao Encontrado", "recurso-nao-encontrado"),
	ENTIDADE_EM_USO("Entidade em uso", "entidade-em-uso"),
	ERRO_NEGOCIO("Violação de regra de negócio", "erro-negocio"),
	PARAMETRO_INVALIDO("Parâmetro inválido", "parametro-invalido"),
	ERRO_DO_SISTEMA("Erro do sistema", "erro-sistema"),
	DADOS_INVALIDOS("Dados inválidos", "dados-invalidos");

	private String title;
	private String uri;

	PoblemType(String title, String uri)
	{
		this.title = title;
		this.uri = "https://localhost/"+ uri;
	}

	public String getTitle()
	{
		return title;
	}

	public String getUri()
	{
		return uri;
	}
}
