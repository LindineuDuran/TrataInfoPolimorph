package com.lduran.infopolimorph.model;

public enum Apuracao
{
	A0("ICMS"),
	A1("ICMS-ST"),
	A2("ICMS DIFAL"),
	A3("FCP (FECOP)");

	private String descricao;

	/**
	 * @param descricao
	 */
	private Apuracao(String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao()
	{
		return this.descricao;
	}
}