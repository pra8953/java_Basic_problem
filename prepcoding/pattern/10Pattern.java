class Pattern10 {
    public static void main(String[] args) {
        int num = 5;
        int inner = -1;
        int outer = num / 2;

        for (int i = 1; i <= num; i++) {

            // outer spaces
            for (int j = 1; j <= outer; j++) {
                System.out.print("\t");
            }

            // first star
            System.out.print("*\t");

            // inner spaces
            for (int j = 1; j <= inner; j++) {
                System.out.print("\t");
            }

            // second star (only if not first or last row)
            if (i > 1 && i < num) {
                System.out.print("*\t");
            }

            // new line after each row
            System.out.println();

            // adjust outer and inner counts
            if (i <= num / 2) {
                outer--;
                inner += 2;
            } else {
                outer++;
                inner -= 2;
            }
        }
    }
}
