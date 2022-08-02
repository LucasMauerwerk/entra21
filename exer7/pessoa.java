package exer7;

import java.util.Set;

public class pessoa {
	
	double comicao;

	public pessoa(double comicao) {
		super();
		this.comicao = comicao;
	}

	public void getComicao(double comicao) {
		this.comicao = comicao;
		if (this.comicao <= 80000.00) {
			this.comicao = this.comicao * 0.02 ;
			System.out.println(this.comicao);
		}
		else if (this.comicao >= 80001.00 && this.comicao < 150000.00 ) {
			setComicao(this.comicao * 0.04) ;
			System.out.println(comicao);
		}
		else {
			setComicao(this.comicao * 0.05) ;
			System.out.println(comicao);
		}
	}

	public void setComicao(double comicao) {
		this.comicao = comicao;
	}

	
}
