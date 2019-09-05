package com.lduran.infopolimorph.service;

import java.util.LinkedList;
import java.util.List;

import com.lduran.infopolimorph.model.ObjectBI;
import com.lduran.infopolimorph.model.Produto;

public class ProdutoServiceImpl implements ObjectService
{

	@Override
	public List<? extends ObjectBI> getObjectList(List<String> fileContent)
	{
		List<Produto> objectListProduto = new LinkedList<>();

		for (String linha : fileContent)
		{
			Produto produto = new Produto();

			if (!linha.contains("IdProduto"))
			{
				String[] item = linha.replace(".", "").replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null)) {produto.setIdProduto(item[0]);}
				if ((item.length > 1) && (item[1] != null)) {produto.setDescricao(item[1]);}
				if ((item.length > 2) && (item[2] != null)) {produto.setTipoDeProduto(item[2]);}
				if ((item.length > 3) && (item[3] != null)) {produto.setGrupoProd(item[3]);}
				if ((item.length > 4) && (item[4] != null)) {produto.setFamiliaProd(item[4]);}

				objectListProduto.add(produto);
			}
		}

		List<? extends ObjectBI> objectList = objectListProduto;
		return objectList;
	}

	@Override
	public String getObjectHeader()
	{
		return "IdProduto;Produto;TipoDeProduto;GrupoDeProdutos;FamiliaDeProdutos";
	}

	@Override
	public String getObjectContent(ObjectBI obj)
	{
		Produto produto = (Produto) obj;
		return produto.getIdProduto() + ";" + produto.getDescricao() + ";" + produto.getTipoDeProduto() + ";" + produto.getGrupoProd() + ";" + produto.getFamiliaProd();
	}

}
