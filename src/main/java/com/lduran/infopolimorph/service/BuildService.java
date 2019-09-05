package com.lduran.infopolimorph.service;

import org.springframework.stereotype.Service;

@Service("buidService")
public class BuildService
{
	public ObjectService getObjectService(String criteria)
	{
		switch(criteria)
		{
		case "ApuracaoICMS": return new ApuracaoServiceImpl();
		case "Produtos": return new ProdutoServiceImpl();
		case "Inventario": return new InventarioServiceImpl();
		case "Organizacoes": return new OrganizacaoServiceImpl();
		case "Participantes": return new ParticipanteServiceImpl();
		default: return null;
		}
	}
}
