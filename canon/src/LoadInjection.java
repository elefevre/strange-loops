import static java.util.Arrays.asList;

import java.util.Iterator;

public class LoadInjection {
	public static void main(String... args) {
		VirtualUser[] users = new VirtualUser[] { new VirtualUser(),
				new VirtualUser(), new VirtualUser(), new VirtualUser() };

		Iterator<VirtualUser> iterator = asList(users).iterator();

		while (anyIsStillRunning(users)) {
			if (iterator.hasNext()) {
				iterator.next().start();
			}
			for (VirtualUser injector : users) {
				injector.step();
			}

			System.out.println();
		}
	}

	private static boolean anyIsStillRunning(VirtualUser[] users) {
		for (VirtualUser user : users) {
			if (!user.complete()) {
				return true;
			}
		}
		return false;
	}

	public static class VirtualUser {
		private int step = 0;

		public void start() {
			step = 1;
		}

		public void step() {
			if (started()) {
				step(step);
				step(step);
				step++;
			}
		}

		public boolean complete() {
			return (step / 2) > 4;
		}

		public boolean started() {
			return step > 0;
		}

		public void step(int i) {
			switch (i) {
			case 1:
				frereJacques();
				break;
			case 2:
				dormezVous();
				break;
			case 3:
				sonnezLesMatines();
				break;
			case 4:
				dingDaingDong();
				break;

			default:
				break;
			}
		}

		public void frereJacques() {
			System.out.println("Frère Jacques");
		}

		public void dingDaingDong() {
			System.out.println("Ding daing dong");
		}

		public void sonnezLesMatines() {
			System.out.println("Sonnez les mâtines");
		}

		public void dormezVous() {
			System.out.println("Dormez-vous ?");
		}

	}
}
