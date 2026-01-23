class SkipMultiplesOf3 {
    public static void main(String[] arg) {
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}
