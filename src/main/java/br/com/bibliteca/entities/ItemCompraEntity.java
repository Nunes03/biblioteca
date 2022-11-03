package br.com.bibliteca.entities;

public class ItemCompraEntity {

	private Integer id;

	private CompraEntity compra;

	private AcervoEntity acervo;

	public ItemCompraEntity() {
	}

	public ItemCompraEntity(Integer id, CompraEntity compra, AcervoEntity acervo) {
		super();
		this.id = id;
		this.compra = compra;
		this.acervo = acervo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CompraEntity getCompra() {
		return compra;
	}

	public void setCompra(CompraEntity compra) {
		this.compra = compra;
	}

	public AcervoEntity getAcervo() {
		return acervo;
	}

	public void setAcervo(AcervoEntity acervo) {
		this.acervo = acervo;
	}
}