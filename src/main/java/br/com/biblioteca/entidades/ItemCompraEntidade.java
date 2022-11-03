package main.java.br.com.biblioteca.entidades;

public class ItemCompraEntidade {

	private Integer id;

	private CompraEntidade compra;

	private AcervoEntidade acervo;

	public ItemCompraEntidade() {
	}

	public ItemCompraEntidade(Integer id, CompraEntidade compra, AcervoEntidade acervo) {
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

	public CompraEntidade getCompra() {
		return compra;
	}

	public void setCompra(CompraEntidade compra) {
		this.compra = compra;
	}

	public AcervoEntidade getAcervo() {
		return acervo;
	}

	public void setAcervo(AcervoEntidade acervo) {
		this.acervo = acervo;
	}
}