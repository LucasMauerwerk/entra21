package computador1;

public class computador {
	
		
		private int ram;
		private int armazemento;
		private boolean temTeclado;
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getArmazemento() {
			return armazemento;
		}
		public void setArmazemento(int armazemento) {
			this.armazemento = armazemento;
		}
		public boolean isTemTeclado() {
			return temTeclado;
		}
		public void setTemTeclado(boolean temTeclado) {
			this.temTeclado = temTeclado;
		}
		public computador(int ram, int armazemento, boolean temTeclado) {
			setRam(ram);
			setArmazemento(armazemento);
			setTemTeclado(temTeclado);
		}
		public void AumentarRam(int aumentar) {
		  ram=ram+aumentar;
		}public void AumentarArmazenamento(int aumentarA) {
			armazemento=armazemento+aumentarA;

	}
	}



