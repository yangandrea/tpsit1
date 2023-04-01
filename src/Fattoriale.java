public class Fattoriale extends Thread
{
        private int val;
        private long result;

        public Fattoriale(int val) {
            this.val = val;
            this.result = 1;
        }

        public long getVal() {
            return result;
        }

        @Override
        public void run() {
            for (int i = 1; i <= val; i++) {
                result *= i;
            }
        }
}
