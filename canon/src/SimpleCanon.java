public class SimpleCanon {
	public static void main(String... args) {
		Voice voice1 = new Voice();
		Voice voice2 = new Voice();
		Voice voice3 = new Voice();
		Voice voice4 = new Voice();

		voice1.frereJacques();
		voice1.frereJacques();

		voice1.dormezVous();
		voice2.frereJacques();
		voice1.dormezVous();
		voice2.frereJacques();

		voice1.sonnezLesMatines();
		voice2.dormezVous();
		voice3.frereJacques();
		voice1.sonnezLesMatines();
		voice2.dormezVous();
		voice3.frereJacques();

		voice1.dingDaingDong();
		voice2.sonnezLesMatines();
		voice3.dormezVous();
		voice4.frereJacques();
		voice1.dingDaingDong();
		voice2.sonnezLesMatines();
		voice3.dormezVous();
		voice4.frereJacques();

		voice2.dingDaingDong();
		voice3.sonnezLesMatines();
		voice4.dormezVous();
		voice2.dingDaingDong();
		voice3.sonnezLesMatines();
		voice4.dormezVous();

		voice3.dingDaingDong();
		voice4.sonnezLesMatines();
		voice3.dingDaingDong();
		voice4.sonnezLesMatines();

		voice4.dingDaingDong();
		voice4.dingDaingDong();
	}

	public static class Voice {

		public void frereJacques() {
		}

		public void dingDaingDong() {
		}

		public void sonnezLesMatines() {
		}

		public void dormezVous() {
		}

	}
}
