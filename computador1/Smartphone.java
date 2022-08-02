package computador1;


	public class Smartphone extends computador {

		int selfies;

		public int getSelfies() {
			return selfies;
		}

		public void setSelfies(int selfies) {
			this.selfies = selfies;
		}

		public Smartphone(int ram, int armazemento, boolean temTeclado, int selfies) {
			super(ram, armazemento, temTeclado);
			setSelfies(selfies);
		}public void tirarSelfie() {
			selfies++;
		}
		
	}


