package com.lduran.infopolimorph.util;

import com.lduran.infopolimorph.model.Apuracao;
import com.lduran.infopolimorph.model.IndicadorPropriedade;
import com.lduran.infopolimorph.model.Utilizacao;

public class ToolsFactory
{
	private static ToolsFactory instance;

	private ToolsFactory()
	{

	}

	/**
	 * @return the instance
	 */
	public static ToolsFactory getInstance()
	{
		if (instance == null)
		{
			instance = new ToolsFactory();
		}

		return instance;
	}

	/**
	 * Check if a string is numeric [with regex]
	 * @param str
	 * @return
	 */
	public boolean isNumeric(String str)
	{
		return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional '-' and decimal.
	}

	/**
	 * Obtem a descrição do enum Apuracao
	 * @param codigo
	 * @return
	 */
	public String obtemDescricaoApuracao(String codigo)
	{
		String descricao = "";

		for (Apuracao apuracao : Apuracao.values())
		{
			if (codigo.equalsIgnoreCase(apuracao.name()))
			{
				descricao = apuracao.getDescricao();
				break;
			}
		}

		return descricao;
	}

	/**
	 * Obtem a descrição do enum Utilizacao
	 * @param codigo
	 * @return
	 */
	public String obtemDescricaoUtilizacao(String codigo)
	{
		String descricao = "";

		for (Utilizacao utilizacao : Utilizacao.values())
		{
			if (codigo.equalsIgnoreCase(utilizacao.name()))
			{
				descricao = utilizacao.getDescricao();
				break;
			}
		}

		return descricao;
	}

	/**
	 * Obtem a descrição do enum Indicador de Propriedade
	 * 
	 * @param codigo
	 * @return
	 */
	public String obtemDescricaoIndicadorPropriedade(String codigo)
	{
		String descricao = "";

		for (IndicadorPropriedade ip : IndicadorPropriedade.values())
		{
			if (codigo.equalsIgnoreCase(ip.name()))
			{
				descricao = ip.getDescricao();
				break;
			}
		}

		return descricao;
	}
}