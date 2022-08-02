package computador1;


	public class notebook extends computador  {
		
		double peso;

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public notebook(int ram, int armazemento, boolean temTeclado, double peso) {
			super(ram, armazemento, temTeclado);
		  setPeso(peso);
		}
		public boolean ehPesado() {
			if(peso>3) {
				return true;
			}else {
				return false;
			}
			
		}
		

	}

